package homework0919;

public class AnimalHospitalDTO {
	private String id;
	private String guardianName;
	private String petName;
	private int petAge;
	private String contactNumber;

	public AnimalHospitalDTO() {	}

	
	public AnimalHospitalDTO(String id, String guardianName, String petName, int petAge, String contactNumber) {
		this.id = id;
		this.guardianName = guardianName;
		this.petName = petName;
		this.petAge = petAge;
		this.contactNumber = contactNumber;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getGuardianName() {
		return guardianName;
	}


	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}


	public String getPetName() {
		return petName;
	}


	public void setPetName(String petName) {
		this.petName = petName;
	}


	public int getPetAge() {
		return petAge;
	}


	public void setPetAge(int petAge) {
		this.petAge = petAge;
	}


	public String getContactNumber() {
		return contactNumber;
	}


	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	

}
