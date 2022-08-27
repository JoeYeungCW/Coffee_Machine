package machine;

public class Machine {
    private int water;
    private int milk;
    private int beans;
    private int cup;
    private int money;
    private Action action;

    public Machine() {
        this.water = 400;
        this.milk  = 540;
        this.cup   = 9;
        this.beans = 120;
        this.money = 550;
        start();

    }

    public void start(){
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        action= Action.Menu;
    }
    public void state(String input){
        switch(this.action){
            case Menu:
                menu(input);
                break;
            case Buy:
                System.out.println("What do you want to buy? 1 -espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                buy(input);
                break;
            case FillWater:
                fillWater(input);
                break;
            case FillMilk:
                fillMilk(input);
                break;
            case FillBeans:
                fillBeans(input);
                break;
            case FillCup:
                fillCup(input);
                break;
        }
    }

    private void menu(String input){
        switch (input){
            case "buy":
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappucino, back - to main menu:");
                this.action = Action.Buy;
                break;
            case "fill":
                System.out.println("Write how many ml of water do you want to add:");
                this.action = Action.FillWater;
                break;
            case "take":
                System.out.println("Write action (buy, fill, take, remaining, exit):");
                take();
                break;
            case "remaining":
                System.out.println("Write action (buy, fill, take, remaining, exit):");
                remaining();
                break;
            case "exit":
                System.exit(0);
                break;
        }
    }

    private void buy(String input){
        switch (input){
            case "1":
                buyEspresso();
                System.out.println("Write action (buy, fill, take, remaining, exit):");
                this.action= Action.Menu;
                break;
            case "2":
                buyLatte();
                System.out.println("Write action (buy, fill, take, remaining, exit):");
                this.action= Action.Menu;
                break;
            case "3":
                buyCappuccino();
                System.out.println("Write action (buy, fill, take, remaining, exit):");
                this.action= Action.Menu;
                break;
            case "back":
                System.out.println("Write action (buy, fill, take, remaining, exit):");
                this.action= Action.Menu;
                break;
        }
    }

    private void fillWater(String input){
        water += Integer.parseInt(input);
        System.out.println("Write how many ml of milk you want to add:");
        this.action = Action.FillMilk;
    }

    private void fillMilk(String input){
        milk += Integer.parseInt(input);
        System.out.println("Write how many grams of coffee beans you want to add:");
        this.action = Action.FillBeans;
    }

    private void fillBeans(String input){
        beans += Integer.parseInt(input);
        System.out.println("Write how many disposable cups of coffee you want to add:");
        this.action = Action.FillCup;
    }

    private void fillCup(String input){
        cup += Integer.parseInt(input);
        this.action = Action.Menu;
    }

    private void buyEspresso() {
        if (water >= 250 && beans >= 16 && cup > 0) {
            water -= 250;
            beans -= 16;
            cup--;
            money += 4;
            System.out.println("I have enough resources, making you a coffee!");
        } else {
            System.out.println("Sorry not enough resources");
        }
    }

    private void buyLatte() {
        if (water >= 350 && milk >= 75 && beans >= 20 && cup > 0){
            water -= 350;
            milk -= 75;
            beans -= 20;
            cup--;
            money += 7;
            System.out.println("I have enough resources, making you a coffee!");
        } else {
            System.out.println("Sorry not enough resources");
        }

    }

    private void buyCappuccino() {
        if (water >= 200 && milk >= 100 && beans >= 12 && cup > 0){
            water-=200;
            milk-=100;
            beans-=12;
            cup--;
            money+=6;
            System.out.println("I have enough resources, making you a coffee!");
        } else {
            System.out.println("Sorry not enough resources");
        }
    }

    private void take(){
        System.out.printf("I gave you $%d%n",this.money);
        this.money = 0;
        this.action = Action.Menu;
    }

    private void remaining(){
        System.out.println("The coffee machine has:");
        System.out.printf("%d ml of water%n", this.water);
        System.out.printf("%d ml of milk%n", this.milk);
        System.out.printf("%d g of coffee beans%n", this.beans);
        System.out.printf("%d disposable cups%n", this.cup);
        System.out.printf("$%d of money%n", this.money);
        this.action = Action.Menu;
    }
}

