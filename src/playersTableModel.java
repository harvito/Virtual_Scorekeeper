import java.util.Arrays;
import java.util.Vector;

import javax.swing.table.AbstractTableModel;

import Model.Manager;

public class playersTableModel extends AbstractTableModel {

	
	private static Vector<String[]> data = new Vector<String[]>(320);
	
	public static String team = "all"; //this should be deleted
	
    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex){
            case 0:
                return "Player";
            case 1:
                return "Jersey Number";
            case 2:
                return "Height";
            case 3:
                return "Weight";
            case 4:
            	return "Team";
        }
        return "";  
    }	

	public static void updateTable() {
		//clear the current data
		data.clear();
		//columntosortby=blabla //get value of dropdownbox sortby
		team = "all";//get value of dropdownbox team
		
		//add all the new data to the data vector
		int i = 0;
		int j = 0;
		int numOfTeams = 0;
		int numOfPlayers = 0;
		String playerData[] = new String[5];
		if (team == "all") {
			numOfTeams = Manager.getInstance().numberOfTeams();
			for (i = 0; i <= numOfTeams; i++) {
				numOfPlayers = Manager.getInstance().getTeam(i).numberOfPlayers();
				for (j = 0; j <= numOfPlayers; j++) {
					playerData[0] = Manager.getInstance().getTeam(i).getPlayer(j).getName();
					playerData[1] =	String.valueOf(Manager.getInstance().getTeam(i).getPlayer(j).getJerseyNumber());
					playerData[2] =	String.valueOf(Manager.getInstance().getTeam(i).getPlayer(j).getHeight());
					playerData[3] =	String.valueOf(Manager.getInstance().getTeam(i).getPlayer(j).getWeight());
					playerData[4] =	String.valueOf(Manager.getInstance().getTeam(i).getPlayer(j).getTeam());
					data.addElement(playerData);
				}
				
			}
		} else {
			String[] columns = new String[5];
			columns[0] = "Player"; 
			columns[1] = "Jersey Number";
			columns[2] = "Height";
			columns[3] = "Weight";
			columns[4] = "Team";
			int x = Arrays.asList(columns).indexOf(team);
			numOfPlayers = Manager.getInstance().getTeam(x).numberOfPlayers();
			for (j = 0; j <= numOfPlayers; j++) {
				playerData[0] = Manager.getInstance().getTeam(x).getPlayer(j).getName();
				playerData[1] =	String.valueOf(Manager.getInstance().getTeam(x).getPlayer(j).getJerseyNumber());
				playerData[2] =	String.valueOf(Manager.getInstance().getTeam(x).getPlayer(j).getHeight());
				playerData[3] =	String.valueOf(Manager.getInstance().getTeam(x).getPlayer(j).getWeight());
				playerData[4] =	String.valueOf(Manager.getInstance().getTeam(x).getPlayer(j).getTeam());
				data.addElement(playerData);
			}
		}
	}

	/**
	 * serialVersionUID because apparently it's necessary
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		if (team=="all") {
			return 320;
		} else {
			return 20;
		}
	}
	
	@Override
	public Object getValueAt(int row, int col) {
		
		// TODO Auto-generated method stub
		if (!data.isEmpty()) {
			if (data.get(row)[col] != null) {
				return data.get(row)[col];
			}
		}
		return "";		
	}
}
