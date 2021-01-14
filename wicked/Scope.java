package java.ziprisc;

import java.util.HashSet;

public class Scope extends HashSet<String> {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    final Scope parent;

    public Scope(Scope parent) {
        this.parent = parent;
    }

    boolean inScope(String varName) {
        if(super.contains(varName)) {
            return true;
        }
        return parent == null ? false : parent.inScope(varName);
    }
}