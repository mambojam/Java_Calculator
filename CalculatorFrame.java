import javax.swing.JFrame;

public class CalculatorFrame extends JFrame {
    CalculatorFrame(){
//        GamePanel panel = new GamePanel();
//        this.add(panel);
//        Shortcut for above:
        this.add(new CalculatorPanel());

        this.setTitle("Calculator"); // Set Title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //
        this.setResizable(false); //
        this.pack(); // This fits the frame around components
        this.setVisible(true); //
        this.setLocationRelativeTo(null); // Frame appears in the middle of our screen
    }
}