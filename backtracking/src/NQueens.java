import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author hallo
 * @datetime 2023-02-11 21:52
 * @description 51. N 皇后
 * <a href="https://leetcode.cn/problems/n-queens/description/">...</a>
 */
public class NQueens {
    List<List<String>> res = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        char[][] board =  new char[n][n];
        for (char[] c : board) {
            Arrays.fill(c, '.');
        }
        backtracking(board, n, 0);
        return res;
    }

    public void backtracking(char[][] board, int n, int row) {
        if (row == n) {
            res.add(Array2List(board));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (isValid (board, row, i, n)) {
                board[row][i] = 'Q';
                backtracking(board, n, row+1);
                board[row][i] = '.';
            }
        }
    }

    public List Array2List(char[][] board) {
        List<String> list = new ArrayList<>();
        for (char[] c : board) {
            list.add(String.copyValueOf(c));
        }
        return list;
    }


    public boolean isValid(char[][] board, int row, int col, int n) {
        // 检查列
        for (int i=0; i<row; ++i) { // 相当于剪枝
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // 检查45度对角线
        for (int i=row-1, j=col-1; i>=0 && j>=0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // 检查135度对角线
        for (int i=row-1, j=col+1; i>=0 && j<=n-1; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
}
