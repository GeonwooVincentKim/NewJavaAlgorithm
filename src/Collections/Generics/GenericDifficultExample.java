package Collections.Generics;

import static java.lang.System.out;

public class GenericDifficultExample {
    public static void main(String[] args) {
        out.println("Gen3 Type -> ");

        Gen3 g3 = new Gen3();
        out.println(g3.getClass());

        out.println("---------------------------");
        out.println("Reference ParentClass Data-Type (Gen3 => Gen1(Gen2)) -> ");

        Generic5<? super Gen2> g2 = new Generic5<Gen1>(g3);
        out.println(g2.getClass());

        out.println("---------------------------");
        out.println("Autonomous Crossover (Gen3 => Gen1) -> ");

        Gen1 t2 = (Gen3) g2.get();
        out.println(t2.getClass());

        out.println("---------------------------");
        out.println("Object Type -> ");

        Object t1 = g2.get();
        out.println(t1.getClass());

        out.println("---------------------------");
        out.println("Get t2 Type -> ");

        out.println(t2.name);
        out.println(t2.getName());

        out.println("---------------------------");
        out.println("Get t2 Type -> ");
    }
}

class Gen1 {
    String name = "Gen1";

    String getName() {
        return name;
    }
}

class Gen2 extends Gen1 {
    String name = "Gen2";

    String getName() {
        return name;
    }
}

class Gen3 extends Gen2 {
    String name = "Gen3";

    String getName() {
        return name;
    }
}

class Generic5<T> {
    T obj;

    Generic5(T obj) {
        this.obj = obj;
    }

    void set(T obj) {
        this.obj = obj;
    }

    T get() {
        return obj;
    }
}