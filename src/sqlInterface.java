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
	
	public static boolean addPlayer(String playerName, int jerseyNum, float height, float weight, boolean goalKeeper) {
		String url = "jdbc:mysql://159.203.11.244:3306/filthybase";
		String user = "filthyuser";
		String password = "filthypass";
		try (Connection connection = DriverManager.getConnection(url, user, password);
				Statement stmt = connection.createStatement()) {
			try (ResultSet rs = stmt.executeQuery("INSERT INTO players VALUES ("
													+ playerName + "," 
													+ String.valueOf(jerseyNum) + ","
													+ String.valueOf(height) + ","
													+ String.valueOf(weight) + ","
													+ String.valueOf(goalKeeper) + ") ;")) {
				connection.close();
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
		//remove the player from the database
	}
	
	public static boolean removePlayer (String playerName) {
		String url = "jdbc:mysql://159.203.11.244:3306/filthybase";
		String user = "filthyuser";
		String password = "filthypass";
		try (Connection connection = DriverManager.getConnection(url, user, password);
				Statement stmt = connection.createStatement()) {
			try (ResultSet rs = stmt.executeQuery("DELETE FROM players WHERE name='" + playerName + "';")) {
				connection.close();
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public static boolean addTeam(String teamName) {
		String url = "jdbc:mysql://159.203.11.244:3306/filthybase";
		String user = "filthyuser";
		String password = "filthypass";
		try (Connection connection = DriverManager.getConnection(url, user, password);
				Statement stmt = connection.createStatement()) {
			try (ResultSet rs = stmt.executeQuery("INSERT INTO teams VALUES (" + teamName + ") ;")) {
				connection.close();
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
		//remove the player from the database
	}
	
	public static boolean removeTeam (String teamName) {
		String url = "jdbc:mysql://159.203.11.244:3306/filthybase";
		String user = "filthyuser";
		String password = "filthypass";
		try (Connection connection = DriverManager.getConnection(url, user, password);
				Statement stmt = connection.createStatement()) {
			try (ResultSet rs = stmt.executeQuery("DELETE FROM teams WHERE name='" + teamName + "';")) {
				connection.close();
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}	
	
	public static boolean changePlayersTeam (String playerName, String teamFrom, String teamTo) {
		String url = "jdbc:mysql://159.203.11.244:3306/filthybase";
		String user = "filthyuser";
		String password = "filthypass";
		try (Connection connection = DriverManager.getConnection(url, user, password);
				Statement stmt = connection.createStatement()) {
			try (ResultSet rs = stmt.executeQuery("UPDATE players SET team='" + teamTo + "' WHERE team='" + teamFrom + "';")) {
				connection.close();
				if (rs != null) {
					return true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;		
	}
	
	public static String[] getPlayerInfo (String playerName){
		String url = "jdbc:mysql://159.203.11.244:3306/filthybase";
		String user = "filthyuser";
		String password = "filthypass";
		String[] playerInfo = new String[4];
		try (Connection connection = DriverManager.getConnection(url, user, password);
				Statement stmt = connection.createStatement()) {
			try (ResultSet rs = stmt.executeQuery("SELECT * FROM players WHERE name='" + playerName + "';")) {
				connection.close();
				if (rs != null) {
					playerInfo[0] = rs.getString(0);
					playerInfo[1] = rs.getString(1);
					playerInfo[2] = rs.getString(2);
					playerInfo[3] = rs.getString(3);
					return playerInfo;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static String[][] getTeamsFullPlayerInfo(String teamName) {
		String url = "jdbc:mysql://159.203.11.244:3306/filthybase";
		String user = "filthyuser";
		String password = "filthypass";
		String[][] playersInfo = new String[16][4];
		int i = 0;
		try (Connection connection = DriverManager.getConnection(url, user, password);
				Statement stmt = connection.createStatement()) {
			try (ResultSet rs = stmt.executeQuery("SELECT * FROM players WHERE currentTeam='" + teamName + "';")) {
				connection.close();
				if (rs != null) {
					do {
						playersInfo[i][0] = rs.getString(0);
						playersInfo[i][1] = rs.getString(1);
						playersInfo[i][2] = rs.getString(2);
						playersInfo[i][3] = rs.getString(3);
						i++;
					} while (rs.next());
					return playersInfo;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}	
	
	public static String[][] getAllPlayersFullInfo() {
		String url = "jdbc:mysql://159.203.11.244:3306/filthybase";
		String user = "filthyuser";
		String password = "filthypass";
		String[][] teamInfo = new String[16][4];
		int i = 0;
		try (Connection connection = DriverManager.getConnection(url, user, password);
				Statement stmt = connection.createStatement()) {
			try (ResultSet rs = stmt.executeQuery("SELECT * FROM players;")) {
				connection.close();
				if (rs != null) {
					do {
						teamInfo[i][0] = rs.getString(0);
						teamInfo[i][1] = rs.getString(1);
						teamInfo[i][2] = rs.getString(2);
						teamInfo[i][3] = rs.getString(3);
						i++;
					} while (rs.next());
					return teamInfo;
				}
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
		String[] teamNames = new String[16];
		int i = 0;
		try (Connection connection = DriverManager.getConnection(url, user, password);
				Statement stmt = connection.createStatement()) {
			try (ResultSet rs = stmt.executeQuery("SELECT name FROM teams;")) {
				connection.close();
				if (rs != null) {
					teamNames[i] = rs.getString(0);
					while (rs.next()) {
						i++;
						teamNames[i] = rs.getString(0);
					}
					return teamNames;
				}
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
		String[] playersOnTeam = new String[20];
		int i = 0;
		try (Connection connection = DriverManager.getConnection(url, user, password);
				Statement stmt = connection.createStatement()) {
			try (ResultSet rs = stmt.executeQuery("SELECT name FROM players WHERE currentTeam='" + teamName + "';")) {
				connection.close();
				if (rs != null) {
					playersOnTeam[i] = rs.getString(0);
					while (rs.next()) {
						i++;
						playersOnTeam[i] = rs.getString(0);
					}
					return playersOnTeam;
				}
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
				if (rs != null) {
					amountOfGoals = 1;
					while (rs.next()) {
						amountOfGoals++;
					}
					return amountOfGoals;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return amountOfGoals;
	}
	
	
}
