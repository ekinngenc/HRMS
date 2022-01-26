package kodlamaio.HRMS.entities.concretes;


import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Table(name="hrms_employee")
@AllArgsConstructor
@NoArgsConstructor

public class Employee{
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name="e_user_id")
	private int userId;
	
	@Column(name="e_company_name")
	private String companyName;
	
	@Column(name="e_web_site")
	private String webSite;
	
	@Column(name="e_company_email")
	private String companyEmail;

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employee")
	private List<JobAdvertisement> jobAdvertisement;

}
