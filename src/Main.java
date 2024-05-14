//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;

public class Main {
    public static void main(String[] args) {

            Random random = new Random();
            int randomNumb = random.nextInt(41) - 20;
            if (randomNumb > 0) {
                System.out.println("Випадкове натуральне число з проміжку [-20;20]:" + randomNumb);
            } else {
                do {
                    randomNumb = random.nextInt(41) - 20;
                } while (randomNumb <= 0);
                System.out.println("Випадкове натуральне число з проміжку [-20;20]:" + randomNumb);
            }
        }
    }
