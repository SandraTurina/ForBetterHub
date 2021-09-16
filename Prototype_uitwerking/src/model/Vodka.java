package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Vodka extends Beverage {

    //TODO Opdracht 1:Maak de klasse Vodka compleet!

    // attributen zoals:
    String country;
    List<String> ingredients = new ArrayList<>();

    public Vodka(Vodka target) {
        super(target);
        if (target != null) {
            this.country = target.country;
            this.ingredients = target.ingredients;
        }
    }

    public Vodka() {
    }

    @Override
    public Beverage clone() {
        return new Vodka(this);
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }


    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Vodka) || !super.equals(object2)) return false;
        Vodka beverage2 = (Vodka) object2;
        return beverage2.country.equals(country) && beverage2.ingredients.equals(ingredients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), country, ingredients);
    }

    @Override
    public String toString() {
        return "Vodka{" +
                "country='" + country + '\'' +
                ", ingredients=" + ingredients + '\'' +
                " } " + super.toString();
    }
}
