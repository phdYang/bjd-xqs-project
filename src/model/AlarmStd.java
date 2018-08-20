package model;

public class AlarmStd {
	private int id; //阈值项目id
	private String desc; //阈值项目名称
	private double mean; //阈值平均值
	private double dev; //阈值标准差
	private double min;//阈值最小值
	private double max;//阈值最大值
	public AlarmStd() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AlarmStd(int id, String desc, double mean, double dev, double min, double max) {
		super();
		this.id = id;
		this.desc = desc;
		this.mean = mean;
		this.dev = dev;
		this.min = min;
		this.max = max;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public double getMean() {
		return mean;
	}
	public void setMean(double mean) {
		this.mean = mean;
	}
	public double getDev() {
		return dev;
	}
	public void setDev(double dev) {
		this.dev = dev;
	}
	public double getMin() {
		return min;
	}
	public void setMin(double min) {
		this.min = min;
	}
	public double getMax() {
		return max;
	}
	public void setMax(double max) {
		this.max = max;
	}
	@Override
	public String toString() {
		return "AlarmStd [id=" + id + ", desc=" + desc + ", mean=" + mean + ", dev=" + dev + ", min=" + min + ", max="
				+ max + "]";
	}
	
}
