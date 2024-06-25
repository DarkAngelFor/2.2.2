package web.DAO;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Repository
public class CarDAOImpl implements CarDAO {

    private final List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("FAW Besturn X80", 2.0, "red"));
        carList.add(new Car("KIA Sportage", 2.0, "purple"));
        carList.add(new Car("Hyundai Tuscon", 2.0, "blue"));
        carList.add(new Car("Nissan Qashqai", 2.0, "white"));
        carList.add(new Car("Haval X6", 1.5, "gray"));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }


}
