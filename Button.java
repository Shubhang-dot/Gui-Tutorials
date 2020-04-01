package GuiTutorial;

import javax.swing.*;

public class Button {
    public static void main(String[] args){
        JFrame frame = new JFrame("Frame");
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(400,400);

        JButton button = new JButton("Click me");
        button.setVisible(true);
        button.setBounds(20,20,100,30);

        frame.add(button);
    }
}
