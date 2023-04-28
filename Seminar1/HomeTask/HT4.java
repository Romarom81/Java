package Seminar1.HomeTask;

import java.util.Scanner;

public class HT4 {
    public static void main(String[] args) {
        /*4.Реализовать простой калькулятор 
            (введите первое число, введите второе число, введите требуемую операцию, ответ)*/
        System.out.println(" Для расчета результата необходимо ввести числа и выбрать операцию");
        int number1 = getNumber();
        String operation = getOperations();
        int number2 = getNumber();
        
        int resault = getResult(operation, number1, number2);
        System.out.println(" Результат вычислений = " + resault);
        
  
    }
    static int getNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scan.nextInt();
        return number;
        
    }
    
    static String getOperations () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите оператор: -, +, *, /");
        String action = scan.nextLine();
        return action;
    }
    static int getResult(String opr, int one, int secd) {
        int result = 0;
        switch (opr) {
            case "+":
                result = one + secd;
                break;
            case "-":
                result = one - secd;
                break;
            case "*":
                result = one * secd;
                break;
            case "/":
                result = one / secd;

            default:
                break;
        }
        return result;
    } 
    
    
}

