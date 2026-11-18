public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        int n = Integer.parseInt(args[0]);
        double parity = 1;
        for(double i=1;i<=n;i++){
            approxPi += (1/(2*i-1))*parity;
            parity *= -1;
        }
        approxPi *= 4;
        System.out.println(approxPi + " " + actualPi);
    }
}
