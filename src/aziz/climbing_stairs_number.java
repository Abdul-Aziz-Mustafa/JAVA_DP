package aziz;

public class climbing_stairs_number {
    static int climbStairs_bottomup1(int n) {
        int a=1;
        int b=1;
        for (int i  = n-2; i>=0;i--){
            int curr=a+b;
            b=a;
            a=curr;

        }
        return a;

    }


    static int climbStairs_bottomup2(int n) {
        int prev2 = 1, prev = 1;
        for (int i = 2; i <= n; i++) {

            int curr = prev + prev2;
            prev2 = prev;
            prev = curr;

        }
        return prev;

    }

    static int climbStairs_recursion(int n) {
        if(n<0)return 0;
        if(n==0) return 1;

        int l=climbStairs_recursion(n-1);
        int r=climbStairs_recursion(n-2);
        return l+r;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs_recursion(6));

    }

}

