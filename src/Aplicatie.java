import bazaDate.Conexiune;
import constante.Ecran;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Aplicatie extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("autentificare/autentificare.fxml"));
        primaryStage.setTitle("UTCN Cloudy");
        primaryStage.setScene(new Scene(root, Ecran.WIDTH, (int)(Ecran.HEIGHT/1.5f)));
        primaryStage.show();
    }
    // lansam aplicatia
    public static void main(String[] args) {
        launch(args);
    }
}

