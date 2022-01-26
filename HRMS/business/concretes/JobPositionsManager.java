package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.JobPositionsService;
import kodlamaio.HRMS.dataAccess.abstracts.JobPositionsDao;
import kodlamaio.HRMS.entities.concretes.JobPositions;


@Service
public class JobPositionsManager implements JobPositionsService{

	JobPositionsDao jobPositionsDao;
	
	@Autowired
	public JobPositionsManager(JobPositionsDao jobPositionsDao) {
		this.jobPositionsDao=jobPositionsDao;
	}

	@Override
	public List<JobPositions> getAll() {
		return this.jobPositionsDao.findAll();
	}


	
	
	
}
