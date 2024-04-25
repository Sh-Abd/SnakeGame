import javax.swing.*;

public class GameFrame extends JFrame {
    GamePanel gamePanel;

    //constructor
    GameFrame(){
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        gamePanel.requestFocusInWindow();
    }
}
