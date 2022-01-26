package kodlamaio.HRMS.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="hrms_job_seekers")
@AllArgsConstructor
@NoArgsConstructor

public class JobSeekers {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@NotNull
	@Column(name="js_userId")
	private int userId;

	@NotNull
	@Column(name="js_name")
	String name;

	@NotNull
	@Column(name="js_surname")
	String surname;

	@NotNull
	@Column(name="js_tc")
	int tc;


	@Column(name="js_birthdate")
	Date birthday;


	
}
