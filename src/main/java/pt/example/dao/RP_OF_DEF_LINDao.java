package pt.example.dao;


import java.util.List;

import javax.persistence.Query;

import pt.example.entity.RP_OF_DEF_LIN;
import pt.example.entity.RP_OF_OP_LIN;

public class RP_OF_DEF_LINDao extends GenericDaoJpaImpl<RP_OF_DEF_LIN,Integer> implements GenericDao<RP_OF_DEF_LIN,Integer> {
	public RP_OF_DEF_LINDao() {
		super(RP_OF_DEF_LIN.class);
	}
	
	
	public List<RP_OF_DEF_LIN> getbyid(String id, Integer id2) {

		Query query = entityManager.createQuery("Select a from RP_OF_DEF_LIN a where substring(a.COD_DEF, 1, 2) = :id and ID_OP_LIN = :id2");
		query.setParameter("id", id);
		query.setParameter("id2", id2);
		List<RP_OF_DEF_LIN> utz = query.getResultList();
		return utz;

	}
	
	public List<RP_OF_DEF_LIN> getbyidDEF(Integer id) {

		Query query = entityManager.createQuery("Select a from RP_OF_DEF_LIN a where a.ID_DEF_LIN = :id");
		query.setParameter("id", id);
		List<RP_OF_DEF_LIN> utz = query.getResultList();
		return utz;

	}

}
