package kodlamaio.HRMS.entities.concretes;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Table(name="hrms_job_positions")
@AllArgsConstructor
@NoArgsConstructor

public class JobPositions {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="jp_id")
	private int id;
	
	@Column(name="jp_job_title")
	private String jobTitle;

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "jobPositions")
	private List<JobAdvertisement> jobAdvertisement;


}
