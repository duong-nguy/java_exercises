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
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    public String getFeatherColors() {
        return featherColors;
    }

    public void setFeatherColors(String featherColors) {
        this.featherColors = featherColors;
    }
    @Override
    public int getAge() {
        return age;
    }
    @Override
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public int getWeight() {
        return weight;
    }
    @Override
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

    @Override
    public void sleep() {
        System.out.println("Bird sleep");
    }
}