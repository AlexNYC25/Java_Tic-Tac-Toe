import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;

import java.lang.reflect.Method;

public class BtnClick implements EventHandler<ActionEvent>
{
    Button btnClicked = null;
    Board theBoard = null;
    Application maingame = null;

    private boolean isItTaken;
    private int xValue;
    private int yValue;


    public BtnClick()
    {
        System.out.print("Clicked");
    }


    public void setValues(Board t, int a, int b, Application z)
    {
        isItTaken = t.taken(a,b);
        xValue = a;
        yValue = b;
        theBoard = t;
        maingame = z;
    }

    @Override
    public void handle(ActionEvent event)
    {
        theBoard.change(xValue,yValue);
        btnClicked = (Button) event.getSource();
        btnClicked.setText(theBoard.whatValueToChange());
        theBoard.changeTurn();
        btnClicked.setDisable(true);
        theBoard.checkIfWinner();

        if (theBoard.isWinner == true)
        {
            //maingame.start().options;
        }


    }
}