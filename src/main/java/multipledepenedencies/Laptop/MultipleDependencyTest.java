package multipledepenedencies.Laptop;

/**
 * Created by ppatel2 on 8/6/2014.
 */

import com.google.inject.Guice;
import com.google.inject.Injector;
public class MultipleDependencyTest {

    public static void main(String[] args) {

        Injector injector = Guice.createInjector();
        Person person = injector.getInstance(Person.class);
        person.diplayInfo();
    }
}
