package ziprisc;

public class LocalVar {
    private String name;
    private String type;
    public LocalVar(){}

    public LocalVar(String n,String t) {
        this.name = n;
        this.type = t;
    }
    public String getName() {
        return this.name;
    }

    public String getType() {
        return type;
    }
}
