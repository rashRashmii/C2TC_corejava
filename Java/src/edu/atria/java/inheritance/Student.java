package edu.atria.java.inheritance;

public class Student extends Citizen {
	private int studentid;
	private String name;
	private String department;
	private String proctor;
	public Student(long aadhaarno, long voterid, String nationality, int studentid, String name, String department,
			String proctor) {
		super(aadhaarno, voterid, nationality);
		this.studentid = studentid;
		this.name = name;
		this.department = department;
		this.proctor = proctor;
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getProctor() {
		return proctor;
	}
	public void setProctor(String proctor) {
		this.proctor = proctor;
	}
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", name=" + name + ", department=" + department + ", proctor="
				+ proctor + ", getAadhaarno()=" + getAadhaarno() + ", getVoterid()=" + getVoterid()
				+ ", getNationality()=" + getNationality() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
