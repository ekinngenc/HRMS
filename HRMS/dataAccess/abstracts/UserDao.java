package kodlamaio.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.HRMS.entities.abstracts.Users;

@Repository
public interface UserDao extends JpaRepository<Users, Integer>{


}
