import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class ShowAllParts extends JFrame{
    public static String username;
    public static String userid;
    public static String username2;


    public ShowAllParts() {
        createWindow();
    }

    public void createWindow() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setBounds(100, 100, 580, 242);

        setTitle("Мои партнеры");

        getContentPane().setLayout(null);



// ScrollPane

        JScrollPane scrollPane = new JScrollPane();

        scrollPane.setBounds(64, 44, 440, 89);

        getContentPane().add(scrollPane);


// Table

        JTable table = new JTable();

        scrollPane.setViewportView(table);

        DefaultTableModel model = (DefaultTableModel)table.getModel();

        model.addColumn("Номер пары: ");

        model.addColumn("Мое имя: ");

        model.addColumn("Имя партнера:");

        model.addColumn("Дата пары: ");




        Connection connect = null;

        Statement s = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");



            connect =  DriverManager.getConnection("jdbc:mysql://localhost:3306/coursework", "Sara", "12345s");

            s = connect.createStatement();

            String sql = "SELECT * FROM ready_paars";



            ResultSet rec = s.executeQuery(sql);

            int row = 0;

            while((rec!=null) && (rec.next()))

            {

                model.addRow(new Object[0]);

                model.setValueAt(rec.getString("num_paar"), row, 0);

                model.setValueAt(rec.getString("user1"), row, 1);

                model.setValueAt(rec.getString("user2"), row, 2);

                model.setValueAt(rec.getString("date_of_spilivili"), row, 3);

                row++;

            }



            rec.close();


        } catch (Exception e) {

// TODO Auto-generated catch block

            JOptionPane.showMessageDialog(null, e.getMessage());

            e.printStackTrace();

        }



        try {

            if(s != null) {

                s.close();

                connect.close();

            }

        } catch (SQLException e) {

// TODO Auto-generated catch block

            e.printStackTrace();

        }
    }

    public static void main(String args[]) {
        username = args[0];
        userid = args[1];
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ShowAllParts().setVisible(true);
            }
        });
    }

    private javax.swing.JTextField tfuser;


}




