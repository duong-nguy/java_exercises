public class App {
    public static Account task1() {
        Account x = null;
        return x;
    }

    private static void task1Run() {
        try {
            task1().getBalance();
        } catch (NullPointerException e) {
            System.out.println("Error at task1");
            e.printStackTrace();
            System.out.println(e.toString());
        }
    }

    public static void task2(int a) {
        int[] arr = { 1, 2, 3 };
        arr[a] /= a;
    }

    public static void task2Run(int a) {
        try {
            task2(a);
        } catch (ArithmeticException e) {
            System.out.println("Math error");
            e.printStackTrace();
            System.out.println(e.toString());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of bound");
            e.printStackTrace();
            System.out.println(e.toString());
        } finally{
            System.out.println("This code is good");
        }


    }

    public static void task3Run() {
        Account a1 = new Account("Duong", 1000, 10);
        Account a2 = new Account("David", 0, 1);
        try {
            Account.transfer(a2, a1, 10);
        } catch (NotEnoughMoneyException e) {
            System.out.println("Error sender: " + a2.getOwner() + " is too poor");
            e.printStackTrace();
            System.out.println(e.toString());
        } catch(Exception e){
            System.out.println("Some Errors");
            e.printStackTrace();
            System.out.println(e.toString());
        } finally {
            System.out.println(a1.getOwner() + ":\t" + a1.getBalance());
            System.out.println(a2.getOwner() + ":\t" + a2.getBalance());
        }
    }

    public static void task4(int dx) throws Exception {
        if (dx > 1000)
            throw new GradientExplosionExeption();
        if (dx == 0)
            throw new GradientVanishExeption();
        if ((dx - 3) == 0)
            throw new OnPlateauExeption();
    }
    public static void task4Run() throws Exception{
        try {
            task4(0);
        } catch (GradientExplosionExeption | GradientVanishExeption | OnPlateauExeption e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) throws Exception {
        task4Run();
    }
}
