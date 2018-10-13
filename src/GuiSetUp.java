import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GuiSetUp extends Application{

    BorderPane root = new BorderPane();
    Scene scene = null;
    GridPane grid = null;
    VBox options = null;
    Label theEnd = null;
    Board game = null;

    @Override
    public void start(Stage primaryStage) {
        //BorderPane root = new BorderPane();
        root.setStyle("-fx-background-color: #87CEFA;");

        grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setPrefSize(250,250);

        options = new VBox();
        Button reset = new Button("Reset");
        options.getChildren().add(reset);
        options.setPrefWidth(200);
        options.setStyle("-fx-background-color: #eafa93");

        theEnd = new Label();
        theEnd.setAlignment(Pos.BOTTOM_CENTER);
        options.getChildren().add(theEnd);

        scene = new Scene(root, 500, 200);

        game = new Board();

        Button pos1 = new Button("1");
        Button pos2 = new Button("2");
        Button pos3 = new Button("3");
        Button pos4 = new Button("4");
        Button pos5 = new Button("5");
        Button pos6 = new Button("6");
        Button pos7 = new Button("7");
        Button pos8 = new Button("8");
        Button pos9 = new Button("9");

        BtnClick clickEvent1 = new BtnClick();
        clickEvent1.setValues(game, 0, 0, this);
        pos1.setOnAction(clickEvent1);

        BtnClick clickEvent2 = new BtnClick();
        clickEvent2.setValues(game, 0, 1, this);
        pos2.setOnAction(clickEvent2);

        BtnClick clickEvent3 = new BtnClick();
        clickEvent3.setValues(game, 0, 2, this);
        pos3.setOnAction(clickEvent3);

        BtnClick clickEvent4 = new BtnClick();
        clickEvent4.setValues(game, 1, 0, this);
        pos4.setOnAction(clickEvent4);

        BtnClick clickEvent5 = new BtnClick();
        clickEvent5.setValues(game, 1, 1, this);
        pos5.setOnAction(clickEvent5);

        BtnClick clickEvent6 = new BtnClick();
        clickEvent6.setValues(game, 1, 2, this);
        pos6.setOnAction(clickEvent6);

        BtnClick clickEvent7 = new BtnClick();
        clickEvent7.setValues(game, 2, 0, this);
        pos7.setOnAction(clickEvent7);

        BtnClick clickEvent8 = new BtnClick();
        clickEvent8.setValues(game, 2, 1, this);
        pos8.setOnAction(clickEvent8);

        BtnClick clickEvent9 = new BtnClick();
        clickEvent9.setValues(game, 2, 2, this);
        pos9.setOnAction(clickEvent9);

        pos1.setPrefSize(75,75);
        pos2.setPrefSize(75,75);
        pos3.setPrefSize(75,75);
        pos4.setPrefSize(75,75);
        pos5.setPrefSize(75,75);
        pos6.setPrefSize(75,75);
        pos7.setPrefSize(75,75);
        pos8.setPrefSize(75,75);
        pos9.setPrefSize(75,75);

        grid.add(pos1, 1,1);
        grid.add(pos2, 2,1);
        grid.add(pos3, 3,1);
        grid.add(pos4, 1,2);
        grid.add(pos5, 2,2);
        grid.add(pos6, 3,2);
        grid.add(pos7, 1,3);
        grid.add(pos8, 2,3);
        grid.add(pos9, 3,3);


        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setScene(scene);

        primaryStage.show();

    }

    public static void main(String[] args)
    {
        launch(args);
    }

    public void st()
    {
        System.out.print("HI");
        main(null);
    }


}
