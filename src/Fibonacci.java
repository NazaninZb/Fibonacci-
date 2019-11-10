public class Fibonacci
{
    public void fib(int n)
    {
        int a=0,b=1,c;
        int i;
        if(n==0)
            System.out.println("0");
        System.out.print(a+" "+b+" ");
        for(i=2;i<n;i++)
        {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}
