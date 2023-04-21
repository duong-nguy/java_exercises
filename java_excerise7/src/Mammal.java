

public class Mammal extends Animal {
    String name;
    String furColor;
    int age;
    int weight;
    public Mammal(String name) {
        this.name = name;
    }

    public Mammal(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }

    public Mammal(String name, String furColor, int age, int weight) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    @Override
    public String toString() {
    return "Name: " + name + "\nAge: " +age+ "\nWeight: " +weight+ "\nFur color: " +furColor;
    }
    @Override
    public void eat() {
        throw new UnsupportedOperationException("Unimplemented method 'eat'");
    }

    @Override
    public String getVoice() {
        throw new UnsupportedOperationException("Unimplemented method 'getVoice'");
    }

    @Override
    public void sleep() {
        System.out.println("Mammal sleep");
    }
}