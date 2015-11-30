import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import com.mysql.jdbc.Driver;

public class sqlInterface {
	
	//constructor holding all the connection shit
	public sqlInterface() {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String connectionUrl = "jdbc:mysql://159.203.11.244:3306/filthybase";
			String connectionUser = "filthyuser";
			String connectionPassword = "filthypass";
			DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
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
	
	public static boolean addPlayer(String playerName, int jerseyNum, float height, float weight) {
		String url = "jdbc:mysql://159.203.11.244:3306/filthybase";
		String user = "filthyuser";
		String password = "filthypass";
		try (Connection connection = DriverManager.getConnection(url, user, password);
				Statement stmt = connection.createStatement()) {
			try (ResultSet rs = stmt.executeQuery("INSERT INTO players VALUES ("
													+ playerName + "," 
													+ String.valueOf(jerseyNum) + ","
													+ String.valueOf(height) + ","
													+ String.valueOf(weight) + ") ;")) {
				connection.close();
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
		//remove the player from the database
	}
	
	public static void removePlayer (String playerName) {
		String url = "jdbc:mysql://159.203.11.244:3306/filthybase";
		String user = "filthyuser";
		String password = "filthypass";
		try (Connection connection = DriverManager.getConnection(url, user, password);
				Statement stmt = connection.createStatement()) {
			try (ResultSet rs = stmt.executeQuery("DELETE FROM players WHERE name='" + playerName + "';")) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static String[] getFullTeamInfo(String teamName) {
		String url = "jdbc:mysql://159.203.11.244:3306/filthybase";
		String user = "filthyuser";
		String password = "filthypass";
		try (Connection connection = DriverManager.getConnection(url, user, password);
				Statement stmt = connection.createStatement()) {
			try (ResultSet rs = stmt.executeQuery("SELECT * FROM players WHERE currentTeam='" + teamName + "';")) {
				connection.close();
				return (String[])rs.getArray("is_nullable").getArray();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public String[] getTeamNames() {
		String url = "jdbc:mysql://159.203.11.244:3306/filthybase";
		String user = "filthyuser";
		String password = "filthypass";
		try (Connection connection = DriverManager.getConnection(url, user, password);
				Statement stmt = connection.createStatement()) {
			try (ResultSet rs = stmt.executeQuery("SELECT name FROM teams;")) {
				connection.close();
				return (String[])rs.getArray("is_nullable").getArray();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public String[] getPlayersOnTeam (String teamName) {
		String url = "jdbc:mysql://159.203.11.244:3306/filthybase";
		String user = "filthyuser";
		String password = "filthypass";
		try (Connection connection = DriverManager.getConnection(url, user, password);
				Statement stmt = connection.createStatement()) {
			try (ResultSet rs = stmt.executeQuery("SELECT name FROM players WHERE currentTeam='" + teamName + "';")) {
				connection.close();
				return (String[])rs.getArray("is_nullable").getArray();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}

	public static int getTeamTotalGoals (String teamName) {
		String url = "jdbc:mysql://159.203.11.244:3306/filthybase";
		String user = "filthyuser";
		String password = "filthypass";
		int amountOfGoals = 0;
		try (Connection connection = DriverManager.getConnection(url, user, password);
				Statement stmt = connection.createStatement()) {
			try (ResultSet rs = stmt.executeQuery("SELECT playerName FROM shots WHERE teamFrom='" 
													+ teamName +
													"' and success='2';")) {
				connection.close();
				String[] god = (String[])rs.getArray("is_nullable").getArray();
				amountOfGoals = god.length;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return amountOfGoals;
	}
	
	
}
