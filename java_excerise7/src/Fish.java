

public class Fish extends Animal {
    String name;
    String scaleColors; 
    int age, weight;
    public Fish(String name, int age, int weight,String scaleColor) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.scaleColors = scaleColor;
    }
    public Fish(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    public Fish(String name) {
        this.name = name;
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

    public String getScaleColors() {
        return scaleColors;
    }
    public void setFeatherColors(String scaleColors) {
        this.scaleColors = scaleColors;
    }
    @Override
    public String toString() {
    return "Name: " + name + "\nAge: " +age+ "\nWeight: " +weight+ "\nScale color: " +scaleColors;
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
    public String getName() {
        return this.name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void sleep() {
        System.out.println("fish: sleep");
    }
}