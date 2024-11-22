package com.github.bigbrainmat.swingtest1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.util.TimerTask;

public class SwingTest1 extends JFrame {
    private static JFrame frame = new JFrame("Authentication");
    private static JButton button = new JButton("Click to Authenticate");

        public static void main(String[] args) {
            frame.setSize(1920, 1080);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(null);

            JLabel label = new JLabel("Welcome to SeasideRP", JLabel.CENTER);
            label.setFont(new Font("Arial", Font.BOLD, 30));
            label.setSize(400, 50);
            label.setLocation((frame.getWidth() - label.getWidth()) / 2, (frame.getHeight() + 250)/ 3);
            frame.add(label);

            button.setSize(200, 50);
            button.setLocation((frame.getWidth() - button.getWidth()) / 2, (frame.getHeight() - button.getHeight()) / 2);
            frame.add(button);

            JLabel errorLabel = new JLabel("Thier was en error try again", JLabel.CENTER);
            errorLabel.setFont(new Font("Arial", Font.BOLD, 30));
            errorLabel.setSize(400, 50);
            errorLabel.setLocation((frame.getWidth() - label.getWidth()) / 2, (frame.getHeight() + 50) / 2);
            errorLabel.setForeground(Color.RED);
            errorLabel.setVisible(false);
            frame.add(errorLabel);


            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        Desktop.getDesktop().browse(new URI("https://www.youtube.com/"));
                    } catch (Exception ex) {
                        errorLabel.setVisible(true);
                        TimerTask showError = new TimerTask() {
                            public void run() {
                                errorLabel.setVisible(false);
                            }
                        };
                        java.util.Timer timer = new java.util.Timer("Timer");
                        timer.schedule(showError, 5000);
                    }
                }
            });

            frame.setVisible(true);
            frame.setResizable(false);
            frame.setTitle("SeasideRP");

    }

}
