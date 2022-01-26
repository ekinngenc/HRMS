package kodlamaio.HRMS.api;

import kodlamaio.HRMS.business.abstracts.JobPositionsService;
import kodlamaio.HRMS.entities.concretes.JobPositions;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.abstracts.JobSeekersService;
import kodlamaio.HRMS.entities.concretes.JobSeekers;

import java.util.List;


@RestController
@RequestMapping("/api/jpc")
public class JobPositionsController {

	 JobPositionsService jobPositionsService;
	
	public JobPositionsController(JobPositionsService jobPositionsService) {
	this.jobPositionsService = jobPositionsService;
	}
	
	@GetMapping("/getall")
	public List<JobPositions> getAll(){
		return this.jobPositionsService.getAll();
	}
	
}
