package model;

import java.util.Objects;

public class Whiskey extends Beverage {

    private String district;
    private String blend;

    public Whiskey (Whiskey target){
        super(target);
        if (target != null){
            this.district = target.district;
            this.blend = target.blend;
        }
    }
    public Whiskey(){

    }

    @Override
    public Beverage clone() {
        return new Whiskey(this);
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setBlend(String blend) {
        this.blend = blend;
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Whiskey) || !super.equals(object2)) return false;
        Whiskey beverage2 = (Whiskey) object2;
        return beverage2.district.equals(district) && beverage2.blend.equals(blend);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), district, blend);
    }

    @Override
    public String toString() {
        return "Whiskey{" +
                "district='" + district + '\'' +
                ", blend='" + blend + '\'' +
                "} " + super.toString();
    }
}
