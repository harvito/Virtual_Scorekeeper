import java.sql.Date;
import java.util.List;

public class BatchInput 
	{
		private int team1Score;
		private int team2Score;
		
		// This class makes no sense
		public void createNewMatch (String loc, Date date, Team teamone, Team teamtwo)
		{
			//NOT SURE WHAT IM DOING IN THIS METHOD...SOMEONE READ IT AND FIX IF WRONG
			//making a variable called newMatch doesn't make sense to me
			Match newMatch = new Match (loc, date, teamone, teamtwo);
		
			team1Score=0;
			team2Score=0;
			

		}
		
		//Batch method should also allow to edit old matches
		
		public void changeLocation (Match x, String loc)
		{
			x.setLocation(loc);
		}
		
		public void changeDate (Match x, Date date)
		{
			x.setDate(date);
		}
		
		public void changeTeams (Match x, Team teamone, Team teamtwo)
		{
			x.setTeams(teamone, teamtwo);
		}
		
		//How do we delete a match
		//How do we insert shots and infractions?????????????
		
	}
