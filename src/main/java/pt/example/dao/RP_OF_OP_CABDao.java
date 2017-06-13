package pt.example.dao;

import java.util.List;

import javax.persistence.Query;

import pt.example.entity.RPCONFUTZPERF;
import pt.example.entity.RP_OF_OP_CAB;

public class RP_OF_OP_CABDao extends GenericDaoJpaImpl<RP_OF_OP_CAB, Integer>
		implements GenericDao<RP_OF_OP_CAB, Integer> {
	public RP_OF_OP_CABDao() {
		super(RP_OF_OP_CAB.class);
	}

	public List<RPCONFUTZPERF> getbyid(String id_utz) {

		Query query = entityManager.createQuery("Select a from RP_OF_OP_CAB a where a.ID_UTZ_CRIA = :id");
		query.setParameter("id", id_utz);
		List<RPCONFUTZPERF> utz = query.getResultList();
		return utz;

	}

}
