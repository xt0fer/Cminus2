package ziprisc;

import java.util.HashMap;

public class VarScope extends HashMap<String,LocalVar> {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    final VarScope parent;

    public VarScope(VarScope parent) {
        this.parent = parent;
    }

    boolean inScope(String varName) {
        if(super.containsKey(varName)) {
            return true;
        }
        return parent == null ? false : parent.inScope(varName);
    }
}