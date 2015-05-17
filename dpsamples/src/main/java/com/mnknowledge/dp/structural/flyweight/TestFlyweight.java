package com.mnknowledge.dp.structural.flyweight;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestFlyweight extends JFrame {

    private static final Color colors[] = { Color.red, Color.blue, Color.yellow, Color.orange, Color.black, Color.white };
    private static final int WIDTH_ = 400, HEIGHT = 400, NUMBER_OF_SHAPES = 1000;
    private final Random random = new Random();

    public TestFlyweight() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        Container contentPane = getContentPane();
        JButton button = new JButton("Draw Shape");
        final JPanel panel = new JPanel();
        contentPane.add(panel, BorderLayout.CENTER);
        contentPane.add(button, BorderLayout.SOUTH);
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        final ShapeFactory shapeFactory = new CircleFactory();
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                Graphics g = panel.getGraphics();
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
        return (int) (random.nextInt(40) * 10);
    }

    private int getRandomY() {
        return (int) (random.nextInt(40) * 10);
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
