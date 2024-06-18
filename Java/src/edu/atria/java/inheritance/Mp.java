package edu.atria.java.inheritance;

public class Mp extends Citizen {
	private int id;
	private String name;
	private String party;
	public Mp(long aadhaarno, long voterid, String nationality, int id, String name, String party) {
		super(aadhaarno, voterid, nationality);
		this.id = id;
		this.name = name;
		this.party = party;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getParty() {
		return party;
	}
	public void setParty(String party) {
		this.party = party;
	}
	@Override
	public String toString() {
		return "Mp [id=" + id + ", name=" + name + ", party=" + party + ", getAadhaarno()=" + getAadhaarno()
				+ ", getVoterid()=" + getVoterid() + ", getNationality()=" + getNationality() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
}
