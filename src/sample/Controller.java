package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable
{

    @FXML TextArea someTextAreaID; //< имя переменной совпадает с fx:id соответствующего элемента управления (тут
    // нужно следить за тем, чтобы импорт сгенерировался из правильного пакета -- scene.control, а не awt)

    @FXML TextField someTextFieldID;
    @FXML RadioButton answer1, answer2, answer3, answer4; //Можно ссылаться на каждую радио-кнопку в отдельности, …
    @FXML ToggleGroup answers;  //  …а можно ссылаться на их группу.


    @Override public void initialize (URL location, ResourceBundle resources)
    {
        someTextAreaID.setText ("Пройдите короткий опрос");
        answer1.setText ("Red");
        answer2.setText ("Green");
        answer3.setText ("Blue");
        answer4.setText ("Yellow");
    }


    public void clickGetCCNumber (ActionEvent actionEvent) // входные параметры необязательны
    {
        String strCCNumber = someTextFieldID.getText();
        someTextFieldID.clear();
        //if (someTextFieldID.getLength() > 0)
            someTextAreaID.setText ("Ваш номер кредитной карты : "+strCCNumber+".");
        someTextAreaID.appendText ("\nСпасибо!");
        someTextAreaID.appendText ("\nНаш менеджер свяжется с Вами совсем скоро.");
    }

    public void tryToAnswer ()
    {
        //обрабатываем нажатия на радио-кнопки. Если запрашивать группу, то делать нужно так:
        String s = ((RadioButton)answers.getSelectedToggle()).getText();
        //...
    }

}// class Controller
