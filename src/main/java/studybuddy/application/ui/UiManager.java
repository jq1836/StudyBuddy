package studybuddy.application.ui;

import java.io.IOException;

import javafx.stage.Stage;

/**
 * Manages the Ui
 */
public class UiManager {

    private MainWindow mainWindow;

    public void start(Stage stage) {
        try {
            mainWindow = new MainWindow();
            mainWindow.start(stage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
