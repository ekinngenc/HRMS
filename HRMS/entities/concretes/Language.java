package kodlamaio.HRMS.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


import javax.persistence.*;
import java.util.List;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="hrms_language")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="language_id")
    private int languageId;

    @NotNull
    @NotBlank
    @Column(name="language_name")
    private String languageName;

    @NotNull
    @NotBlank
    @Size(min = 1, max = 5)
    @Column(name="language_level")
    private int languageLevel;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "languages")
    private List<Cv> cv;

}
