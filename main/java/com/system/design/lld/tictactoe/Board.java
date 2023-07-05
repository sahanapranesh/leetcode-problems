package com.system.design.lld.tictactoe;

public class Board {
    private String[][] matrix = new String[3][3];
    private Player currentPlayer;

    public String[][] getMatrix() {
        return matrix;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void play(Player player, int row, int column) {
        this.currentPlayer = player;
        if (matrix[row][column].isEmpty()) {
            matrix[row][column] = player.getSymbol();
        }
        boolean winRow = true, winColumn = true, winDiag = true;
        for(int i=0;i<3; i++){
            if(matrix[row][i]!= player.getSymbol()){
                winRow = false;
            }
            if(matrix[i][column]!= player.getSymbol()){
                winColumn =false;
            }
            if (matrix[i][i] != player.getSymbol()) {
                winDiag = false;
            }
        }
        if(winRow || winColumn || winDiag){
            System.out.println("Winner is " +player.getName());;
        }
    }
}
