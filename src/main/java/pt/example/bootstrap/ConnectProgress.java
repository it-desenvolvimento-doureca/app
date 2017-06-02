package pt.example.bootstrap;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.json.JsonObject;

public class ConnectProgress {

	private static final String QUERY = "select * from PUB.\"SOFA\" where utimod= 'recep1'";
	private static final String QUERY_CADEIRA = null;
	public static String querySofaGetAll = "select * from PUB.\"SOFA\" where utimod='%s'";

	public static void main(String[] args) throws SQLException {
	}

	private Connection getConnection() {
		Connection connection = null;
		try {
			// the openedge driver string
			Class.forName("com.ddtek.jdbcx.openedge.OpenEdgeDataSource40");
			// the openedge url
			String url = "jdbc:datadirect:openedge://192.168.30.25:20612;DatabaseName=silv-exp;User=SYSPROGRESS;Password=SYSPROGRESS;";

			// get the openedge database connection
			connection = DriverManager.getConnection(url);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			// System.exit(1);
		} catch (SQLException e) {
			e.printStackTrace();
			// System.exit(2);
		} finally {
			// connection.close();
		}
		return connection;
	}

	public List<String> getSofas() throws SQLException {
		String query = String.format(ConnectProgress.querySofaGetAll, "recep1");

		List<String> x = new ArrayList<>();

		// Usa sempre assim que fecha os resources automaticamente
		try (Connection connection = getConnection();
				Statement stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery(query)) {
			while (rs.next()) {
				String coffeeName = rs.getString("OFNUM");
				x.add(coffeeName);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
	}

	public List<String> getCadeira() throws SQLException {

		// Query da cadeira
		// String query = String.format(ConnectProgress.querySofaGetAll,
		// "recep1");

		List<String> x = new ArrayList<>();

		// Usa sempre assim que fecha os resources automaticamente
		try (Connection connection = getConnection();
				Statement stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery(QUERY_CADEIRA)) {
			while (rs.next()) {
				// parser da cadeira
				String coffeeName = rs.getString("utimod");
				x.add(coffeeName);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
	}

	public List<HashMap<String, String>> getOF(String ofnum) throws SQLException {

		String query = "select * from PUB.\"SOFA\" where ofnum= '"+ofnum+"'";

		List<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();

		// Usa sempre assim que fecha os resources automaticamente
		try (Connection connection = getConnection();
				Statement stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery(query)) {
			while (rs.next()) {
				// parser da cadeira
				HashMap<String, String> x = new HashMap<>();
				x.put("ofnum", rs.getString("ofnum"));
				x.put("ofanumenr",rs.getString("ofanumenr"));
				list.add(x);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	public List<HashMap<String, String>> getOP(String ofanumenr) throws SQLException {

		String query = "select * from PUB.\"SOFD\" where ofanumenr= '"+ofanumenr+"'";
		
		List<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();

		// Usa sempre assim que fecha os resources automaticamente
		try (Connection connection = getConnection();
				Statement stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery(query)) {
			while (rs.next()) {
				// parser das operações
				HashMap<String, String> x = new HashMap<>();
				x.put("OPECOD",rs.getString("OPECOD"));
				x.put("OPEDES",rs.getString("OPEDES"));
				list.add(x);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	public List<HashMap<String, String>> getallOP() throws SQLException {

		String query = "select DISTINCT OPECOD,OPEDES from PUB.\"SOFD\"";
		
		List<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();

		// Usa sempre assim que fecha os resources automaticamente
		try (Connection connection = getConnection();
				Statement stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery(query)) {
			while (rs.next()) {
				// parser das operações
				HashMap<String, String> x = new HashMap<>();
				x.put("OPECOD",rs.getString("OPECOD"));
				x.put("OPEDES",rs.getString("OPEDES"));
				list.add(x);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	
	public List<HashMap<String, String>> getMaq(String ofanumenr) throws SQLException {

		String query = "select * from PUB.\"SDTSEC\"a inner join PUB.\"SPASSE\" b on a.ssecod = b.ssecod where a.ssecod= '"+ofanumenr+"'";
		
		List<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();

		// Usa sempre assim que fecha os resources automaticamente
		try (Connection connection = getConnection();
				Statement stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery(query)) {
			while (rs.next()) {
				// parser das operações
				HashMap<String, String> x = new HashMap<>();
				x.put("ssecod",rs.getString("ssecod"));
				x.put("SSEDES",rs.getString("SSEDES"));
				list.add(x);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}