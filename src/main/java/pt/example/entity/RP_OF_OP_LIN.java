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
@Table(name = "RP_OF_OP_LIN")
public class RP_OF_OP_LIN {

	private Integer ID_OP_LIN;
	private Integer ID_CAB;
	private String REF_NUM;
	private String REF_DES;
	private Date DATA_INI;
	private Time HORA_INI;
	private Date DATA_FIM;
	private Time HORA_FIM;
	private String ID_EQUIPA;
	private String ID_UTZ_CRIA;
	private String NOME_UTZ_CRIA;
	private String PERFIL_CRIA;
	private String ID_UTZ_MODIF;
	private String NOME_UTZ_MODIF;
	private String PERFIL_MODIF;
	private Date DATA_HORA_MODIF;
	private String ESTADO;
	private String REF_IND;
	private String REF_VAR1;
	private String REF_VAR2;
	private Integer REF_INDNUMENR;
	private Integer QUANT_OF;
	private Integer QUANT_BOAS_TOTAL;
	private Integer QUANT_DEF_TOTAL;
	private Time TEMPO_PREP_TOTAL;
	private Time TEMPO_PARA_TOTAL;
	private Time TEMPO_EXEC_TOTAL;

	@Id
	@Column(name = "ID_OP_LIN")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getID_OP_LIN() {
		return ID_OP_LIN;
	}

	@Column(name = "ID_CAB")
	public Integer getID_CAB() {
		return ID_CAB;
	}

	@Column(name = "REF_NUM")
	public String getREF_NUM() {
		return REF_NUM;
	}

	@Column(name = "REF_DES")
	public String getREF_DES() {
		return REF_DES;
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

	@Column(name = "ID_EQUIPA")
	public String getID_EQUIPA() {
		return ID_EQUIPA;
	}

	@Column(name = "ID_UTZ_CRIA")
	public String getID_UTZ_CRIA() {
		return ID_UTZ_CRIA;
	}

	@Column(name = "NOME_UTZ_CRIA")
	public String getNOME_UTZ_CRIA() {
		return NOME_UTZ_CRIA;
	}

	@Column(name = "PERFIL_CRIA")
	public String getPERFIL_CRIA() {
		return PERFIL_CRIA;
	}

	@Column(name = "ID_UTZ_MODIF")
	public String getID_UTZ_MODIF() {
		return ID_UTZ_MODIF;
	}

	@Column(name = "NOME_UTZ_MODIF")
	public String getNOME_UTZ_MODIF() {
		return NOME_UTZ_MODIF;
	}

	@Column(name = "PERFIL_MODIF")
	public String getPERFIL_MODIF() {
		return PERFIL_MODIF;
	}

	@Column(name = "DATA_HORA_MODIF")
	public Date getDATA_HORA_MODIF() {
		return DATA_HORA_MODIF;
	}

	@Column(name = "ESTADO")
	public String getESTADO() {
		return ESTADO;
	}

	@Column(name = "REF_IND")
	public String getREF_IND() {
		return REF_IND;
	}

	@Column(name = "REF_VAR1")
	public String getREF_VAR1() {
		return REF_VAR1;
	}

	@Column(name = "REF_VAR2")
	public String getREF_VAR2() {
		return REF_VAR2;
	}

	@Column(name = "REF_INDNUMENR")
	public Integer getREF_INDNUMENR() {
		return REF_INDNUMENR;
	}

	@Column(name = "QUANT_OF")
	public Integer getQUANT_OF() {
		return QUANT_OF;
	}

	@Column(name = "QUANT_BOAS_TOTAL")
	public Integer getQUANT_BOAS_TOTAL() {
		return QUANT_BOAS_TOTAL;
	}

	@Column(name = "QUANT_DEF_TOTAL")
	public Integer getQUANT_DEF_TOTAL() {
		return QUANT_DEF_TOTAL;
	}

	@Column(name = "TEMPO_PREP_TOTAL")
	public Time getTEMPO_PREP_TOTAL() {
		return TEMPO_PREP_TOTAL;
	}

	@Column(name = "TEMPO_PARA_TOTAL")
	public Time getTEMPO_PARA_TOTAL() {
		return TEMPO_PARA_TOTAL;
	}

	@Column(name = "TEMPO_EXEC_TOTAL")
	public Time getTEMPO_EXEC_TOTAL() {
		return TEMPO_EXEC_TOTAL;
	}

	public void setID_OP_LIN(Integer iD_OP_LIN) {
		ID_OP_LIN = iD_OP_LIN;
	}

	public void setID_CAB(Integer iD_CAB) {
		ID_CAB = iD_CAB;
	}

	public void setREF_NUM(String rEF_NUM) {
		REF_NUM = rEF_NUM;
	}

	public void setREF_DES(String rEF_DES) {
		REF_DES = rEF_DES;
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

	public void setID_EQUIPA(String iD_EQUIPA) {
		ID_EQUIPA = iD_EQUIPA;
	}

	public void setID_UTZ_CRIA(String iD_UTZ_CRIA) {
		ID_UTZ_CRIA = iD_UTZ_CRIA;
	}

	public void setNOME_UTZ_CRIA(String nOME_UTZ_CRIA) {
		NOME_UTZ_CRIA = nOME_UTZ_CRIA;
	}

	public void setPERFIL_CRIA(String pERFIL_CRIA) {
		PERFIL_CRIA = pERFIL_CRIA;
	}

	public void setID_UTZ_MODIF(String iD_UTZ_MODIF) {
		ID_UTZ_MODIF = iD_UTZ_MODIF;
	}

	public void setNOME_UTZ_MODIF(String nOME_UTZ_MODIF) {
		NOME_UTZ_MODIF = nOME_UTZ_MODIF;
	}

	public void setPERFIL_MODIF(String pERFIL_MODIF) {
		PERFIL_MODIF = pERFIL_MODIF;
	}

	public void setDATA_HORA_MODIF(Date dATA_HORA_MODIF) {
		DATA_HORA_MODIF = dATA_HORA_MODIF;
	}

	public void setESTADO(String eSTADO) {
		ESTADO = eSTADO;
	}

	public void setREF_IND(String rEF_IND) {
		REF_IND = rEF_IND;
	}

	public void setREF_VAR1(String rEF_VAR1) {
		REF_VAR1 = rEF_VAR1;
	}

	public void setREF_VAR2(String rEF_VAR2) {
		REF_VAR2 = rEF_VAR2;
	}

	public void setREF_INDNUMENR(Integer rEF_INDNUMENR) {
		REF_INDNUMENR = rEF_INDNUMENR;
	}

	public void setQUANT_OF(Integer qUANT_OF) {
		QUANT_OF = qUANT_OF;
	}

	public void setQUANT_BOAS_TOTAL(Integer qUANT_BOAS_TOTAL) {
		QUANT_BOAS_TOTAL = qUANT_BOAS_TOTAL;
	}

	public void setQUANT_DEF_TOTAL(Integer qUANT_DEF_TOTAL) {
		QUANT_DEF_TOTAL = qUANT_DEF_TOTAL;
	}

	public void setTEMPO_PREP_TOTAL(Time tEMPO_PREP_TOTAL) {
		TEMPO_PREP_TOTAL = tEMPO_PREP_TOTAL;
	}

	public void setTEMPO_PARA_TOTAL(Time tEMPO_PARA_TOTAL) {
		TEMPO_PARA_TOTAL = tEMPO_PARA_TOTAL;
	}

	public void setTEMPO_EXEC_TOTAL(Time tEMPO_EXEC_TOTAL) {
		TEMPO_EXEC_TOTAL = tEMPO_EXEC_TOTAL;
	}

}
