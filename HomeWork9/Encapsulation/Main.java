package HomeWork9.Encapsulation;

public class Main {

        public static void main(String[] args) {

            Cat barsik = new Cat("Барсик", 5, 4, "Meow!");
            System.out.println("Имя кота: " + barsik.getName());
            System.out.println("Возраст кота: " + barsik.getAge());
            System.out.println("Вес кота: " + barsik.getWeight());
            System.out.println("Голос:" + barsik.getMeow());
        }
}
