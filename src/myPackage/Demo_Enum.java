package myPackage;

public enum Demo_Enum {
    HANG_SO("Hello World ");
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Demo_Enum(String name) {
        this.name = name;
    }
}
