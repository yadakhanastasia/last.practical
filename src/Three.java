import java.util.Random;

public class Three {

        public static void main(String[] args) {
            Random random = new Random();

            int randomNum = random.nextInt(101);
            System.out.println("Випадкове число:" +randomNum);

            int numOfDigits = String.valueOf(randomNum).length();
            System.out.println("К-сть цифр у числі:" +numOfDigits);
        }
    }

