package edu.atria.java.inheritance;

public class Citizen {
	
	private long aadhaarno;
	private long voterid;
	private String nationality;
	public Citizen(long aadhaarno, long voterid, String nationality) {
		super();
		this.aadhaarno = aadhaarno;
		this.voterid = voterid;
		this.nationality = nationality;
	}
	public long getAadhaarno() {
		return aadhaarno;
	}
	public void setAadhaarno(long aadhaarno) {
		this.aadhaarno = aadhaarno;
	}
	public long getVoterid() {
		return voterid;
	}
	public void setVoterid(long voterid) {
		this.voterid = voterid;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	@Override
	public String toString() {
		return "Citizen [aadhaarno=" + aadhaarno + ", voterid=" + voterid + ", nationality=" + nationality + "]";
	}
	
	
}
