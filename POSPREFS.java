import java.util.Scanner;

class PROSPREFS
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int ii=0;ii<t;ii++)
        {
            int n= sc.nextInt();
            int k= sc.nextInt();
            int [] ans= new int[n+1];
            int i=0,sum=0;

            if(k==n)
            {
                for (i = 1; i <= n; i++)
                    ans[i]=i;

            }
            else if(k==0)
            {
                for( i=1;i<=n;i++)
                    ans[i]=-i;
            }
            else
            {
                for(i=1;i<=n;i++)
                {
                    if(sum+i<=i+1 && k>0)
                    {
                        sum=sum+i;
                        ans[i]=i;
                        k--;
                        if(k==0)
                            break;
                        else
                            continue;
                    }
                    else if(sum+i>i+1 && k==1)
                    {
                        ans[i]=-i;
                        sum=sum-i;

                        if(sum>0)
                            break;
                        else
                            continue;
                    }
                    else if(sum>i)
                    {
                        ans[i]=-i;
                        sum=sum-i;
                        if(sum>0)
                            k--;
                        if(k==0)
                            break;
                        else
                            continue;
                    }
                    else  if(sum+i>i+1 && k>1)
                    {
                        ans[i]=i;
                        if(sum>0)
                            k--;
                        sum=sum+i;
                        if(k==0)
                            break;
                        else
                            continue;
                    }
                }
                for(int j=i+1;j<=n;j++)
                    ans[j]=-j;
            }

            StringBuilder br= new StringBuilder();
            for(int j=1;j<=n;j++)
                br.append(ans[j]+" ");
            System.out.println(br);
        }
    }
}
