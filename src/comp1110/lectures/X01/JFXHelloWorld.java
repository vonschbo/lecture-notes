package comp1110.lectures.X01;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Created by comp1110 on 8/7/15.
 */
public class JFXHelloWorld extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hello");
  //      Group root = new Group();
        StackPane root = new StackPane();
        Scene  scene = new Scene(root, 300, 300);
        primaryStage.setScene(scene);

        Text hi = new Text("Hello world!");
        hi.setFont(Font.font("Tahoma", FontWeight.NORMAL, 40));
        hi.setFill(Color.RED);
        hi.setOpacity(1.0);
        primaryStage.setOpacity(0.5);


        root.getChildren().add(hi);


        System.out.println("Before show");
        primaryStage.show();
        System.out.println("After show");
    }

    public static void main(String[] args) {
        System.out.println("Before launch");
        launch(args);
        System.out.println("After launch");
    }
}
