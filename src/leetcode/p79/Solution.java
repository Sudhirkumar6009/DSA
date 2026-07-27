package leetcode.p79;

public class Solution {
    public static boolean exists_char(char[][] board, char[] words, int i, int j, int idx) {
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length) return false;
        if (board[i][j] != words[idx] || board[i][j] == '*') return false;
        if (idx == words.length-1) return true;
        char org = board[i][j];
        board[i][j] = '*';
        boolean res = exists_char(board,words,i+1,j,idx+1) ||
        exists_char(board,words,i-1,j,idx+1) ||
        exists_char(board,words,i,j+1,idx+1) ||
        exists_char(board,words,i,j-1,idx+1);
        board[i][j] = org;
        return res;
    }
    public static boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (words[0] == board[i][j] && exists_char(board, words, i, j,0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCB";
        System.out.println(exist(board,word));
    }
}
