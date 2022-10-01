package studybuddy.application;

import javafx.application.Application;
import javafx.stage.Stage;
import studybuddy.application.ui.UiManager;

/**
 * The main application class
 */
public class App extends Application {

    private UiManager uiManager;

    @Override
    public void init() throws Exception {
        super.init();
        uiManager = new UiManager();
    }

    @Override
    public void start(Stage stage) {
        uiManager.start(stage);
    }

}
