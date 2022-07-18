package academy.mindswap;

public class CrankyBear extends Bears {

    public CrankyBear() {
        super();
    }


    @Override
    public void speak() {
        System.out.println(batteryLevel);

        if (batteryLevel> batteryConsuming && batteryLevel > 50) {
            System.out.println(SPEAKING_NOISE);
            batteryLevel -= batteryConsuming;
            System.out.println(batteryLevel);

        } else if (batteryLevel <= 50) {
            System.out.println("Cranky now playing Sad and Sorrow!");
            batteryLevel = 0;
        }
    }
}
