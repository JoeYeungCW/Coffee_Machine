package machine;
import java.util.Scanner;
public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Machine machine = new Machine();

        while(scanner.hasNext()){
            machine.state(scanner.nextLine());
        }
    }
}