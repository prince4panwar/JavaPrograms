// Write a Java method to find all twin prime numbers less than 100.


import java.util.Scanner;
class TwinPrime
{
    public static void main(String arg[])
    {
       twinPrimeNumbers();
    }
    public static void twinPrimeNumbers()
    {
        int i;
        for(int num=11; num<100; num++)
        {
            for(i=2; i<num; i++)
            {
                if(num%i==0)
                    break;
            }
            if(i==num)
                System.out.println(num);
        }
    }
}