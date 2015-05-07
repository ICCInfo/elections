package be.icc.ecoles;

public class Options {
	private Integer id;
	private String FASE_ETAB;
	private String Options;
	public Options(Integer id, String fASE_ETAB, String options) {
		this.id = id;
		FASE_ETAB = fASE_ETAB;
		Options = options;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFASE_ETAB() {
		return FASE_ETAB;
	}
	public void setFASE_ETAB(String fASE_ETAB) {
		FASE_ETAB = fASE_ETAB;
	}
	public String getOptions() {
		return Options;
	}
	public void setOptions(String options) {
		Options = options;
	}
	@Override
	public String toString() {
		return "Options [id=" + id + ", FASE_ETAB=" + FASE_ETAB + ", Options="
				+ Options + "]";
	}
}
