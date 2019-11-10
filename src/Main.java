import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        String num;
        System.out.println("Enter end of sequence:");
        num=scanner.nextLine();
        Fibonacci fibonacci=new Fibonacci();
        fibonacci.fib(Integer.parseInt(num));
    }
}
