import de.ur.mi.bouncer.apps.BouncerApp;
import de.ur.mi.bouncer.apps.BouncerLauncher;
import de.ur.mi.bouncer.world.fields.FieldColor;

public class CaveCarver extends BouncerApp {

    @Override
    public void bounce() {
        loadMap("cave");
    }

    public static void main(String[] args) {
        BouncerLauncher.launch("CaveCarver");
    }
}
