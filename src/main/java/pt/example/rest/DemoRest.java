package pt.example.rest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import pt.example.bootstrap.ConnectProgress;

@Stateless
@Path("/demo")
public class DemoRest {

	@GET
	@Path("/silver/{ofnum}")
	@Produces("application/json")
	public List<HashMap<String, String>> silver(@PathParam("ofnum") String ofnum)
			throws SQLException, ClassNotFoundException {

		ConnectProgress connectionProgress = new ConnectProgress();

		List<HashMap<String, String>> dados = connectionProgress.getOF(ofnum);
		return dados;
	}

	@GET
	@Path("/operacao/{ofanumenr}")
	@Produces("application/json")
	public List<HashMap<String, String>> operacao(@PathParam("ofanumenr") String ofanumenr)
			throws SQLException, ClassNotFoundException {

		ConnectProgress connectionProgress = new ConnectProgress();

		List<HashMap<String, String>> dados = connectionProgress.getOP(ofanumenr);
		return dados;
	}

	@GET
	@Path("/allop")
	@Produces("application/json")
	public List<HashMap<String, String>> allop() throws SQLException, ClassNotFoundException {

		ConnectProgress connectionProgress = new ConnectProgress();

		List<HashMap<String, String>> dados = connectionProgress.getallOP();
		return dados;
	}

	@GET
	@Path("/maquina/{SECNUMENR}")
	@Produces("application/json")
	public List<HashMap<String, String>> maquina(@PathParam("SECNUMENR") String SECNUMENR)
			throws SQLException, ClassNotFoundException {

		ConnectProgress connectionProgress = new ConnectProgress();

		List<HashMap<String, String>> dados = connectionProgress.getMaq(SECNUMENR);
		return dados;
	}

	@GET
	@Path("/allmaquina")
	@Produces("application/json")
	public List<HashMap<String, String>> Allmaquina() throws SQLException, ClassNotFoundException {

		ConnectProgress connectionProgress = new ConnectProgress();

		List<HashMap<String, String>> dados = connectionProgress.getAllMaq();
		return dados;
	}

	@GET
	@Path("/tipofaltas")
	@Produces("application/json")
	public List<HashMap<String, String>> getTipoFalta() throws SQLException, ClassNotFoundException {

		ConnectProgress connectionProgress = new ConnectProgress();

		List<HashMap<String, String>> dados = connectionProgress.getTipoFalta();
		return dados;
	}

	@GET
	@Path("/users")
	@Produces("application/json")
	public List<HashMap<String, String>> getUsers() throws SQLException, ClassNotFoundException {

		ConnectProgress connectionProgress = new ConnectProgress();

		List<HashMap<String, String>> dados = connectionProgress.getUsers();
		return dados;
	}

	@GET
	@Path("/searchuser/{RESCOD}")
	@Produces("application/json")
	public List<HashMap<String, String>> getUser(@PathParam("RESCOD") String RESCOD)
			throws SQLException, ClassNotFoundException {

		ConnectProgress connectionProgress = new ConnectProgress();

		List<HashMap<String, String>> dados = connectionProgress.getUser(RESCOD);
		return dados;
	}

	@GET
	@Path("/sessoes")
	@Produces("application/json")
	public List<HashMap<String, String>> getSessoes() throws SQLException, ClassNotFoundException {

		ConnectProgress connectionProgress = new ConnectProgress();

		List<HashMap<String, String>> dados = connectionProgress.getSessoes();
		return dados;
	}

	@GET
	@Path("/listadefeitos")
	@Produces("application/json")
	public List<HashMap<String, String>> getListaDefe() throws SQLException, ClassNotFoundException {

		ConnectProgress connectionProgress = new ConnectProgress();

		List<HashMap<String, String>> dados = connectionProgress.getListaDefe();
		return dados;
	}

	@GET
	@Path("/referencias/{OFANUMENR}")
	@Produces("application/json")
	public List<HashMap<String, String>> getRef(@PathParam("OFANUMENR") String OFANUMENR)
			throws SQLException, ClassNotFoundException {

		ConnectProgress connectionProgress = new ConnectProgress();

		List<HashMap<String, String>> dados = connectionProgress.getRef(OFANUMENR);
		return dados;
	}
	
	@GET
	@Path("/familias")
	@Produces("application/json")
	public List<HashMap<String, String>> getFamilias()
			throws SQLException, ClassNotFoundException {

		ConnectProgress connectionProgress = new ConnectProgress();

		List<HashMap<String, String>> dados = connectionProgress.getFamilias();
		return dados;
	}

}
