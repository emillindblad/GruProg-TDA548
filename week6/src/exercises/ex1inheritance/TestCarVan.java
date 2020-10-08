package exercises.ex1inheritance;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

/*
        Using classes, inheritance and overriding

        Run this to get the printout requested i.e.

        Car{topSpeed=160.0{owner=Person{id='123', name='olle'}, id='abc'}}
        Van{maxCargo=400.0{owner=Person{id='456', name='fia'}, id='def'}}
        Car{topSpeed=210.0{owner=Person{id='456', name='fia'}, id='ghi'}}
        Van{maxCargo=800.0{owner=Person{id='123', name='olle'}, id='jkl'}}

   See:
   - inheritance/

   NOTE: IntelliJ can generate toString() method

 */
public class TestCarVan {

    public static void main(String[] args) {
        new TestCarVan().program();
    }

    private void program() {
        Person p1 = new Person("123", "olle");
        Person p2 = new Person("456", "fia");
        /*
        List<Vehicle> vehicles = Arrays.asList(new Car(p1, "abc", 160),
                new Van(p2, "def", 400),
                new Car(p2, "ghi", 210),
                new Van(p1, "jkl", 800)
        );

        for (Vehicle v : vehicles) {
            out.println(v);   // Each vehicle should know what to print!
        }*/
    }
}
