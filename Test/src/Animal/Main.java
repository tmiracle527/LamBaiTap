package Animal;


public class Main {
    public static void main(String[] args) {
//        Cat cat= new Cat("miu",2019,"yellow","vn",false);
//        Dog dog= new Dog("mic",2022,"black","bull");
//        Bird bird= new Bird("cu",2023,"big",true,"vet");
//        cat.makeSound();
//        dog.makeSound();
//        System.out.println(Animal.checkCat(cat));
//        System.out.println(Animal.checkCat(dog));
//        System.out.println( Animal.checkCat(bird));
//        if (cat.getStatus()){
//            cat.healing("rau ma");
//        }else {
//            cat.healing("xa ot",3);
//        }
        Manage manage = new Manage();
        Cat cat = new Cat("Tom", 2001, "Đỏ", "anh", true);
        Dog dog = new Dog("Chó", 2000, "Đen", "Thịt");
        manage.addAnimal(cat);
        manage.addAnimal(dog);
    }
}
