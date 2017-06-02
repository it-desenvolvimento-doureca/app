package pt.example.rest;

import pt.example.bootstrap.ConnectProgress;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import pt.example.dao.UserDao;
import pt.example.entity.User;

@Stateless
@Path("/demo")
public class DemoRest {

	@Inject
	private UserDao dao;

	private ConnectProgress ConnectProgress;

	@GET
	@Path("/user")
	@Produces("application/json")
	public List<User> listUsers() {

		return dao.allEntries();
	}

	@GET
	@Path("/silver/{ofnum}")
	@Produces("application/json")
	public List<HashMap<String, String>> silver(@PathParam("ofnum") String ofnum) throws SQLException, ClassNotFoundException {
				
		ConnectProgress connectionProgress = new ConnectProgress();
		
		 List<HashMap<String, String>> sofas =connectionProgress.getOF(ofnum);
		return sofas;
	}
	
	
	@GET
	@Path("/operacao/{ofanumenr}")
	@Produces("application/json")
	public List<HashMap<String, String>> operacao(@PathParam("ofanumenr") String ofanumenr) throws SQLException, ClassNotFoundException {
				
		ConnectProgress connectionProgress = new ConnectProgress();
		
		 List<HashMap<String, String>> sofas =connectionProgress.getOP(ofanumenr);
		return sofas;
	}
	
	
	@GET
	@Path("/allop")
	@Produces("application/json")
	public List<HashMap<String, String>> allop() throws SQLException, ClassNotFoundException {
				
		ConnectProgress connectionProgress = new ConnectProgress();
		
		 List<HashMap<String, String>> sofas =connectionProgress.getallOP();
		return sofas;
	}
	
	@GET
	@Path("/maquina/{ofanumenr}")
	@Produces("application/json")
	public List<HashMap<String, String>> maquina(@PathParam("ofanumenr") String ofanumenr) throws SQLException, ClassNotFoundException {
				
		ConnectProgress connectionProgress = new ConnectProgress();
		
		 List<HashMap<String, String>> sofas =connectionProgress.getMaq(ofanumenr);
		return sofas;
	}


	// DATA:{"name":"exemplo","email":"1@gmail.com"}
	// Headers:Content-Type: application/json
	@POST
	@Path("/createuser")
	@Consumes("*/*")
	@Produces("application/json")
	public User insertUsers(final User user) {
		return dao.create(user);
	}

	@DELETE
	@Path("/deleteuser/{id}")
	public void deleteUsers(@PathParam("id") Integer id) {
		User user = new User();
		user.setId(id);
		dao.delete(user);
	}

	
	
	// DATA:{"name":"exemplo","email":"1@gmail.com"}
	// Headers:Content-Type: application/json
	@PUT
	@Path("/updateuser")
	@Consumes("*/*")
	@Produces("application/json")
	public User updateuser(final User user) {
		user.setName(user.getName());
		return dao.update(user);
	}

	@GET
	@Path("/user2")
	@Produces("application/json")
	public void listUsers2() throws IOException {
		BufferedWriter bw = null;
		FileWriter fw = null;
		String path = "C:" + File.separator + "hello" + File.separator + "hi.txt";

		try {

			String data = "Campo1: \r\n" + "Campo2:\r\n" + "Campo3:\r\n" + "Campo4:";

			File file = new File(path);

			// if file doesnt exists, then create it

			file.createNewFile();

			// true = append file
			fw = new FileWriter(file.getAbsoluteFile(), true);
			bw = new BufferedWriter(fw);

			bw.write(data);

			System.out.println("Done");

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}
		}

	}

}
