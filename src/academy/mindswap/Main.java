package academy.mindswap;

public class Main {

    public static void main(String[] args) {

        Shop ToysRUs = new Shop();
        ToysRUs.massProduction(10);
        Shop lojaDos300 = new Shop();
        lojaDos300.massProduction(10);

        if (lojaDos300.getNumberOfSimple() > ToysRUs.getNumberOfSimple()) {
            System.out.println("'Loja Dos 300' have more simples bears");
        } else {
            System.out.println("'ToysRUs' have more simples bears");
        }

        if (lojaDos300.getNumberOfDrunks() > ToysRUs.getNumberOfDrunks()) {
            System.out.println("'Loja Dos 300' have more drunk bears");
        } else {
            System.out.println("'ToysRUs' have more drunk bears");
        }
        if (lojaDos300.getNumberOfCrankies() > ToysRUs.getNumberOfCrankies()) {
            System.out.println("'Loja Dos 300' have more cranky bears");
        } else {
            System.out.println("'ToysRUs' have more cranky bears");
        }
    }
}
