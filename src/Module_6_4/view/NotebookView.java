package Module_6_4.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class NotebookView extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../resources/notebook.fxml"));
        Parent root = fxmlLoader.load();

        stage.getStyle().getClass().getResource("../resources/style.css");
        stage.setScene(new Scene(root));
        stage.setTitle("Notebook");
        stage.setResizable(false);
        stage.show();
    }
}
