import java.sql.Date;
import java.util.List;


public class Controller
	{
		
		//ALSO ADD METHODS TO SORT PLAYER/TEAM TABLES
		
	
		//ALSO ADD METHOD FOR LOGINVALIDITY
	
		//Retrieve Info about Match:
		public Date getMatchDate (Match x)
		{
			return x.getDate();
		}
		
		public String getMatchLocation (Match x)
		{
			return x.getLocation();
		}
		
		public List<Team> getTeamsPlayingMatch (Match x)
		{
			return x.getTeams();
		}
		//How to retrieve Score???
		
		//Retrieve Info about Team
		public String getTeamName (Team x)
		{
			return x.getTeamName();
		}
		
		public int getTeamPoints (Team x)
		{
			return x.getPoints();
		}
		
		//METHOD TO GET LIST OF PLAYERS WAS PLACED IN DATA MANGER FOR SOME UNKNOWN REASON
		
		public int numberOfPlayersinTeam (Team x)
		{
			return x.numberOfPlayers();
		}
		
		//Retrieve Info about Player:
		public String getPlayerName(Player x)
		{
			return x.getPlayerName();
		}
		
		public int getPlayerJerseyNumber(Player x)
		{
			return x.getJerseyNumber();
		}
		
		public boolean getPlayerType(Player x)
		{
			return x.getGoalKeeper();
		}
		
		//FOR SOME REASON LIST OF SHOTS AND INFRACTIONS WAS PLACED IN DATA MANAGER
		
		public int getPlayerNumberofShots (Player x)
		{
			return x.numberOfShots();
		}
		
		// NEED METHOD FOR NUMBER OF SHOTS ON GOAL / PENALTY / SCORED
		
		public int getPlayerNumberofInfractions (Player x)
		{
			return x.numberOfInfractions();
		}
		
		// NEED METHOD FOR INFRACTIONS: RED CARDS< YELLOW CARDS< OTHER
	
		
	}
