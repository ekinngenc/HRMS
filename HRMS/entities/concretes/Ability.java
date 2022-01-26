package kodlamaio.HRMS.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="hrms_ability")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class Ability {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="ability_id")
    private int abilityId;

    @Column(name="ability_name")
    private String ability_name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "ability")
    private List<Cv> cv;
}
