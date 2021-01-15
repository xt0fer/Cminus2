package ziprisc;

import java.util.HashSet;

public class VarScope extends HashSet<String> {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    final VarScope parent;

    public VarScope(VarScope parent) {
        this.parent = parent;
    }

    boolean inScope(String varName) {
        if(super.contains(varName)) {
            return true;
        }
        return parent == null ? false : parent.inScope(varName);
    }
}