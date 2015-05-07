package be.icc.ecoles;

public class Ecole {
	private int id;
	private String nom;
	private String adresse;
	private String cp;
	private String localite;
	private Implantation implantation;
	private String FASE_ETAB;
	private Options options;

	public Ecole(int id, String nom, String adresse, String cp,
			String localite, Implantation implantation, String fASE_ETAB,
			Options options) {
		this.id = id;
		this.nom = nom;
		this.adresse = adresse;
		this.cp = cp;
		this.localite = localite;
		this.implantation = implantation;
		FASE_ETAB = fASE_ETAB;
		this.options = options;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
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
	public String getFASE_ETAB() {
		return FASE_ETAB;
	}
	public void setFASE_ETAB(String fASE_ETAB) {
		FASE_ETAB = fASE_ETAB;
	}
	@Override
	public String toString() {
		return "Ecole [id=" + id + ", nom=" + nom + ", adresse=" + adresse
				+ ", cp=" + cp + ", localite=" + localite + ", implantation="
				+ implantation + ", FASE_ETAB=" + FASE_ETAB + ", options="
				+ options + "]";
	}
	public Implantation getImplantation() {
		return implantation;
	}
	public void setImplantation(Implantation implantation) {
		this.implantation = implantation;
	}
	public Options getOptions() {
		return options;
	}
	public void setOptions(Options options) {
		this.options = options;
	}
}
