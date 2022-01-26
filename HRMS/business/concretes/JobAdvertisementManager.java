package kodlamaio.HRMS.business.concretes;

import kodlamaio.HRMS.business.abstracts.JobAdvertisementService;
import kodlamaio.HRMS.core.utilities.DataResult;
import kodlamaio.HRMS.core.utilities.SuccessDataResult;
import kodlamaio.HRMS.dataAccess.abstracts.JobAdvertisementDao;
import kodlamaio.HRMS.entities.concretes.JobAdvertisement;
import kodlamaio.HRMS.entities.dtos.JobAdvertisementDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {

    JobAdvertisementDao jobAdvertisementDao;

    public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
        this.jobAdvertisementDao = jobAdvertisementDao;
    }


    @Override
    public DataResult<List<JobAdvertisement>> getAll() {
        return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(), "Job advertisement listed");
    }

    @Override
    public DataResult<List<JobAdvertisement>> getAllByIsActiveTrue() {
        return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getAllByIsActiveTrue());
    }

    @Override
    public DataResult<List<JobAdvertisement>> getAllByEmployee_CompanyNameAndIsActiveTrue(String companyName) {
        return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getAllByEmployee_CompanyNameAndIsActiveTrue(companyName), "Listed the advertisement");
    }

    @Override
    public DataResult<List<JobAdvertisement>> getAllByOrderByApplicationDeadLineAsc() {
        return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getAllByOrderByApplicationDeadLineAsc(), "Listed job advertisement order by order application deadline ascend");
    }

    @Override
    public DataResult<List<JobAdvertisementDto>> getJobAdvertisementDtoWithEmployerDetails() {
        return new SuccessDataResult<List<JobAdvertisementDto>>(this.jobAdvertisementDao.getJobAdvertisementDtoWithEmployerDetails(), "Job advertisement and employee details are listed");
    }
}
