public class Main {
    public static void main(String[] args) {
        SlotMachine sm = new SlotMachine();
        sm.gamble();
    }
 
    static class SlotMachine {
        public SlotMachine() {
            for (int i = 0; i < board.length; i++) {
                for (int j = 1; j <= 9; j++) {
                    board[i][j - 1] = j;
                }
            }
        }
 
        public boolean gamble() {
            int numberSelections[] = { -1, -1, -1 };
            for (int row = 0; row < board.length; row++) {
                int randomNumber = (int) Math.floor(Math.random() * 9);
                numberSelections[row] = board[row][randomNumber];
            }
 
            for (int num : numberSelections) {
                System.out.print(" " + num);
            }
            System.out.println();
            if (numberSelections[0] == numberSelections[1] && numberSelections[1] == numberSelections[2]) {
                System.out.println("You win duh game");
                return true;
            }
            System.out.println("No monies");
            return false;
        }
 
        int board[][] = new int[3][9];
    }
 }
 