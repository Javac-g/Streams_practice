package V4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String...args){
        List<Dish> menu = new ArrayList<>();
        menu.add(new Dish(500,"potato"));
        menu.add(new Dish(1200,"fish"));
        menu.add(new Dish(3300,"meat"));
        menu.add(new Dish(1400,"soup"));
        menu.add(new Dish(6500,"mushrooms"));
        menu.add(new Dish(1600,"chicken"));
        menu.add(new Dish(7700,"deer"));
        menu.add(new Dish(1800,"alcohol"));
        menu.add(new Dish(2900,"nirn roots"));
        menu.add(new Dish(3100,"skuma"));
        menu.add(new Dish(2600,"fast food"));

        List<Dish> smallCallories = new ArrayList<>();
        for (Dish d:menu){
            if (d.getCalories() < 2000){
                smallCallories.add(d);
            }
        }
        smallCallories.sort(Comparator.comparingInt(Dish::getCalories));

//        Collections.sort(smallCallories, new Comparator<Dish>() {
//            @Override
//            public int compare(Dish o1, Dish o2) {
//                return Integer.compare(o1.getCalories(),o2.getCalories());
//            }
//        });

//        Collections.sort(smallCallories, (o1, o2) -> Integer.compare(o1.getCalories(),o2.getCalories()));

        List<String > menuNames = new ArrayList<>();
        for (Dish smallCallory : smallCallories) {
            menuNames.add(smallCallory.getName());
        }

        System.out.println(menuNames);

        List<String> bigMenuNames = menu.stream()
                .filter(x -> x.getCalories() > 2000)
                .sorted(Comparator.comparingInt(Dish::getCalories))
                .map(Dish::getName).toList();
        System.out.println(bigMenuNames);
    }
}
