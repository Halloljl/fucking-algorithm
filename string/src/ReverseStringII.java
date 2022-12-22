/**
 * @author hallo
 * @datetime 2022-12-21 13:54
 * @description
 */
public class ReverseStringII {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i += 2*k) {
            if ((i + k) < arr.length) {
                reverse(arr, i ,i + k - 1);
                continue;
            }
            reverse(arr, i, arr.length - 1);
        }
        return new String(arr);
    }

    public void reverse(char[] arr, int begin, int end) {
        for (;begin < end; begin++, end--) {
            arr[begin] ^= arr[end];
            //将 a ^ b 这一结果再 ^ b ，存入b中，此时 b = a, a = a ^ b
            arr[end] ^= arr[begin];
            arr[begin] ^= arr[end];
        }
    }

}
