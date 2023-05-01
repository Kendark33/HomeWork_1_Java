
//        Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;

class task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = sc.nextInt();
        int result = 0;
        {
            for (int i = 1; i <= number; i++) {
                result += i;                      //( *= )
            }
            System.out.println(result);
        
        }
    }
}
/*
 * class factorial {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * 
 * int result = 0;
 * for (int i = 1; i <= value; i++) {
 * result += i;
 * 
 * }
 * }
 */

// Вывести все простые числа от 1 до 1000

// import java.util.Scanner;

// public class Hw_1 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("ВВедите число: ");

// for (int i = 2; i < 1000; ++i) {
// int count = 0;
// for (int j = 2; j <= i && count < 2; ++j) {
// if (i % j == 0) {
// ++count;
// }
// }
// if (count < 2)
// System.out.println(i);
// }
// }
// }

/*
 * Реализовать простой калькулятор
 * Минимум -- > Условия + Цикл
 * Введите число
 * Введите число
 * Выберите операцию
 * 1 - сложить
 * 2 - умножить
 */

// import java.util.Scanner;

// class Calculator {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int number_1, number_2, answer;
// char sum;

// System.out.print("Введите первое число:");
// number_1 = sc.nextInt();
// System.out.print("Введите оперцию(+,*):"); // Можно добавиить (- , /)
// String a = sc.next();
// sum = a.charAt(0);
// System.out.print("Введите второе число:");
// number_2 = sc.nextInt();

// if (sum == '+') {
// answer = number_1 + number_2;
// System.out.println("Ответ: " + answer);
// /*
// * } else if (sum == '-') {
// * answer = number_1 - number_2;
// * System.out.println("Ответ: " + answer);
// */
// } else if (sum == '*') {
// answer = number_1 * number_2;
// System.out.println("Ответ: " + answer);
// /*
// * } else if (sum == '/') {
// * answer = number_1 / number_2;
// * System.out.println("Ответ: " + answer);
// */
// } else {
// System.out.println("Неверная операция!");
// }
// }
// }
