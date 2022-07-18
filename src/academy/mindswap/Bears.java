package academy.mindswap;

public abstract class Bears {
   protected static final String SPEAKING_NOISE = "I Love You!";
   public int batteryLevel = 100;
   public int batteryConsuming = 10;


   public Bears(){
      this.batteryLevel = batteryLevel;
      this.batteryConsuming = batteryConsuming;
   }

   public int getBatteryLevel() {
      System.out.println( "the battery level is : " + batteryLevel);
      return batteryLevel;
   }
   public void speak(){

      if(batteryConsuming <= batteryLevel ){
         System.out.println(SPEAKING_NOISE);
         batteryLevel -= batteryConsuming;
      } else if (batteryConsuming  > batteryLevel) {
         System.out.println("Battery depleted!");

      }
   }
}
