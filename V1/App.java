package V1;

import java.util.List;

public class App {

    public static void main(String...args){
        new App().go();
    }
    public static void go(){
        List<String> songList = Storage.getSongs();
        System.out.println(songList);
        Storage s = new Storage();
        s.setName("Tony");
        s.setAge(23);
        System.out.println(s);
    }
}
