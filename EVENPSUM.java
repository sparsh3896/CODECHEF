import java.util.Scanner;

class kk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long c = 0;

        for (int ii = 0; ii < t; ii++)
        {
            long a = sc.nextInt();
            long b = sc.nextInt();

            if(a%2!=0 && b%2!=0)
            {
                c=((a*b)/2)+1;
            }
            else
                c=(a*b)/2;

            System.out.println(c);

        }
    }
}
