package Collections.Set.HashSet;

public class Member {
    String name;
    int age;

    Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Override `toString()` Method
    @Override
    public String toString() {
        return "(" + name + "," + age + ")";
    }

    // Override `equals()` Method
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member m = (Member) obj;
            return this.name.equals(m.name) && this.age == m.age;
        } else {
            return false;
        }
    }

    // Override `hashCode()` Method
    @Override
    public int hashCode() {
        return this.name.hashCode() + age;
    }
}
