package V1;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    String name;
    Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static List<String> getSongs(){
         List<String> songs = new ArrayList<>();
         songs.add("One");
         songs.add("Two");
         songs.add("Three");
         songs.add("Four");
         return songs;
    }
    @Override
    public String toString(){
        return "Name: "+ name + "\nAge: " +  age;
    }

}
