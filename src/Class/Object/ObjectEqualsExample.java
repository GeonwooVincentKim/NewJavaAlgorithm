package Class.Object;

import static java.lang.System.out;

public class ObjectEqualsExample {
    public static void main(String[] args) {
        Obj obj1 = new Obj(100);
        out.println(obj1);

        Obj obj2 = new Obj(100);
        out.println(obj2);

        out.println("---------------");
        out.println("== 을 통한 객체 주소 값 비교");

        if (obj1 == obj2) {
            out.println("객체 주소 값이 같습니다.");
        } else {
            out.println("객체 주소 값 같지 않습니다.");
        }

        out.println("---------------");
        out.println("객체 내 hashCode 값 비교");

        out.println(obj1.hashCode());
        out.println(obj2.hashCode());

        out.println("---------------");
        out.println("equals() 을 통한 객체 주소 값 비교");

        if (obj1.equals(obj2)) {
            out.println("객체 주소 값이 같습니다.");
        } else {
            out.println("객체 주소 값이 같지 않습니다.");
        }

        // 객체 obj1 을 obj3에 대입(복사)
        Obj obj3 = obj1;
        out.println(obj3);

        out.println("---------------");
        out.println("== 을 통한 객체 주소 값 비교");

        if (obj1.equals(obj3)) {
            out.println("객체 주소 값이 같습니다.");
        } else {
            out.println("객체 주소 값이 같지 않습니다.");
        }

        out.println("---------------");
        out.println("객체 내 hashCode 값 비교");

        out.println(obj1.hashCode());
        out.println(obj3.hashCode());

        out.println("---------------");
        out.println("Overrided equals() 을 통한 객체 주소 값 비교");

        ObjOverride objo1 = new ObjOverride(100);
        out.println(objo1);

        ObjOverride objo2 = new ObjOverride(100);
        out.println(objo2);

        if (objo1.equals(objo2)) {
            out.println("객체 주소 값이 같습니다.");
        } else {
            out.println("객체 주소 값이 같지 않습니다.");
        }

        out.println("---------------");
        out.println("기본 Object == 을 통한 객체 주소 값 비교");

        Object basicObject1 = new Object();
        out.println(basicObject1);

        Object basicObject2 = new Object();
        out.println(basicObject2);

        if (basicObject1 == basicObject2) {
            out.println("객체 주소 값이 같습니다.");
        } else {
            out.println("객체 주소 값이 같지 않습니다.");
        }

        out.println("---------------");
        out.println("기본 Object equals() 을 통한 객체 주소 값 비교");

        Object basicObject11 = new Object();
        out.println(basicObject11);

        Object basicObject22 = new Object();
        out.println(basicObject22);

        if (basicObject11.equals(basicObject22)) {
            out.println("객체 주소 값이 같습니다.");
        } else {
            out.println("객체 주소 값이 같지 않습니다.");
        }
    }
}

class Obj {
    int obj_var;

    Obj(int obj_var) {
        this.obj_var = obj_var;
    }
}

class ObjOverride {
    int obj_var;

    ObjOverride(int obj_var) {
        this.obj_var = obj_var;
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