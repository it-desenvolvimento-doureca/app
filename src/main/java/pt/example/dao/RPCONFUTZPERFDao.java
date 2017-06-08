package pt.example.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import pt.example.entity.RPCONFUTZPERF;
import pt.example.entity.RP_CONF_CHEF_SEC;

public class RPCONFUTZPERFDao extends GenericDaoJpaImpl<RPCONFUTZPERF,Integer> implements GenericDao<RPCONFUTZPERF,Integer> {
	public RPCONFUTZPERFDao() {
		super(RPCONFUTZPERF.class);
	}
	
	@PersistenceContext(unitName = "persistenceUnit")
	protected EntityManager entityManager;

	public List<RPCONFUTZPERF> getbyid(String id_utz) {

		Query query = entityManager.createQuery("Select a from RPCONFUTZPERF a where a.ID_UTZ = :id");
		query.setParameter("id", id_utz);
		List<RPCONFUTZPERF> utz = query.getResultList();
		return utz;

	}

}
