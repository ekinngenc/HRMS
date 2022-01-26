package kodlamaio.HRMS.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="hrms_cv")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class Cv {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "cv_id")
    private int cvId;

    @Column(name = "cover_letter")
    private String coverLetter;

    @ManyToOne
    @JoinColumn(name = "job_experience_id")
    private List<JobExperience> jobExperiences;

    @ManyToOne
    @JoinColumn(name = "school_id")
    private List<School> schools;

    @ManyToOne
    @JoinColumn(name = "language_id")
    private List<Language> languages;

    @ManyToOne
    @JoinColumn(name = "adress_id")
    private List<SocialAdress> socialAdresses;

    @ManyToOne
    @JoinColumn(name = "ability_id")
    private List<Ability> ability;



}
