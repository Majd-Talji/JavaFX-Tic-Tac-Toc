
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class SettingsPane extends Pane {

    Label labelForBoards = new Label("Game Board");
    Label labelForFontSizes = new Label("Font Size");
    ComboBox boardsComboBox = new ComboBox();
    ComboBox fontSizeComboBox = new ComboBox();
    Button reset = new Button("Reset Default Settings");
    Button back = new Button("Back");

    public SettingsPane() {

        boardsComboBox.getItems().addAll("Board 1", "Board 2", "Board 3", "Board 4");
        fontSizeComboBox.getItems().addAll("Small", "Meduim", "Large");

        labelForBoards.setPrefSize(100, 30);
        boardsComboBox.setPrefSize(120, 30);
        labelForFontSizes.setPrefSize(100, 30);
        fontSizeComboBox.setPrefSize(120, 30);
        reset.setPrefSize(240, 40);
        back.setPrefSize(240, 40);

        labelForBoards.setTranslateX(80);
        labelForBoards.setTranslateY(130);
        boardsComboBox.setTranslateX(200);
        boardsComboBox.setTranslateY(130);
        labelForFontSizes.setTranslateX(80);
        labelForFontSizes.setTranslateY(190);
        fontSizeComboBox.setTranslateX(200);
        fontSizeComboBox.setTranslateY(190);
        reset.setTranslateX(80);
        reset.setTranslateY(250);
        back.setTranslateX(80);
        back.setTranslateY(310);

        getChildren().add(labelForBoards);
        getChildren().add(boardsComboBox);
        getChildren().add(labelForFontSizes);
        getChildren().add(fontSizeComboBox);
        getChildren().add(reset);
        getChildren().add(back);

        boardsComboBox.getSelectionModel().selectedIndexProperty().addListener(
                (ObservableValue<? extends Number> ov, Number oldValue, Number newValue) -> {
                    switch ((int) newValue) {
                        case 0:
                            AppManager.preferredBoard = "board_1.png";
                            break;
                        case 1:
                            AppManager.preferredBoard = "board_2.png";
                            break;
                        case 2:
                            AppManager.preferredBoard = "board_3.png";
                            break;
                        case 3:
                            AppManager.preferredBoard = "board_4.png";
                            break;
                    }
                });
        
        fontSizeComboBox.getSelectionModel().selectedIndexProperty().addListener(
                (ObservableValue<? extends Object> observable, Object oldValue, Object newValue) -> {
                    
                    String selectedFont = fontSizeComboBox.getSelectionModel().getSelectedItem().toString();
                    int fontSize = 0;
                    
                    switch (selectedFont) {
                        case "Small":
                            fontSize = 15;
                            break;
                        case "Meduim":
                            fontSize = 16;
                            break;
                        case "Large":
                            fontSize = 17;
                            break;
                    }

                    AppManager.preferredFont = Font.font("Arial", FontWeight.BOLD, fontSize);
                    AppManager.setFont();
                });
        
        reset.setOnAction((ActionEvent) -> {
            AppManager.setDefaultSettings();
            boardsComboBox.getSelectionModel().selectFirst();
            fontSizeComboBox.getSelectionModel().select(1);
        });
        
        back.setOnAction((ActionEvent) -> {
            AppManager.viewPane(AppManager.startPane);
        });

    }

}
