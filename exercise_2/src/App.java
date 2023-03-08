import java.math.BigDecimal;
import java.util.Map;

public class App {
    static final float MARS_GAV_RATIO = 0.38f;
    static final double VAT = 0.23;
    static final BigDecimal VAT_bd = new BigDecimal(0.23);
    static final Map<String, String> COLORS = Map.of(
            "reset", "\u001B[0m",
            "red", "\u001B[31m",
            "green", "\u001B[32m",
            "yellow", "\u001B[33m",
            "blue", "\u001B[34m",
            "magenta", "\u001B[35m",
            "cyan", "\u001B[36m");
    static String logs = "";

    static float mars_weight_duong(float weight) {
        return weight - weight * MARS_GAV_RATIO;
    }

    static int generator(int min, int max, String mode) {
        int res = (int) (min + Math.random() * (max - min));
        switch (mode) {
            case "even":
                res = res % 2 == 0 ? res : generator(min, max, mode);
                break;
            case "odd":
                res = res % 2 == 1 ? res : generator(min, max, mode);
                break;
        }
        return (int) res;
    }

    static String stringc(Object values, String color_key) {
        String res = COLORS.get(color_key);
        res += String.valueOf(values);
        res += COLORS.get("reset");
        return res;

    }

    public static void task2() {
        logs += stringc("__________TASK 2_________ \n", "red");
        float earth_weight_duong = 53.5f;
        String name = stringc("Duong", "yellow");
        logs += String.format(name +
                "'s Earth weight:" +
                COLORS.get("cyan") +
                " %.4f" + COLORS.get("reset") +
                "  \n",
                earth_weight_duong);

        double mars_weight_duong = (double) mars_weight_duong(earth_weight_duong);
        logs += String.format(name +
                "'s Mars weight:" +
                COLORS.get("cyan") +
                " %.4f" + COLORS.get("reset") +
                "  \n", mars_weight_duong);

        int mars_weight_duong_i = (int) mars_weight_duong;
        logs += name +
                "'s Mars weight in interger: " +
                stringc(mars_weight_duong_i,
                        "cyan")
                + "\n";

        char mars_weight_duong_ch = (char) mars_weight_duong_i;
        logs += name +
                "'s Mars weight in char: " +
                stringc(mars_weight_duong_ch,
                        "cyan")
                + "\n";

        mars_weight_duong_ch += 2;
        logs += name +
                "'s Mars weight in char +=2: " +
                stringc(mars_weight_duong_ch,
                        "cyan")
                + "\n";

        int mars_weight_duong_i2 = (int) mars_weight_duong_ch;
        logs += name +
                "'s Mars weight in char += 2 and convert back to interger: " +
                stringc(mars_weight_duong_i2,
                        "cyan")
                + "\n";
        logs += "\n";
    }

    public static void task3() {
        logs += stringc("__________TASK 3_________ \n",
                "red");
        int random_number = generator(0, 100, "None");
        logs += "Generate random interger number from 0 - 100: " +
                stringc(random_number, "cyan") + "\n";
        String res = random_number % 2 == 0 ? "Even" : "Odd";
        logs += "The number: " +
                stringc(random_number, "cyan") +
                " is an " +
                stringc(res, "cyan") +
                " number" + "\n";
        logs += "\n";
    }

    public static void task4() {
        logs += stringc("__________TASK 4_________ \n",
                "red");
        int n_bricks = generator(50, 100, "odd");
        logs += "Number of bricks: " +
                stringc(n_bricks, "cyan") +"\n";
        int container_cap = generator(5, 10, "even");
        logs += "Container capacity: " +
                stringc(container_cap, "cyan") + "\n";
        int n_full_containers = n_bricks / container_cap;
        logs += "Number of full containers: " +
                stringc(n_full_containers, "cyan") + "\n";
        int left_over = n_bricks % container_cap;
        int n_unfull_containters = left_over == 0 ? 0 : 1;
        logs += "Number of not full containers : " +
                stringc(n_unfull_containters, "cyan")+"\n";
        logs += "Number of leftover: " + stringc(left_over, "cyan") + "\n";
        logs += "\n";

    }

    public static void task5() {
        logs += stringc("__________TASK 5_________ \n", "red");
        double product_cost_d = 9.99;
        BigDecimal product_cost_bd = new BigDecimal(9.99);
        int n_products = 1000;
        logs += "Total sold calculated with double:" +
                stringc(product_cost_d * n_products * VAT, "cyan")+"\n";
        logs +="Total sold calculated with Big Decimal:" +
                stringc(product_cost_bd.multiply(VAT_bd).multiply(
                        new BigDecimal(n_products)),
                        "cyan")+ "\n";
       logs += (
                "Double can cause floating point error. Normally this won't cause" +
                        "any problem since the error is usually small (i.e., 1e-10 error for a pixel)\n" +
                        "However,when working with values that sensitive to rounding error such as currentcy" +
                        "It is recomended to use BigDecimal insteal of double");
    }

    public static void main(String[] args) {
        task2();
        task3();
        task4();
        task5();
        System.out.println(logs);
    }

}