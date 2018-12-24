package prac8;
import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);
    private static Order tableOrder = null;
    private static Order internetOrder = null;

    public static void main(String[] args)
    {
        int cmdForOrder;
        int cmd;
        System.out.println("Добро пожаловать в лучший ресторан Москвы!");
        System.out.print("Желаете прийти к нам лично(1) или сделать интеренет заказ(2)?: ");
        cmdForOrder = input.nextInt();
        switch(cmdForOrder)
        {
            case 1:
                tableOrder = new Order();
                tableOrder.makeAnOrder();
                break;
            case 2:
                internetOrder = new Order();
                internetOrder.makeAnOrder();
                break;
            default: System.out.println("Что-то не так.."); break;
        }
    }

}
