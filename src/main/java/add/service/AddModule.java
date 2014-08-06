package add.service;

/**
 * Created by ppatel2 on 8/6/2014.
 */

import com.google.inject.Binder;
import com.google.inject.Module;

public class AddModule implements  Module
{
// In the below code, we are telling Guice to bind the implementation for Add interface to SimpleAdd class which literally tells that calls on
// Add.add() made by the clients will be re-directed to SimpleAdd.add().
    public void configure(Binder binder)
    {
        binder.bind(Add.class).to(SimpleAdd.class);
    }
}
