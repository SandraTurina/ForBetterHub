package model;

import java.util.Objects;

public class Beer extends Beverage {

    private String cerealGrains;

    public Beer(Beer target) {
        super(target);
        if (target != null) {
            this.cerealGrains = target.cerealGrains;
        }
    }
    public Beer() {
    }

    public void setCerealGrains(String cerealGrains) {
        this.cerealGrains = cerealGrains;
    }

    @Override
    public Beverage clone() {
        return new Beer(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Beer) || !super.equals(object2)) return false;
        Beer beverage2 = (Beer) object2;
        return beverage2.cerealGrains.equals(cerealGrains);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cerealGrains);
    }


}
