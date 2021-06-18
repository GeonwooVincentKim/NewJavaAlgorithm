package Class.Vector;

public class CustomVector {
    public static final int DEFAULT_SIZE = 10;
    private int[] object;
    private int size;

    public void customVector() {

    }

    public void customVector(int[] object) {

    }

    public void customVector(int[] object, int size) {
        this.setObject(object);
        this.setSize(size);
    }

    public int[] getObject() {
        return this.object;
    }

    public void setObject(int[] object) {
        this.object = object;
    }

    public int setSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
