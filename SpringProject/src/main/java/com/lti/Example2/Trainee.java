package com.lti.Example2;

public class Trainee {
	int tid;
	String tname;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	@Override
	public String toString() {
		return "Trainee [tid=" + tid + ", tname=" + tname + "]";
	}
	
	

}
