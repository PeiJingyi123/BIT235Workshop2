/**
 * Exercise 1.7 - Length and value of a substring.
 *
 * Expression: "I love java programming".substring(7, 11)
 *
 * Index:        0123456789...
 * Character:    I _ l o v e _ j a v a ...
 * Index 7 = 'j', and substring(7, 11) takes indexes 7, 8, 9, 10
 * (the end index 11 is exclusive) -> "java", which has 4 characters.
 */
public class Exercise1_7 {

    public static void main(String[] args) {
        String text = "I love java programming";
        String result = text.substring(7, 11);

        System.out.println("=== Exercise 1.7 : String substring ===");
        System.out.println("Original string      : \"" + text + "\"");
        System.out.println("Index of each char   : 0123456789012345678901");
        System.out.println("                       " + text);
        System.out.println("substring(7, 11)     : \"" + result + "\"");
        System.out.println("Length of the string : " + result.length() + " characters");
        System.out.println();
        System.out.println("Answer: the returned string is \"" + result
                + "\" and its length is " + result.length() + ".");
    }
}
