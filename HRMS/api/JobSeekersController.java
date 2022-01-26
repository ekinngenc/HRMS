package kodlamaio.HRMS.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.abstracts.JobSeekersService;
import kodlamaio.HRMS.entities.concretes.JobSeekers;

import java.util.List;


@RestController
@RequestMapping("/api/jsc")
public class JobSeekersController {

	JobSeekersService jobSeekersService;
	
	public JobSeekersController(JobSeekersService jobSeekersService) {
		this.jobSeekersService=jobSeekersService;
	}
	
	@GetMapping("/getall")
	public List<JobSeekers> getAll(){
		return this.jobSeekersService.getAll();
	}
}
