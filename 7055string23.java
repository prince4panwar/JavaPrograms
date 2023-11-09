// Program to find Reverse of the string
class ReverseString {
    public static void main(String[] args) {
        String inputString = "Hello, World!";
        String reversedString = reverseString(inputString);
        System.out.println(reversedString);
    }

    public static String reverseString(String input) {
        StringBuffer reversed = new StringBuffer();

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        return reversed.toString();
    }
}
