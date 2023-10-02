package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Needle7 {

    @Autowired
    private Deth8 deth;


    @Override
    public String toString() {
        return ", смерть Кощея на игле :( " + deth.toString();
    }
}

//
//    @Autowired
//    private Island2 island;
//
//    @Override
//    public String toString() {
//        return "на океане остров " + island.toString();
//    }