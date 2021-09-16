package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BeverageCatalogus {

    private Map<String, Beverage> catalogus = new HashMap<>();

    public BeverageCatalogus() {

        Beer beer = new Beer();
        beer.setBrand("Heineken");
        beer.setAlcoholPercentage(6.5);
        beer.setVolume( 0.75);
        beer.setCerealGrains("Hop");
        catalogus.put("Heineken Zomerbier", beer);

        Wine wine = new Wine();
        wine.setColour("White");
        wine.setCountryOfOrigin("France");
        wine.setGrape("Chardonnay");
        wine.setAlcoholPercentage(11);
        catalogus.put("White Chardonnay", wine);

        Whiskey whiskey = new Whiskey();
        whiskey.setAlcoholPercentage(41);
        whiskey.setBrand("Jameson");
        whiskey.setBlend("Mixed");
        whiskey.setVolume(1.5);
        whiskey.setDistrict("Highlands");
        catalogus.put("Scottish Favourite", whiskey);

        //TODO Opdracht 2: Voeg een lekkere Vodka toe aan de catalogus
        Vodka vodka = new Vodka();
        List<String> ingredientList = new ArrayList<>();
        ingredientList.add("potatoes");
        ingredientList.add("water");
        ingredientList.add("ethanol");
        vodka.setIngredients(ingredientList);
        vodka.setCountry("Russia");
        vodka.setVolume(1.0);
        vodka.setBrand("Petronika");
        vodka.setAlcoholPercentage(40.0);
        catalogus.put("From Russia With Love", vodka);
    }

    public Beverage put(String key, Beverage beverage) {
        catalogus.put(key, beverage);
        return beverage;
    }

    public Beverage get(String key) {
        return catalogus.get(key).clone();
    }
}
