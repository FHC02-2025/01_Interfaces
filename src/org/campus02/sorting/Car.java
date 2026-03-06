package org.campus02.sorting;

import java.util.Objects;

public class Car implements Sortable, Sortable2<Car> {

    private String carType;
    private int productionYear;
    private int drivenKilometer;

    // ALT+Einfg

    public Car(String carType, int productionYear, int drivenKilometer) {
        this.carType = carType;
        this.productionYear = productionYear;
        this.drivenKilometer = drivenKilometer;
    }

    @Override
    public int sortValue() {
        return drivenKilometer;
    }

    @Override
    public int sortValue(Car other) {
        if (productionYear > other.productionYear) {
            return 1;
        } else if (productionYear < other.productionYear) {
            return -1;
        } else
            return 0;
    }

   /* public int sortValue(Car other) {
        if (drivenKilometer > other.drivenKilometer) {
            return -1;
        } else if (drivenKilometer < other.drivenKilometer) {
            return 1;
        } else
            return 0;
    }
    */

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return productionYear == car.productionYear && drivenKilometer == car.drivenKilometer && Objects.equals(carType, car.carType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carType, productionYear, drivenKilometer);
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType='" + carType + '\'' +
                ", productionYear=" + productionYear +
                ", drivenKilometer=" + drivenKilometer +
                '}';
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public int getDrivenKilometer() {
        return drivenKilometer;
    }

    public void setDrivenKilometer(int drivenKilometer) {
        this.drivenKilometer = drivenKilometer;
    }


}