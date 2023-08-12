package stackschallenge;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
//         should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {
        String[] tokens = string.split("\\W");
        StringBuilder letters = new StringBuilder();
        for(String token: tokens){
            letters.append(token.toLowerCase());
        }
        int[] chars =  letters.chars().toArray();
        Deque<Integer> stack = new LinkedList<>();
        for (int aChar : chars) {
            stack.push(aChar);
        }
        for (int aChar : chars) {
            if (!stack.isEmpty() && stack.peek() == aChar) {
                stack.pop();
            }
        }

        return stack.size() == 0;
    }


        // Solution from the lecturer
//    public static boolean checkForPalindrome(String string) {
//
//        LinkedList<Character> stack = new LinkedList<Character>();
//        StringBuilder stringNoPunctuation = new StringBuilder(string.length());
//        String lowerCase = string.toLowerCase();
//
//        for (int i = 0; i < lowerCase.length(); i++) {
//            char c = lowerCase.charAt(i);
//            if (c >= 'a' && c <= 'z') {
//                stringNoPunctuation.append(c);
//                stack.push(c);
//            }
//        }
//
//        StringBuilder reversedString = new StringBuilder(stack.size());
//        while (!stack.isEmpty()) {
//            reversedString.append(stack.pop());
//        }
//
//        return reversedString.toString().equals(stringNoPunctuation.toString());
//    }
}
