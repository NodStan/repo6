package pet_shop;

public class main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setName("Rex");
        d.setBreed("Bulldog");
        d.setAge(10);
        System.out.println(d.getName());
        System.out.println(d.getBreed());
        System.out.println(d.getAge());
    }
}
