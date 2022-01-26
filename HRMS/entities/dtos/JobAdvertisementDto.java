package kodlamaio.HRMS.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobAdvertisementDto {

    private int advertisementId;
    private String openPositions;
    private Date applicationDeadLine;
    private boolean isActive;
    private String companyName;
    private String jobTitle;

}
