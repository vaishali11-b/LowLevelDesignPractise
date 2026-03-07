package tictactoe;
import model.Board;
import model.PieceType;
import model.PlayingPiece;
import model.Player;
import model.Pair;
import java.util.LinkedList;
import java.util.Deque; 
import java.util.Scanner;
import java.util.List;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n===>>> TicTacToe Game\n");
        TicTacToeGame game = new TicTacToeGame();
        game.initializeGame();
        GameStatus status = game.startGame();
        System.out.print("\n===>>> GAME OVER: ");
        switch (status) {
            case WIN:
                System.out.print(game.winner.name + " won the game");
                break;
            case DRAW:
                System.out.print(" Its a Draw!");
                break;
            case EXIT:
                System.out.print("Game exited early.");
                break;
            default:
                System.out.print(" Game Ends");
                break;
        }


    }
}
