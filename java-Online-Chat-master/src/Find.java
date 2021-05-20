import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public class Find extends JFrame implements ActionListener {
    public static String username;
    public static String userid;
    public static String username2;
        JLabel JL_fname, JL_lname, JL_age, JL_id;
        JTextField JT_fname, JT_lname, JT_age, JT_id;
        JButton btn_search;
        JButton message;

        public Find() {
            createWindow();
        }

        public void createWindow() {
            tfuser = new javax.swing.JTextField();
            JL_id = new JLabel("Впишите интерес:");
            JL_id.setBounds(20, 20, 200, 20);
            JT_id = new JTextField(20);
            JT_id.setBounds(130, 20, 150, 20);
            btn_search = new JButton("Поиск");
            btn_search.setBounds(300, 20, 80, 20);
            btn_search.addActionListener(this);
            message = new JButton("Запрос на дружбу");
            message.setBounds(40, 140, 160, 20);
            message.addActionListener(this);
            setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            setSize(500, 400);

            JL_fname = new JLabel("Имя: ");
            JL_fname.setBounds(20, 50, 100, 20);
            JT_fname = new JTextField(20);
            JT_fname.setBounds(130, 50, 150, 20);
            JL_lname = new JLabel("Пол: ");
            JL_lname.setBounds(20, 80, 100, 20);
            JT_lname = new JTextField(20);
            JT_lname.setBounds(130, 80, 150, 20);
            JL_age = new JLabel("Дата рождения: ");
            JL_age.setBounds(20, 110, 100, 20);
            JT_age = new JTextField(20);
            JT_age.setBounds(130, 110, 150, 20);
            setLayout(null);
            add(btn_search);
            add(message);
            add(JL_fname);
            add(JT_fname);
            add(JL_lname);
            add(JT_lname);
            add(JL_age);
            add(JT_age);
            add(JL_id);
            add(JT_id);
        }
        public void actionEvent() {
            // Adding action listener to buttons
            message.addActionListener(this);
        }
        @Override
        public void actionPerformed(ActionEvent e) {
   /*         String username = tfuser.getSelectedText();*/
            String username2=JT_fname.getText();
            if (e.getSource() == message) {
                try {
                    JOptionPane.showMessageDialog(null, "Успешно добавлен!");
                    Class.forName("java.sql.DriverManager");
                    // the part to edit
                    com.mysql.jdbc.Connection con = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/coursework", "Sara", "12345s");

                    com.mysql.jdbc.Statement stmt1 = (com.mysql.jdbc.Statement) con.createStatement();
                    String query2 = "INSERT INTO ready_paars (user1, user2,date_of_spilivili) VALUES ('"+username+"','"+username2+"', now())";
                    stmt1.executeUpdate(query2);

                } catch (ClassNotFoundException classNotFoundException) {
                    classNotFoundException.printStackTrace();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            Function f = new Function();
            ResultSet rs = null;
            String fn = "fname";
            String ln = "lname";
            String ag = "age";

            rs = f.find(JT_id.getText());
            try {
                if (rs.next()) {
                    JT_fname.setText(rs.getString("displayname"));
                    JT_lname.setText(rs.getString("gender"));
                    JT_age.setText(rs.getString("dob"));
                } else {
                    JOptionPane.showMessageDialog(null, "Пользователь с таким интересом не найден!");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }

        public class Function {
            Connection con = null;
            ResultSet rs = null;
            PreparedStatement ps = null;

            public ResultSet find(String s) {
                try {
                    con = DriverManager.getConnection("jdbc:mysql://localhost/coursework", "Sara", "12345s");
                    ps = con.prepareStatement("select displayname, gender, dob from enterinfo where personalmessage = ? ");
                    ps.setString(1, s);
                    rs = ps.executeQuery();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                return rs;
            }

        }
    public static void main(String args[]) {
        username = args[0];
        userid = args[1];
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Find().setVisible(true);
            }
        });
    }

    private javax.swing.JTextField tfuser;

    }
