public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");
        int[] Fibonacci = new int[x];
        Fibonacci[0] = 1;
        Fibonacci[1] = 1;
        int numOdd = 2;
        for (int i = 2; i < x; i++) {
            Fibonacci[i] = Fibonacci[i - 1] + Fibonacci[i - 2];
            if (Fibonacci[i] % 2 == 1) {
                numOdd++;
            }
        }
        for (int i = 0; i < x; i++) {
            System.out.print(Fibonacci[i]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
