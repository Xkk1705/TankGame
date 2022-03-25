package com.xk.event_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BallMove extends JFrame {
    MyPanel mp = null;
    public static void main(String[] args) {
        BallMove ballMove = new BallMove();
    }

    public BallMove() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400,300);
        this.addKeyListener(mp); //这里加入在这个面板里监听 因为这个 MyPanel实现了KeyListener接口
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

class MyPanel extends JPanel implements KeyListener {
    int x = 10;
    int y = 10;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x,y,20,20);
    }

    //输入字符时触发
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
//        System.out.println((char) e.getKeyCode()+"被按下");
        if (e.getKeyCode() == KeyEvent.VK_DOWN){
            y++;
        }else if (e.getKeyCode() == KeyEvent.VK_UP) {
            y--;
        }else if (e.getKeyCode() == KeyEvent.VK_RIGHT){
            x++;
        }else if (e.getKeyCode() == KeyEvent.VK_LEFT){
            x--;
        }

        this.repaint(); //重绘面板

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}