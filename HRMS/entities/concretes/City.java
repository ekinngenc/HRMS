package kodlamaio.HRMS.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name="hrms_cities")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column (name = "city_id")
    private int cityId;

    @Column (name = "city_name")
    private String cityName;


    @JsonIgnore
    @OneToMany(fetch=FetchType.LAZY, mappedBy = "city")
    @NotFound(action = NotFoundAction.IGNORE)
    private List<JobAdvertisement> jobAdvertisement;


}
