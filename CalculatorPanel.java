import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class CalculatorPanel extends JPanel // implements ActionListener
 {
    
    static final int SCREEN_WIDTH = 400;
    static final int SCREEN_HEIGHT = 400;
    static final int UNIT_SIZE = 80;
    static final int SCREEN_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT / UNIT_SIZE);
    static JTextArea CalculatorScreen = new JTextArea();



    CalculatorPanel() {
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.gray);
        this.setFocusable(true);
        this.setLayout(null);
        setButtons(this);
        CalculatorScreen.setBounds(0, 0, UNIT_SIZE*4, UNIT_SIZE);
        this.add(CalculatorScreen);
    }

    // Set buttons
    public void setButtons(CalculatorPanel panel) {
        // Nums 1-9
        int num = 1;
        // Y axis
        for ( int Y = UNIT_SIZE*3 ; Y >= UNIT_SIZE*1 ; Y -= UNIT_SIZE ) {
            // X Axis 
            for ( int X = 0 ; X <= UNIT_SIZE*2 ; X += UNIT_SIZE ) {
                JButton b=new JButton(""+num);//creating instance of JButton  
                b.setBounds(X,Y,UNIT_SIZE, UNIT_SIZE);//x axis, y axis, width, height  
                panel.add(b);//adding button in JFrame  
                // NEED TO SET A FUNCTION TO WRITE THE NUMBERS AS A STRING IN THE SCREEN
                num++;
            } 
        }
        // BOTTOM ROW
        // 0
        JButton zero=new JButton("0");//creating instance of JButton  
        zero.setBounds(0,UNIT_SIZE*4,UNIT_SIZE, UNIT_SIZE);//x axis, y axis, width, height  
        panel.add(zero);//adding button in JFrame  
        // .
        JButton point=new JButton(".");//creating instance of JButton  
        point.setBounds(UNIT_SIZE,UNIT_SIZE*4,UNIT_SIZE, UNIT_SIZE);//x axis, y axis, width, height  
        panel.add(point);//adding button in JFrame 
        // +/-
        JButton posNeg=new JButton("+/-");//creating instance of JButton  
        posNeg.setBounds(UNIT_SIZE*2,UNIT_SIZE*4,UNIT_SIZE, UNIT_SIZE);//x axis, y axis, width, height  
        panel.add(posNeg);//adding button in JFrame 
        // -
        JButton plus=new JButton("+");//creating instance of JButton  
        plus.setBounds(UNIT_SIZE*3,UNIT_SIZE*4,UNIT_SIZE, UNIT_SIZE);//x axis, y axis, width, height  
        panel.add(plus);//adding button in JFrame 
        // =
        JButton equals=new JButton("=");//creating instance of JButton  
        equals.setBounds(UNIT_SIZE*4,UNIT_SIZE*4,UNIT_SIZE, UNIT_SIZE);//x axis, y axis, width, height  
        panel.add(equals);//adding button in JFrame 
        // SECOND ROW
        // Minus
        JButton minus=new JButton("-");//creating instance of JButton  
        minus.setBounds(UNIT_SIZE*3,UNIT_SIZE*3,UNIT_SIZE, UNIT_SIZE);//x axis, y axis, width, height  
        panel.add(minus);//adding button in JFrame 
        // powOF
        JButton powOf=new JButton("x**x");//creating instance of JButton  
        powOf.setBounds(UNIT_SIZE*4,UNIT_SIZE*3,UNIT_SIZE, UNIT_SIZE);//x axis, y axis, width, height  
        panel.add(powOf);//adding button in JFrame 
        // THIRD ROW
        // times
        JButton times=new JButton("x");//creating instance of JButton  
        times.setBounds(UNIT_SIZE*3,UNIT_SIZE*2,UNIT_SIZE, UNIT_SIZE);//x axis, y axis, width, height  
        panel.add(times);//adding button in JFrame 
        // Percent
        JButton percent=new JButton("%");//creating instance of JButton  
        percent.setBounds(UNIT_SIZE*4,UNIT_SIZE*2,UNIT_SIZE, UNIT_SIZE);//x axis, y axis, width, height  
        panel.add(percent);//adding button in JFrame 
        // FourthRow
        // Divided By
        JButton divided=new JButton("/");//creating instance of JButton  
        divided.setBounds(UNIT_SIZE*3,UNIT_SIZE,UNIT_SIZE, UNIT_SIZE);//x axis, y axis, width, height  
        panel.add(divided);//adding button in JFrame 
        // SQRT
        JButton sqrt=new JButton("sqrt");//creating instance of JButton  
        sqrt.setBounds(UNIT_SIZE*4,UNIT_SIZE,UNIT_SIZE, UNIT_SIZE);//x axis, y axis, width, height  
        panel.add(sqrt);//adding button in JFrame 
        // TOP ROW
        // Clear
        JButton clear=new JButton("C");//creating instance of JButton  
        clear.setBounds(UNIT_SIZE*4,0,UNIT_SIZE, UNIT_SIZE);//x axis, y axis, width, height  
        panel.add(clear);//adding button in JFrame 
    }


    // Create Paint
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }
    // Paint Grapphics
    public void draw(Graphics g) {
        for (int i = 0; i < SCREEN_HEIGHT / UNIT_SIZE; i++) { // Create grid
            g.drawLine(i * UNIT_SIZE, 0, i * UNIT_SIZE, SCREEN_HEIGHT);
            g.drawLine(0, i * UNIT_SIZE, SCREEN_WIDTH, i * UNIT_SIZE);
        }
    }
 }