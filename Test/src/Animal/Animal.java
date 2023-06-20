package Animal;

public class Animal {
   private static int count=0;
    private int id;
    private String name;
    private int birthYear;

    public Animal( String name, int birthYear) {
            this.id= count;
            this.name= name;
            this.birthYear= birthYear;
            count ++;
    }

    public static int getCount() {
        return count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    public static boolean checkCat(Animal animal) {
        return animal instanceof Cat;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
    public void makeSound(){
        System.out.println("sound");
    }
 }

