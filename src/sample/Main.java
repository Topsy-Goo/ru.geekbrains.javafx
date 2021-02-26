package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class Main extends Application
{

    @Override public void start (Stage primaryStage) throws Exception
    {
    //создаём окно:
        Parent root = FXMLLoader.load (getClass ().getResource ("sample.fxml"));
        primaryStage.setTitle (" Фонд «Озеленение Луны»");
    //создали «сцену» (внутреннее наполнение клиентской области окна) и привязали её к окну:
        primaryStage.setScene (new Scene (root, 700, 475));
    //показали окно:
        primaryStage.show ();

    //
        Alert alert = new Alert (Alert.AlertType.CONFIRMATION, "Здрасьте!", ButtonType.APPLY);
        alert.showAndWait(); //< похоже, то же что и show(), но приостанавливает работу программы (для наглядности
        // можно поменять местами этот вызов с вызовом show(), используемым ниже.)
        alert = new Alert (Alert.AlertType.ERROR, "Здрасьте!", ButtonType.OK); // ButtonType.CLOSE
        alert.show();

    //(Окном управляет сласс Controller.)

    }


    public static void main (String[] args)
    {
        launch (args);
    }
}
