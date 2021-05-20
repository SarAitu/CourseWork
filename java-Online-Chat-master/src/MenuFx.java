import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;


public class MenuFx implements ActionListener {
    public static String username;
    public static String userid;
    JFrame frame;
    JLabel messages = new JLabel("О нас");
    JLabel partnerss = new JLabel("Мои партнёры");
    JLabel find = new JLabel("Поиск по интересам");
    JLabel zodiac = new JLabel("Поиск по совместимости");
    JLabel showAllPart = new JLabel("Посмотреть все пары");
    JLabel exit = new JLabel("Выход");


    /**
     * Launch the application.
     */


    /**
     * Create the application.
     */
    public MenuFx() {
        createWindow();
        initialize();
    }


    /**
     * Create a main window
     */
    public void createWindow() {
        frame = new JFrame();
        frame.setTitle("Меню");
        frame.getContentPane().setBackground(Color.GRAY);
        frame.setBounds(200, 100, 700, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {


        // label: orange colored background
        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 165, 0, 200));
        panel.setBounds(150, 150, 450, 450);
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        // Label: scaled background
        JLabel background = new JLabel("");
        background.setBounds(6, 6, 700, 700);
        ImageIcon icon = new ImageIcon(this.getClass().getResource("/0_00Love.jpg"));
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(background.getWidth(), background.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        background.setIcon(scaledIcon);
        frame.getContentPane().add(background);


        JLabel lblNewLabel_1 = new JLabel("Меню");
        lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 19));
        lblNewLabel_1.setBounds(200, 40, 107, 29);
        panel.add(lblNewLabel_1);


        messages.setBounds(150, 100, 100, 60);
        messages.setFont(new Font("Lucida Grande", Font.ITALIC, 15));
        panel.add(messages);
        messages.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String info[] = new String[2];
                info[0] = username;
                info[1] = userid;
                About.main(info);
            }
        });
        partnerss.setFont(new Font("Lucida Grande", Font.ITALIC, 15));;
        partnerss.setBounds(150, 150, 300, 60);
        panel.add(partnerss);
        partnerss.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String info[] = new String[2];
                info[0] = username;
                info[1] = userid;
                ShowPartners.main(info);
            }
        });
        find.setFont(new Font("Lucida Grande", Font.ITALIC, 15));
        find.setBounds(150, 200, 300, 60);
        panel.add(find);
        find.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String info[] = new String[2];
                info[0] = username;
                info[1] = userid;
                Find.main(info);
            }
        });
        zodiac.setFont(new Font("Lucida Grande", Font.ITALIC, 15));
        zodiac.setBounds(150, 250, 300, 60);
        panel.add(zodiac);
        zodiac.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URL("https://horoscopes.rambler.ru/sovmestimost-znakov-zodiaka/").toURI());
                } catch (Exception ep) {}
            }
        });
        showAllPart.setFont(new Font("Lucida Grande", Font.ITALIC, 15));
        showAllPart.setBounds(150, 300, 300, 60);
        panel.add(showAllPart);
        showAllPart.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String info[] = new String[2];
                info[0] = username;
                info[1] = userid;
                ShowAllParts.main(info);
            }
        });
        exit.setFont(new Font("Lucida Grande", Font.ITALIC, 15));
        exit.setBounds(150, 350, 100, 60);
        panel.add(exit);
        exit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });


    }
    public static void main(String args[]) {
        username = args[0];
        userid = args[1];
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MenuFx();
            }
        });
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}