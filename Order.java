package prac8;
import java.util.Scanner;

public final class Order {
    private static Scanner input = new Scanner(System.in);
    private static Address address = null;
    private static Customer customer = null;
    private static Menu totalCost = null;
    private static int choiceDrink;
    private static int choiceDish;
    private static String cityName;
    private static String streetName;
    private static int zipCode;
    private static int buildingNumber;
    private static int apartmentNumber;
    private static char buildingLetter;
    private static int age;
    private static String firstName;
    private static String secondName;
    private static int sizeOfOrderedItems;

    private static void printDinks()
    {
        System.out.println("0. Пиво: 350р");
        System.out.println("1. Вино: 200р");
        System.out.println("2. Вода: 100р");
        System.out.println("3. Ром: 300р");
        System.out.println("4. Текила: 450р");
        System.out.println("5. Вдка: 250р");
        System.out.println("6. Брэнди: 300р");
        System.out.println("7. Виски: 350р");
        System.out.println("8. Газировка: 150р");
        System.out.println("9. БЕЗ НАПИТКА!");
    }
    private static void printDishes()
    {
        System.out.println("0. Стейк: 500р");
        System.out.println("1. Орешки: 300р");
        System.out.println("2. БЕЗ ЗАКУСКИ!");
    }

    public Order(){sizeOfOrderedItems = 0;}
    public int getSize(){return sizeOfOrderedItems;}
    public void makeAnOrder()
    {
        totalCost = new Menu();
        int cmd;

        // ADDRESS
        setAddress(address);

        // CUSTOMER
        setCustomer(customer, address);

        do
        {
            // DRINK TYPE
            System.out.println("Наше меню напитков\n");
            printDinks();
            System.out.print("Напиток: ");
            choiceDrink = input.nextInt();
            if(choiceDrink == 9)
            {
                System.out.println("Вы не заказали напиток!");
                break;
            }
            setDrink(choiceDrink);
            System.out.print("Желаете еще напиток? 1/0: ");
            cmd = input.nextInt();
            sizeOfOrderedItems++;
        } while(cmd != 0);

        do
        {
            // DISH TYPE
            System.out.println("Наше меню закусок\n");
            printDishes();
            System.out.print("Закуска: ");
            choiceDish = input.nextInt();
            if(choiceDish == 2)
            {
                System.out.println("Вы не заказали закуску!");
                break;
            }
            setDish(choiceDish);
            System.out.print("Желаете еще закуску? 1/0: ");
            cmd = input.nextInt();
            sizeOfOrderedItems++;
        } while(cmd != 0);

        System.out.println("Общая сумма: " + totalCost.getTotalCost());
        System.out.println("Количество заказанных блюд: " + sizeOfOrderedItems);
        sizeOfOrderedItems = 0;
        totalCost.setNullToTotalCost();
    }
    private void setDrink(int index)
    {
        Menu item = new Menu();
        item.getDrinkInfoByIndex(index);
    }
    private void setDish(int index)
    {
        Menu item = new Menu();
        item.getDishesInfoByUndex(index);
    }
    private void setAddress(Address newAddress)
    {
        System.out.print("Город: ");
        cityName = input.next();
        System.out.print("Улица: ");
        streetName = input.next();
        System.out.print("Индекс: ");
        zipCode = input.nextInt();
        System.out.print("Номер дома: ");
        buildingNumber = input.nextInt();
        System.out.print("Квартира: ");
        apartmentNumber = input.nextInt();
        System.out.print("Буква дома: ");
        buildingLetter = input.next().charAt(0);
        newAddress = new Address(cityName, streetName, zipCode, buildingNumber, apartmentNumber, buildingLetter);
        System.out.println(addressToString(newAddress));
    }
    private String addressToString(Address a)
    {
        String str = "Адрес проживания: Город " + a.getCityName() +
                ", Улица " + a.getStreetName() +
                ", Дом " + a.getBuildingNumber() +
                ", Индекс " + a.getZipCode() +
                ", Квартира " + a.getApartmentNumber() +
                ", Корпус " + a.getBuildingLetter() + "\n";
        return str;
    }
    private String customerToString(Customer c)
    {
        String str = "Имя: " + c.getFirstName() +
                ", Фамилия: " + c.getSecondName() +
                ", Возраст: " + c.getAge() + "\n";
        return str;
    }
    private void setCustomer(Customer newCustomer, Address customerAddress)
    {
        System.out.print("Имя: ");
        firstName = input.next();
        System.out.print("Фамилия: ");
        secondName = input.next();
        System.out.print("Возраст: ");
        age = input.nextInt();
        newCustomer = new Customer(firstName, secondName, age, customerAddress);
        System.out.println(customerToString(newCustomer));
    }

}
