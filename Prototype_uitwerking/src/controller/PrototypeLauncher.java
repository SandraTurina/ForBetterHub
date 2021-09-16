package controller;

import model.Beer;
import model.Beverage;
import model.Vodka;
import model.Wine;

import java.util.ArrayList;
import java.util.List;

public class PrototypeLauncher {
    public static void main(String[] args) {
        List<Beverage> beverages = new ArrayList<>();
        List<Beverage> beveragesCopy = new ArrayList<>();

        // Biertje
        Beer beer = new Beer();
        beer.setBrand("Heineken");
        beer.setAlcoholPercentage(6.5);
        beer.setVolume(0.75);
        beer.setCerealGrains("Hop");

        Beer beerClone1 = (Beer) beer.clone();

        beverages.add(beer);
        beverages.add(beerClone1);

        //Wijntje
        Wine wine = new Wine();
        wine.setColour("Red");
        wine.setCountryOfOrigin("France");
        wine.setGrape("Chardonnay");
        wine.setAlcoholPercentage(11);

        Wine wineClone1 = (Wine) wine.clone();

        beverages.add(wine);
        beverages.add(wineClone1);

        //TODO Opdracht 3 Maak drie verschillende Vodka's
        //Vodka
        Vodka vodka1 = new Vodka();
        List<String> ingredientList1 = new ArrayList<>();
        ingredientList1.add("barley");
        ingredientList1.add("water");
        ingredientList1.add("ethanol");
        vodka1.setIngredients(ingredientList1);
        vodka1.setCountry("Poland");
        vodka1.setVolume(1.0);
        vodka1.setBrand("Fajna Wódka");
        vodka1.setAlcoholPercentage(42.0);

        Vodka vodka2 = new Vodka();
        List<String> ingredientList2 = new ArrayList<>();
        ingredientList2.add("wheat");
        ingredientList2.add("water");
        ingredientList2.add("ethanol");
        ingredientList2.add("honey");
        vodka2.setIngredients(ingredientList2);
        vodka2.setCountry("Poland");
        vodka2.setVolume(1.2);
        vodka2.setBrand("Poland's best silver");
        vodka2.setAlcoholPercentage(43.0);

        Vodka vodka3 = new Vodka();
        List<String> ingredientList3 = new ArrayList<>();
        ingredientList3.add("corn");
        ingredientList3.add("water");
        ingredientList3.add("ethanol");
        ingredientList3.add("maple syrup");
        vodka3.setIngredients(ingredientList3);
        vodka3.setCountry("Swedem");
        vodka3.setVolume(1.0);
        vodka3.setBrand("fin vodka");
        vodka3.setAlcoholPercentage(41.0);

        beverages.add(vodka1);
        beverages.add(vodka2);
        beverages.add(vodka3);

        //TODO Opdracht 4 Clone 1 Vodka en laat zien dat het twee verschillende objecten zijn, maar wel identiek
        Vodka vodkaClone1 = (Vodka) vodka1.clone();
        beverages.add(vodkaClone1);

        clone(beverages,beveragesCopy);
        compare(beverages,beveragesCopy);

    }

    private static void clone(List<Beverage> beverages, List<Beverage> beveragesCopy) {
        for (Beverage beverage : beverages) {
            beveragesCopy.add(beverage.clone());
        }
    }

    private static void compare(List<Beverage> beverages, List<Beverage> beveragesCopy) {
        for (int i = 0; i < beverages.size(); i++) {
            if (beverages.get(i) != beveragesCopy.get(i)) {
                System.out.println(i + ": Beverages are different objects (yay!)");
                if (beverages.get(i).equals(beveragesCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Beverages objects are the same (booo!)");
            }
        }
    }


}
