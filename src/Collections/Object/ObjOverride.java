package Collections.Object;

public class ObjOverride extends Obj {
    ObjOverride() {
        super();
    }

    ObjOverride(int objectNumber) {
        super(objectNumber);
    }

    ObjOverride(String objectName) {
        super(objectName);
    }

    ObjOverride(int objectNumber, String objectName) {
        super(objectNumber, objectName);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ObjOverride) {
            return true;
        } else {
            return false;
        }
    }
}
