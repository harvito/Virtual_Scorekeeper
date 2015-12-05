import java.util.Vector;

import javax.swing.table.AbstractTableModel;

public class playersTableModel extends AbstractTableModel {

	
	private Vector<String[]> data = new Vector<String[]>(320);
	
	public String team = "all"; //this should be deleted
	
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
                return "Position";
            case 5:
            	return "Team";
        }
        return "";  
    }	

	public void updateTable() {
		//clear the current data
		data.clear();
		//columntosortby=blabla //get value of dropdownbox sortby
		team = "all";//get value of dropdownbox team
		
		//add all the new data to the data vector
		if (team == "all") {
			String[][] temp = new String[320][6];
			temp = sqlInterface.getTeamsFullPlayerInfo("%");
			int i = 0;
			for (i=0; i <=320; i++) {
				data.add(temp[i]);
			}
		} else {
			String[][] temp = new String[20][6];
			temp = sqlInterface.getTeamsFullPlayerInfo(team);
			int i = 0;
			for (i=0; i <=20; i++) {
				data.add(temp[i]);
			}
		}
		fireTableDataChanged();
	}
	/*
	public void setValueAt(Object value, int row, int col) {

	      data[row][col] = (String) value;
	      fireTableCellUpdated(row, col);

	    }
	*/
	/**
	 * serialVersionUID because apparently it's necessary
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 7;
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
		if (data.get(0) != null) { data.elementAt(1);
			if (data.get(row)[col] != null) {
				return data.get(row)[col];
			}	
		}
		return "0";
	}

}
