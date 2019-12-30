package LessonHW8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Homework8 extends JFrame {
    public Homework8() {
        setTitle("Ferst windoow");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  //
        setBounds(310, 400, 310, 400);

        JButton[] butt = new JButton[10];
        setLayout(null);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                butt[i * 3 + j + 1] = new JButton((i * 3 + j + 1) + "");
                butt[i * 3 + j + 1].setBounds(i * (60 + 10) + 10, j * (60 + 10) + 60, 60, 60);
                add(butt[i * 3 + j + 1]);
            }
        }

        butt[0] = new JButton("0");
        butt[0].setBounds(80, 270, 60, 60);
        add(butt[0]);

        JButton clear = new JButton("del");
        clear.setBounds(10,270,60,60);
        add(clear);

        JButton resalt = new JButton("=");
        resalt.setBounds(150,270,60,60);
        add(resalt);

        JButton pluss = new JButton("+");
        pluss.setBounds(220,60,60,60);
        add(pluss);
        JButton minus = new JButton("-");
        minus.setBounds(220,130,60,60);
        add(minus);
        JButton multi = new JButton("*");
        multi.setBounds(220,200,60,60);
        add(multi);
        JButton div = new JButton("/");
        div.setBounds(220,270,60,60);
        add(div);

        JTextField tablo = new JTextField();
        tablo.setBounds(10, 10, 270, 40);
        tablo.setEditable(false);
        add(tablo);

        ActionListener listner = (ActionEvent e) -> {
            JButton b = (JButton) e.getSource();
            tablo.setText(tablo.getText() + b.getText());
        };

        for (JButton b : butt) {
            b.addActionListener(listner);
        }

        clear.addActionListener(e -> tablo.setText(null));
        pluss.addActionListener(e -> tablo.setText(tablo.getText() + pluss.getText()));
        minus.addActionListener(e -> tablo.setText(tablo.getText() + minus.getText()));
        multi.addActionListener(e -> tablo.setText(tablo.getText() + multi.getText()));
        div.addActionListener(e -> tablo.setText(tablo.getText() + div.getText()));

        /**
         * Здесь должна быть логика подсчета.
         * Пока не осилил
         */

        setVisible(true); //показывает полученную форму на экране
    }

    public static void main(String[] args) {
        MyWindow Homework8 = new MyWindow();
    }

}