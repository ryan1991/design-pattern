package builder;

public class Main {
    public static void main(String[] args) {

        Meal vegMeal = new MealBuilder().prepareVegMeal();
        System.out.println(vegMeal.getCost());
        vegMeal.showItems();

        Meal noVegMeal = new MealBuilder().prepareNonVegMeal();
        System.out.println(noVegMeal.getCost());
        noVegMeal.showItems();

    }

}
