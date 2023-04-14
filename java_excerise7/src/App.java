public class App {
    public static void task1() {
        Staff staff = new Staff();
        staff.init1(
            "aoeu", 
            "aoeu", 
            "aoeu", 
            "aoeu", 
            "aoeu",
            "aoeu",
            "aoeu");
        staff.print();
        System.out.println("---------------");
        staff.print1();
    }
    public static void task2() {
        
        Animal[] animals = new Animal[6];
        animals[0] = new Mammal("aoeu","red",12,12);
        animals[1] = new Dog("aoe1","red",12,12,true);
        animals[2] = new Bird("aoe1","Blue",12,23);
        animals[3] = new Pigeon("aoe1","Blue",12,12,23);
        animals[4] = new Fish("aoe1",1,12,"blue");
        animals[4] = new BlowFish("aoe1",1,12,"blue","feaaa");
        System.out.println(animals[1].getVoice());
        System.out.println(animals[3].getVoice());
    }
    public static void main(String[] args) throws Exception {
        task2();
    }
}
