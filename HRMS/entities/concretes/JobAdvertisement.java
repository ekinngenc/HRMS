package kodlamaio.HRMS.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "hrms_job_advertisement")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class JobAdvertisement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column (name = "advertisement_id")
   private int advertisementId;

    @Column (name = "open_positions")
   private String openPositions;

    @Column(name="job_description")
   private String jobDescription;

    @Column(name = "salary_min")
   private int salaryMin;

    @Column(name = "salary_max")
   private int salaryMax;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "application_dead_line")
   private Date applicationDeadLine;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column (name = "release_date_time")
   private Date releaseDateTime;

    @Column (name = "is_active")
   private boolean isActive;

    @JsonIgnore
    @ManyToOne
    @JoinColumn (name = "e_user_id")
   private Employee employee;

    @JsonIgnore
    @ManyToOne
    @JoinColumn (name = "jp_id")
   private JobPositions jobPositions;

    @JsonIgnore
    @ManyToOne
    @JoinColumn (name = "city_id")
    private City city;



}
