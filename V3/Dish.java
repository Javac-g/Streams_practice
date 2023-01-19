package V3;

public class Dish {
    private final String name;
    private int calories;

    public Dish(String name,int calories){
        this.name = name;
        this.calories = calories;
    }
    public String getName(){
        return name;

    }
    private int getCalories(){
        return calories;
    }
}
