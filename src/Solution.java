import java.util.Arrays;
import java.util.Collections;

class Solution {
    public static String[] findBin(int n) {
        String[] result = new String[n];
        MyQueue<String> queue = new MyQueue<String> ();
        queue.enqueue("1");
        for (int i = 0; i < n; i++) {
           result[i] = queue.dequeue();
           String s1 = result[i] + "0";
           String s2 = result[i] + "1";
           queue.enqueue(s1);
           queue.enqueue(s2);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] inputs = { 1, 3, 5, 9, 11 };
        for (int i = 0; i < inputs.length; i++) {
            System.out.println((i + 1) + ".\tn: " + inputs[i]);
            System.out.println("\n\tBinary numbers " + Arrays.toString(findBin(inputs[i])));
            System.out.println('-' + String.join("", Collections.nCopies(100, "-")) + '\n');
        }
    }

}
