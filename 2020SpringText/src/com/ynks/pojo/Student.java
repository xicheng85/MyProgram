package com.ynks.pojo;

public class Student {
	/**
	 * 
	 */
	public Student() {
		super();
	}
	/**
	 * @param id
	 * @param uname
	 */
	public Student(int id, String uname) {
		this.id = id;
		this.uname = uname;
	}
	
	int id;
	String uname;
	int age;
	int tid;
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "student [id=" + id + ", uname=" + uname + ", age=" + age + ", tid=" + tid + "]";
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the uname
	 */
	public String getUname() {
		return uname;
	}
	/**
	 * @param uname the uname to set
	 */
	public void setUname(String uname) {
		this.uname = uname;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the tid
	 */
	public int getTid() {
		return tid;
	}
	/**
	 * @param tid the tid to set
	 */
	public void setTid(int tid) {
		this.tid = tid;
	}
}
