import java.util.List;


public class DataManager 
	{
		//Get Team Info Methods:
		public List<Player> listAllPlayersinTeam (Team x)
		{
			return x.getPlayers();
		}
		
		//insert method : get all shots/infractions by team
		
		//Get Player Info Methods:
		public List<Shot> listAllShotsOfPlayer (Player x)
		{
			return x.getShots();
		}
		
		public List<Infraction> listAllInfractionsOfPlayer (Player x)
		{
			return x.getInfractions();
		}
		
		//insert method: Get list of teams
		
		//insert method: Get list of players
		
		//insert method to create match, team, player
		
		
		
	}
