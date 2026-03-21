// There are `n` monkeys sitting on a tree. Travelers offer `m` bananas and `p` peanuts. Each monkey can eat either `k` bananas or `j` peanuts, and monkeys come down one by one to eat and then leave without returning. If, for the last monkey, the remaining bananas are less than `k` or the remaining peanuts are less than `j`, that monkey can eat whatever is left. Your task is to determine how many monkeys remain on the tree after some have eaten.

// **Test Case:**
// Input: `n = 10, m = 10, p = 10, k = 3, j = 3`
// Output: `3`

import java.util.Scanner;

public class practice4 {

    public static int monkeysLeft(int n,int m,int p,int k,int j)
    {
        int mk=m/k;
        int pj=p/j;
        int extra=0;
        if(m%k!=0 || p%j!=0)
        {
            extra++;
        }
        int totalFed=mk+pj+extra;
        if(totalFed>n)
        {
            totalFed=n;
        }
        return n-totalFed;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Total no. of monkeys on tree:");
        int n=sc.nextInt();
        System.out.println("Total no. of Bananas:");
        int m=sc.nextInt();
        System.out.println("Total no. of peanuts:");
        int p=sc.nextInt();
        System.out.println("min. bananas can eat at once:");
        int k=sc.nextInt();
        System.out.println("min. peanuts can eat at once:");
        int j=sc.nextInt();

        System.out.println("Monkeys left on tree: "+monkeysLeft(n,m,p,k,j));
        sc.close();
    }
}
