package kodlamaio.HRMS.dataAccess.abstracts;

import kodlamaio.HRMS.entities.concretes.City;
import kodlamaio.HRMS.entities.concretes.JobAdvertisement;
import kodlamaio.HRMS.entities.dtos.JobAdvertisementDto;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {

    List<JobAdvertisement> getAllByIsActiveTrue();
    List<JobAdvertisement> getAllByEmployee_CompanyNameAndIsActiveTrue(@Param("companyName") String companyName);
    List<JobAdvertisement> getAllByOrderByApplicationDeadLineAsc();

    @Query("SELECT new kodlamaio.HRMS.entities.dtos.JobAdvertisementDto"
            + "(ja.advertisementId, ja.openPositions, ja.applicationDeadLine, ja.isActive, e.companyName, jp.jobTitle) "
            + "FROM JobAdvertisement ja INNER JOIN ja.employee e INNER JOIN ja.jobPositions jp")
    List<JobAdvertisementDto> getJobAdvertisementDtoWithEmployerDetails();
}
