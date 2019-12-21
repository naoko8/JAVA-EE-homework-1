package homework;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import java.util.Random;
import javafx.scene.shape.Line;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class Hello_World extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        String minNumber ="000";
        Text text = new Text();
        text.setText("თამაში შვიდიანი");
        text.setFill(Color.RED);
        text.setX(50);
        text.setY(20);
        Text text2 = new Text("თანხა: 100");
        text2.setX(160);
        text2.setY(115);
        Text text3 = new Text(minNumber);
        text3.setX(50);
        text3.setY(80);
        Line line = new Line();
        line.setStartX(50);
        line.setStartY(25);
        line.setEndX(350);
        line.setEndY(25);


        // TODO Auto-generated method stub
        Button btn1=new Button("დატრიალება");
        btn1.setLayoutX(50);
        btn1.setLayoutY(100);
        btn1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                int maxNumber = 100;
                // TODO Auto-generated method stub
                Random rand = new Random();
                int r = (rand.nextInt(999-100)+1)+100;
                text3.setText(String.valueOf(r));
                int helper=0;
                if(((r%7)+((r/10)%7)+((r/100)%7))==0) helper=3;
                if((((r%7)+((r/10)%7))==0) || ((((r%7)+(r/100)%7))==0) || ((((r/100)%7)+((r/10)%7))==0)) helper=2;
                if(((r%7)==0) || (((r/10)%7)==0) || (((r/100)%7)==0)) helper=1;
                else if(helper==0){
                    text2.setText("თანხა: " + (maxNumber/10));
                }
                text2.setText("თანხა: " + (maxNumber + "0".repeat(helper)));

            }
        }
        );

        Group root = new Group(text,btn1,text2,text3,line);
        Scene scene = new Scene(root, 400, 200);
        stage.setScene(scene);
        stage.setTitle("JavaFX Application");
        stage.show();
    }
    public static void main (String[] args)
    {
        launch(args);
    }

}

