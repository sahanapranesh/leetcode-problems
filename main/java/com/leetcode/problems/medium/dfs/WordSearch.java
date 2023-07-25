package com.leetcode.problems.medium.dfs;

/**
 * Given an m x n grid of characters board and a string word, return true if word exists in the grid.
 * <p>
 * The word can be constructed from letters of sequentially adjacent cells,
 * where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.
 */

public class WordSearch {
    public static boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (word.charAt(0) == board[i][j] && search(board, visited, i, j, 0, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean search(char[][] board, boolean[][] visited, int i, int j, int index, String word) {
        if (index == word.length()) {
            return true;
        }
        if(i <0 || i >=board.length || j<0 || j>= board[i].length || word.charAt(index)!=board[i][j] || visited[i][j]){
            return false;
        }
        visited[i][j] = true;

        boolean found =
                search(board, visited, i + 1, j, index + 1, word) ||
                        search(board, visited, i - 1, j, index + 1, word) ||
                        search(board, visited, i, j + 1, index + 1, word) ||
                        search(board, visited, i, j - 1, index + 1, word);

        visited[i][j] = false;
        return found;
    }

    public static void main(String[] args) {
        char[] first = new char[]{'A','B','C','E'};
        char[] second = new char[]{'S','F','C','S'};
        char[] third = new char[]{'A','D','E','E'};
        char[][] input = new char[][]{first, second, third};
        System.out.println(exist(input,"SEE"));
    }
}
