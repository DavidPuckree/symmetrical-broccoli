public class DebugExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int sum = add(a, b)+10*5;
        System.out.println("Sum: " + sum);
    }

    private static int add(int x, int y) {
        return x + y;
    }
}