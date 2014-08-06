package BindingAnnotations;

/**
 * Created by ppatel2 on 8/6/2014.
 */
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.Module;
import com.google.inject.name.Named;
import com.google.inject.name.Names;

public class PlayerClient
{
    public static void main(String[] args) {

        PlayerModule module = new PlayerModule();
        Injector injector = Guice.createInjector(new Module[]{module});

        Player goodPlayer = (Player)injector.getInstance(Key.get(Player.class, Good.class));
        goodPlayer.bat();
        goodPlayer.bowl();
    }
}
