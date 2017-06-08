package pt.example.dao;


import pt.example.entity.RPOFCAB;

public class RPOFDao extends GenericDaoJpaImpl<RPOFCAB,Integer> implements GenericDao<RPOFCAB,Integer> {
	public RPOFDao() {
		super(RPOFCAB.class);
	}


}
