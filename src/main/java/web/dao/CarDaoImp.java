package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Repository
public class CarDaoImp implements CarDao {
    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Camry", 7, 2001));
        cars.add(new Car("Corolla", 6, 2002));
        cars.add(new Car("Alphard", 3, 2008));
        cars.add(new Car("Gr 86", 1, 2022));
        cars.add(new Car("Verso", 1, 2009));
    }

    @Override
    public List<Car> getCarByNumber(int number) {
        return IntStream.range(0, cars.size()).filter(n -> n < number).mapToObj(cars::get).collect(Collectors.toList());
    }
}
