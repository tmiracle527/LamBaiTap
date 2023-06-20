package Animal;

public class Cat extends Animal {
    private String eyesColor;
    private String catType;
    private boolean Status;

    public Cat( String name, int birthYear, String eyesColor, String catType, boolean Status) {
        super( name, birthYear);
        this.eyesColor = eyesColor;
        this.catType = catType;
        this.Status = Status;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    public String getCatType() {
        return catType;
    }

    public void setCatType(String catType) {
        this.catType = catType;
    }

    public boolean getStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        this.Status = status;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "eyesColor='" + eyesColor + '\'' +
                ", catType='" + catType + '\'' +
                ", health='" + Status + '\'' +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", birthYear=" + getBirthYear() +
                '}';
    }
    @Override
    public void makeSound(){
        System.out.println("mail mail");
    }
    public void healing(String heal, int amount){
        System.out.println("meo duoc uong"+ heal + amount+"vien");
    }
    public void healing (String heal){
        System.out.println("meo duoc uong" + heal);
    }
}
