package com.xk.tankgame2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

//绘图区域
public class MyPanel extends JPanel implements KeyListener {
    //定义我的tank
    MyTank hero = null;

    public MyPanel() {
        hero = new MyTank(100, 100);
        //tank的速度
        hero.setSpeed(1);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750); //填充矩形，默认黑色
        drawTank(hero.getX(), hero.getY(), g, hero.getDirect(), 0);
//        drawTank(hero.getX()+60, hero.getY(), g, 0, 1);

    }

    public void drawTank(int x, int y, Graphics g, int direct, int type) {
        switch (type) {
            case 0:// 我们的坦克
                g.setColor(Color.cyan);
                break;
            case 1:// 敌人的坦克
                g.setColor(Color.yellow);
                break;
        }

        //根据坦克方向，来绘制坦克 0表示向上 1表示向右 2 表示向下  3 表示想左
        switch (direct) {
            case 0: // 0表示向上
                g.fill3DRect(x, y, 10, 60, false);          //左轮
                g.fill3DRect(x + 30, y, 10, 60, false); //右轮
                g.fill3DRect(x + 10, y + 10, 20, 40, false);  //盖子
                g.fillOval(x + 10, y + 20, 20, 20);                //圆形盖子
                g.drawLine(x + 20, y + 30, x + 20, y);                   //炮筒
                break;

            case 1: // 0表示向you
                g.fill3DRect(x, y, 60, 10, false);    //上轮
                g.fill3DRect(x, y + 30, 60, 10, false);     //下轮
                g.fill3DRect(x + 10, y + 10, 40, 20, false);
                g.fillOval(x + 20, y + 10, 20, 20);                //圆形盖子
                g.drawLine(x + 30, y + 20, x + 60, y + 20); //炮筒
                break;

            case 2: // 0表示向下
                g.fill3DRect(x, y, 10, 60, false);          //左轮
                g.fill3DRect(x + 30, y, 10, 60, false); //右轮
                g.fill3DRect(x + 10, y + 10, 20, 40, false);  //盖子
                g.fillOval(x + 10, y + 20, 20, 20);                //圆形盖子
                g.drawLine(x + 20, y + 30, x + 20, y + 60);                   //炮筒
                break;

            case 3: // 0表示向左
                g.fill3DRect(x, y, 60, 10, false);    //上轮
                g.fill3DRect(x, y + 30, 60, 10, false);     //下轮
                g.fill3DRect(x + 10, y + 10, 40, 20, false);
                g.fillOval(x + 20, y + 10, 20, 20);                //圆形盖子
                g.drawLine(x + 30, y + 20, x, y + 20); //炮筒
                break;

            default:
                System.out.println("暂时没有处理");
        }
        this.repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            hero.setDirect(0);
            hero.moveUp();
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            hero.setDirect(1);
            hero.moveRight();
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            hero.setDirect(2);
            hero.moveDown();
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            hero.setDirect(3);
            hero.moveLeft();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
