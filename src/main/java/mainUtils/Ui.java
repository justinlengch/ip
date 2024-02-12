package mainUtils;
import fileUtils.*;

import java.util.Scanner;

public class Ui {
    private String[] userInput;
    public Ui() {
    }
    public final void displayStart() {
        displayLine();
        displayLogo();
        System.out.println("      Hello! I'm RahhBot. RAHHHH!!\n");
        System.out.println("      What can I do for you today?\n");
        displayLine();
    }

    public final void displayLine() {
        FileUtil.displayFile(FilePaths.HORIZONTAL_LINE_PATH);
    }

    public final void displayLogo() {
        FileUtil.displayFile(FilePaths.LOGO_PATH);
    }

    public final void displayErrorGraphic(String errorMessage) {
        FileUtil.displayFile(FilePaths.ERROR_GRAPHIC_PATH);
        System.out.println(errorMessage);
    }

    public void storeCommand(String userInput) {
        this.userInput = userInput.trim().split("\\s+");
    }

    public String[] getCommand() {
        return this.userInput;
    }

}
