package kodlamaio.HRMS.business.abstracts;

import kodlamaio.HRMS.core.utilities.DataResult;
import kodlamaio.HRMS.core.utilities.Result;
import kodlamaio.HRMS.entities.concretes.City;

import java.util.List;

public interface CityService {

    Result add(City city);

    DataResult<List<City>> getAll();
}
