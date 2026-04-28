package gui;

import javax.swing.*;

public class Library {
    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> new LoginFrame().setVisible(true));
    }
}
