package zadachki;
/*
Игра крестики нолики:

1. использовать двумерный массив для хранения значений крестиков и ноликов,
2. использовать цикл для проверки правильности введенных данных
и вывода сообщений о победителе.
3. использовать библиотеку Scanner для чтения
введенных пользователем данных с консоли.

 */
import java.util.Scanner;

public class TicTacToe {
    public TicTacToe(int i) {
    }

    public static void main(String[] args) {
        int[][] board = new int[3][3]; // Двумерный массив для хранения значений крестиков и ноликов
        Scanner input = new Scanner(System.in);
        int turn = 0; // Ход первого игрока
        boolean gameover = false; // Игра закончена?

        System.out.println("Tic-Tac-Toe стартует!");

        while (!gameover) {
            // Ввод значения от первого игрока
            System.out.println("Игрок 1: Введите номер ячейки от 1 до 9:");
            int move1 = input.nextInt();
            board[(move1 - 1) / 3][(move1 - 1) % 3] = 1;

            // Проверка на победу первого игрока
            if (checkWin(board, 1)) {
                System.out.println("Игрок 1 победил!");
                gameover = true;
                break;
            }

            // Ввод значения от второго игрока
            System.out.println("Игрок 2: Введите номер ячейки от 1 до 9:");
            int move2 = input.nextInt();
            board[(move2 - 1) / 3][(move2 - 1) % 3] = 2;

            // Проверка на победу второго игрока
            if (checkWin(board, 2)) {
                System.out.println("Игрок 2 победил!");
                gameover = true;
                break;
            }
        }
        input.close();
    }

    // Метод для проверки на победу
    public static boolean checkWin(int[][] board, int player) {
        if (board[0][0] == player && board[0][1] == player && board[0][2] == player) {
            return true;
        }
        if (board[1][0] == player && board[1][1] == player && board[1][2] == player) {
            return true;
        }
        if (board[2][0] == player && board[2][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][0] == player && board[1][0] == player && board[2][0] == player) {
            return true;
        }
        if (board[0][1] == player && board[1][1] == player && board[2][1] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][2] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[2][0] == player && board[1][1] == player && board[0][2] == player) {
            return true;
        }
        return false;
    }

}