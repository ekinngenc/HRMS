package kodlamaio.HRMS.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@Table(name= "hrms_school")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="school_id")
    private int schoolId;

    @NotNull
    @Column(name="school_name")
    private String schoolName;

    @NotNull
    @Column(name="department_name")
    private String departmentName;

    @NotNull
    @Column(name="start_date")
    private Date startDate;

    @Column(name="finished_date")
    private Date finishedDate;

    @Column(name="graduated_date")
    private Date graduatedDate;

    @OneToMany(fetch=FetchType.LAZY, mappedBy = "schools")
    private List<Cv> cv;

}
