package machine;
import java.util.Scanner;
public class CoffeeMachine {

    static int water = 400;
    static int milk = 540;
    static int bean = 120;
    static int cup = 9;
    static int money = 550;



    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
                action();
    }

    public static void remaining(){
        System.out.println("The coffee machine has:");
        System.out.printf("%d ml of water%n",water);
        System.out.printf("%d ml of milk%n",milk);
        System.out.printf("%d g of coffee beans%n",bean);
        System.out.printf("%d disposable cups%n",cup);
        System.out.printf("$%d of money%n",money);
    }

    public static void buy(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        switch (scanner.next()){
            case "1":
                resourcechecker(250,0,16,1);
                money+=4;
                break;
            case "2":
                resourcechecker(350,75,20,1);
                money+=7;
                break;
            case "3":
                resourcechecker(200,100,12,1);
                money+=6;
                break;
            case "back":
                action();
            default:
                break;
        }
        action();
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
        action();
    }

    public static void take(){
        System.out.printf("I gave you $%d%n",money);
        money=0;
        action();
    }

    public static void resourcechecker(int waterC, int milkC, int beanC, int cupC){
        if(water<waterC){
            System.out.println("Sorry, not enough water!");
        }
        else if(milk<milkC){
            System.out.println("Sorry, not enough milk!");
        }
        else if(bean<beanC){
            System.out.println("Sorry, not enough coffee beans!");
        }
        else if(cup<cupC){
            System.out.println("Sorry, not enough cup!");
        }
        else{
            System.out.println("I have enough resources, making you a coffee!");
            water-=waterC;
            milk-=milkC;
            bean-=beanC;
            cup-=cupC;
        }
    }
    public static void action(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String action = scanner.next();
        switch(action){
            case "buy":
                buy();
                action();
                break;
            case "fill":
                fill();
                action();
                break;
            case "take":
                take();
                action();
                break;
            case "remaining":
                remaining();
                action();
                break;
            case "exit":
                System.exit(0);
                break;
            default:
                break;
            }
    }
}
