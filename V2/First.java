package V2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class First {
    private final static List<String> some = new ArrayList<>();

    static void print(Iterable<String> iterable){
        Iterator<String> iterator = iterable.iterator();
        while(iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }
    }


    public static void main(String...args){
        some.add("Hello");
        some.add("My");
        some.add("Name");
        some.add("Is");
        some.add("Max");

        print(some);

    }
}
