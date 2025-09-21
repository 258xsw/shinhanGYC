package homework0919;


import java.util.List;

public class GymService {
	
	private GymDAO dao;
	
	public GymService(GymDAO dao) {
		super();
		this.dao = dao;
	}
	
	public void addMember(String memberName, int memberId, int baseCalorie, int consumedCalorie) {
		GymDTO dto = new GymDTO(memberName, memberId, baseCalorie, consumedCalorie);
		dao.save(dto);
	}
	
	public List<GymDTO> getAll() {
		return dao.findAll();
	}

}
