import java.util.Scanner;

public class EspressoMaker extends CoffeMaker{
    Scanner sc= new Scanner(System.in);
    public void addMilk() {

        System.out.println("Doriti lapte la espresso? YES/NO");
        String raspuns=sc.nextLine();
        if (raspuns.equalsIgnoreCase("YES")){
            System.out.println("Am adaugat lapte la espresso!");
        } else if (raspuns.equalsIgnoreCase("NO")){
            System.out.println("Nu am adaugat lapte la cafea!");
        }else{
            System.out.println("Nu ati introdus un raspuns valid!");
        }
    }
    public void makeItDouble(){
        System.out.println("Doriti espresso dublu? YES/NO");
        String raspuns=sc.nextLine();
        if (raspuns.equalsIgnoreCase("YES")){
            System.out.println("Vom prepara un espresso dublu!");
            addCoffee();
        } else if (raspuns.equalsIgnoreCase("NO")){
            System.out.println("Vom prepara un espresso simplu!");
        }else{
            System.out.println("Nu ati introdus un raspuns valid!");
        }
    }

    @Override
    public void prepareCoffee() {
        addCoffee();
        addMilk();
        makeItDouble();
    }
}
