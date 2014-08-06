package BindingAnnotations;

/**
 * Created by ppatel2 on 8/6/2014.
 */
import com.google.inject.*;
import com.google.inject.name.Names;
import java.lang.annotation.*;
import com.google.inject.BindingAnnotation;

public class PlayerModule implements Module {
    public void configure(Binder binder) {

        binder.bind(Player.class).annotatedWith(Good.class).to(
                GoodPlayer.class);
        binder.bind(Player.class).annotatedWith(Bad.class).to(
                BadPlayer.class);
    }
}



