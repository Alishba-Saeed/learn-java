class Person {
    static String specie;
    String name;
    int age;

    public Person() {
        specie = "human";
        System.out.println("In person constructor");
    }

    static {
        System.out.println("In static block");
    }

    static void show(Person p) {
        System.out.println("Name: "+p.name+" age: "+p.age+ " "+Person.specie);
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        Person p1 = new Person();
        p1.name = "Alishba";
        p1.age = 23;
        Person.show(p1);
        Person p2 = new Person();
        Person.specie = "Homosapiens";
        p2.name = "Sana";
        p2.age = 26;
        Person.show(p2);
    }
}
