package Animal;

public class Manage {
    public static int size = 0;
    public Animal[] animals;

    public void Manage() {
        animals = new Animal[1000];
    }

    public void showAnimals() {
        for (int i = 0; i < size; i++) {
            System.out.println(animals[i].toString());
        }
    }

    public void deleteAnimal(int id) {
        int index = findAnimal(id);
        for (int i = index; i < size; i++) {
            animals[i] = animals[i + 1];
        }
        animals[size - 1] = null;
        size--;
    }
    public void addAnimal(Animal animal) {
        animals[size] = animal;
        size++;
    }

    public int findAnimal(int id) {
        for (int i = 0; i < size; i++) {
            if (animals[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
