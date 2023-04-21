import javax.print.event.PrintEvent;

public abstract class Animal implements IAnimalBehavior,IAnimalMove,IAnimalName {
    String name;
    int age,weight;
    public abstract String getName();
    
    public abstract void setName(String name);
    public abstract int getWeight();
    public abstract void setWeight(int weight);
    public abstract int getAge();
    public abstract void setAge(int age);
    public abstract void eat();
    public abstract String getVoice();

    @Override
    public void sleep() {
        System.out.println("abstract sleep");
    }
}
