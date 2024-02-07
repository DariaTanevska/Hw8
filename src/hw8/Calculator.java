package hw8;
/*Создать класс калькулятор.
В нем создать методы:
summ, minus, multiply, division.
        Сложение, вычитание, умножение и деление соответственно.
Каждый метод принимает в качестве параметров два значения типа double.
И выводит в консоль результат действия.

Также в классе есть метод старт. Который выводит сообщение в консоль, что
калькулятор запущен. И предлагает ввести действие в вашей консоли.

Калькулятор должен принимать только следующие типы действий:
        2+4;    - пример синтаксиса сложения;
5-6;    - пример синтаксиса вычитания;
25*3;   - пример синтаксиса умножения;
34/3;   - пример синтаксиса деления;

После ввода действия на консоль выводится ответ этого действия.
И после снова выводится сообщение о предложении ввести действие.

В случае ввода другого синтаксисана консоль возвращается сообщение:
        "Введите корректное действие".
И после снова выводится сообщение о предложении ввести действие.

Программа закрывается после ввода команды Stop.
Перед закрытием на консоль должно выводится сообщение:
        "Калькулятор закрыт".*/

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Калькулятор запущен. Введите действие (например, 2+4):");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("Stop")) {
                System.out.println("Калькулятор закрыт.");
                break;
            }

            double result = performCalculation(input);
            if (result != Double.MIN_VALUE) {
                System.out.println("Результат: " + result);
            } else {
                System.out.println("Введите корректное действие.");
            }
        }
    }

    private static double performCalculation(String input) {
        try {
            String[] parts = input.split("[+\\-*/]");
            double num1 = Double.parseDouble(parts[0]);
            double num2 = Double.parseDouble(parts[1]);

            if (input.contains("+")) {
                return num1 + num2;
            } else if (input.contains("-")) {
                return num1 - num2;
            } else if (input.contains("*")) {
                return num1 * num2;
            } else if (input.contains("/")) {
                return num1 / num2;
            } else {
                return Double.MIN_VALUE;
            }
        } catch (Exception e) {
            return Double.MIN_VALUE;
        }
    }

}
