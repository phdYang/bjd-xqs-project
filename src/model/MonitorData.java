package model;

public class MonitorData {
	
	private int seqId;
	private int sensorId;
	private double monitorValue;
	private double monitorWave;
	private String monitorDate;
	private int monitorHour;
	private int isValid;
	private int isTransfer;
	public MonitorData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MonitorData(int seqId, int sensorId, double monitorValue, double monitorWave, String monitorDate,
			int monitorHour, int isValid, int isTransfer) {
		super();
		this.seqId = seqId;
		this.sensorId = sensorId;
		this.monitorValue = monitorValue;
		this.monitorWave = monitorWave;
		this.monitorDate = monitorDate;
		this.monitorHour = monitorHour;
		this.isValid = isValid;
		this.isTransfer = isTransfer;
	}
	public int getSeqId() {
		return seqId;
	}
	public void setSeqId(int seqId) {
		this.seqId = seqId;
	}
	public int getSensorId() {
		return sensorId;
	}
	public void setSensorId(int sensorId) {
		this.sensorId = sensorId;
	}
	public double getMonitorValue() {
		return monitorValue;
	}
	public void setMonitorValue(double monitorValue) {
		this.monitorValue = monitorValue;
	}
	public double getMonitorWave() {
		return monitorWave;
	}
	public void setMonitorWave(double monitorWave) {
		this.monitorWave = monitorWave;
	}
	public String getMonitorDate() {
		return monitorDate;
	}
	public void setMonitorDate(String monitorDate) {
		this.monitorDate = monitorDate;
	}
	public int getMonitorHour() {
		return monitorHour;
	}
	public void setMonitorHour(int monitorHour) {
		this.monitorHour = monitorHour;
	}
	public int getIsValid() {
		return isValid;
	}
	public void setIsValid(int isValid) {
		this.isValid = isValid;
	}
	public int getIsTransfer() {
		return isTransfer;
	}
	public void setIsTransfer(int isTransfer) {
		this.isTransfer = isTransfer;
	}
	@Override
	public String toString() {
		return "MonitorData [seqId=" + seqId + ", sensorId=" + sensorId + ", monitorValue=" + monitorValue
				+ ", monitorWave=" + monitorWave + ", monitorDate=" + monitorDate + ", monitorHour=" + monitorHour
				+ ", isValid=" + isValid + ", isTransfer=" + isTransfer + "]";
	}
	
	
}
