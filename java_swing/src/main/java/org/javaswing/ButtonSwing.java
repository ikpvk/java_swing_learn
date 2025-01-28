package org.javaswing;

import javax.swing.*;

public class ButtonSwing {
    public static void main(String[] args) {
        JFrame f = new JFrame();//creating instance of JFrame

        JButton b = new JButton("Click here");//creating instance of JButton
        b.setBounds(50, 300, 150, 40);//x axis, y axis, width, height

        f.add(b);//adding button in JFrame

        f.setSize(400, 500);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible
    }
}