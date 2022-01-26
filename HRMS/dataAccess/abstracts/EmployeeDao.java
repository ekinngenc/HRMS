package kodlamaio.HRMS.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.HRMS.entities.concretes.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer>{

	List<Employee> getByUserId(int userId);
	Employee getByCompanyName(String companyName);
	Employee getByWebSite(String webSite);
	List<Employee> getByCompanyEmail(String companyEmail);
	
}
