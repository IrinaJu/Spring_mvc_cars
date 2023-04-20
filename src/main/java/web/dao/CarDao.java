package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDao {
    private static int car_count;
    private static List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car(++car_count, "model1", "color1"));
        cars.add(new Car(++car_count, "model2", "color2"));
        cars.add(new Car(++car_count, "model3", "color3"));
        cars.add(new Car(++car_count, "model4", "color4"));
        cars.add(new Car(++car_count, "model5", "color5"));
    }


    public List<Car> getCars(Integer count) {
        return cars.stream().limit(Math.min(count, cars.size())).collect
                (Collectors.toList());
    }
}

