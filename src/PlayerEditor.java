
public class PlayerEditor 
	{
		//HOW DO WE DELETE A PIECE OF SHIT PLAYER
		
		public void changePlayerName(Player x, String newName)
		{
			x.setPlayerName(newName);
		}
		
		public void chanePlayerJerseyNumber(Player x, int newNum)
		{
			x.setJerseyNumber(newNum);
		}
		
		public void changePlayerType(Player x, boolean goalkeeper)
		{
			x.setGoalKeeper(goalkeeper);
		}
		
		public void clearAllShotsAndInfractions(Player x)
		{
			x.delete();
		}
		
		public void addShot(Player x, Shot newShot)
		{
			x.addShot(newShot);
		}
		
		public void removeShot(Player x, Shot removeShot)
		{
			x.removeShot(removeShot);
		}
		
		public void addInfraction(Player x, Infraction newInfraction)
		{
			x.addInfraction(newInfraction);
		}
		
		public void removeInfraction(Player x, Infraction removeInfraction)
		{
			x.removeInfraction(removeInfraction);
		}
		
	}
