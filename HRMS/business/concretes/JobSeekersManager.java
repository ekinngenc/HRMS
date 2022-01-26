package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.JobSeekersService;
import kodlamaio.HRMS.dataAccess.abstracts.JobSeekersDao;
import kodlamaio.HRMS.entities.concretes.JobSeekers;


@Service
public class JobSeekersManager implements JobSeekersService{

	JobSeekersDao jobSeekersDao;
	
	@Autowired
	public JobSeekersManager(JobSeekersDao jobSeekersDao) {
		this.jobSeekersDao=jobSeekersDao;
	}
	
	@Override
	public List<JobSeekers> getAll() {
		return this.jobSeekersDao.findAll();
	}

}
