public class Main {
    public static void main(String[] args) {
        CappucinoMaker cappucinoMaker = new CappucinoMaker();
        EspressoMaker espressoMaker = new EspressoMaker();

        cappucinoMaker.prepareCoffee();
        System.out.println(" ");
        espressoMaker.prepareCoffee();
    }
}