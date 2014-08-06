package BindingAnnotations;

/**
 * Created by ppatel2 on 8/6/2014.
 */
public class BadPlayer implements Player
{
    public void bat() {
        System.out.println("I think i can face the ball");
    }

    public void bowl() {
        System.out.println("I don't know bowling");
    }
}
