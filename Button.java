package GuiTutorial;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button {
    static int count = 0;
    public static void main(String[] args){
        JFrame frame = new JFrame("Frame");
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(400,400);

        JLabel label = new JLabel();
        label.setVisible(true);
        label.setBounds(20,60,200,30);

        JButton button = new JButton("Click me");
        button.setVisible(true);
        button.setBounds(20,20,100,30);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                label.setText("No. of times button clicked: "+ count);
            }
        });

        frame.add(button);
        frame.add(label);
    }
}
