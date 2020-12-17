import java.util.Scanner;

class HXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int ii = 0; ii < t; ii++) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] arr = new int[n];

            for (int jj = 0; jj < n; jj++)
                arr[jj] = sc.nextInt();

            int i = 0,nn=n,p=0,j=0,tt=1;

            while(n!=1)
            {
                p= (int)(Math.log(arr[i])/Math.log(2));
                if(x==0)
                    break;

                if(arr[i]!=0)
                {
                    j=i+1;
                    if((arr[i]^(1<<p))<arr[i])
                    {
                        arr[i] = arr[i] ^ (1<<p);
                        tt=0;
                        x=x-1;
                    }
                    if(arr[i]==0)
                    {
                        i++;
                        n=n-1;
                    }
                }
                else
                {
                    i++;
                    n=n-1;
                }
                while(tt==0)
                {

                    if(j==nn-1)
                    {
                        arr[j] = (arr[j] ^(1<<p));
                        tt=1;
                        break;
                    }
                    else if((arr[j]^(1<<p))<arr[j])
                    {
                        arr[j] = (arr[j] ^ (1<<p));
                        tt=1;
                        break;
                    }
                    else
                        j++;
                }

            }
            if(nn==2 && (x%2)!=0)
            {
                arr[0]=arr[0]+1;
                if(arr[1]%2==0)
                arr[1]=arr[1]+1;
                else
                    arr[1]=arr[1]-1;
            }
            StringBuilder br= new StringBuilder();
            for(int f=0;f<nn;f++)
                br.append(arr[f]+" ");
            System.out.println(br);
        }
    }
}
