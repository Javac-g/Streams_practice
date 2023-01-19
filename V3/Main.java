package V3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static List<Dish> getSmallerThan(int flag,List<Dish> dishes){
        List<Dish> smaller = new ArrayList<>();
        for(Dish dish : dishes){
            if (dish.getCalories() < flag){
                smaller.add(dish);
            }
        }
        smaller.sort(Comparator.comparingInt(Dish::getCalories));
        return smaller;
    }
    public static List<String> getNames(List<Dish> smallers){
        List<String> names = new ArrayList<>();
        for (Dish d : smallers){
            names.add(d.getName());
        }
        return names;
    }
    public static void main(String...args){
        List<Dish> dishes = new ArrayList<>();
        dishes.add(new Dish("Mushrooms",100));
        dishes.add(new Dish("Meat",200));
        dishes.add(new Dish("Ice cream",300));
        dishes.add(new Dish("Soup",400));
        dishes.add(new Dish("Salad",500));
        dishes.add(new Dish("Potato",600));
        dishes.add(new Dish("Chicken",700));
        dishes.add(new Dish("Chocolate",800));

        List<Dish> smaller = getSmallerThan(500,dishes);
        List<String> lowCalories = getNames(smaller);

        System.out.println(lowCalories);


    }
}
