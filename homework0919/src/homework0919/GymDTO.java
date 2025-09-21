package homework0919;

public class GymDTO {
	
	private String memberName;
	private int memberId;
	private int baseCalorie;
	private int consumedCalorie;
	
	public GymDTO(String memberName, int memberId, int baseCalorie, int consumedCalorie) {
		this.memberName = memberName;
		this.memberId = memberId;
		this.baseCalorie = baseCalorie;
		this.consumedCalorie = consumedCalorie;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public int getBaseCalorie() {
		return baseCalorie;
	}
	public void setBaseCalorie(int baseCalorie) {
		this.baseCalorie = baseCalorie;
	}
	public int getConsumedCalorie() {
		return consumedCalorie;
	}
	public void setConsumedCalorie(int consumedCalorie) {
		this.consumedCalorie = consumedCalorie;
	}

}
