package Collections.Object;

public class Obj {
    private int objectNumber;
    private String objectName;

    Obj() {
    }

    Obj(int objectNumber) {
        this.setobjectNumber(objectNumber);
    }

    Obj(String objectName) {
        this.setObjectName(objectName);
    }

    Obj(int objectNumber, String objectName) {
        this.setobjectNumber(objectNumber);
        this.setObjectName(objectName);
    }

    public int getobjectNumber() {
        return objectNumber;
    }

    public void setobjectNumber(int objectNumber) {
        this.objectNumber = objectNumber;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }
}