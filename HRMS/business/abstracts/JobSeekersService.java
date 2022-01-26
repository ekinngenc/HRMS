package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.entities.concretes.JobSeekers;

public interface JobSeekersService {

	List<JobSeekers> getAll();
}
