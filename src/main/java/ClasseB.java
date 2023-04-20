
public class ClasseB extends ClasseA {

    private int b;

    public ClasseB() {
        super();
        setB(0);
    }

    public ClasseB(int a, int b) {
        super(a);
        setB(b);
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
