
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class StartPane extends Pane {

    Button singlePlayer = new Button("Single Player");
    Button multiPlayer = new Button("Multi Player");
    Button settings = new Button("Settings");
    Button about = new Button("About");
    Button exit = new Button("Exit");

    Alert alert = new Alert(Alert.AlertType.INFORMATION);

    public StartPane() {
        
        singlePlayer.setPrefSize(240, 40);
        multiPlayer.setPrefSize(240, 40);
        settings.setPrefSize(240, 40);
        about.setPrefSize(240, 40);
        exit.setPrefSize(240, 40);
        
        singlePlayer.setTranslateX(80);
        singlePlayer.setTranslateY(110);
        multiPlayer.setTranslateX(80);
        multiPlayer.setTranslateY(170);
        settings.setTranslateX(80);
        settings.setTranslateY(230);
        about.setTranslateX(80);
        about.setTranslateY(290);
        exit.setTranslateX(80);
        exit.setTranslateY(350);
        
        getChildren().add(singlePlayer);
        getChildren().add(multiPlayer);
        getChildren().add(settings);
        getChildren().add(about);
        getChildren().add(exit);
        
        singlePlayer.setOnAction((ActionEvent event) -> {
            AppManager.viewPane(AppManager.singlePlayerPane);
        });

        multiPlayer.setOnAction((ActionEvent event) -> {
            AppManager.viewPane(AppManager.multiPlayerPane);
        });

        settings.setOnAction((ActionEvent event) -> {
            AppManager.viewPane(AppManager.settingsPane);
        });

        about.setOnAction((ActionEvent event) -> {
            String str
                    = "Prepared by a Majd Talji\n\n"
                    + "If you have any comments, ideas.. just let know\n\n"
                    + "E-Mail:  en.majd.talji@gmail.com\n"
                    + "twitter & facebook: @noch nicht \n\n"
                    + "Note\n"
                    + "I used JDK 1.8 to compile the source code\n\n."
                    + "C Copyright 2019 majdtalji.com - All Rights Reserved";

            alert.setTitle("About Tic Tac Toe");
            alert.setHeaderText("About Tic Tac Toe");
            alert.setContentText(str);
            alert.showAndWait();
        });

        exit.setOnAction((ActionEvent event) -> {
            System.exit(0);
        });
    }

}
