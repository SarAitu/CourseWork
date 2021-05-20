/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * EnterInfo.java
 *
 * Created on 27 Jun, 2013, 10:31:50 PM
 */
/**
 *
 * @author arjunsk
 */

import java.awt.*;
import java.awt.event.*;
import java.sql.DriverManager;
import javax.swing.*;
import javax.swing.border.*;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class EnterInfo extends javax.swing.JFrame {
    public static String username;
    public static String userid;
    /** Creates new form EnterInfo */
    public EnterInfo() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    // Generated using JFormDesigner Evaluation license - unknown
    private void initComponents() {
        jLabel2 = new JLabel();
        red = new JLabel();
        green = new JLabel();
        grey = new JLabel();
        jLabel1 = new JLabel();
        jTextField2 = new JTextField();
        jLabel3 = new JLabel();
        jComboBox1 = new JComboBox<>();
        jLabel4 = new JLabel();
        jComboBox3 = new JComboBox<>();
        jComboBox4 = new JComboBox<>();
        jComboBox2 = new JComboBox<>();
        jLabel5 = new JLabel();
        jTextField3 = new JTextField();
        jLabel7 = new JLabel();
        jComboBox5 = new JComboBox<>();
        jLabel8 = new JLabel();
        jLabel6 = new JLabel();
        screen = new JLabel();
        iphone = new JLabel();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- jLabel2 ----
        jLabel2.setText("Информация пользователя");
        contentPane.add(jLabel2);
        jLabel2.setBounds(80, 100, 70, jLabel2.getPreferredSize().height);

        //---- red ----
        red.setIcon(new ImageIcon(getClass().getResource("/close.jpg")));
        red.setOpaque(true);
        contentPane.add(red);
        red.setBounds(30, 10, 20, red.getPreferredSize().height);

        //---- green ----
        green.setIcon(new ImageIcon(getClass().getResource("/maximise.jpg")));
        green.setOpaque(true);
        contentPane.add(green);
        green.setBounds(70, 10, 20, green.getPreferredSize().height);

        //---- grey ----
        grey.setIcon(new ImageIcon(getClass().getResource("/minimise.jpg")));
        grey.setOpaque(true);
        contentPane.add(grey);
        grey.setBounds(50, 10, 20, grey.getPreferredSize().height);

        //---- jLabel1 ----
        jLabel1.setText("Никнейм");
        contentPane.add(jLabel1);
        jLabel1.setBounds(30, 120, jLabel1.getPreferredSize().width, 10);
        contentPane.add(jTextField2);
        jTextField2.setBounds(30, 130, 210, jTextField2.getPreferredSize().height);

        //---- jLabel3 ----
        jLabel3.setText("Пол");
        contentPane.add(jLabel3);
        jLabel3.setBounds(30, 160, jLabel3.getPreferredSize().width, 10);

        //---- jComboBox1 ----
        jComboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
            "M",
            "Ж"
        }));
        contentPane.add(jComboBox1);
        jComboBox1.setBounds(30, 170, 50, 20);

        //---- jLabel4 ----
        jLabel4.setText("Дата рождения");
        contentPane.add(jLabel4);
        jLabel4.setBounds(30, 210, 50, 10);

        //---- jComboBox3 ----
        jComboBox3.setModel(new DefaultComboBoxModel<>(new String[] {
                "Январь",
                "Февраль",
                "Март",
                "Апрель",
                "Май",
                "Июнь",
                "Июль",
                "Август",
                "Сентябрь",
                "Октябрь",
                "Ноябрь",
                "Декабрь"
        }));
        contentPane.add(jComboBox3);
        jComboBox3.setBounds(30, 220, 90, jComboBox3.getPreferredSize().height);

        //---- jComboBox4 ----
        jComboBox4.setModel(new DefaultComboBoxModel<>(new String[] {
            "01",
            "02",
            "03",
            "04",
            "05",
            "06",
            "07",
            "08",
            "09",
            "10",
            "11",
            "12",
            "13",
            "14",
            "15",
            "16",
            "17",
            "18",
            "19",
            "20",
            "21",
            "22",
            "23",
            "24",
            "25",
            "26",
            "27",
            "28",
            "29",
            "30",
            "31"
        }));
        contentPane.add(jComboBox4);
        jComboBox4.setBounds(130, 220, 40, jComboBox4.getPreferredSize().height);

        //---- jComboBox2 ----
        jComboBox2.setModel(new DefaultComboBoxModel<>(new String[] {
            "1940",
            "1941",
            "1942",
            "1943",
            "1944",
            "1945",
            "1946",
            "1947",
            "1948",
            "1949",
            "1950",
            "1951",
            "1952",
            "1953",
            "1954",
            "1955",
            "1956",
            "1957",
            "1958",
            "1959",
            "1960",
            "1961",
            "1962",
            "1963",
            "1964",
            "1965",
            "1966",
            "1967",
            "1968",
            "1969",
            "1970",
            "1971",
            "1972",
            "1973",
            "1974",
            "1975",
            "1976",
            "1977",
            "1978",
            "1979",
            "1980",
            "1981",
            "1982",
            "1983",
            "1984",
            "1985",
            "1986",
            "1987",
            "1988",
            "1989",
            "1990",
            "1991",
            "1992",
            "1993",
            "1994",
            "1995",
            "1996",
            "1997",
            "1998",
            "1999",
            "2000",
            "2001",
            "2002",
            "2003",
            "2004",
            "2005",
            "2006",
            "2007",
            "2008",
            "2009",
            "2010",
            "2011",
            "2012",
            "2013",
            "2014",
                "2015",
                "2016",
                "2017",
                "2018",
                "2019",
                "2020",
                "2021"
        }));
        contentPane.add(jComboBox2);
        jComboBox2.setBounds(179, 220, 60, jComboBox2.getPreferredSize().height);

        //---- jLabel5 ----
        jLabel5.setText("Интересы");
        contentPane.add(jLabel5);
        jLabel5.setBounds(30, 260, jLabel5.getPreferredSize().width, 10);
        contentPane.add(jTextField3);
        jTextField3.setBounds(30, 270, 210, jTextField3.getPreferredSize().height);

        //---- jLabel7 ----
        jLabel7.setText("Страна");
        contentPane.add(jLabel7);
        jLabel7.setBounds(30, 310, jLabel7.getPreferredSize().width, 10);

        //---- jComboBox5 ----
        jComboBox5.setModel(new DefaultComboBoxModel<>(new String[] {
                "Абхазия",
                "Афганистан",
                "Акротири и Декелия",
                "Аланд",
                "Албания",
                "Алжир",
                "Американское Самоа",
                "Андорра",
                "Ангола",
                "Ангилья",
                "Антигуа и Барбуда",
                "Аргентина",
                "Армения",
                "Аруба",
                "Остров Вознесения",
                "Австралия",
                "Австрия",
                "Азербайджан",
                "Багамские Острова",
                "Бахрейн",
                "Бангладеш",
                "Барбадос",
                "Беларусь",
                "Бельгия",
                "Белиз",
                "Бенин",
                "Бермуды",
                "Бутан",
                "Боливия",
                "Босния и Герцеговина",
                "Ботсвана",
                "Бразилия",
                "Бруней",
                "Болгария",
                "Буркина-Фасо",
                "Бурунди",
                "Камбоджа",
                "Камерун",
                "Канада",
                "Кабо-Верде",
                "Каймановы Острова",
                "Центрально-Африканской Республики",
                "Чад",
                "Чили",
                "Китай",
                "Остров Рождества",
                "Кокос (Килинг) Острова",
                "Колумбия",
                "Коморские острова",
                "Конго",
                "Острова Кука",
                "Коста-Рика",
                "Кот д'Ивуар'",
                "Хорватия",
                "Куба",
                "Кипр",
                "Чехия",
                "Дания",
                "Джибути",
                "Доминика",
                "Доминиканская Республика",
                "Восточный Тимор Эквадор",
                "Египет",
                "Сальвадор",
                "Экваториальная Гвинея",
                "Эритрея",
                "Эстония",
                "Эфиопия",
                "Фолклендские Острова",
                "Фарерские Острова",
                "Фиджи",
                "Финляндия",
                "Франция",
                "Французская Полинезия",
                "Габон",
                "Организация, В",
                "Грузии",
                "Германия",
                "Гана",
                "Гибралтар",
                "Греция",
                "Гренландия",
                "Гренада",
                "Гуам",
                "Гватемала",
                "Guemsey",
                "Гвинея",
                "Гвинея-Бисау",
                "Гайана",
                "Гаити",
                "Гондурас",
                "Гонконг",
                "Венгрия",
                "Исландия",
                "Индия",
                "Индонезия",
                "Иран",
                "Ирак",
                "Ирландия",
                "Мэн",
                "Израиль",
                "Италия",
                "Ямайка",
                "Япония",
                "Джерси",
                "Иордания",
                "Казахстан",
                "Кения",
                "Кирибати",
                "Корея, Н",
                "Корея, С",
                "Косово",
                "Кувейт",
                "Кыргызстан",
                "Лаос",
                "Латвия",
                "Ливан",
                "Лесото",
                "Либерия",
                "Ливия",
                "Лихтенштейн",
                "Литва",
                "Люксембург",
                "Словения",
                "Македония",
                "Мадагаскар",
                "Малави",
                "Малайзия",
                "Мальдивы",
                "Мали",
                "Мальта",
                "Маршалловы Острова",
                "Мавритания",
                "Маврикий",
                "Майотта",
                "Мексика",
                "Микронезия",
                "Молдова",
                "Монако",
                "Монголия",
                "Черногория",
                "Монтсеррат",
                "Марокко",
                "Мозамбик",
                "Мьянма",
                "Нагорно-Карабахский",
                "Намибия",
                "Науру",
                "Непал",
                "Нидерланды",
                "Нидерландские Антильские Острова",
                "Новая Каледония",
                "Новая Зеландия",
                "Никарагуа",
                "Нигер",
                "Нигерия",
                "Ниуэ",
                "Норфолк",
                "Северный Кипр",
                "Северные Марианские Острова",
                "Норвегия",
                "Оман",
                "Пакистан",
                "Палау",
                "Палестина",
                "Панама",
                "Папуа Новая Гвинея",
                "Парагвай",
                "Перу",
                "Филиппины",
                "Pitcaim Острова",
                "Польша",
                "Португалия",
                "Пуэрто-Рико",
                "Катар",
                "Румыния",
                "Россия",
                "Руанда",
                "Сахарская Арабская Демократическая Республика",
                "Сен-Бартельми",
                "Остров Святой Елены",
                "Сент-Китс и Невис",
                "Сент-Люсия",
                "Сен-Мартен",
                "Сен Пьер и Микелон",
                "Сент-Винсент и Гренадины",
                "Самос",
                "Сан-Марино",
                "Сан-Томе и Принсипи",
                "Саудовская Аравия",
                "Сенегал",
                "Сербия",
                "Сейшельские острова",
                "Сьерра-Леоне",
                "Сингапур",
                "Словакия",
                "Словения",
                "Соломоновы Острова",
                "Сомали",
                "Сомалиленда",
                "ЮАР",
                "Южная Осетия",
                "Испания",
                "Шри-Ланка",
                "Судан",
                "Суринам",
                "Шпицберген",
                "Свазиленд",
                "Швеция",
                "Швейцария",
                "Сирия",
                "Таджикистан",
                "Танзания",
                "Таиланд",
                "Того",
                "Токелау",
                "Тонга",
                "Приднестровье",
                "Тринидад и Тобаго",
                "Тристан-да-Кунья",
                "Тунис",
                "Турция",
                "Туркменистан",
                "Теркс и Кайкос",
                "Тувалу",
                "Уганда",
                "Украина",
                "Объединенные Арабские Эмираты",
                "Соединенное Королевство",
                "Соединенные Штаты Америки",
                "Уругвай",
                "Узбекистан",
                "Вануату",
                "Ватикан",
                "Венесуэла",
                "Вьетнам",
                "Британские Виргинские Острова",
                "Виргинские острова, США",
                "Уоллис и Футуна",
                "Йемен",
                "Замбия",
                "Зимбабве"
        }));
        contentPane.add(jComboBox5);
        jComboBox5.setBounds(30, 320, 210, 20);

        //---- jLabel8 ----
        jLabel8.setIcon(new ImageIcon(getClass().getResource("/go.jpg")));
        jLabel8.setText("jLabel8");
        jLabel8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jLabel8MouseClicked(e);
            }
        });
        contentPane.add(jLabel8);
        jLabel8.setBounds(90, 370, 80, 30);
        contentPane.add(jLabel6);
        jLabel6.setBounds(20, 60, 80, 20);

        //---- screen ----
        screen.setBorder(new EtchedBorder());
        screen.setOpaque(true);
        contentPane.add(screen);
        screen.setBounds(20, 80, 230, 340);

        //---- iphone ----
        iphone.setIcon(new ImageIcon(getClass().getResource("/0_00Love.jpg")));
        contentPane.add(iphone);
        iphone.setBounds(-130, 0, 390, 500);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked

String displayname,gender,dob,personalmessage,country;        
        
displayname=jTextField2.getText();
gender= ""+ jComboBox1.getSelectedItem();
dob=jComboBox4.getSelectedItem()+"/"+ jComboBox3.getSelectedItem()+"/"+ jComboBox2.getSelectedItem();
personalmessage=jTextField3.getText();
country=""+jComboBox5.getSelectedItem();


if (displayname.isEmpty() && gender.isEmpty() && dob.isEmpty() && personalmessage.isEmpty() && country.isEmpty())
    JOptionPane.showMessageDialog(this,"Заполните все поля");

 
else{
    
try{
Class.forName("java.sql.DriverManager");
// the part to edit 
Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/coursework", "Sara", "12345s");

Statement stmt3=(Statement) con.createStatement();
String query3="Select * from enterinfo where displayname='"+displayname+"';";
ResultSet rs3=stmt3.executeQuery(query3);
if(rs3.next()){JOptionPane.showMessageDialog(null,"Такой аккаунт уже существует!");}

else{
Statement stmt1=(Statement) con.createStatement();
String query1="INSERT INTO enterinfo VALUES('"+displayname+"','"+gender+"','"+dob+"','"+personalmessage+"','"+country+"',curdate(),'"+userid+"');";
stmt1.executeUpdate(query1);

Statement stmt2=(Statement) con.createStatement();
String query2=  "UPDATE registration set enterinfo=1 where userid='"+userid+"';";
stmt2.executeUpdate(query2);


 String info[]=new String[2];
 info[0]=username;
 info[1]=""+userid;
 onlinebuddy.main(info);
 this.setVisible(false);
con.close();
}
}



catch(Exception e){
JOptionPane.showMessageDialog(this,e.getMessage());

}// catch
}// if username and password not empty     

        
              
        
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        username=args[0];
        userid=args[1];
        
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new EnterInfo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JLabel jLabel2;
    private JLabel red;
    private JLabel green;
    private JLabel grey;
    private JLabel jLabel1;
    private JTextField jTextField2;
    private JLabel jLabel3;
    private JComboBox<String> jComboBox1;
    private JLabel jLabel4;
    private JComboBox<String> jComboBox3;
    private JComboBox<String> jComboBox4;
    private JComboBox<String> jComboBox2;
    private JLabel jLabel5;
    private JTextField jTextField3;
    private JLabel jLabel7;
    private JComboBox<String> jComboBox5;
    private JLabel jLabel8;
    private JLabel jLabel6;
    private JLabel screen;
    private JLabel iphone;
    // End of variables declaration//GEN-END:variables
}