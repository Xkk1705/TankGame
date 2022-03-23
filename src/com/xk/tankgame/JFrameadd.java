package com.xk.tankgame;

import javax.swing.*;

public class JFrameadd extends JFrame {
    MyPanel mp = null;

    public static void main(String[] args) {
        JFrameadd jFrameadd = new JFrameadd();

    }
    public JFrameadd() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(1000,750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 释放资源
        this.setVisible(true);
    }
}
