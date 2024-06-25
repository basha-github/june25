package com.mtz.stu;

public class Student {
	
	private int sid;
	private String name;
	private String college;
	private int fee;
	private int maths,sci,eng;
	public Student(int sid, String name, String college, int fee, int maths, int sci, int eng) {
		super();
		this.sid = sid;
		this.name = name;
		this.college = college;
		this.fee = fee;
		this.maths = maths;
		this.sci = sci;
		this.eng = eng;
	}
	
	
	
	
	public int getSid() {
		return sid;
	}




	public void setSid(int sid) {
		this.sid = sid;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getCollege() {
		return college;
	}




	public void setCollege(String college) {
		this.college = college;
	}




	public int getFee() {
		return fee;
	}




	public void setFee(int fee) {
		this.fee = fee;
	}




	public int getMaths() {
		return maths;
	}




	public void setMaths(int maths) {
		this.maths = maths;
	}




	public int getSci() {
		return sci;
	}




	public void setSci(int sci) {
		this.sci = sci;
	}




	public int getEng() {
		return eng;
	}




	public void setEng(int eng) {
		this.eng = eng;
	}




	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", college=" + college + ", fee=" + fee + ", maths=" + maths
				+ ", sci=" + sci + ", eng=" + eng + "]";
	}
	
	
	

}
