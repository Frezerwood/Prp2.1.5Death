package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Rabbit4 {
    private Duck5 duck;

    @Override
    public String toString() {
        return ", в зайце утка " + duck.toString();
    }

    @Autowired
    public void setDuck(Duck5 duck) {
        this.duck = duck;
    }
}

//    private Ocean1 ocean;
//
//    public String getRulesByDeth() {
//        return "На свете есть океан , " + ocean.toString();
//    }
//
//    @Autowired
//    public void setOcean(Ocean1 ocean) {
//        this.ocean = ocean;
//    }