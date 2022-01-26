package kodlamaio.HRMS.core.concretes;

import kodlamaio.HRMS.core.abstracts.HRMSEmployeeService;
import kodlamaio.HRMS.core.utilities.Result;
import kodlamaio.HRMS.core.utilities.SuccessResult;
import kodlamaio.HRMS.entities.concretes.Employee;

public class HRMSEmployeeManager implements HRMSEmployeeService{

	@Override
	public Result isEmployee(Employee employee) {
		return new SuccessResult("This person is an HRMS employee");
	}

}
