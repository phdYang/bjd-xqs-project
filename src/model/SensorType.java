package model;

public class SensorType {
	/**
	 * 传感器类型model
	 */
	private int typeId;
	private String typeName;
	private String unit;
	private int isValid;
	private String sDesc;
	public SensorType() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SensorType(int typeId, String typeName, String unit, int isValid, String sDesc) {
		super();
		this.typeId = typeId;
		this.typeName = typeName;
		this.unit = unit;
		this.isValid = isValid;
		this.sDesc = sDesc;
	}
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
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
		return "SensorType [typeId=" + typeId + ", typeName=" + typeName + ", unit=" + unit + ", isValid=" + isValid
				+ ", sDesc=" + sDesc + "]";
	}
	
}
