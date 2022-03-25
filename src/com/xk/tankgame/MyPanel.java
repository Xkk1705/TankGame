package com.xk.tankgame;

import javax.swing.*;
import java.awt.*;

//绘图区域
public class MyPanel extends JPanel {
    //定义我的tank
    com.xk.tankgame.MyTank hero = null;

    public MyPanel() {
        hero = new com.xk.tankgame.MyTank(100, 100);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750); //填充矩形，默认黑色
        drawTank(hero.getX(), hero.getY(), g, 0, 0);
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

        //根据坦克方向，来绘制坦克
        switch (direct) {
            case 0: // 0表示向上
                g.fill3DRect(x, y, 10, 60, false);          //左轮
                g.fill3DRect(x + 30, y, 10, 60, false); //右轮
                g.fill3DRect(x+10,y+10,20,60,false);  //盖子
                g.fillOval(x+10,y+20,20,20);                //圆形盖子
                g.drawLine(x+20,y+30,x+20,y);                   //炮筒
            default:
                System.out.println("暂时没有处理");
        }

    }
}
