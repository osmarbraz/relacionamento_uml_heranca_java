
public final class ClasseC extends ClasseA {

    private int c;

    public ClasseC() {
        super();
        setC(0);
    }

    public ClasseC(int a, int c) {
        super(a);
        setC(c);
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
