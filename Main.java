public class Main{
    public static void main(String[] args) {

        int start = Integer.parseInt(args[0]);
        int end = Integer.parseInt(args[1]);


        SumCalculator sum = (x, y) -> {
            int total = 0;
            for (int i = x; i <= y; i++) {
                total += i;
            }
            return total;
        };

        int result = sum.calculateSum(start, end);
        System.out.println(result);
    }
}