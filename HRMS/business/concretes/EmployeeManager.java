package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.EmployeeService;
import kodlamaio.HRMS.core.utilities.DataResult;
import kodlamaio.HRMS.core.utilities.SuccessDataResult;
import kodlamaio.HRMS.core.utilities.SuccessResult;
import kodlamaio.HRMS.dataAccess.abstracts.EmployeeDao;
import kodlamaio.HRMS.entities.concretes.Employee;


@Service
public class EmployeeManager implements EmployeeService{
	
	EmployeeDao employeeDao;
	
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public SuccessResult add(Employee employee) {
		this.employeeDao.save(employee);
		return new SuccessResult("Employee saved");
	}


	@Override
	public DataResult<List<Employee>> getByUserId(int userId) {
		return new SuccessDataResult<List<Employee>>(this.employeeDao.getByUserId(userId), "Data listelendi");
	}

	@Override
	public DataResult<Employee> getByCompanyName(String companyName) {
		return new SuccessDataResult<Employee>(this.employeeDao.getByCompanyName(companyName), "Data listelendi");
	}

	@Override
	public DataResult<Employee> getByWebSite(String webSite) {
		return new SuccessDataResult<Employee>(this.employeeDao.getByWebSite(webSite), "Data listelendi");
	}

	@Override
	public DataResult<List<Employee>> getByCompanyEmail(String companyEmail) {
		return new SuccessDataResult<List<Employee>>(this.employeeDao.getByCompanyEmail(companyEmail), "Data listelendi");
	}

	@Override
	public List<Employee> getAll() {
		return this.employeeDao.findAll();
	}

	

	
}
