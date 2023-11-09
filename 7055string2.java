//  Program to perform Deep Copy for String?
class DeepCopyString {
    public static void main(String[] args) {
        String original = "This is the original string";
        
        // Create a deep copy of the original string
        String deepCopy = new String(original);
        
        // Modify the deep copy
        deepCopy = deepCopy.concat(", and this is the deep copy.");
        
        // Print both the original and deep copy
        System.out.println("Original: " + original);
        System.out.println("Deep Copy: " + deepCopy);
    }
}
