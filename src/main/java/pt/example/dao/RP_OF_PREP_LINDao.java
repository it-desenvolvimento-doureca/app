package pt.example.dao;


import java.util.List;

import javax.persistence.Query;

import pt.example.entity.RPCONFUTZPERF;
import pt.example.entity.RP_OF_PREP_LIN;

public class RP_OF_PREP_LINDao extends GenericDaoJpaImpl<RP_OF_PREP_LIN,Integer> implements GenericDao<RP_OF_PREP_LIN,Integer> {
	public RP_OF_PREP_LINDao() {
		super(RP_OF_PREP_LIN.class);
	}
	public List<RPCONFUTZPERF> getbyid(String id_utz) {

		Query query = entityManager.createQuery("Select a from RP_OF_PREP_LIN a where a.ID_UTZ_CRIA = :id");
		query.setParameter("id", id_utz);
		List<RPCONFUTZPERF> utz = query.getResultList();
		return utz;

	}


}
