import java.util.Scanner;

class VACCINE2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int ii=0;ii<t;ii++)
        {
            int n=sc.nextInt();
            int d= sc.nextInt();
            int [] arr= new int[n];
            int b=0,c=0,ans=0;

            for(int i=0;i<n;i++)
            {
                arr[i]= sc.nextInt();

                if(arr[i]<=9 || arr[i]>=80)
                    b++;
                else
                    c++;
            }
            if(b%d==0)
                b=b/d;
            else
                b=b/d+1;

            if(c%d==0)
                c=c/d;
            else
                c=c/d+1;
            ans=b+c;

            System.out.println(ans);

        }


    }
}
