package pt.example.entity;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RP_OF_PARA_LIN")
public class RP_OF_PARA_LIN {

	private Integer ID_PARA_LIN;
	private Integer ID_OP_LIN;
	private Date DATA_INI;
	private Time HORA_INI;
	private Date DATA_FIM;
	private Time HORA_FIM;
	private String ID_UTZ_CRIA;
	private String ID_UTZ_MODIF;
	private Date DATA_HORA_MODIF;
	private String TIPO_PARAGEM;
	private String DES_PARAGEM;
	private String ESTADO;

	@Id
	@Column(name = "ID_PARA_LIN")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getID_PARA_LIN() {
		return ID_PARA_LIN;
	}

	@Column(name = "ID_OP_LIN")
	public Integer getID_OP_LIN() {
		return ID_OP_LIN;
	}

	@Column(name = "DATA_INI")
	public Date getDATA_INI() {
		return DATA_INI;
	}

	@Column(name = "HORA_INI")
	public Time getHORA_INI() {
		return HORA_INI;
	}

	@Column(name = "DATA_FIM")
	public Date getDATA_FIM() {
		return DATA_FIM;
	}

	@Column(name = "HORA_FIM")
	public Time getHORA_FIM() {
		return HORA_FIM;
	}

	@Column(name = "ID_UTZ_CRIA")
	public String getID_UTZ_CRIA() {
		return ID_UTZ_CRIA;
	}

	@Column(name = "ID_UTZ_MODIF")
	public String getID_UTZ_MODIF() {
		return ID_UTZ_MODIF;
	}

	@Column(name = "DATA_HORA_MODIF")
	public Date getDATA_HORA_MODIF() {
		return DATA_HORA_MODIF;
	}

	@Column(name = "TIPO_PARAGEM")
	public String getTIPO_PARAGEM() {
		return TIPO_PARAGEM;
	}

	@Column(name = "DES_PARAGEM")
	public String getDES_PARAGEM() {
		return DES_PARAGEM;
	}

	@Column(name = "ESTADO")
	public String getESTADO() {
		return ESTADO;
	}

	public void setID_PARA_LIN(Integer iD_PARA_LIN) {
		ID_PARA_LIN = iD_PARA_LIN;
	}

	public void setID_OP_LIN(Integer iD_OP_LIN) {
		ID_OP_LIN = iD_OP_LIN;
	}

	public void setDATA_INI(Date dATA_INI) {
		DATA_INI = dATA_INI;
	}

	public void setHORA_INI(Time hORA_INI) {
		HORA_INI = hORA_INI;
	}

	public void setDATA_FIM(Date dATA_FIM) {
		DATA_FIM = dATA_FIM;
	}

	public void setHORA_FIM(Time hORA_FIM) {
		HORA_FIM = hORA_FIM;
	}

	public void setID_UTZ_CRIA(String iD_UTZ_CRIA) {
		ID_UTZ_CRIA = iD_UTZ_CRIA;
	}

	public void setID_UTZ_MODIF(String iD_UTZ_MODIF) {
		ID_UTZ_MODIF = iD_UTZ_MODIF;
	}

	public void setDATA_HORA_MODIF(Date dATA_HORA_MODIF) {
		DATA_HORA_MODIF = dATA_HORA_MODIF;
	}

	public void setTIPO_PARAGEM(String tIPO_PARAGEM) {
		TIPO_PARAGEM = tIPO_PARAGEM;
	}

	public void setDES_PARAGEM(String dES_PARAGEM) {
		DES_PARAGEM = dES_PARAGEM;
	}

	public void setESTADO(String eSTADO) {
		ESTADO = eSTADO;
	}
}
