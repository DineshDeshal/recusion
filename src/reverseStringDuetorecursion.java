public class reverseStringDuetorecursion {
    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true; // Base case
        } else {
            return (str.charAt(0) == str.charAt(str.length() - 1)) &&
                    isPalindrome(str.substring(1, str.length() - 1)); // Recursive step
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("radar")); // Example usage
    }
}
