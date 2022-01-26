package kodlamaio.HRMS.business.abstracts;

import kodlamaio.HRMS.core.utilities.DataResult;
import kodlamaio.HRMS.entities.concretes.JobAdvertisement;
import kodlamaio.HRMS.entities.dtos.JobAdvertisementDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface JobAdvertisementService {

    DataResult<List<JobAdvertisement>> getAll();
    DataResult<List<JobAdvertisement>> getAllByIsActiveTrue();
    DataResult<List<JobAdvertisement>> getAllByEmployee_CompanyNameAndIsActiveTrue(String companyName);
    DataResult<List<JobAdvertisement>> getAllByOrderByApplicationDeadLineAsc();
    DataResult<List<JobAdvertisementDto>> getJobAdvertisementDtoWithEmployerDetails();

}
