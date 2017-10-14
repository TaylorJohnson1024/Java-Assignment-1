package assignment_1;

import javax.swing.JDialog;

/**
 *
 * @author Taylor Johnson
 * date - 9/24/17
 */
public class Assignment_1 {
    
    private static MovieForm myFrame;

    public static void main(String[] args) {
        instantiateGUI();
    }
    
    //instantiates the GUI
    private static void instantiateGUI() {
        myFrame = new MovieForm(null, false);
        myFrame.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        myFrame.pack();
        myFrame.setLocationRelativeTo(null);
        myFrame.setVisible(true);
    }
}
