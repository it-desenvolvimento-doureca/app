package pt.example.dao;

import java.util.List;

import javax.persistence.Query;

import pt.example.entity.RPCONFUTZPERF;
import pt.example.entity.RPOFCAB;

public class RPOFDao extends GenericDaoJpaImpl<RPOFCAB, Integer> implements GenericDao<RPOFCAB, Integer> {
	public RPOFDao() {
		super(RPOFCAB.class);
	}

	public List<RPOFCAB> getbyid(String id_utz) {

		Query query = entityManager.createQuery("Select a from RPOFCAB a where a.ID_UTZ_CRIA = :id and a.ESTADO NOT IN ('C','A','M')");
		query.setParameter("id", id_utz);
		List<RPOFCAB> utz = query.getResultList();
		return utz;

	}

}
