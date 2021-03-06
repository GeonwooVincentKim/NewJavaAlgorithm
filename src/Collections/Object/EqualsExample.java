package Collections.Object;

import static java.lang.System.out;

public class EqualsExample {
    public static void main(String[] args) {
        Obj obj1 = new Obj(100);
        out.println(obj1);

        Obj obj2 = new Obj(100);
        out.println(obj2);

        out.println("------------------------------------");

        if (obj1.equals(obj2)) {
            out.println("obj1 object and obj2 object are same");
        } else {
            out.println("obj1 object and obj2 object are different");
        }

        out.println();
        out.println("====================================");
        out.println();

        Obj obj3 = obj1;
        out.println(obj3);

        out.println("------------------------------------");

        if (obj1.equals(obj3)) {
            out.println("obj1 Object and obj3 Object are same");
        } else {
            out.println("obj1 Object and obj3 Object are different");
        }

        out.println();
        out.println("====================================");
        out.println();

        ObjOverride objOverride1 = new ObjOverride(100);
        out.println(objOverride1);

        ObjOverride objOverride2 = new ObjOverride(100);
        out.println(objOverride2);

        if (objOverride1.equals(objOverride2)) {
            out.println("objOverride1 and objOverride2 are same");
        } else {
            out.println("objOverride1 and objOverride2 are different");
        }
    }
}