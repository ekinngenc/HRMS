package kodlamaio.HRMS.entities.abstracts;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="hrms_users")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="user_id")
	private int id;
	
	@Column(name="user_email")
	private String Email;
	
	@Column(name="user_password")
	private String password;

}
