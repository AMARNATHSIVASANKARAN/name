public class pali {

    public static void main(String[] args) {
        String input = "level";
        
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }

    static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase for case-insensitive palindrome check
        str = str.replaceAll("\\s", "").toLowerCase();
        
        int length = str.length();
        
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        
        return true;
    }
}

