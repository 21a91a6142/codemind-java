import java.util.*;
class besttime2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int s=0;
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            if(a[i]<a[i+1])
            {
                s=s+a[i+1]-a[i];
            }
        }
        System.out.println(s);
    }
}