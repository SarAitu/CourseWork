import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class About extends JFrame implements ActionListener {
    public static String username;
    public static String userid;
    JButton b1;
    JLabel l1;
    Font f, f1, f2;
    TextArea t1;
    String s;

    public About() {

        setLayout(null);
        JButton b1 = new JButton("Выход");
        add(b1);
        b1.setBounds(180, 430, 120, 20);
        b1.addActionListener(this);

        Font f = new Font("RALEWAY", Font.BOLD, 180);
        setFont(f);

        s = "                                   Про проект         \n  "
                + "\nSA APP - это инновационная программа для знакомств"
                + "Проект создан с целью помощи одиноким людям найти друзей или свою  "
                + "вторую половинку. Приложение реализует ряд функций - один из которых "
                + "Real-time чат, в котором можно познакомиться с пользователями и возможно "
                + "назначить встречу в будущем.\n\n"
                + "С помощью приложения можно найти человека с похожими интересами "
                + "и автоматически создать пару. "
                + "Благодаря простоте интерфейса каждый пользователь сможет"
                + "быстро соориентироваться и перестанет быть одиноким :)"
        ;

        TextArea t1 = new TextArea(s, 10, 40, Scrollbar.VERTICAL);
        t1.setEditable(false);
        t1.setBounds(20, 100, 450, 300);

        add(t1);

        Font f1 = new Font("RALEWAY", Font.BOLD, 16);
        t1.setFont(f1);

        Container contentPane = this.getContentPane();
        t1 = new TextArea();

        JLabel l1 = new JLabel("SA Application");
        add(l1);
        l1.setBounds(170, 10, 180, 80);
        l1.setForeground(Color.red);

        Font f2 = new Font("RALEWAY", Font.BOLD, 20);
        l1.setFont(f2);

        setBounds(700, 220, 500, 550);

        setLayout(null);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        dispose();
    }

    public static void main(String args[]) {
        username = args[0];
        userid = args[1];
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new About().setVisible(true);
            }
        });
    }

    }

