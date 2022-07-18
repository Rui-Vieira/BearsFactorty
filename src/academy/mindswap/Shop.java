package academy.mindswap;

public class Shop {
    private int numberOfBears = 0;
    private int numberOfCrankies = 0;
    private int numberOfSimples = 0;
    private int numberOfDrunks;



    public Shop() {
        super();

    }
    public Bears bearsFactory(){
        final int randomNumber = (int) (Math.random()*100);
        if(randomNumber % 5 == 0) {
            numberOfBears++;
            numberOfCrankies++;
            return new CrankyBear();

        }else if(randomNumber % 2 == 0) {
            numberOfBears++;
            numberOfSimples++;
            return new SimpleBear();

        }else{
            numberOfBears++;
            numberOfDrunks++;
            return new DrunkBear();
        }
    }

    public void massProduction ( int howMany){
        int i = 0;
        while(i < howMany) {
            bearsFactory();
            i++;
        }
    }

    public int getNumberOfBears() {
        System.out.println("Number of bears: " + numberOfBears);
        return numberOfBears;
    }

    public void setNumberOfBears(int numberOfBears) {
        this.numberOfBears = numberOfBears;
    }

    public void setNumberOfCrankies(int numberOfCrankies) {
        this.numberOfCrankies = numberOfCrankies;
    }

    public void setNumberOfSimples(int numberOfSimples) {
        this.numberOfSimples = numberOfSimples;
    }

    public void setNumberOfDrunks(int numberOfDrunks) {
        this.numberOfDrunks = numberOfDrunks;
    }

    public int getNumberOfCrankies() {
        System.out.println("Number of crankies: " + numberOfCrankies);
        return numberOfCrankies;
    }

    public int getNumberOfDrunks() {
        System.out.println("Number of drunks: " + numberOfDrunks);
        return numberOfDrunks;
    }

    public int getNumberOfSimple() {
        System.out.println("Number of simples bears: " + numberOfSimples);
        return numberOfSimples;
    }
}
