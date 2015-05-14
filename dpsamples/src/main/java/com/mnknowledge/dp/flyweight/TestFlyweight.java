package com.mnknowledge.dp.flyweight;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestFlyweight extends JFrame {

    private static final Color colors[] = { Color.red, Color.blue, Color.yellow, Color.orange, Color.black, Color.white };
    private static final int WIDTH_ = 400, HEIGHT = 400, NUMBER_OF_SHAPES = 50;

    public TestFlyweight() {
        Container contentPane = getContentPane();
        JButton button = new JButton("Draw Shape");
        final JPanel panel = new JPanel();
        contentPane.add(panel, BorderLayout.CENTER);
        contentPane.add(button, BorderLayout.SOUTH);
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                Graphics g = panel.getGraphics();
                ShapeFactory shapeFactory = new CircleFactory();
                for (int i = 0; i < NUMBER_OF_SHAPES; ++i) {
                    CircleExtrinsicState context = new CircleExtrinsicState();
                    context.setGraphics(g);
                    context.setRadius(getRandomR());
                    context.setX(getRandomX());
                    context.setY(getRandomY());

                    Shape shape = shapeFactory.getShapeBy(getRandomColor());
                    shape.draw(context);
                }
            }
        });
    }

    private int getRandomX() {
        return (int) (Math.random() * WIDTH);
    }

    private int getRandomY() {
        return (int) (Math.random() * HEIGHT);
    }

    private int getRandomR() {
        return (int) (Math.random() * (HEIGHT / 10));
    }

    private Color getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    public static void main(String[] args) {
        TestFlyweight test = new TestFlyweight();
    }
}
