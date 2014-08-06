package multipledepenedencies.laptop;

/**
 * Created by ppatel2 on 8/6/2014.
 */
public class Laptop
{
    private String model;
    private String price;

    public Laptop(){
        this.model = "HP 323233232";
        this.price = "$545034";
    }

    public String toString(){
        return "[laptop: " + model + "," + price + "]";
    }
}
