package oop.itp.model;

public class PastProject {
	private String proect_ID;
	private String Description;
	private String Type;
	
	public PastProject() {
		super();
	}

	public PastProject(String proect_ID, String description, String type) {
		super();
		this.proect_ID = proect_ID;
		Description = description;
		Type = type;
	}
	
	public String getProect_ID() {
		return proect_ID;
	}
	public void setProect_ID(String proect_ID) {
		this.proect_ID = proect_ID;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	
	

}
