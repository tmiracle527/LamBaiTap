package Animal;

public class Dog extends Animal {
    private String color;
    private String dogType;


    public Dog( String name, int birthYear, String color, String dogType) {
        super( name, birthYear);
        this.color = color;
        this.dogType = dogType;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDogType() {
        return dogType;
    }

    public void setDogType(String dogType) {
        this.dogType = dogType;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "color='" + color + '\'' +
                ", type='" + dogType + '\'' +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", birthYear=" + getBirthYear() +
                '}';
    }

    @Override
    public void makeSound() {
        System.out.println("go go");
    }
}
