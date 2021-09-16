package model;

import java.util.Objects;

public class Wine extends Beverage {

    private String colour;
    private String countryOfOrigin;
    private String grape;

    public Wine(Wine target) {
        super(target);
        if (target != null) {
            this.colour = target.colour;
            this.countryOfOrigin = target.countryOfOrigin;
            this.grape = target.grape;
        }
    }
    public Wine (){
    }

    @Override
    public Beverage clone() {
        return new Wine(this);
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public void setGrape(String grape) {
        this.grape = grape;
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Wine) || !super.equals(object2)) return false;
        Wine beverage2 = (Wine) object2;
        return beverage2.colour.equals(colour) && beverage2.countryOfOrigin.equals(countryOfOrigin)
                && beverage2.grape.equals(grape);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), colour, countryOfOrigin, grape);
    }

    @Override
    public String toString() {
        return "Wine{" +
                "colour='" + colour + '\'' +
                ", countryOfOrigin='" + countryOfOrigin + '\'' +
                ", grape='" + grape + '\'' +
                "} " + super.toString();
    }

}
