package web.model;

import java.util.Objects;

public class Car {
    private String model;
    private int generation;
    private int yearOfRelease;

    public Car() {
    }

    public Car(String model, int generation, int yearOfRelease) {
        this.model = model;
        this.generation = generation;
        this.yearOfRelease = yearOfRelease;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + generation +
                ", yearOfRelease=" + yearOfRelease +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return generation == car.generation && yearOfRelease == car.yearOfRelease && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, generation, yearOfRelease);
    }
}
