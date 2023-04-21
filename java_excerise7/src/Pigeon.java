

public class Pigeon extends Bird {
    int bodyTemp;
    public int getBodyTemp() {
        return bodyTemp;
    }
    public void setBodyTemp(int bodyTemp) {
        this.bodyTemp = bodyTemp;
    }
    public Pigeon(String name, int bodyTemp) {
        super(name);
        this.bodyTemp = bodyTemp;
    }
    public Pigeon(String name, String featherColors, int age, int bodyTemp) {
        super(name, featherColors, age);
        this.bodyTemp = bodyTemp;
    }
    public Pigeon(String name, String featherColors, int age, int weight,int bodyTemp) {
        super(name, featherColors, age, weight);
        this.bodyTemp = bodyTemp;
    }
    @Override
    public String getVoice() {
        // TODO Auto-generated method stub
        return "Cu Cu";
    }
    @Override
    public void sleep() {
        System.out.println("Pigeon: sleep");
    } 
    
}
