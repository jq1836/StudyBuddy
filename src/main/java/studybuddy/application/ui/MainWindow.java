package studybuddy.application.ui;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * The main window page
 */
public class MainWindow extends VBox {

    @FXML
    private TabPane tabPane;
    @FXML
    private Tab homeTab;
    @FXML
    private Tab scheduleTab;

    private HomePane homePane;

    @FXML
    public void initialize() throws IOException {
        setUpHomeTab();
        setUpScheduleTab();
    }

    private void setUpHomeTab() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HomePane.class.getResource("HomePane.fxml"));
        homeTab.setContent(fxmlLoader.load());
        homePane = fxmlLoader.getController();
    }

    private void setUpScheduleTab() {
    }

    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainWindow.class.getResource("MainWindow.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 720, 480);
        stage.setTitle("Study Buddy");
        stage.setScene(scene);
        stage.show();
    }

}
