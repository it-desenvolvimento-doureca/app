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
	public static String querySofaGetAll = "select * from PUB.\"SOFA\" where utimod='%s'";
	Connection globalconnection = null;

	public static void main(String[] args) throws SQLException {
	}

	private Connection getConnection() throws SQLException {
		try {
			// the openedge driver string
			Class.forName("com.ddtek.jdbcx.openedge.OpenEdgeDataSource40");
			// the openedge url
			String url = "jdbc:datadirect:openedge://192.168.40.112:20613;DatabaseName=silv-ver;User=SYSPROGRESS;Password=SYSPROGRESS;";
			//String url = "jdbc:datadirect:openedge://192.168.30.25:20612;DatabaseName=silv-exp;User=SYSPROGRESS;Password=SYSPROGRESS;";
			// get the openedge database connection
			globalconnection = DriverManager.getConnection(url);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			globalconnection.close();
			// System.exit(1);
		} catch (SQLException e) {
			e.printStackTrace();
			globalconnection.close();
			// System.exit(2);
		} finally {
			// connection.close();
		}
		return globalconnection;
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
			stmt.close();
			rs.close();
			connection.close();
			globalconnection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			globalconnection.close();
			globalconnection.close();
		}
		return x;
	}

	public List<HashMap<String, String>> getOF(String ofnum) throws SQLException {

		String query = "select * from PUB.\"SOFA\" where ofnum= '" + ofnum + "'";

		List<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();

		// Usa sempre assim que fecha os resources automaticamente
		try (Connection connection = getConnection();
				Statement stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery(query)) {
			while (rs.next()) {
				HashMap<String, String> x = new HashMap<>();
				x.put("ofnum", rs.getString("ofnum"));
				x.put("ofanumenr", rs.getString("ofanumenr"));
				x.put("ofref", rs.getString("ofref"));
				list.add(x);
			}
			stmt.close();
			rs.close();
			connection.close();
			globalconnection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			globalconnection.close();
		}
		return list;
	}

	public List<HashMap<String, String>> getOP(String ofanumenr) throws SQLException {

		String query = "select * from PUB.\"SOFD\" where ofanumenr= '" + ofanumenr + "'";

		List<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();

		// Usa sempre assim que fecha os resources automaticamente
		try (Connection connection = getConnection();
				Statement stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery(query)) {
			while (rs.next()) {
				// parser das operações
				HashMap<String, String> x = new HashMap<>();
				x.put("OPECOD", rs.getString("OPECOD"));
				x.put("OPEDES", rs.getString("OPEDES"));
				x.put("SECNUMENR1", rs.getString("SECNUMENR1"));
				list.add(x);
			}
			stmt.close();
			rs.close();
			connection.close();
			globalconnection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			globalconnection.close();
		}
		return list;
	}

	public List<HashMap<String, String>> getallOP() throws SQLException {

		String query = "select * from PUB.\"SDTOPP\"";

		List<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();

		// Usa sempre assim que fecha os resources automaticamente
		try (Connection connection = getConnection();
				Statement stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery(query)) {
			while (rs.next()) {
				// parser das operações
				HashMap<String, String> x = new HashMap<>();
				x.put("OPECOD", rs.getString("OPECOD"));
				x.put("OPEDES", rs.getString("OPEDES"));
				x.put("SECNUMENR1", rs.getString("SECNUMENR1"));
				list.add(x);
			}
			stmt.close();
			rs.close();
			connection.close();
			globalconnection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			globalconnection.close();
		}
		return list;
	}

	public List<HashMap<String, String>> getallOPNOTIN(String data) throws SQLException {
		String query = "select * from PUB.\"SDTOPP\"";
		if ( !data.equals("null")) {
			query += " where OPECOD not in(" + data + ")";
		}

		List<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();

		// Usa sempre assim que fecha os resources automaticamente
		try (Connection connection = getConnection();
				Statement stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery(query)) {
			while (rs.next()) {
				// parser das operações
				HashMap<String, String> x = new HashMap<>();
				x.put("OPECOD", rs.getString("OPECOD"));
				x.put("OPEDES", rs.getString("OPEDES"));
				x.put("SECNUMENR1", rs.getString("SECNUMENR1"));
				list.add(x);
			}
			stmt.close();
			rs.close();
			connection.close();
			globalconnection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			globalconnection.close();
		}
		return list;
	}

	public List<HashMap<String, String>> getTipoFalta() throws SQLException {

		String query = "select DISTINCT * from PUB.\"SPAARR\"";

		List<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();

		// Usa sempre assim que fecha os resources automaticamente
		try (Connection connection = getConnection();
				Statement stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery(query)) {
			while (rs.next()) {
				// parser das operações
				HashMap<String, String> x = new HashMap<>();
				x.put("numenr", rs.getString("numenr"));
				x.put("arrlib", rs.getString("arrlib"));
				list.add(x);
			}
			stmt.close();
			rs.close();
			connection.close();
			globalconnection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			globalconnection.close();
		}
		return list;
	}

	public List<HashMap<String, String>> getMaq(String SECNUMENR) throws SQLException {

		String query = "select * from PUB.\"SDTSEC\"a inner join PUB.\"SPASSE\" b on a.ssecod = b.ssecod where a.SECNUMENR= '"
				+ SECNUMENR + "'";

		List<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();

		// Usa sempre assim que fecha os resources automaticamente
		try (Connection connection = getConnection();
				Statement stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery(query)) {
			while (rs.next()) {
				// parser das operações
				HashMap<String, String> x = new HashMap<>();
				x.put("ssecod", rs.getString("ssecod"));
				x.put("SSEDES", rs.getString("SSEDES"));
				list.add(x);
			}
			stmt.close();
			rs.close();
			connection.close();
			globalconnection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			globalconnection.close();
		}
		return list;
	}

	public List<HashMap<String, String>> getAllMaq() throws SQLException {

		String query = "select * from PUB.\"SDTSEC\"a inner join PUB.\"SPASSE\" b on a.ssecod = b.ssecod";

		List<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();

		// Usa sempre assim que fecha os resources automaticamente
		try (Connection connection = getConnection();
				Statement stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery(query)) {
			while (rs.next()) {
				// parser das operações
				HashMap<String, String> x = new HashMap<>();
				x.put("ssecod", rs.getString("ssecod"));
				x.put("SSEDES", rs.getString("SSEDES"));
				list.add(x);
			}
			stmt.close();
			rs.close();
			connection.close();
			globalconnection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			globalconnection.close();
		}
		return list;
	}

	public List<HashMap<String, String>> getFamilias() throws SQLException {

		String query = "select DISTINCT LEFT(QUACOD,2) as fam from PUB.\"SPAQUA\"";

		List<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();

		// Usa sempre assim que fecha os resources automaticamente
		try (Connection connection = getConnection();
				Statement stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery(query)) {
			while (rs.next()) {
				// parser das operações
				HashMap<String, String> x = new HashMap<>();
				x.put("fam", rs.getString("fam"));
				// x.put("SSEDES", rs.getString("SSEDES"));
				list.add(x);
			}
			stmt.close();
			rs.close();
			connection.close();
			globalconnection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			globalconnection.close();
		}
		return list;
	}

	public List<HashMap<String, String>> getRef(String OFANUMENR) throws SQLException {

		String query = "select * from PUB.\"SOFB\"a inner join PUB.\"SDTPRA\" b on a.PROREF = b.PROREF  where OFANUMENR= '"
				+ OFANUMENR + "'";

		List<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();

		// Usa sempre assim que fecha os resources automaticamente
		try (Connection connection = getConnection();
				Statement stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery(query)) {
			while (rs.next()) {
				// parser das operações
				HashMap<String, String> x = new HashMap<>();
				x.put("PROREF", rs.getString("PROREF"));
				x.put("PRODES1", rs.getString("PRODES1"));
				x.put("VA1REF", rs.getString("VA1REF"));
				x.put("VA2REF", rs.getString("VA2REF"));
				x.put("INDREF", rs.getString("INDREF"));
				x.put("OFBQTEINI", rs.getString("OFBQTEINI"));
				x.put("INDNUMENR", rs.getString("INDNUMENR"));
				
				list.add(x);
			}
			stmt.close();
			rs.close();
			connection.close();
			globalconnection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			globalconnection.close();
		}
		return list;
	}

	public List<HashMap<String, String>> getUsers() throws SQLException {

		String query = "select * from PUB.\"SDTRES \" where RESTYPCOD = 'MO' ";

		List<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();

		// Usa sempre assim que fecha os resources automaticamente
		try (Connection connection = getConnection();
				Statement stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery(query)) {
			while (rs.next()) {
				// parser das operações
				HashMap<String, String> x = new HashMap<>();
				x.put("RESCOD", rs.getString("RESCOD"));
				x.put("RESDES", rs.getString("RESDES"));
				list.add(x);
			}

			stmt.close();
			rs.close();
			connection.close();
			globalconnection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			globalconnection.close();
		}
		return list;
	}

	public List<HashMap<String, String>> getUser(String RESCOD) throws SQLException {

		String query = "select * from PUB.\"SDTRES \" where RESTYPCOD = 'MO' and RESCOD='" + RESCOD + "'";

		List<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();

		// Usa sempre assim que fecha os resources automaticamente
		try (Connection connection = getConnection();
				Statement stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery(query)) {
			while (rs.next()) {
				// parser das operações
				HashMap<String, String> x = new HashMap<>();
				x.put("RESCOD", rs.getString("RESCOD"));
				x.put("RESDES", rs.getString("RESDES"));
				list.add(x);
			}

			stmt.close();
			rs.close();
			connection.close();
			globalconnection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			globalconnection.close();
		}
		return list;
	}

	public List<HashMap<String, String>> getSessoes() throws SQLException {

		String query = "select * from PUB.\"SPASEC \" ";

		List<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();

		// Usa sempre assim que fecha os resources automaticamente
		try (Connection connection = getConnection();
				Statement stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery(query)) {
			while (rs.next()) {
				// parser das operações
				HashMap<String, String> x = new HashMap<>();
				x.put("SECCOD", rs.getString("SECCOD"));
				x.put("SECLIB", rs.getString("SECLIB"));
				list.add(x);
			}

			stmt.close();
			rs.close();
			connection.close();
			globalconnection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			globalconnection.close();
		}
		return list;
	}

	public List<HashMap<String, String>> getListaDefe() throws SQLException {

		String query = "select * from PUB.\"SPAQUA\" ";

		List<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();

		// Usa sempre assim que fecha os resources automaticamente
		try (Connection connection = getConnection();
				Statement stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery(query)) {
			while (rs.next()) {
				// parser das operações
				HashMap<String, String> x = new HashMap<>();
				x.put("QUACOD", rs.getString("QUACOD"));
				x.put("QUALIB", rs.getString("QUALIB"));
				list.add(x);
			}
			stmt.close();
			rs.close();
			connection.close();
			globalconnection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			globalconnection.close();
		}
		return list;
	}

}