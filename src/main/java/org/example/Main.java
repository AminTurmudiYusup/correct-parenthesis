package org.example;

public class Main {
    public static long countCharacter(String str, char ch) {
        return str.chars() // Convert the string into an IntStream of character codes
                .filter(c -> c == ch) // Filter for the specific character
                .count(); // Count the occurrences
    }

    public static void main(String[] args) {
        String testString="(fhggjjg)()";
        String invalidString="())))";

        long paranthesisOpen = countCharacter(invalidString, '(');
        long paranthesisClose=countCharacter(invalidString, ')');
        boolean isValid=paranthesisOpen==paranthesisClose;
        System.out.println("The Parenthesis is valid "+isValid);
    }
}