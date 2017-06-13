package pt.example.rest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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

import pt.example.bootstrap.ConnectProgress;
import pt.example.dao.RPOFDao;
import pt.example.dao.RP_CONF_CHEF_SECDao;
import pt.example.dao.RP_CONF_OPDao;
import pt.example.dao.RP_CONF_OP_NPREVDao;
import pt.example.dao.RP_OF_OP_CABDao;
import pt.example.dao.RP_OF_OP_LINDao;
import pt.example.dao.RP_OF_PREP_LINDao;
import pt.example.dao.RPCONFUTZPERFDao;
import pt.example.dao.UserDao;
import pt.example.entity.RPOFCAB;
import pt.example.entity.RP_CONF_CHEF_SEC;
import pt.example.entity.RP_CONF_OP;
import pt.example.entity.RP_CONF_OP_NPREV;
import pt.example.entity.RP_OF_OP_CAB;
import pt.example.entity.RP_OF_OP_LIN;
import pt.example.entity.RP_OF_PREP_LIN;
import pt.example.entity.RPCONFUTZPERF;
import pt.example.entity.User;

@Stateless
@Path("/siip")
public class SIIP {

	@Inject
	private RPOFDao dao;

	@Inject
	private RPCONFUTZPERFDao dao1;

	@Inject
	private RP_CONF_CHEF_SECDao dao2;

	@Inject
	private RP_CONF_OPDao dao3;

	@Inject
	private RP_CONF_OP_NPREVDao dao4;
	
	@Inject
	private RP_OF_OP_CABDao dao6;
	
	@Inject
	private RP_OF_OP_LINDao dao7;
	
	@Inject
	private RP_OF_PREP_LINDao dao8;
	

	// RP_CONF_UTZ_PERF***************************************************************
	@POST
	@Path("/createRPCONFUTZPERF")
	@Consumes("*/*")
	@Produces("application/json")
	public RPCONFUTZPERF insertRPCONFUTZPERF(final RPCONFUTZPERF data) {
		return dao1.create(data);
	}

	@GET
	@Path("/getRPCONFUTZPERF")
	@Produces("application/json")
	public List<RPCONFUTZPERF> getRPCONFUTZPERF() {
		return dao1.allEntries();
	}

	@GET
	@Path("/getRPCONFUTZPERFid/{id}")
	@Produces("application/json")
	public List<RPCONFUTZPERF> getRPCONFUTZPERF_id(@PathParam("id") String id) {
		return dao1.getbyid(id);
	}

	@DELETE
	@Path("/deleteRPCONFUTZPERF/{id}")
	public void deleteRPCONFUTZPERF(@PathParam("id") Integer id) {
		RPCONFUTZPERF RPCONFUTZPERF = new RPCONFUTZPERF();
		RPCONFUTZPERF.setID_CONF_UTZ_PERF(id);
		dao1.delete(RPCONFUTZPERF);
	}

	// RP_CONF_CHEF_SEC***************************************************************
	@POST
	@Path("/createRP_CONF_CHEF_SEC")
	@Consumes("*/*")
	@Produces("application/json")
	public RP_CONF_CHEF_SEC insertRP_CONF_CHEF_SECF(final RP_CONF_CHEF_SEC data) {
		return dao2.create(data);
	}

	@GET
	@Path("/getRP_CONF_CHEF_SEC")
	@Produces("application/json")
	public List<RP_CONF_CHEF_SEC> getRP_CONF_CHEF_SEC() {
		return dao2.allEntries();
	}

	@DELETE
	@Path("/deleteRP_CONF_CHEF_SEC/{id}")
	public void deleteRP_CONF_CHEF_SEC(@PathParam("id") Integer id) {
		RP_CONF_CHEF_SEC RP_CONF_CHEF_SEC = new RP_CONF_CHEF_SEC();
		RP_CONF_CHEF_SEC.setID_CONF_CHEF_SEC(id);
		dao2.delete(RP_CONF_CHEF_SEC);
	}

	@PUT
	@Path("/updateRP_CONF_CHEF_SEC")
	@Consumes("*/*")
	@Produces("application/json")
	public RP_CONF_CHEF_SEC updateuser(final RP_CONF_CHEF_SEC RP_CONF_CHEF_SEC) {
		RP_CONF_CHEF_SEC.setID_UTZ(RP_CONF_CHEF_SEC.getID_UTZ());
		return dao2.update(RP_CONF_CHEF_SEC);
	}

	// RP_CONF_OP***************************************************************

	@GET
	@Path("/getRP_CONF_OP")
	@Produces("application/json")
	public List<RP_CONF_OP> getRP_CONF_OP() {
		return dao3.allEntries();
	}

	@POST
	@Path("/createRP_CONF_OP")
	@Consumes("*/*")
	@Produces("application/json")
	public RP_CONF_OP insertRP_CONF_OP(final RP_CONF_OP data) {
		return dao3.create(data);
	}

	@DELETE
	@Path("/deleteRP_CONF_OP/{id}")
	public void deleteRP_CONF_OP(@PathParam("id") Integer id) {
		RP_CONF_OP RP_CONF_OP = new RP_CONF_OP();
		RP_CONF_OP.setID_CONF_OP(id);
		dao3.delete(RP_CONF_OP);
	}

	@PUT
	@Path("/updateRP_CONF_OP")
	@Consumes("*/*")
	@Produces("application/json")
	public RP_CONF_OP updateRP_CONF_OP(final RP_CONF_OP RP_CONF_OP) {
		RP_CONF_OP.setID_OP_PRINC(RP_CONF_OP.getID_OP_PRINC());
		return dao3.update(RP_CONF_OP);
	}

	// RP_CONF_OP_NPREV***********************************************************

	@GET
	@Path("/getRP_CONF_OP_NPREV")
	@Produces("application/json")
	public List<RP_CONF_OP_NPREV> getRP_CONF_OP_NPREV() {
		return dao4.allEntries();
	}

	@POST
	@Path("/createRP_CONF_OP_NPREV")
	@Consumes("*/*")
	@Produces("application/json")
	public RP_CONF_OP_NPREV insertRP_CONF_OP_NPREV(final RP_CONF_OP_NPREV data) {
		return dao4.create(data);
	}

	@DELETE
	@Path("/deleteRP_CONF_OP_NPREV/{id}")
	public void deleteRP_CONF_OP_NPREV(@PathParam("id") Integer id) {
		RP_CONF_OP_NPREV RP_CONF_OP_NPREV = new RP_CONF_OP_NPREV();
		RP_CONF_OP_NPREV.setID_CONF_OP_NPREV(id);
		dao4.delete(RP_CONF_OP_NPREV);
	}

	// RPOFCAB***********************************************************

	@GET
	@Path("/user")
	@Produces("application/json")
	public List<RPOFCAB> listof() {
		return dao.allEntries();
	}
	
	@GET
	@Path("/listofcurrentof/{id}")
	@Produces("application/json")
	public List<RPOFCAB> listofcurrentof(@PathParam("id") String id) {
		return dao.getbyid(id);
	}
	
	@POST
	@Path("/createRP_OF_CAB")
	@Consumes("*/*")
	@Produces("application/json")
	public RPOFCAB insertRPOFCAB(final RPOFCAB data) {
		return dao.create(data);
	}

	// RP_OF_OP_CAB*************************************************************

	@POST
	@Path("/createRP_OF_OP_CAB")
	@Consumes("*/*")
	@Produces("application/json")
	public RP_OF_OP_CAB insertRP_OF_OP_CAB(final RP_OF_OP_CAB data) {
		return dao6.create(data);
	}
	
	
	//RP_OF_OP_LIN************************************************************
	
	@POST
	@Path("/createRP_OF_OP_LIN")
	@Consumes("*/*")
	@Produces("application/json")
	public RP_OF_OP_LIN insertRP_OF_OP_LIN(final RP_OF_OP_LIN data) {
		return dao7.create(data);
	}
	
	//RP_OF_PREP_LIN***********************************
	
	@POST
	@Path("/createRP_OF_PREP_LIN")
	@Consumes("*/*")
	@Produces("application/json")
	public RP_OF_PREP_LIN insertRP_OF_PREP_LIN(final RP_OF_PREP_LIN data) {
		return dao8.create(data);
	}
	
	
	// CRIAR
	// FICHEIRO****************************************************************

	@GET
	@Path("/ficheiro")
	@Produces("application/json")
	public void getFicheiro() throws IOException {
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
