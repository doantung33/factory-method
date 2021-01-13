public class Main {
    public static void main(String[] args) {
        FactoryAnimal factoryAnimal= new FactoryAnimal();
        Animal a1= factoryAnimal.getAnimal("anime");
        System.out.println("a1 sound "+a1.makeSound());
        Animal a2=factoryAnimal.getAnimal("abc");
        System.out.println("a2 sound "+a2.makeSound());
    }
}
