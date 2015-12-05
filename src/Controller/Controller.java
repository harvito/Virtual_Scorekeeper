package Controller;


import java.sql.Date;
import java.util.List;

import Model.Infraction;
import Model.Manager;
import Model.Match;
import Model.Player;
import Model.Shot;
import Model.Team;
import Persistence.XStreamPersistence;

public class Controller 
{
	// Constructor
	public Controller ()
	{	
	}
	//Create a match
	public Match createNewMatch (Date date, String location, String teamone, String teamtwo)
	{
		Date date1 = date;
		String loc = location;
		
		Manager manager = Manager.getInstance();
		Team Home = new Team("temp",0);
		Team Away = new Team("temp",0);
		
		for (int i=0; i < manager.numberOfTeams(); i++)
		{
			if(manager.getTeam(i).getName()==teamone)
				Home = manager.getTeam(i);
		}
		
		for (int i=0; i < manager.numberOfTeams(); i++)
		{
			if(manager.getTeam(i).getName()==teamone)
				Away = manager.getTeam(i);
		}	
		
		Match newMatch = new Match(date1, loc, 0, 0, Home, Away);
		manager.addMatche(newMatch);
		XStreamPersistence.saveToXMLwithXStream(manager);
		return newMatch;
	}
	
	//Create a team
	public Team newTeam (String teamname)
	{
		String name = teamname;
		Manager manager = Manager.getInstance();
		
		for (int i=0; i < manager.numberOfTeams(); i++)
		{
			if(manager.getTeam(i).getName()==name)
			{
				System.out.print("Name already exists");
				return null;
			}
		}
		
		Team newTeam = new Team(name, 0);
		manager.addTeam(newTeam);
		XStreamPersistence.saveToXMLwithXStream(manager);
		return newTeam;
	}
	
	//Create a Player
	public Player newPlayer (String playerName, int jerseyNum, int height, int weight, Team playerTeam)
	{
		String name = playerName;
		int num = jerseyNum;
		int Height=height;
		int Weight = weight;
		Team team = playerTeam;
		
		Manager manager = Manager.getInstance();
		Player newPlayer = new Player(name, num, Height, Weight, team);
		
		for (int i=0; i < manager.numberOfTeams(); i++)
		{
			if(manager.getTeam(i)==team)
				manager.getTeam(i).addPlayer(newPlayer);
		}
		
		XStreamPersistence.saveToXMLwithXStream(manager);
		return newPlayer;
	}
	
	//Create a Shot
	public void newShot(boolean scored, boolean onTarget, Player player, Match match1) 
	{
		Manager manager = Manager.getInstance();
		
		boolean isGoal = scored;
		boolean isOnTarget = onTarget;
		Player playertemp = player;
		
		Shot newShot = new Shot(isGoal, isOnTarget);
		Match match2 = match1;
		
		for (int i=0; i < manager.numberOfTeams(); i++)
			{
				for (int j=0; j < manager.getTeam(i).numberOfPlayers(); j++)
				{
					if(manager.getTeam(i).getPlayer(j) == playertemp)
					{
						manager.getTeam(i).getPlayer(j).addShot(newShot);
					}
				}
			}
		
		for (int k = 0; k < manager.numberOfMatches(); k++ )
		{
			if(manager.getMatche(k) == match2)
			{
				manager.getMatche(k).addShot(newShot);
			}
		}
		
		if (isGoal == true) 
		{
			if (playertemp.getTeam() == match2.getTeam(0))
			{
				match2.setGoals1(match2.getGoals1()+1);
			}
			else 
			{
				match2.setGoals2(match2.getGoals2()+1);
			}
		}
		XStreamPersistence.saveToXMLwithXStream(manager);
	}

	//Pick winner of game and assign points
	public void winner (Match match)
	{
		Manager manager = Manager.getInstance();
		
		if (match.getGoals1() < match.getGoals2())
		{
			match.getTeam(1).setPoints(match.getTeam(1).getPoints()+3);
		}
		
		else if(match.getGoals2() < match.getGoals1())
		{
			match.getTeam(0).setPoints(match.getTeam(0).getPoints()+3);
		}
		
		else if(match.getGoals2() == match.getGoals1())
		{
			match.getTeam(0).setPoints(match.getTeam(0).getPoints()+1);
			match.getTeam(1).setPoints(match.getTeam(1).getPoints()+1);	
		}
		XStreamPersistence.saveToXMLwithXStream(manager);
	}
	
	//Create new infraction
	public void newInfraction(boolean red, boolean yellow, boolean other, boolean penalty,Player player, Match match1 )
	{
		Manager manager = Manager.getInstance();
		boolean isRedCard = red;
		boolean isYellowCard = yellow;
		boolean isOther = other;
		boolean isPenalty = penalty;
		Player playertemp = player;
		Match matchtemp = match1;
		Infraction newInfraction = new Infraction(isRedCard, isYellowCard, isOther, isPenalty);
		if (isRedCard || isYellowCard || isOther || isPenalty) 
		{
			//adding infraction to player
			for (int i=0; i < manager.numberOfTeams(); i++)
			{
				for (int j=0; j < manager.getTeam(i).numberOfPlayers(); j++)
				{
					if(manager.getTeam(i).getPlayer(j) == playertemp)
					{
						manager.getTeam(i).getPlayer(j).addInfraction(newInfraction);
					}   
				}
			}
			//adding infraction to match
			for (int k = 0; k < manager.numberOfMatches(); k++ )
			{
				if(manager.getMatche(k) == matchtemp)
				{
					manager.getMatche(k).addInfraction(newInfraction);
				}
			}
		}
		}
	
	//Sort an array of players by goals
	public void sortByGoals(Player[] players)
	{
		int i =0;
		int j=0;
		
		for(int k = 1; k<players.length;k++)
		{
			List<Shot> s1 = players[k-1].getShots();
			for(Shot s: s1)
			{
				if(s.getIsGoal()==true)
				{
					i++;
				}
			}
			
			List<Shot> s2 = players[k].getShots();
			for(Shot s: s2)
			{
				if(s.getIsGoal()==true)
				{
					j++;
				}
			}
			
			if(i>j)
			{
					Player temp = new Player("temp",0,0,0,players[k-1].getTeam());
					temp = players[k-1];
					players[k-1]=players[k];
					players[k]=temp;
			}
		}
	}
	
	//create a sorted list of all players
	public Player[] playerRankings (String sortBy)
	{
		String sort = sortBy;
		Manager manager = Manager.getInstance();
		int i =0;
		int j=0;
		
		for(int t=0; t<manager.numberOfTeams();t++)
		{
			i = i + manager.getTeam(t).numberOfPlayers();
		}
		
		Player[] players = new Player[i];
		
		for(int k=0; k<manager.numberOfTeams();k++)
		{
			for(int p=0; p<manager.getTeam(k).numberOfPlayers(); p++)
			{
				players[p] = manager.getTeam(k).getPlayer(p);
			}
		}
		
		if(sort=="Goals")
		{
			sortByGoals(players);
		}
		if(sort=="Red Cards")
		{
			sortByReds(players);
		}
		if(sort=="YellowCards")
		{
			sortByYellows(players);
		}
		if(sort=="Other")
		{
			sortByOthers(players);
		}
		if(sort=="Penalty")
		{
			sortByPenalties(players);
		}
		return players;
	}
	
	//to sort by red cards
	public void sortByReds(Player[] players)
		{
			int i =0;
			int j=0;
			for(int m = 1; m <players.length;m++)
			{
				List<Infraction> k1 = players[m-1].getInfractions();
				for(Infraction k: k1)
				{
					if(k.getIsRedCard()==true)
					{
						i++;
					}
				}
				List<Infraction> k2 = players[m].getInfractions();
				for(Infraction k: k2)
				{
					if(k.getIsRedCard()==true)
					{
						j++;
					}
				}
	
				if(i>j)
					{
						Player temp = new Player("temp",0,0,0,players[m-1].getTeam());
						temp = players[m-1];
						players[m-1]=players[m];
						players[m]=temp;
					}
			}
		}
	    
	//to sort by yellow cards
	public void sortByYellows(Player[] players)
	{
		int i =0;
		int j=0;
		for(int m = 1; m <players.length;m++)
		{
			List<Infraction> k1 = players[m-1].getInfractions();
			for(Infraction k: k1)
			{
				if(k.getIsYellowCard()==true)
				{
					i++;
				}
			}
			List<Infraction> k2 = players[m].getInfractions();
			for(Infraction k: k2)
			{
				if(k.getIsYellowCard()==true)
				{
					j++;
				}
			}

			if(i>j)
				{
					Player temp = new Player("temp",0,0,0,players[m-1].getTeam());
					temp = players[m-1];
					players[m-1]=players[m];
					players[m]=temp;
				}
			
		}
	}
	  
	//to sort by penalties
	public void sortByPenalties(Player[] players)
		{
			int i =0;
			int j=0;
			for(int m = 1; m <players.length;m++)
			{
				List<Infraction> k1 = players[m-1].getInfractions();
				for(Infraction k: k1)
				{
					if(k.getIsPenalty()==true)
					{
						i++;
					}
				}
			List<Infraction> k2 = players[m].getInfractions();
			for(Infraction k: k2)
				{
				if(k.getIsPenalty()==true)
					{
						j++;
					}
				}

			if(i>j)
				{
					Player temp = new Player("temp",0,0,0,players[m-1].getTeam());
					temp = players[m-1];
					players[m-1]=players[m];
					players[m]=temp;
				}
			
			}
		}
	    
	//to sort by others
	public void sortByOthers(Player[] players)
		{
			int i =0;
			int j=0;
			for(int m = 1; m <players.length;m++)
			{
				List<Infraction> k1 = players[m-1].getInfractions();
				for(Infraction k: k1)
				{
					if(k.getIsOther()==true)
					{
						i++;
					}
				}
				
				List<Infraction> k2 = players[m].getInfractions();
				for(Infraction k: k2)
				{
					if(k.getIsOther()==true)
					{
						j++;
					}
				}
			
				if(i>j)
					{
						Player temp = new Player("temp",0,0,0,players[m-1].getTeam());
						temp = players[m-1];
						players[m-1]=players[m];
						players[m]=temp;
					}
			}
		}
	
	//sort teams by shots
	public void sortTeamGoals(Team[] teams)
	{
		int i =0;
		int j =0;
		
		for(int k=1; k<teams.length; k++)
		{
			for(int z=1; z<teams[k-1].numberOfPlayers();z++)
			{
				List<Shot> s1 = teams[k-1].getPlayer(z).getShots();
				for (Shot s: s1)
				{
					if(s.getIsGoal()==true)
					{
						i++;
					}
				}
			}
			
			for(int z=1; z<teams[k].numberOfPlayers();z++)
			{
				List<Shot> s2 = teams[k].getPlayer(z).getShots();
				for (Shot s: s2)
				{
					if(s.getIsGoal()==true)
					{
						j++;
					}
				}
			}
			
			if(i>j)
			{
				Team temp = new Team("temp",0);
				temp = teams[k-1];
				teams[k-1]=teams[k];
				teams[k]=temp;
			}
		}
	}
	
	//sort teams by points
	public void sortTeamsByPoints (Team[] teams)
	{
		for(int i=1; i<teams.length;i++)
		{
			if(teams[i-1].getPoints() > teams[i].getPoints())
			{
				Team temp = new Team("temp",0);
				temp = teams[i-1];
				teams[i-1]=teams[i];
				teams[i]=temp;
			}
		}
	}
	
	//sort teams by reds
	public void sortTeamReds(Team[] teams)
	{
		int i =0;
		int j =0;
		
		for(int k=1; k<teams.length; k++)
		{
			for(int z=1; z<teams[k-1].numberOfPlayers();z++)
			{
				List<Infraction> s1 = teams[k-1].getPlayer(z).getInfractions();
				for (Infraction s: s1)
				{
					if(s.getIsRedCard()==true)
					{
						i++;
					}
				}
			}
			
			for(int z=1; z<teams[k].numberOfPlayers();z++)
			{
				List<Infraction> s2 = teams[k].getPlayer(z).getInfractions();
				for (Infraction s: s2)
				{
					if(s.getIsRedCard()==true)
					{
						j++;
					}
				}
			}
			
			if(i>j)
			{
				Team temp = new Team("temp",0);
				temp = teams[k-1];
				teams[k-1]=teams[k];
				teams[k]=temp;
			}
		}
	}
	
	//sort teams by yellows
	public void sortTeamYellows(Team[] teams)
	{
		int i =0;
		int j =0;
		
		for(int k=1; k<teams.length; k++)
		{
			for(int z=1; z<teams[k-1].numberOfPlayers();z++)
			{
				List<Infraction> s1 = teams[k-1].getPlayer(z).getInfractions();
				for (Infraction s: s1)
				{
					if(s.getIsYellowCard()==true)
					{
						i++;
					}
				}
			}
			
			for(int z=1; z<teams[k].numberOfPlayers();z++)
			{
				List<Infraction> s2 = teams[k].getPlayer(z).getInfractions();
				for (Infraction s: s2)
				{
					if(s.getIsYellowCard()==true)
					{
						j++;
					}
				}
			}
			
			if(i>j)
			{
				Team temp = new Team("temp",0);
				temp = teams[k-1];
				teams[k-1]=teams[k];
				teams[k]=temp;
			}
		}
	}
	
	//sort teams by penalties
	public void sortTeamPenalties(Team[] teams)
	{
		int i =0;
		int j =0;
		
		for(int k=1; k<teams.length; k++)
		{
			for(int z=1; z<teams[k-1].numberOfPlayers();z++)
			{
				List<Infraction> s1 = teams[k-1].getPlayer(z).getInfractions();
				for (Infraction s: s1)
				{
					if(s.getIsPenalty()==true)
					{
						i++;
					}
				}
			}
			
			for(int z=1; z<teams[k].numberOfPlayers();z++)
			{
				List<Infraction> s2 = teams[k].getPlayer(z).getInfractions();
				for (Infraction s: s2)
				{
					if(s.getIsPenalty()==true)
					{
						j++;
					}
				}
			}
			
			if(i>j)
			{
				Team temp = new Team("temp",0);
				temp = teams[k-1];
				teams[k-1]=teams[k];
				teams[k]=temp;
			}
		}
	}
	
	//sort teams by others
	public void sortTeamOthers(Team[] teams)
	{
		int i =0;
		int j =0;
		
		for(int k=1; k<teams.length; k++)
		{
			for(int z=1; z<teams[k-1].numberOfPlayers();z++)
			{
				List<Infraction> s1 = teams[k-1].getPlayer(z).getInfractions();
				for (Infraction s: s1)
				{
					if(s.getIsOther()==true)
					{
						i++;
					}
				}
			}
			
			for(int z=1; z<teams[k].numberOfPlayers();z++)
			{
				List<Infraction> s2 = teams[k].getPlayer(z).getInfractions();
				for (Infraction s: s2)
				{
					if(s.getIsOther()==true)
					{
						j++;
					}
				}
			}
			
			if(i>j)
			{
				Team temp = new Team("temp",0);
				temp = teams[k-1];
				teams[k-1]=teams[k];
				teams[k]=temp;
			}
		}
	}

	
	

	
	
		
		
	
		
		
	//Last Paranthesis	
	}

	