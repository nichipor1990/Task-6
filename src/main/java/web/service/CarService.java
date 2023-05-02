package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;


@Service
public class CarService {

    @Autowired
    private CarDao carDao;

    public List<Car> getCarsByCount(Integer count) {
        List<Car> cars = carDao.getCars();
        if (count == null) {
            return cars;
        } else {
            return cars.stream()
                    .limit(count)
                    .toList();
        }
    }
}
