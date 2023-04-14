public class Bird extends Animal {
    String name;
    String featherColors;
    int age;
    int weight;

    public Bird(String name, String featherColors, int age) {
        this.name = name;
        this.featherColors = featherColors;
        this.age = age;
    }

    public Bird(String name) {
        this.name = name;
    }

    public Bird(String name, String featherColors, int age, int weight) {
        this.name = name;
        this.featherColors = featherColors;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFeatherColors() {
        return featherColors;
    }

    public void setFeatherColors(String featherColors) {
        this.featherColors = featherColors;
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
        return "Name: " + name + "\nAge: " + age + "\nWeight: " + weight + "\nFeather color: " + featherColors;
    }

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eat'");
    }

    @Override
    public String getVoice() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getVoice'");
    }
}