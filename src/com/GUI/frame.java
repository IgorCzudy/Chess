package com.GUI;

import javax.swing.*;

public class frame {
    static JFrame frame;
    public frame() {
        frame = new JFrame("Chess");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Panel());
        frame.setSize(800,800);
        frame.setVisible(true);
    }
}
