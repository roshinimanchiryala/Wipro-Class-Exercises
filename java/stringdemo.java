
public class stringdemo{
    public static void main(String[] args) {

        // Creating Strings
        String str1 = "Hello";
        String str2 = "World";
        String str3 = new String("Java");

        // Concatenation
        String result = str1 + " " + str2;
        System.out.println("Concatenation: " + result);

        // Length of string
        System.out.println("Length of str3: " + str3.length());

        // Convert to uppercase
        System.out.println("Uppercase: " + str1.toUpperCase());

        // Convert to lowercase
        System.out.println("Lowercase: " + str2.toLowerCase());

        // Compare strings
        if (str1.equals("Hello")) {
            System.out.println("str1 is Hello");
        }

        // Check if string contains a word
        if (str3.contains("Ja")) 
            System.out.println("str3 contains 'Ja'");
    }
}

