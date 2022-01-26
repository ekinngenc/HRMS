package kodlamaio.HRMS.dataAccess.abstracts;

import kodlamaio.HRMS.entities.concretes.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CityDao extends JpaRepository<City, Integer> {

    City findByCityId(int id);
    City findByCityName(String cityName);

}
