package multipledepenedencies.Laptop;

/**
 * Created by ppatel2 on 8/6/2014.
 */
import com.google.inject.Inject;
public class Person {

    private Mobile mobile;
    private Laptop laptop;

    @Inject
    public Person(Mobile mobile, Laptop laptop){
        this.mobile = mobile;
        this.laptop = laptop;
    }

    public void diplayInfo(){
        System.out.println("Mobile:" + mobile);
        System.out.println("Laptop:" + laptop);
    }
}
