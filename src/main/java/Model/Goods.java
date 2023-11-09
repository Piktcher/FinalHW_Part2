package Model;

public class Goods {
    protected String name;

    public Goods(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
