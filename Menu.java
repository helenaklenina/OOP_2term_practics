package prac8;
import java.util.ArrayList;

public class Menu
{
    private ArrayList<MenuItem> drinks = new ArrayList<>();
    private ArrayList<MenuItem> dishes = new ArrayList<>();
    private static int totalCost;
    private void setAllDrinks()
    {
        final MenuItem BEER = new MenuItem(350, "Пиво", "Бельгийское");
        final MenuItem WINE = new MenuItem(200, "Вино", "Белое, страна: Франция");
        final MenuItem WATER = new MenuItem(100, "Вода", "Холодная освежающая");
        final MenuItem RUM = new MenuItem(300, "Ром", "Вам понравится");
        final MenuItem TEQUILA = new MenuItem(450, "Текила", "Голубая агава");
        final MenuItem VODKA = new MenuItem(250, "Водка", "Столичная");
        final MenuItem BRANDY = new MenuItem(300, "Брэнди", "Лучший в Москве");
        final MenuItem WHISKEY = new MenuItem(350, "Виски", "Шотландский");
        final MenuItem SODA = new MenuItem(150, "Газировка", "Кока-Кола");
        drinks.add(0, BEER);
        drinks.add(1, WINE);
        drinks.add(2, WATER);
        drinks.add(3, RUM);
        drinks.add(4, TEQUILA);
        drinks.add(5, VODKA);
        drinks.add(6, BRANDY);
        drinks.add(7, WHISKEY);
        drinks.add(8, SODA);
    }
    private void setAllDishes()
    {
        final MenuItem BEEF = new MenuItem(500, "Говядина", "Стейк");
        final MenuItem NUTS = new MenuItem(300, "Орешки", "Фисташки");
        dishes.add(0, BEEF);
        dishes.add(1,  NUTS);
    }
    public int getTotalCost()
    {
        return totalCost;
    }
    public int setNullToTotalCost(){return totalCost = 0;}
    public void getDrinkInfoByIndex(int index)
    {
        setAllDrinks();
        System.out.println("Цена: " + drinks.get(index).getCost());
        System.out.println("Напиток: " + drinks.get(index).getName());
        System.out.println("Описание: " + drinks.get(index).getDesc());
        totalCost += drinks.get(index).getCost();
    }
    public void getDishesInfoByUndex(int index)
    {
        setAllDishes();
        System.out.println("Цена: " + dishes.get(index).getCost());
        System.out.println("Закуска: " + dishes.get(index).getName());
        System.out.println("Описание: " + dishes.get(index).getDesc());
        totalCost += dishes.get(index).getCost();
    }
}
