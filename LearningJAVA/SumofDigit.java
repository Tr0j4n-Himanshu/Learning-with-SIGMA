import java.util.Scanner;

public class SumofDigit 
{
    public static int SumofDigit(int n)
    {
    int sum=0;
    while(n>0)
    {
        int r=n%10;
        sum+=r;
        n/=10;
    }
    return sum;
}
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No. : ");
        int num=sc.nextInt();

        System.out.println(SumofDigit(num));
    }
    
}
