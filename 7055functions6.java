// Write a Java method to print characters between two characters (i.e. A to P).

import java.util.Scanner;
class Between
{
    public static void main(String arg[])
    {
       betweenTwoCharacters();
    }
    public static void betweenTwoCharacters()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter a first character  :- ");
        char a  = s.next().charAt(0);
        System.out.print("\nEnter a second character :- ");
        char b  = s.next().charAt(0);
       
        while(a<b-1)
        {
            a++;
            System.out.println(a);
        }
    }
}
