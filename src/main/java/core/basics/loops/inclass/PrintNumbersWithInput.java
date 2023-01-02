package core.basics.loops.inclass;

public class PrintNumbersWithInput {
    public static void main(String[] args) {
        /**
         * Write a program which takes an integer
         * n as input, and prints the numbers between
         * 1 2 3 4 5 ......n on the same line
         * separated by space.
         */
        // TODO: Write code to input n

        // Initialize code for loop

        // Write Loop with condition and update logic
        {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int i=1;
       while(i<=n)
       {
           System.out.print(i+" ");
           i++;
       }
    }
}
    }
}
