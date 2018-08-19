package model;

public class Sensor {
	private int sensorId;
	private String sensorCode;
	private String sensorName;
	private String channelCode;
	private int sensorItemId;
	private int mySensorItemId;
	private double initKValue;
	private double initWave;
	private double initValue;
	private int initOrientations;
	private double bdWave;
	private double bdTemperature;
	private int refSensorId;
	private double refWDKValue;
	private int targetId;
	private int sectionId;
	private int typeId;
	private int isValid;
	private int range;
	private double accuracy;
	private String info;
	private String sDec;
	public Sensor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sensor(int sensorId, String sensorCode, String sensorName, String channelCode, int sensorItemId,
			int mySensorItemId, double initKValue, double initWave, double initValue, int initOrientations,
			double bdWave, double bdTemperature, int refSensorId, double refWDKValue, int targetId, int sectionId,
			int typeId, int isValid, int range, double accuracy, String info, String sDec) {
		super();
		this.sensorId = sensorId;
		this.sensorCode = sensorCode;
		this.sensorName = sensorName;
		this.channelCode = channelCode;
		this.sensorItemId = sensorItemId;
		this.mySensorItemId = mySensorItemId;
		this.initKValue = initKValue;
		this.initWave = initWave;
		this.initValue = initValue;
		this.initOrientations = initOrientations;
		this.bdWave = bdWave;
		this.bdTemperature = bdTemperature;
		this.refSensorId = refSensorId;
		this.refWDKValue = refWDKValue;
		this.targetId = targetId;
		this.sectionId = sectionId;
		this.typeId = typeId;
		this.isValid = isValid;
		this.range = range;
		this.accuracy = accuracy;
		this.info = info;
		this.sDec = sDec;
	}
	public int getSensorId() {
		return sensorId;
	}
	public void setSensorId(int sensorId) {
		this.sensorId = sensorId;
	}
	public String getSensorCode() {
		return sensorCode;
	}
	public void setSensorCode(String sensorCode) {
		this.sensorCode = sensorCode;
	}
	public String getSensorName() {
		return sensorName;
	}
	public void setSensorName(String sensorName) {
		this.sensorName = sensorName;
	}
	public String getChannelCode() {
		return channelCode;
	}
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}
	public int getSensorItemId() {
		return sensorItemId;
	}
	public void setSensorItemId(int sensorItemId) {
		this.sensorItemId = sensorItemId;
	}
	public int getMySensorItemId() {
		return mySensorItemId;
	}
	public void setMySensorItemId(int mySensorItemId) {
		this.mySensorItemId = mySensorItemId;
	}
	public double getInitKValue() {
		return initKValue;
	}
	public void setInitKValue(double initKValue) {
		this.initKValue = initKValue;
	}
	public double getInitWave() {
		return initWave;
	}
	public void setInitWave(double initWave) {
		this.initWave = initWave;
	}
	public double getInitValue() {
		return initValue;
	}
	public void setInitValue(double initValue) {
		this.initValue = initValue;
	}
	public int getInitOrientations() {
		return initOrientations;
	}
	public void setInitOrientations(int initOrientations) {
		this.initOrientations = initOrientations;
	}
	public double getBdWave() {
		return bdWave;
	}
	public void setBdWave(double bdWave) {
		this.bdWave = bdWave;
	}
	public double getBdTemperature() {
		return bdTemperature;
	}
	public void setBdTemperature(double bdTemperature) {
		this.bdTemperature = bdTemperature;
	}
	public int getRefSensorId() {
		return refSensorId;
	}
	public void setRefSensorId(int refSensorId) {
		this.refSensorId = refSensorId;
	}
	public double getRefWDKValue() {
		return refWDKValue;
	}
	public void setRefWDKValue(double refWDKValue) {
		this.refWDKValue = refWDKValue;
	}
	public int getTargetId() {
		return targetId;
	}
	public void setTargetId(int targetId) {
		this.targetId = targetId;
	}
	public int getSectionId() {
		return sectionId;
	}
	public void setSectionId(int sectionId) {
		this.sectionId = sectionId;
	}
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	public int getIsValid() {
		return isValid;
	}
	public void setIsValid(int isValid) {
		this.isValid = isValid;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public double getAccuracy() {
		return accuracy;
	}
	public void setAccuracy(double accuracy) {
		this.accuracy = accuracy;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getsDec() {
		return sDec;
	}
	public void setsDec(String sDec) {
		this.sDec = sDec;
	}
	@Override
	public String toString() {
		return "Sensor [sensorId=" + sensorId + ", sensorCode=" + sensorCode + ", sensorName=" + sensorName
				+ ", channelCode=" + channelCode + ", sensorItemId=" + sensorItemId + ", mySensorItemId="
				+ mySensorItemId + ", initKValue=" + initKValue + ", initWave=" + initWave + ", initValue=" + initValue
				+ ", initOrientations=" + initOrientations + ", bdWave=" + bdWave + ", bdTemperature=" + bdTemperature
				+ ", refSensorId=" + refSensorId + ", refWDKValue=" + refWDKValue + ", targetId=" + targetId
				+ ", sectionId=" + sectionId + ", typeId=" + typeId + ", isValid=" + isValid + ", range=" + range
				+ ", accuracy=" + accuracy + ", info=" + info + ", sDec=" + sDec + "]";
	}
	
	
	
}
