package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDao {
    private static final List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("bmw", "x5", 2015));
        cars.add(new Car("bmw", "x6", 2022));
        cars.add(new Car("bmw", "m5", 2019));
        cars.add(new Car("bmw", "z3", 2010));
        cars.add(new Car("bmw", "x1", 2020));
    }

    public List<Car> getCars() {
        return cars;
    }
}
