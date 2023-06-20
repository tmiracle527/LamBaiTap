package Animal;

public class Bird extends Animal {
    private String rostrum;
    private boolean fly;
    private String birdType;

    public Bird( String name, int birthYear, String rostrum, boolean fly, String birdType) {
        super( name, birthYear);
        this.rostrum = rostrum;
        this.fly = fly;
        this.birdType = birdType;
    }

    public String getRostrum() {
        return rostrum;
    }

    public void setRostrum(String rostrum) {
        this.rostrum = rostrum;
    }

    public boolean isFly() {
        return fly;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }

    public String getBirdType() {
        return birdType;
    }

    public void setBirdType(String birdType) {
        this.birdType = birdType;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "rostrum='" + rostrum + '\'' +
                ", fly='" + fly + '\'' +
                ", birdType='" + birdType + '\'' +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", birthYear=" + getBirthYear() +
                '}';
    }
    @Override
    public void makeSound (){
        System.out.println("cheap cheap");
    }
}
