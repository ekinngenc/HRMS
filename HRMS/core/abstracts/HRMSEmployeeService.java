package kodlamaio.HRMS.core.abstracts;

import kodlamaio.HRMS.core.utilities.Result;
import kodlamaio.HRMS.entities.concretes.Employee;

public interface HRMSEmployeeService {

	Result isEmployee(Employee employee);
}
