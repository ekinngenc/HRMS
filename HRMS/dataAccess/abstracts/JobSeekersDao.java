package kodlamaio.HRMS.dataAccess.abstracts;


import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.HRMS.entities.concretes.JobSeekers;

@Repository
public interface JobSeekersDao extends JpaRepository<JobSeekers, Integer>{
	
	JobSeekers getByName(String name);
	JobSeekers getBySurname(String surname);
	JobSeekers getByTc(int tc);


}
