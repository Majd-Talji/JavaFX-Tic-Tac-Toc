
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;


/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class AppManager {
    
    static StartPane startPane = new StartPane();
    static SinglePlayerPane singlePlayerPane = new SinglePlayerPane();
    static MultiPlayerPane multiPlayerPane = new MultiPlayerPane();
    static SettingsPane settingsPane = new SettingsPane();
    static GamePane gamePane = new GamePane();
    
    static String preferredBoard;

    static Font preferredFont;

    static boolean challengeComputer;
    
    public static void viewPane(Pane pane) {
        startPane.setVisible(false);
        singlePlayerPane.setVisible(false);
        multiPlayerPane.setVisible(false);
        settingsPane.setVisible(false);
        gamePane.setVisible(false);

        pane.setVisible(true);
    }
    
    public static void setDefaultSettings() {
        settingsPane.boardsComboBox.getSelectionModel().selectFirst();
        settingsPane.fontSizeComboBox.getSelectionModel().select(1);

        setFont();
    }
    
    public static void setFont() {

        startPane.singlePlayer.setFont(preferredFont);
        startPane.multiPlayer.setFont(preferredFont);
        startPane.settings.setFont(preferredFont);
        startPane.about.setFont(preferredFont);
        startPane.exit.setFont(preferredFont);

        singlePlayerPane.playerNameLabel.setFont(preferredFont);
        singlePlayerPane.playerName.setFont(preferredFont);
        singlePlayerPane.start.setFont(preferredFont);
        singlePlayerPane.back.setFont(preferredFont);

        multiPlayerPane.firstPlayerName.setFont(preferredFont);
        multiPlayerPane.secondPlayerName.setFont(preferredFont);
        multiPlayerPane.firstPlayerName.setFont(preferredFont);
        multiPlayerPane.secondPlayerName.setFont(preferredFont);
        multiPlayerPane.start.setFont(preferredFont);
        multiPlayerPane.back.setFont(preferredFont);

        gamePane.firstPlayerName.setFont(preferredFont);
        gamePane.secondPlayerName.setFont(preferredFont);
        gamePane.firstPlayerScore.setFont(preferredFont);
        gamePane.secondPlayerScore.setFont(preferredFont);
        gamePane.currentPlayerSymbol.setFont(preferredFont);
        gamePane.back.setFont(preferredFont);
        gamePane.newGame.setFont(preferredFont);

        settingsPane.labelForBoards.setFont(preferredFont);
        settingsPane.labelForFontSizes.setFont(preferredFont);
        settingsPane.reset.setFont(preferredFont);
        settingsPane.back.setFont(preferredFont);

        // Um festzustellen, dass setStyle() keine spezielle Funktion zum Bestimmen der Schriftgröße hat, haben wie die Funktion fontSizesComboBox und die beiden ObjektfelderBoxboBox verwendet.
        settingsPane.boardsComboBox.setStyle(
                "-fx-font-family: " + preferredFont.getName() + ";"
                + "-fx-font-size: " + preferredFont.getSize() + "px;"
                + "-fx-font-weight: bold;"
        );
        settingsPane.fontSizeComboBox.setStyle(
                "-fx-font-family: " + preferredFont.getName() + ";"
                + "-fx-font-size: " + preferredFont.getSize() + "px;"
                + "-fx-font-weight: bold;"
        );
    }
    
    
    
}
