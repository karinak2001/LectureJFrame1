import javax.swing.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //Swing -> library
        //JFrame -> class

        JFrame myWindow = new JFrame();

        myWindow.setVisible(true);

        myWindow.setSize(600, 400);

        myWindow.setLocationRelativeTo(null);  // ממקמת את החלון למרכז המסך

        myWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        myWindow.setLayout(null);

        JButton myButton = new JButton();

        myWindow.add(myButton);

        myButton.setBounds(10,20,300,100);

        myButton.setText("Click");


        JButton button2 = new JButton("Button 2");

        myWindow.add(button2);

        button2.setBounds(myButton.getX(), myButton.getY() + myButton.getHeight() + WindowConstants.DEFAULT_MARGIN, myButton.getWidth(), myButton.getHeight());

        myButton.addActionListener( (event) -> {
            button2.setVisible(false);
        });

        button2.addActionListener( (event) -> {
            myButton.setVisible(!myButton.isVisible());
        });









    }
}