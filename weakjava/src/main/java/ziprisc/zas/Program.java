package ziprisc.zas;

import java.util.ArrayList;

public class Program extends ArrayList<ZasLine> {

    public void emitAll() {
        this.forEach((z) -> System.out.println(z.emit()));
    }
}
