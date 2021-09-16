package model;

import java.util.Objects;

public abstract class Beverage implements Cloneable {

    private String brand;
    private double alcoholPercentage;
    private double volume;

    public Beverage(Beverage target) {
        if (target != null) {
            this.brand = target.brand;
            this.alcoholPercentage = target.alcoholPercentage;
            this.volume = target.volume;
        }
    }
    public Beverage() {
    }

    public abstract Beverage clone();

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setAlcoholPercentage(double alcoholPercentage) {
        this.alcoholPercentage = alcoholPercentage;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public boolean equals(Object object2){
        if (!(object2 instanceof Beverage)) return false;
        Beverage beverage2 = (Beverage) object2;
        return beverage2.volume == volume && beverage2.alcoholPercentage
                == alcoholPercentage && Objects.equals(beverage2.brand, brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, alcoholPercentage, volume);
    }

    @Override
    public String toString() {
        return "Beverage{" +
                "brand='" + brand + '\'' +
                ", alcoholPercentage=" + alcoholPercentage +
                ", volume=" + volume +
                '}';
    }
}



