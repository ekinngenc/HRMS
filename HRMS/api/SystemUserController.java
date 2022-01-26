package kodlamaio.HRMS.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.abstracts.SystemUserService;
import kodlamaio.HRMS.entities.concretes.SystemUsers;

import java.util.List;

@RestController
@RequestMapping("/api/suc")
public class SystemUserController {

	SystemUserService systemUserService;
	
	public SystemUserController(SystemUserService systemUserService) {
		this.systemUserService=systemUserService;
	}
	
	@GetMapping("/getall")
	public List<SystemUsers> getAll(){
		return this.systemUserService.getAll();
	}
}
