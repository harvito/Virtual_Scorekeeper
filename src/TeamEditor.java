
public class TeamEditor 
	{
		//HOW DO WE DELETE A PIECE OF SHIT TEAM
	
		public void changeTeamrName(Team x, String newName)
		{
			x.setTeamName(newName);
		}
		
		public void setPoints (Team x, int newPoints)
		{
			x.setPoints(newPoints);
		}
		
		public void addNewPlayer (Team x, Player newbie)
		{
			x.addPlayer(newbie);
		}
		
		public void removePlayer (Team x, Player player)
		{
			x.removePlayer(player);
		}
		
		public void deleteAllPlayers(Team x)
		{
			x.delete();
		}
		
	}
