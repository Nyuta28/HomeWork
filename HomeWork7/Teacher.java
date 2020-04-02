package HomeWork7;

public class Teacher {
    String name;
    String lastName;
    int age;

    public Teacher(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 0) {
            this.name = name;
        } else {
            System.out.println("Ошибка! Укажите, пожалуйста, имя!");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Ошибка! Возраст не может быть отрицательным числом!");
        }

    }

    public String getLastName() {
        return lastName;
    }

    //public void setLastName(String name) {
    //    this.name = lastName;
    //}


    public static void main(String[] args) {

        Teacher ofMathematics = new Teacher("Tetyana", "Petrova",44);
        //String teacherName = ofMathematics.getName();
        ofMathematics.setAge(-3);
        ofMathematics.setName("");
        String teacherLastName = ofMathematics.getLastName();

        System.out.println("Имя: " + ofMathematics.getName());
        System.out.println("Фамилия: " + teacherLastName);
        System.out.println("Возраст: " + ofMathematics.getAge());

    }
}
