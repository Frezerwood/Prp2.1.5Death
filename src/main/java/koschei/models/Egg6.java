package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;

public class Egg6 {
    private final Needle7 needle;
    public Egg6(Needle7 needle){
        this.needle = needle;
    }
    @Override
    public String toString() {
        return ", в яйце иголка " + needle.toString();
    }
}

//
//    private final Rabbit4 rabbit;
//
//    @Autowired
//    public Wood3(Rabbit4 rabbit) {
//        this.rabbit = rabbit;
//    }