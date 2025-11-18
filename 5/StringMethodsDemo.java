public class StringMethodsDemo {
    public static void main(String[] args) {
        String str = "Java Programming";
        
        System.out.println("Original String: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("Character at index 5: " + str.charAt(5));
        System.out.println("Substring from index 5: " + str.substring(5));
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Replace 'a' with 'o': " + str.replace('a', 'o'));
        System.out.println("Contains 'Prog': " + str.contains("Prog"));
    }
}