package pt.example.dao;

import java.util.List;

import javax.persistence.Query;
import javax.ws.rs.PathParam;

import pt.example.entity.RPCONFUTZPERF;
import pt.example.entity.RPOFCAB;

public class RPOFDao extends GenericDaoJpaImpl<RPOFCAB, Integer> implements GenericDao<RPOFCAB, Integer> {
	public RPOFDao() {
		super(RPOFCAB.class);
	}

	public List<RPOFCAB> getall() {

		Query query = entityManager.createQuery("Select a,b from RPOFCAB a, RP_OF_OP_CAB b where a.ID_OF_CAB = b.ID_OF_CAB ");
		List<RPOFCAB> utz = query.getResultList();
		return utz;

	}

	public List<RPOFCAB> getbyid(String id_utz) {

		Query query = entityManager
				.createQuery("Select a from RPOFCAB a where a.ID_UTZ_CRIA = :id and a.ESTADO NOT IN ('C','A','M')");
		query.setParameter("id", id_utz);
		List<RPOFCAB> utz = query.getResultList();
		return utz;

	}

	public List<RPOFCAB> getof(Integer id) {

		Query query = entityManager.createQuery("Select a from RPOFCAB a where a.ID_OF_CAB = :id");
		query.setParameter("id", id);
		List<RPOFCAB> utz = query.getResultList();
		return utz;

	}

	public List<RPOFCAB> verifica(String of_num, String op_cod, String op_num) {

		Query query = entityManager.createQuery(
				"Select a from RPOFCAB a where a.OF_NUM = :of_num and a.OP_NUM = :op_num and a.OP_COD = :op_cod and a.ESTADO NOT IN ('C','A','M')");
		query.setParameter("of_num", of_num);
		query.setParameter("op_cod", op_cod);
		query.setParameter("op_num", op_num);
		List<RPOFCAB> utz = query.getResultList();
		return utz;

	}

}
