package add.service;

/**
 * Created by ppatel2 on 8/6/2014.
 */
import com.google.inject.Guice;
import com.google.inject.Injector;

public class AddClient {

    public static void main(String[] args) {

        Injector injector = Guice.createInjector(new AddModule());
        Add add = injector.getInstance(Add.class);
        System.out.println(add.add(10, 54));
    }
}
