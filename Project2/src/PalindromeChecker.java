public class PalindromeChecker {
    public static void main(String[] args) {
        System.out.println(isPalindrome("false"));
        System.out.println(isPalindrome("lol"));

    }

    /**
     * Checks if string is the same in reverse. Only works if all characters are UTF-8,
     *   ie it won't work if some "Characters" require more than one Unicode scalar value,
     *   such as flagged emojis
     * @param word - word to be checked
     * @return isPal - value is true if it is and false otherwise
     */
    public static boolean isPalindrome( String word ){
        boolean isPal = true;
        int length = word.length();

        if (length > 1) {
            for (int i = 0; i < length / 2; i++) {
                if (!word.substring(i, i + 1).equals(word.substring(length - 1 - i, length - i))) return false;
            }
        }

        return isPal;
    }
}
