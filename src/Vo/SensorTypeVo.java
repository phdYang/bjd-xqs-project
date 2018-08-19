package Vo;

public class SensorTypeVo {
	private int typeId;
	private String typeName;
	private String unit;
	public SensorTypeVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SensorTypeVo(int typeId, String typeName, String unit) {
		super();
		this.typeId = typeId;
		this.typeName = typeName;
		this.unit = unit;
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
	@Override
	public String toString() {
		return "SensorTypeVo [typeId=" + typeId + ", typeName=" + typeName + ", unit=" + unit + "]";
	}
	
}
