package pt.example.dao;


import pt.example.entity.RP_CONF_OP;

public class RP_CONF_OPDao extends GenericDaoJpaImpl<RP_CONF_OP,Integer> implements GenericDao<RP_CONF_OP,Integer> {
	public RP_CONF_OPDao() {
		super(RP_CONF_OP.class);
	}


}
