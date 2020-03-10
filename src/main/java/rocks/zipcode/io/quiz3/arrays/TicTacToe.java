package rocks.zipcode.io.quiz3.arrays;

import java.util.Arrays;
import java.util.List;


/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    private String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
    }


    public String[] getRow(Integer value) {

        return this.board[value];
    }

    public String[] getColumn(Integer value) {
        String[] col = new String[3];
        for (int i = 0; i < 3; i++) {
            col[i] = this.board[i][value];
        }
        return col;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        List<String> list = Arrays.asList(getRow(rowIndex));
        boolean allEqual = list.stream().distinct().limit(2).count() <= 1;
        return allEqual;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {

        List<String> list = Arrays.asList(getColumn(columnIndex));
        boolean allEqual = list.stream().distinct().limit(2).count() <= 1;
        return allEqual;
    }

    public String getWinner() {

        for (int i = 0; i < 3; i++) {
            if(isRowHomogenous(i)){
                return getRow(i)[0];
            }
            else if(isColumnHomogeneous(i)){
                return getColumn(i)[0];
            }
            else if(this.board[0][0].equals(this.board[1][1]) && this.board[0][0].equals(this.board[2][2]) ||
            this.board[0][2].equals(this.board[1][1]) &&  this.board[1][1].equals(this.board[2][0])){
                    return this.board[1][1];
            }
        }


        return null;
    }

    public String[][] getBoard() {
        return this.board;
    }
}
