package Vo;

public class SensorVo {
	private int sensorId;
	private String sensorName;
	private String sensorTypeName;
	private String sensorTargetName;
	private String sensorLocationSectionName;
	public SensorVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SensorVo(int sensorId, String sensorName, String sensorTypeName, String sensorTargetName,
			String sensorLocationSectionName) {
		super();
		this.sensorId = sensorId;
		this.sensorName = sensorName;
		this.sensorTypeName = sensorTypeName;
		this.sensorTargetName = sensorTargetName;
		this.sensorLocationSectionName = sensorLocationSectionName;
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
	@Override
	public String toString() {
		return "SensorVo [sensorId=" + sensorId + ", sensorName=" + sensorName + ", sensorTypeName=" + sensorTypeName
				+ ", sensorTargetName=" + sensorTargetName + ", sensorLocationSectionName=" + sensorLocationSectionName
				+ "]";
	}
	
}
