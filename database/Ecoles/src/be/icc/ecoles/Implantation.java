package be.icc.ecoles;

public class Implantation {
	private Integer id;
	private String FASE_IMPL;
	private String adresse;
	private String cp;
	public Implantation(Integer id, String fASE_IMPL, String adresse,
			String cp, String localite) {
		this.id = id;
		FASE_IMPL = fASE_IMPL;
		this.adresse = adresse;
		this.cp = cp;
		this.localite = localite;
	}
	private String localite;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFASE_IMPL() {
		return FASE_IMPL;
	}
	public void setFASE_IMPL(String fASE_IMPL) {
		FASE_IMPL = fASE_IMPL;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}
	public String getLocalite() {
		return localite;
	}
	public void setLocalite(String localite) {
		this.localite = localite;
	}
	@Override
	public String toString() {
		return "Implantations [id=" + id + ", FASE_IMPL=" + FASE_IMPL
				+ ", adresse=" + adresse + ", cp=" + cp + ", localite="
				+ localite + "]";
	}
}
