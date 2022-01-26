package kodlamaio.HRMS.core.concretes;


import kodlamaio.HRMS.core.abstracts.EmailVerificationAdopterService;
import kodlamaio.HRMS.core.utilities.Result;
import kodlamaio.HRMS.core.utilities.SuccessResult;
import kodlamaio.HRMS.entities.abstracts.Users;



public class EmailVerificationAdopterManager implements EmailVerificationAdopterService{

	@Override
	    public Result Verify(Users user) {
	        return new SuccessResult("Email verified successfully");
	    }
	


}
