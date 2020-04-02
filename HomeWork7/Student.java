package HomeWork7;

public class Student {
    String name;
    String lastName;
    int age;

    public Student(String name, String lastName, int age){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public static void main(String[] args) {
        System.out.println("Student KPI");
        Student kpi = new Student("Vasya","Ivanov",20);
        System.out.println(kpi.name);
        System.out.println(kpi.lastName);
        System.out.println(kpi.age);

        System.out.println("");

        System.out.println("Student NAU");
        Student nau = new Student("Katya","Moroz", 21);
        System.out.println(nau.name);
        System.out.println(nau.lastName);
        System.out.println(nau.age);
    }

}
