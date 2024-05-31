package hust.soict.ict.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class PainterController {

    @FXML
    private Pane drawingAreaPane;
    private Color color;

    @FXML
    void clearButtonPressed(ActionEvent event) {
        drawingAreaPane.getChildren().clear();
    }


    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
        Circle circle = new Circle(event.getX(), event.getY(), 4, color);
        drawingAreaPane.getChildren().add(circle);
    }

    @FXML
    public void activePen(ActionEvent actionEvent) {
        color = Color.BLACK;
    }

    @FXML
    public void activeEraser(ActionEvent actionEvent) {
        color = Color.WHITE;
    }
}
