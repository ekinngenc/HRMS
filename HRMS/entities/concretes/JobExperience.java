package kodlamaio.HRMS.entities.concretes;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="hrms_job_experience")
public class JobExperience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="job_experience_id")
    private int jobExperienceId;

    @NotNull
    @Column(name="company_name")
    private String companyName;

    @Column(name="position_name")
    private String positionName;

    @NotNull
    @Column(name="start_date")
    private Date startDate;

    @Column(name="end_date")
    private Date endDate;

    @OneToMany(fetch=FetchType.LAZY, mappedBy = "jobExperiences")
    private List<Cv> cv;

}
