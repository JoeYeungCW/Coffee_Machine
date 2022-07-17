package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        static int water = 400;
        static int milk = 540;
        static int bean = 120;
        static int cup  = 9;
        static int money = 550;
        menu();
        action();
    }

    public static void menu(){
        System.out.println("The coffee machine has:");
        System.out.printf("%d ml of water%n",water);
        System.out.printf("%d ml of milk%n",milk);
        System.out.printf("%d g of coffee beans%n",bean);
        System.out.printf("%d disposable cups%n",cup);
        System.out.printf("$%d of money%n",money);

    }

    public static void buy(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        switch (scanner.nextInt()){
            case 1:
                water-=250;
                bean-=16;
                cup-=1;
                money+=4;
                break;
            case 2:
                water-=350;
                milk-=75;
                bean-=20;
                cup-=1;
                money+=7;
                break;
            case 3:
                water-=200;
                milk-=100;
                bean-=12;
                cup-=1;
                money+=6;
                break;
            default:
                break;
        }
        menu();
    }

    public static void fill(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water you want to add:");
        water+=scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        milk+=scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        bean+=scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add:");
        cup+=scanner.nextInt();
        menu(water,milk,bean,cup,money);
    }

    public static void take(){
        System.out.printf("I gave you $%d%n",money);
        money=0;
        menu();
    }

    public static void action(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write action (buy, fill, take):");
        String action = scanner.next();
        switch(action){
            case "buy":
                buy();
                break;
            case "fill":
                fill();
                break;
            case "take":
                take();
                break;
            default:
                break;

        }
    }



}

