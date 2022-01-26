package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.core.utilities.DataResult;
import kodlamaio.HRMS.core.utilities.Result;
import kodlamaio.HRMS.core.utilities.SuccessResult;
import kodlamaio.HRMS.entities.concretes.Employee;

public interface EmployeeService {

	Result add(Employee employee);
	List<Employee> getAll();
	
	DataResult<List<Employee>> getByUserId(int userId);
	DataResult<Employee> getByCompanyName(String companyName);
	DataResult<Employee> getByWebSite(String webSite);
	DataResult<List<Employee>> getByCompanyEmail(String companyEmail);

}

