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
        animals[5] = new BlowFish("aoe1",1,12,"blue","feaaa");
        System.out.println(animals[1].getVoice());
        System.out.println(animals[3].getVoice());
    }
    public static void task3(){
        Staff staff = new Staff();
        staff.init1(
            "aoeu", 
            "aoeu", 
            "aoeu", 
            "aoeu", 
            "aoeu",
            "aoeu",
            "aoeu");
        System.out.println(staff.salaryForOverTime(40, 32));
        System.out.println(staff.salaryForOverTime(3, 40));
        System.out.println(ISalary.isBonus(10));
    }
    private static void task4() {
        Animal[] animals = new Animal[6];
        animals[0] = new Mammal("0","red",12,12);
        animals[1] = new Dog("1","red",12,12,true);
        animals[2] = new Bird("2","Blue",12,23);
        animals[3] = new Pigeon("3","Blue",12,12,23);
        animals[4] = new Fish("4",1,12,"blue");
        animals[5] = new BlowFish("5",1,12,"blue","feaaa");
        for (Animal animal : animals) {
            animal.sleep();
            animal.move();
            IAnimalName.name(animal);
        }
    }
    public static void main(String[] args) throws Exception {
        task4();
    }
}
