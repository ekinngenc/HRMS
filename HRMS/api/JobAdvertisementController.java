package kodlamaio.HRMS.api;

import kodlamaio.HRMS.business.abstracts.JobAdvertisementService;
import kodlamaio.HRMS.core.utilities.DataResult;
import kodlamaio.HRMS.entities.concretes.JobAdvertisement;
import kodlamaio.HRMS.entities.dtos.JobAdvertisementDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequestMapping("/api/jac")
@RestController
public class JobAdvertisementController {

    JobAdvertisementService jobAdvertisementService;

    public JobAdvertisementController(JobAdvertisementService jobAdvertisementService) {
        this.jobAdvertisementService = jobAdvertisementService;
    }

    @GetMapping("/getAll")
    public DataResult<List<JobAdvertisement>> getAll()
    {
        return  this.jobAdvertisementService.getAll();
    }

    @GetMapping("/getAllByIsActiveTrue")
    public DataResult<List<JobAdvertisement>> getAllByIsActiveTrue()
    {
        return  this.jobAdvertisementService.getAllByIsActiveTrue();
    }
    @GetMapping("/getAllActivitiesByCompanyName")
    public DataResult<List<JobAdvertisement>> getAllByEmployee_CompanyNameAndIsActiveTrue(@RequestParam("companyName") String companyName)
    {
        return  this.jobAdvertisementService.getAllByEmployee_CompanyNameAndIsActiveTrue(companyName);
    }

    @GetMapping("/getAllOrderByApplicationDeadlineAsc")
    public DataResult<List<JobAdvertisement>> getAllByOrderByApplicationDeadLineAsc()
    {
        return  this.jobAdvertisementService.getAllByOrderByApplicationDeadLineAsc();
    }

    @GetMapping("/getJobAdvertisementDtoWithEmployerDetails")
    public DataResult<List<JobAdvertisementDto>> getJobAdvertisementDtoWithEmployerDetails(){
        return this.jobAdvertisementService.getJobAdvertisementDtoWithEmployerDetails();
    }

}
