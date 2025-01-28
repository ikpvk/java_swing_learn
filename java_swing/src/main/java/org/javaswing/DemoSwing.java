package org.javaswing;

import javax.swing.*;
public class DemoSwing {
    JFrame f;
    DemoSwing(){
        f=new JFrame();//creating instance of JFrame
        JButton b=new JButton("Click here again");//creating instance of JButton
        b.setBounds(130,100,200, 40);
        f.add(b);//adding button in JFrame
        f.setSize(400,500);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible
    }
    public static void main(String[] args) {
        new DemoSwing();
    }
}
