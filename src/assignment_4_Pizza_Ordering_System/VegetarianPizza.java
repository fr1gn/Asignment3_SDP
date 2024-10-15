package assignment_4_Pizza_Ordering_System;

public class VegetarianPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Vegetarian Pizza";
    }

    @Override
    public double getCost() {
        return 9;
    }
}
