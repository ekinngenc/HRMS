package kodlamaio.HRMS.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="social_adress")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class SocialAdress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="adress_id")
    private int socialAdressId;

    @Column(name="github_adress")
    private String githubAdress;

    @Column(name="linkedin_adress")
    private String linkedinAdress;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "socialAdresses")
    private List<Cv> cv;
}
