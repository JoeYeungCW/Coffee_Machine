package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many cups of coffee you will need: ");
        int coffee = scanner.nextInt();
        System.out.printf("For %d cups of coffee you will need:%n",coffee);
        System.out.println(200*coffee+" ml of water");
        System.out.println(50*coffee+" ml of milk");
        System.out.println(15*coffee+" g of coffee beans");
    }
}
