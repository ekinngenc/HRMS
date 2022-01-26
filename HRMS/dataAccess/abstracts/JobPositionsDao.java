package kodlamaio.HRMS.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.HRMS.entities.concretes.JobPositions;

@Repository
public interface JobPositionsDao extends JpaRepository<JobPositions, Integer>{

	List<JobPositions> getById (int id);
	List<JobPositions> getByJobTitle (String jobTitle);
}
