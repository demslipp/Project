package Controller;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.time.LocalDate;

public class MyController extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("My first jfx app");
        primaryStage.setWidth(1200);
        primaryStage.setHeight(600);

        Slider slider=new Slider();
        slider.setShowTickMarks(true);
        slider.setShowTickLabels(true);
        slider.setBlockIncrement(100);
        slider.setMajorTickUnit(100);
        slider.setMinorTickCount(100);


        slider.setSnapToTicks(true);

        Button taskButton=new Button("Create new task");
        taskButton.setLayoutX(10);
        taskButton.setLayoutY(40);
        taskButton.setOnAction(new creation());

        Rectangle rectangle=new Rectangle();
        rectangle.setX(0);
        rectangle.setY(0);
        rectangle.setWidth(1200);
        rectangle.setHeight(600);
        rectangle.setFill(Color.BISQUE);


        Group group=new Group(rectangle, taskButton, slider);
        Scene scene=new Scene(group);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public class creation implements EventHandler<ActionEvent>{


        public void handle(ActionEvent actionEvent){
            Stage stage=new Stage();
            stage.setTitle("New task creation");
            stage.setWidth(500);
            stage.setHeight(200);


            Text text1=new Text("Task name");
            text1.setLayoutX(4);
            text1.setLayoutY(14);

            TextField tf1=new TextField();
            tf1.setLayoutX(74);
            tf1.setLayoutY(0);
            tf1.setPrefColumnCount(14);

            Text text2=new Text("Cost");
            text2.setLayoutX(4);
            text2.setLayoutY(44);

            TextField tf2=new TextField();
            tf2.setLayoutX(74);
            tf2.setLayoutY(30);
            tf2.setPrefColumnCount(14);

            Text text3=new Text("Time");
            text3.setLayoutX(4);
            text3.setLayoutY(74);

            DatePicker datePicker=new DatePicker();
            datePicker.setValue(LocalDate.of(2020, 5, 18));
            datePicker.setShowWeekNumbers(true);
            datePicker.setLayoutX(74);
            datePicker.setLayoutY(60);

            Text text4=new Text("Parallelizable");
            text4.setLayoutX(280);
            text4.setLayoutY(14);

            ToggleGroup toggleGroup=new ToggleGroup();

            RadioButton rb1=new RadioButton("+");
            rb1.setLayoutX(370);
            rb1.setLayoutY(2);
            rb1.setToggleGroup(toggleGroup);
            RadioButton rb5=new RadioButton("-");
            rb5.setLayoutX(410);
            rb5.setLayoutY(2);
            rb5.setToggleGroup(toggleGroup);

            Text text5=new Text("Difficult");
            text5.setLayoutX(4);
            text5.setLayoutY(104);

            TextField tf4=new TextField();
            tf4.setLayoutX(74);
            tf4.setLayoutY(90);
            tf4.setPrefColumnCount(14);

            Button taskButton11=new Button("Add");
            taskButton11.setLayoutX(200);
            taskButton11.setLayoutY(130);
            taskButton11.setPrefSize(80, 20);

            Text text6=new Text("Access");
            text6.setLayoutX(280);
            text6.setLayoutY(74);

            RadioButton rb2=new RadioButton("Junior");
            rb2.setLayoutX(370);
            rb2.setLayoutY(32);

            RadioButton rb3=new RadioButton("Middle");
            rb3.setLayoutX(370);
            rb3.setLayoutY(62);

            RadioButton rb4=new RadioButton("Senior");
            rb4.setLayoutX(370);
            rb4.setLayoutY(92);

            Group group=new Group(taskButton11, tf1, tf2, datePicker, tf4, text1, text2, text3, text4, text5, text6,
                    rb1, rb2, rb3, rb4, rb5);
            Scene scene=new Scene(group);
            stage.setScene(scene);
            stage.show();
        }
    }
}
