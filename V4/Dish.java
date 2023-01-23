package V4;

public class Dish {
    private int calories;
    private String name;

    public Dish(int calories, String name) {
        this.calories = calories;
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public String getName() {
        return name;
    }
}
