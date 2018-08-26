package Vo;

public class SensorVo {
	private int sensorId;
	private String sensorName;
	private String sensorTypeName;
	private String sensorTargetName;
	private String sensorLocationSectionName;
	private String sensorClass; //暂时定为这个名字，主要是存放“光纤光栅”
	public SensorVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SensorVo(int sensorId, String sensorName, String sensorTypeName, String sensorTargetName,
			String sensorLocationSectionName, String sensorClass) {
		super();
		this.sensorId = sensorId;
		this.sensorName = sensorName;
		this.sensorTypeName = sensorTypeName;
		this.sensorTargetName = sensorTargetName;
		this.sensorLocationSectionName = sensorLocationSectionName;
		this.sensorClass = sensorClass;
	}
	public int getSensorId() {
		return sensorId;
	}
	public void setSensorId(int sensorId) {
		this.sensorId = sensorId;
	}
	public String getSensorName() {
		return sensorName;
	}
	public void setSensorName(String sensorName) {
		this.sensorName = sensorName;
	}
	public String getSensorTypeName() {
		return sensorTypeName;
	}
	public void setSensorTypeName(String sensorTypeName) {
		this.sensorTypeName = sensorTypeName;
	}
	public String getSensorTargetName() {
		return sensorTargetName;
	}
	public void setSensorTargetName(String sensorTargetName) {
		this.sensorTargetName = sensorTargetName;
	}
	public String getSensorLocationSectionName() {
		return sensorLocationSectionName;
	}
	public void setSensorLocationSectionName(String sensorLocationSectionName) {
		this.sensorLocationSectionName = sensorLocationSectionName;
	}
	public String getSensorClass() {
		return sensorClass;
	}
	public void setSensorClass(String sensorClass) {
		this.sensorClass = sensorClass;
	}
	@Override
	public String toString() {
		return "SensorVo [sensorId=" + sensorId + ", sensorName=" + sensorName + ", sensorTypeName=" + sensorTypeName
				+ ", sensorTargetName=" + sensorTargetName + ", sensorLocationSectionName=" + sensorLocationSectionName
				+ ", sensorClass=" + sensorClass + "]";
	}
	
	
}
