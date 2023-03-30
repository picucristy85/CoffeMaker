public class CappucinoMaker extends CoffeMaker{

    public void addMilk() {
        System.out.println("Adaugam lapte!");
    }

    public void addSugar() {
        System.out.println("Adaugam zahar!");
    }

    @Override
    public void prepareCoffee(){
        addCoffee();
        addMilk();
        addSugar();
    }
}
