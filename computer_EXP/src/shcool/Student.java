package shcool;

public class Student {
	private String name, major;
	private int classNum;
	private float credit;

	public Student(String name, String major, int classNum, float credit) {
		this.name = name;
		this.major = major;
		this.classNum = classNum;
		this.credit = credit;
	}
	
	public String getName() {return name;}
	public String getMajor() {return major;}
	public int getClassNum() {return classNum;}
	public float getCredit() {return credit;}
	
	public void setName(String name) {this.name = name;}
	public void setMajor(String major) {this.major = major;}
	public void setClassNum(int classNum) {this.classNum = classNum;}
	public void setCredit(float credit) {this.credit = credit;}
}
