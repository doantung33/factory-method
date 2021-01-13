public class FactoryAnimal {
    public Animal getAnimal(String type){
        if ("anime".equals(type)){
            return new Dog();
        }else
            return new Cat();
    }
}
