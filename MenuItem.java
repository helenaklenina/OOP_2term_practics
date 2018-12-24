package prac8;

public class MenuItem {
    private int cost;
    private String name;
    private String desc;

    public MenuItem(){};
    public MenuItem(int cost, String name, String desc)
    {
        this.cost = cost;
        this.name = name;
        this.desc = desc;
    }
    public int getCost(){return this.cost;}
    public String getName(){return this.name;}
    public String getDesc(){return this.desc;}
}


