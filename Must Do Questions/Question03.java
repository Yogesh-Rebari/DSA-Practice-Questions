/*Given a string s, return its reverse.*/

public class ReverseString {
    public static String reverse(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {
            // swap characters
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String input = "hello";
        System.out.println("Reversed: " + reverse(input));
    }
}
