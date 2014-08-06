package BindingAnnotations;

/**
 * Created by ppatel2 on 8/6/2014.
 */
public class GoodPlayer implements  Player
{
    public void bat() {
        System.out.println("I can hit any ball");
    }

    public void bowl() {
        System.out.println("I can also bowl");
    }
}
