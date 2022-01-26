package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.entities.concretes.SystemUsers;
public interface SystemUserService {
	
	List<SystemUsers> getAll();

}
