import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import com.mysql.jdbc.Driver;

public class sqlInterface {
	
	//constructor holding all the connection shit
	public sqlInterface() {
		//these variables pertain to the code which connects to the sql database
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
	
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String connectionUrl = "jdbc:mysql://159.203.11.244:3306/filthybase";
			String connectionUser = "filthyuser";
			String connectionPassword = "filthypass";
			conn = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
			stmt = conn.createStatement();
		}
		catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { if (rs != null) rs.close(); } catch (SQLException e) { e.printStackTrace(); }
			try { if (stmt != null) stmt.close(); } catch (SQLException e) { e.printStackTrace(); }
			try { if (conn != null) conn.close(); } catch (SQLException e) { e.printStackTrace(); }
		}
	}
	public static void main(String[] args) {
	}
	
	public static String[][] getPlayers(int column, String team) {
		//these variables are to deal with multiple 
		String output[][] = null;
		int playerCounter = 0;
			

			if (team == "All") {
				rs = stmt.executeQuery("SELECT * FROM players");
				while (rs.next()) {
					output[playerCounter][0] = rs.getString("name");
					output[playerCounter][1] = rs.getString("jerseyNum");
					output[playerCounter][2] = rs.getString("height");
					output[playerCounter][3] = rs.getString("weight");
					playerCounter++;
				}
			} else  {
				String[] playerList = getPlayersOnTeam(team);
				rs = stmt.executeQuery("SELECT * FROM players");
				while (rs.next()) {
					
					playerCounter++;
				}
			}

			while (rs.next()) {
				
				String id = rs.getString("id");
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				System.out.println("ID: " + id + ", First Name: " + firstName
						+ ", Last Name: " + lastName);
			}
			if (conn != null) {
				conn.close();
			}

		return null;
	}
	
	public static boolean addPlayer(String name, int jerseyNum, float height, float weight) {
		return true;
		//remove the player from the database
	}
	
	public static void removePlayer (String name) {
		
	}
	
	public static String[][] getTeams(int column) {
		
		return (["Bob"]["loblaw"]);
	}
	
	public String[] getPlayersOnTeam (String teamName) {
		String[] output = null;
		//rs = this.executeQuery("SELECT * FROM players");
		String id = rs.getString("id");
		return rs.getArray("PlayerList");	
		
	}

	public static int getTeamTotalGoals (String teamName) {
		return 0;
	}
	
	
}
