

public class BlowFish extends Fish {
    String food;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public BlowFish(String name, String food) {
        super(name);
        this.food = food;
    }

    public BlowFish(String name, int weight, String food) {
        super(name, weight);
        this.food = food;
    }

    public BlowFish(String name, int age, int weight, String scaleColor,String food) {
        super(name, age, weight, scaleColor);
        this.food = food;
    }
    @Override
    public String getVoice() {
        // TODO Auto-generated method stub
        return "blob blob";
    }

    @Override
    public void sleep() {
        System.out.println("BlowFish: sleep");
    }

    @Override
    public void move() {
        System.out.println("Blow Fish: Swim");
    }
    
}
