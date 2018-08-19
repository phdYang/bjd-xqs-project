package model;

public class SensorLocationSection {
	private int sectionId;
	private String sectionName;
	private int isValid;
	private String sDesc;
	public SensorLocationSection() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SensorLocationSection(int sectionId, String sectionName, int isValid, String sDesc) {
		super();
		this.sectionId = sectionId;
		this.sectionName = sectionName;
		this.isValid = isValid;
		this.sDesc = sDesc;
	}
	public int getSectionId() {
		return sectionId;
	}
	public void setSectionId(int sectionId) {
		this.sectionId = sectionId;
	}
	public String getSectionName() {
		return sectionName;
	}
	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}
	public int getIsValid() {
		return isValid;
	}
	public void setIsValid(int isValid) {
		this.isValid = isValid;
	}
	public String getsDesc() {
		return sDesc;
	}
	public void setsDesc(String sDesc) {
		this.sDesc = sDesc;
	}
	@Override
	public String toString() {
		return "SensorLocationSection [sectionId=" + sectionId + ", sectionName=" + sectionName + ", isValid=" + isValid
				+ ", sDesc=" + sDesc + "]";
	}
	
}
