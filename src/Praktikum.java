import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        Scanner var1 = new Scanner(System.in);
        System.out.println("Введите год:");
        int var2 = var1.nextInt();
        if (isLeapYear(var2)) {
            System.out.println("12.09." + var2);
        } else {
            System.out.println("13.09." + var2);
        }
    }
    public static boolean isLeapYear(int var0) {
        if (var0 % 4 == 0) {
            if (var0 % 100 == 0) {
                return var0 % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
