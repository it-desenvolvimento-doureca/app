package pt.example.entity;

import java.sql.Date;
import java.text.DecimalFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RP_OF_DEF_LIN")
public class RP_OF_DEF_LIN {

	private Integer ID_DEF_LIN;
	private Integer ID_OP_LIN;
	private String ID_UTZ_CRIA;
	private String ID_UTZ_MODIF;
	private String COD_DEF;
	private String DESC_DEF;
	private Integer QUANT_DEF;
	private Date DATA_HORA_REG;
	private Number PERC_OBJETIV;
	private Number PERC_DEF;

	@Id
	@Column(name = "ID_DEF_LIN")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getID_DEF_LIN() {
		return ID_DEF_LIN;
	}

	@Column(name = "ID_OP_LIN")
	public Integer getID_OP_LIN() {
		return ID_OP_LIN;
	}

	@Column(name = "ID_UTZ_CRIA")
	public String getID_UTZ_CRIA() {
		return ID_UTZ_CRIA;
	}

	@Column(name = "ID_UTZ_MODIF")
	public String getID_UTZ_MODIF() {
		return ID_UTZ_MODIF;
	}

	@Column(name = "COD_DEF")
	public String getCOD_DEF() {
		return COD_DEF;
	}

	@Column(name = "DESC_DEF")
	public String getDESC_DEF() {
		return DESC_DEF;
	}

	@Column(name = "QUANT_DEF")
	public Integer getQUANT_DEF() {
		return QUANT_DEF;
	}

	@Column(name = "DATA_HORA_REG")
	public Date getDATA_HORA_REG() {
		return DATA_HORA_REG;
	}

	@Column(name = "PERC_OBJETIV")
	public Number getPERC_OBJETIV() {
		return PERC_OBJETIV;
	}

	@Column(name = "PERC_DEF")
	public Number getPERC_DEF() {
		return PERC_DEF;
	}

	public void setID_DEF_LIN(Integer iD_DEF_LIN) {
		ID_DEF_LIN = iD_DEF_LIN;
	}

	public void setID_OP_LIN(Integer iD_OP_LIN) {
		ID_OP_LIN = iD_OP_LIN;
	}

	public void setID_UTZ_CRIA(String iD_UTZ_CRIA) {
		ID_UTZ_CRIA = iD_UTZ_CRIA;
	}

	public void setID_UTZ_MODIF(String iD_UTZ_MODIF) {
		ID_UTZ_MODIF = iD_UTZ_MODIF;
	}

	public void setCOD_DEF(String cOD_DEF) {
		COD_DEF = cOD_DEF;
	}

	public void setDESC_DEF(String dESC_DEF) {
		DESC_DEF = dESC_DEF;
	}

	public void setQUANT_DEF(Integer qUANT_DEF) {
		QUANT_DEF = qUANT_DEF;
	}

	public void setDATA_HORA_REG(Date dATA_HORA_REG) {
		DATA_HORA_REG = dATA_HORA_REG;
	}

	public void setPERC_OBJETIV(Number pERC_OBJETIV) {
		PERC_OBJETIV = pERC_OBJETIV;
	}

	public void setPERC_DEF(Number pERC_DEF) {
		PERC_DEF = pERC_DEF;
	}
}
