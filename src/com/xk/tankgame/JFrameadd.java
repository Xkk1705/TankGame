package com.xk.tankgame;

import javax.swing.*;

public class JFrameadd extends JFrame {
    com.xk.tankgame.MyPanel mp = null;
    public static void main(String[] args) {
        JFrameadd jFrameadd = new JFrameadd();

    }
    public JFrameadd() {
        mp = new com.xk.tankgame.MyPanel();
        this.add(mp);
        this.setSize(1000,750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 释放资源
        this.setVisible(true);
    }
}
