package lab1;

public class Multiples {
    static void main() {
        int num = 0;
        for (int i = 1; i <= 100; i++) {
            num += i % 3 == 0 || i % 5 == 0 ? 1 : 0;
        }

        System.out.println(num);
    }
}
