package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has: ");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        int bean = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        int coffee = scanner.nextInt();

        int cupofwater = water/200;
        int cupofmilk = milk/50;
        int cupofbean = bean/15;
        int cup =Math.min(cupofbean,Math.min(cupofmilk,cupofwater));
        if(cup>coffee){
            System.out.printf("Yes, I can make that amount of coffee (and even %d more than that)",cup-coffee);
        }
        else if (cup==coffee){
            System.out.println("Yes, I can make that amount of coffee");
        }
        else{
            System.out.printf("No, I can make only %d cup(s) of coffee",cup);
        }
    }
}
