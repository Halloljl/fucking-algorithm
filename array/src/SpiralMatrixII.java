import java.util.Arrays;

/**
 * @author hallo
 * @datetime 2022-12-13 16:30
 * @description
 */
public class SpiralMatrixII {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(generateMatrix(4)));
    }
    public static int[][] generateMatrix(int n) {
        int startX = 0,startY = 0,offset = 0;
        int i = 0,j,count = 1;
        int[][] nums = new int[n][n];
        while(offset++ < n/2) {
            for(j = startX; j< n - offset;j++) {
                nums[startX][j] = count++;
            }
            for(i = startY; i < n - offset; i++) {
                nums[i][j] = count++;
            }
            for(; j > startY; j--) {
                nums[i][j] = count++;
            }
            for(; i > startX; i--) {
                nums[i][j] = count++;
            }
            startX++;
            startY++;
        }
        if(n % 2 == 1) {
            nums[startX][startY] = count;
        }
        return nums;
    }
}
