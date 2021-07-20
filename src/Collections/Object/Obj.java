package Collections.Object;

public class Obj {
    private int objectSize;
    private String objectName;

    Obj() {
    }

    Obj(int objectSize) {
        this.setObjectSize(objectSize);
    }

    Obj(String objectName) {
        this.setObjectName(objectName);
    }

    Obj(int objectSize, String objectName) {
        this.setObjectSize(objectSize);
        this.setObjectName(objectName);
    }

    public int getObjectSize() {
        return objectSize;
    }

    public void setObjectSize(int objectSize) {
        this.objectSize = objectSize;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }
}