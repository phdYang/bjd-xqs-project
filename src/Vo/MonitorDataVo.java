package Vo;

public class MonitorDataVo {
	private double monitorValue;
	private String monitorDate;
	public MonitorDataVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MonitorDataVo(double monitorValue, String monitorDate) {
		super();
		this.monitorValue = monitorValue;
		this.monitorDate = monitorDate;
	}
	public double getMonitorValue() {
		return monitorValue;
	}
	public void setMonitorValue(double monitorValue) {
		this.monitorValue = monitorValue;
	}
	public String getMonitorDate() {
		return monitorDate;
	}
	public void setMonitorDate(String monitorDate) {
		this.monitorDate = monitorDate;
	}
	@Override
	public String toString() {
		return "MonitorDataVo [monitorValue=" + monitorValue + ", monitorDate=" + monitorDate + "]";
	}
	
}
