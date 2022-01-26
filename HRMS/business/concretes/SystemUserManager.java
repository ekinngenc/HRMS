package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.SystemUserService;
import kodlamaio.HRMS.dataAccess.abstracts.SystemUsersDao;
import kodlamaio.HRMS.entities.concretes.SystemUsers;


@Service
public class SystemUserManager implements SystemUserService{

	SystemUsersDao systemUsersDao;
	
	@Autowired
	public SystemUserManager(SystemUsersDao systemUsersDao) {
		this.systemUsersDao=systemUsersDao;
	}
	@Override
	public List<SystemUsers> getAll() {
		return this.systemUsersDao.findAll();
	}

}
