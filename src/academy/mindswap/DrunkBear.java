package academy.mindswap;

import java.util.Random;

public class DrunkBear extends Bears {

    DrunkBear() {
        super();
    }

@Override
    public void speak(){
        int a_20_chance = new Random().nextInt(10);
        if( a_20_chance >= 2){
            System.out.println(Bears.SPEAKING_NOISE);
        }else{
            System.out.println("ZZzzZZzZz...I need beer...ZZzZZzZ");
        }


}

}
