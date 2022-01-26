package kodlamaio.HRMS.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.abstracts.UserService;
import kodlamaio.HRMS.entities.abstracts.Users;

import java.util.List;

@RestController
@RequestMapping("/api/uc")
public class UserContorller {

	UserService userService;
	
	public UserContorller(UserService userService) {
		this.userService = userService;
		
	}
	
	@GetMapping("/getall")
	public List<Users> getAll(){
		return this.userService.getAll();
	}
}
