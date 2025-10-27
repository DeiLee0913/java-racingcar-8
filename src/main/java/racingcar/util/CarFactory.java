package racingcar.util;

import racingcar.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {
    public List<Car> createCars(String[] names) {
        List<Car> cars = new ArrayList<>();

        for(String name : names) {
            Car car = new Car(name);
            cars.add(car);
        }
        return cars;
    }
}