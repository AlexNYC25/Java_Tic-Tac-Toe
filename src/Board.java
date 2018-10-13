
public class Board
{
    String[][] myBoard = new String[3][3];
    int turn = 1;
    String playerCHAR = "";
    boolean isWinner = false;


    public Board()
    {
        for(int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                myBoard[i][j] = "";
            }
        }
    }

    public void checkIfWinner()
    {
        if(myBoard[0][0].equals("X") && myBoard[0][1].equals("X") && myBoard[0][2].equals("X"))
        {
            isWinner = true;
        }
    }

    // a and b correspond to the values of the 2d array in myBoard;
    // depending on what the value of turn changes it to
    public void change( int a , int b)
    {
        int player = turn % 2;
        String playerCHAR = "";

        int x = a;
        int y = b;

        if (player == 1)
        {
            playerCHAR = "X";
        }
        if (player == 0)
        {
            playerCHAR = "O";
        }

        myBoard[x][y] = playerCHAR;
    }


    // a and b corresponds to myboard value
    // returns false if it hassent change
    // true if other value is in array;
    public boolean taken(int a, int b)
    {
        if (myBoard[a][b] == "")
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    // void function to increment turn variable
    public void changeTurn()
    {
        turn++;
    }

    public String whatValueToChange()
    {
        if (turn % 2 == 1)
        {
            return  "X";
        }
        if (turn % 2 == 0)
        {
            return "O";
        }
        return whatValueToChange();
    }
}
