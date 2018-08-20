package model;

public class AlarmLog {
	private int seqId; //序号
	private int alarmCode; //报警编码
	private int alarmLevel; //告警级别
	private String alarmSource; //告警传感器
	private String alarmDate;//告警日期
	private String alarmContent;
	public AlarmLog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AlarmLog(int seqId, int alarmCode, int alarmLevel, String alarmSource, String alarmDate,
			String alarmContent) {
		super();
		this.seqId = seqId;
		this.alarmCode = alarmCode;
		this.alarmLevel = alarmLevel;
		this.alarmSource = alarmSource;
		this.alarmDate = alarmDate;
		this.alarmContent = alarmContent;
	}
	public int getSeqId() {
		return seqId;
	}
	public void setSeqId(int seqId) {
		this.seqId = seqId;
	}
	public int getAlarmCode() {
		return alarmCode;
	}
	public void setAlarmCode(int alarmCode) {
		this.alarmCode = alarmCode;
	}
	public int getAlarmLevel() {
		return alarmLevel;
	}
	public void setAlarmLevel(int alarmLevel) {
		this.alarmLevel = alarmLevel;
	}
	public String getAlarmSource() {
		return alarmSource;
	}
	public void setAlarmSource(String alarmSource) {
		this.alarmSource = alarmSource;
	}
	public String getAlarmDate() {
		return alarmDate;
	}
	public void setAlarmDate(String alarmDate) {
		this.alarmDate = alarmDate;
	}
	public String getAlarmContent() {
		return alarmContent;
	}
	public void setAlarmContent(String alarmContent) {
		this.alarmContent = alarmContent;
	}
	@Override
	public String toString() {
		return "AlarmLog [seqId=" + seqId + ", alarmCode=" + alarmCode + ", alarmLevel=" + alarmLevel + ", alarmSource="
				+ alarmSource + ", alarmDate=" + alarmDate + ", alarmContent=" + alarmContent + "]";
	}
}
