package aziz;

//declare a Dp array //
public class fib_basic {
    static Integer[] arr = new Integer[10];

    static int fib(int n) {

        if (arr[n] != null) {
            return arr[n];
        } else {

            return arr[n] = fib(n - 1) + fib(n - 2);
        }
    }

    //tabulatiuon is bottom up
    static int fib_tabulation(int n) {
        for (int i = 2; i <= n; i++) {

            arr[i] = arr[i - 1] + arr[i - 2];

        }
        return arr[n];
    }

    static int fib_tabulation_opt(int n) {
        int prev2 = 0, prev = 1;
        for (int i = 2; i <= n; i++) {

            int curr = prev + prev2;
            prev2 = prev;
            prev = curr;

        }
        return prev;
    }

    public static void main(String[] args) {
        arr[0] = 0;
        arr[1] = 1;
        System.out.println(fib_tabulation_opt(9));

    }
}