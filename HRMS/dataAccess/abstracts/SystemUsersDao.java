package kodlamaio.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.HRMS.entities.concretes.SystemUsers;

import java.util.List;

@Repository
public interface SystemUsersDao extends JpaRepository<SystemUsers, Integer>{


}
