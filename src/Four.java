import java.util.Random;
import java.util.Scanner;

public class Four {
    public static void main(String[] args) {

                Random random = new Random();
                int firstNum = random.nextInt(3) + 1;
                int secondNum = random.nextInt(3) + 1;
                int thirdNum = random.nextInt(3) + 1;

                System.out.println("Вітаємо у грі лотерея! Спробуй вгадати послідовність чисел від 1 до 3.");
                int attempts = 3;

                Scanner scanner = new Scanner(System.in);

                while (attempts > 0) {
                    System.out.println("Залишилося " + attempts + " спроб.");
                    System.out.println("Введіть послідовність трьох чисел");

                    String userInput = scanner.nextLine();
                    String[] inputNum = userInput.split("");

                    if (inputNum.length == 3) {
                        int player1 = Integer.parseInt(inputNum[0]);
                        int player2 = Integer.parseInt(inputNum[1]);
                        int player3 = Integer.parseInt(inputNum[2]);

                        if (player1 == firstNum && player2 == secondNum && player3 == thirdNum) {
                            System.out.println("Вітаємо! ТИ відгадав правильну послідовність:" + firstNum + "" + secondNum + "" + thirdNum);
                            System.out.println("Ви виграли!");
                            break;
                        } else {
                            System.out.println("Неправильно, будь ласка спробуй ще раз!");
                              attempts--;
                        }
                    } else {
                        System.out.println("Неправильний ввід, спробуй ще раз через пробіл.");
                    }
                }
                if (attempts == 0) {
                    System.out.println("Гра закінчена. На жаль, ви не відгадали правильну послідовність:" + firstNum + "" + secondNum + "" + thirdNum);
                }
                scanner.close();
            }
        }





