package Anastasiya;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyPanel extends JPanel {
    private Figure figure;
    private boolean ctrlIsSelected = false;
    public MyPanel() {
        figure = new Figure(50,50,50,Color.cyan);
        setBackground(Color.lightGray);
        setLayout(null);
        setBounds(10, 7, 365, 150);
        setFocusable(true);

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    super.keyPressed(e);
                    figure.changeColor(Color.BLACK);
                }
                else if(e.getKeyCode() == KeyEvent.VK_SHIFT){
                    ctrlIsSelected = true;
                }
                repaint();
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    super.keyReleased(e);
                    figure.changeColor(Color.CYAN);
                }
                else if(e.getKeyCode() == KeyEvent.VK_SHIFT){
                    ctrlIsSelected = false;
                }
                repaint();
            }
        });
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setColor(figure.getColor());
        if(!ctrlIsSelected) {
            g2d.fillRect(figure.getX(), figure.getY(), figure.getLength(), figure.getLength());
            g2d.dispose();
        }
        else{
            g2d.fillOval(figure.getX(), figure.getY(), figure.getLength(), figure.getLength());
            g2d.dispose();
        }
    }
}

