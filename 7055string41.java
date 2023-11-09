//write a java Program to Splitting into a number of sub-strings
class Split
{
   public static void main(String[] args) 
   {
     String str = "name1, name2, name3, name4";
    String[] parts = str.split(", "); // split by comma and space
    for (String part : parts) {
    System.out.println(part); // print each substring
   }
    }

}