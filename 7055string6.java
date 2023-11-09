// Program to insert the string using StringBuffer class

class InsertStringWithStringBuffer {
    public static void main(String[] args) {
        // Create a StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Hello, World!");

        // Insert a string at a specific position
        stringBuffer.insert(7, "Java ");

        // Print the modified string
        System.out.println(stringBuffer); // Output: "Hello, Java World!"
    }
}

