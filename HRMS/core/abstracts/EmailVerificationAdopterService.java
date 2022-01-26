package kodlamaio.HRMS.core.abstracts;

import kodlamaio.HRMS.core.utilities.Result;
import kodlamaio.HRMS.entities.abstracts.Users;

public interface EmailVerificationAdopterService {

	Result Verify(Users user);
}
