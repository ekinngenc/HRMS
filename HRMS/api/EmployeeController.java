package kodlamaio.HRMS.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.abstracts.EmployeeService;
import kodlamaio.HRMS.entities.concretes.Employee;


@RestController
@RequestMapping("/api/ec")
public class EmployeeController {
	
	EmployeeService employeeService;
	
	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@GetMapping("/getall")
	public List<Employee> getAll(){
		return this.employeeService.getAll();
	}

	
	
}
