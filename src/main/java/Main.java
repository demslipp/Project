import Controller.MyController;
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
import objects.Employee;

import java.time.LocalDate;

public class Main extends MyController{

    public static void main(String[] args){
       Employee employee=new Employee();
        employee.newJunior(1, "A", "B");
        System.out.println(employee.toString());
        employee.newMiddle(2, "C", "D");
        System.out.println(employee.toString());
        employee.newSenior(3, "E", "F");
        System.out.println(employee.toString());
        Application.launch();
    }

}

