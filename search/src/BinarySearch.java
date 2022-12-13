/**
 * @author hallo
 * @datetime 2022-12-13 13:08
 * @description
 */
public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int arr[] = new int[]{-1,0,3,5,9,12};
        binarySearch.binarySearch2(arr, 1);
    }
    public int binarySearch2(int[] arr, int target) {
        // 循环不变量 [l,r)
        return search(arr, target, 0, arr.length);
    }

    private int search(int[] arr, int target, int left, int right) {
        // 循环不变量 [l,r)
        if (left >= right) {
            return -1;
        }
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] > target) {
            return search(arr, target, left, mid);
        } else {
            return search(arr, target, mid + 1, right);
        }
    }


    /**
     *
     * @param arr 目标数组
     * @param target 要查找的目标值
     * @return
     */
    public int binarySearch(int[] arr, int target) {
        // 循环不变量 [l,r)
        int left = 0;
        int right = arr.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > target) {
                right = mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
