

public class Dog extends Mammal {
    boolean breedable;
    public Dog(String name, String furColor, int age, int weight, boolean breedable) {
        super(name, furColor, age, weight);
        this.breedable = breedable;
    }

    public Dog(String name, String furColor, int age, boolean breedable) {
        super(name, furColor, age);
        this.breedable = breedable;
    }

    public Dog(String name, boolean breedable) {
        super(name);
        this.breedable  = breedable;
    }


    public boolean isBreedable() {
        return breedable;
    }

    public void setBreedable(boolean breedable) {
        this.breedable = breedable;
    }
    @Override
    public String getVoice() {
        // TODO Auto-generated method stub
        return "Bark bark";
    }

    @Override
    public void sleep() {
        System.out.println("Dog: sleep");
    }
    
    
}
