package mod;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String duckType = "";

        while (true) {
            System.out.println("Enter the type of duck (Rubber/Mallard/RedHead/Decoy):");
            duckType = scanner.nextLine().toLowerCase();

            switch (duckType) {
                case "rubber":
                    Duck rubberDuck = new RubberDuck();
                    rubberDuck.display();
                    rubberDuck.swim();
                    rubberDuck.quack();
                    break;
                case "mallard":
                    Duck mallardDuck = new MallardDuck();
                    mallardDuck.display();
                    mallardDuck.swim();
                    mallardDuck.quack();
                    mallardDuck.fly();
                    break;
                case "redhead":
                    Duck redheadDuck = new ReadHeadDuck();
                    redheadDuck.display();
                    redheadDuck.quack();
                    redheadDuck.fly();

                    break;
                case "decoy":
                    Duck decoyDuck = new DecoyDuck();
                    decoyDuck.display();
                    decoyDuck.swim();
                    decoyDuck.quack();
                    decoyDuck.fly();
                    break;
                default:
                    System.out.println("Invalid duck type!");
                    duckType = "";
                    break;


            }
        }
    }
}