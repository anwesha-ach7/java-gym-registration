import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;

public class GymGUI implements ActionListener {

    private JFrame fr,fr1;
    private JPanel Panel1,Panel2, Panel3, Panel4, Panel5, Panel6,Panel11,Panel22,Panel33,Panel44,Panel55,Panel66;
    private JLabel  trainer,attendancetitle, attendancetitle1,title, id, name, location, phone, email, gender, dob, membershipstartdate,p1title, p2title, p3title, p4title,p5title, loyaltypoints,referralsource,activestatus, topay, paidamount, paydue, discount, plans, basic, standard, deluxe,removalreason,title1,id1,name1,location1,phone1,email1,gender1,dob1,membershipstartdate1,p11title,p22title,p33title,p44title,p55title,loyaltypoints1,referralsource1,activestatus1,topay1,paidamount1,paydue1,discount1,plans1,basic1,standard1,deluxe1,removalreason1;
    private JButton due,revert,revert1, discount11,upgrade,upgrade1 , activate,activate1,add,add1, save, cancel, clear,save1,cancel1,clear1,deactivate,deactivate1,attendance,attendance1,display,read,display1,read1;
    private JRadioButton male, female,male1,female1;
    private ButtonGroup bg,bg1;
    private JCheckBox status,status1;
    private JComboBox<Integer> day, year,cbday,cbday1,cbyear,cbyear1,dayy,yearr,cbdayy,cbdayy1,cbyearr,cbyearr1;
    private JComboBox<String> month, cbplan,cbmonth,cbmonth1,monthh,cbmonthh,cbmonthh1,cbplan1;
    private JTextField tf0,tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf9, tf10, tf11, tf12, tf13,tf14,tf15,tf16,tf17,tf18,tf19,tf20,tf21,tf22,tf23,tf24,tf25,tf26,tf27;
    private JTextArea ta1,ta2,ta3,ta4;

    public static void main(String[] args) {
        // ArrayList<GymMember> frame.getObj() = new ArrayList<>();
        new frame();
    }   

    public GymGUI(String type) {

        fr = new JFrame("Gym Registration for Regular Member");
        fr1= new JFrame("Gym Registration for Premium Member");

        //Frame size,visibility and layout for regular gui
        fr.setLayout(null);
        fr.setSize(820, 900);
        fr.getContentPane().setBackground(Color.WHITE);

        //Frame size,visibility and layout for premium gui
        fr1.setLayout(null);
        fr1.setSize(820, 900);
        fr1.getContentPane().setBackground(Color.WHITE);

        // Main Title for regular gui
        title = new JLabel("Gym Registration Details(Regular)");
        title.setFont(new Font("Arial", Font.BOLD, 22));
        title.setBounds(270, 15, 999, 30);
        fr.add(title);

        //Main Title for premium gui
        title1 = new JLabel("Gym Registration Details(Premium)");
        title1.setFont(new Font("Arial", Font.BOLD, 22));
        title1.setBounds(270, 15, 999, 30);
        fr1.add(title1);

        if (type.equals("Regular")) {
            fr.setVisible(true);
        } else if (type.equals("Premium")) {
            fr1.setVisible(true);
        }
        // Panel 1 - Customer Information
        Panel1 = new JPanel();
        Panel1.setLayout(null);
        Panel1.setVisible(true);
        Panel1.setBounds(8, 50, 790, 260);
        Panel1.setBackground(new Color(240, 248, 255));
        fr.add(Panel1);

        // Panel 1 - Customer Information
        Panel11 = new JPanel();
        Panel11.setLayout(null);
        Panel11.setVisible(true);
        Panel11.setBounds(8, 50, 790, 260);
        Panel11.setBackground(new Color(255, 255, 240));
        fr1.add(Panel11);

        // Panel1 Title
        p1title = new JLabel("1.Customer Information");
        p1title.setFont(new Font("Arial", Font.BOLD, 18));
        p1title.setBounds(7, 5, 250, 25);
        Panel1.add(p1title);

        p11title = new JLabel("1.Customer Information");
        p11title.setFont(new Font("Arial", Font.BOLD, 18));
        p11title.setBounds(7, 5, 250, 25);
        Panel11.add(p11title);

        // ID
        id = new JLabel("ID");
        id.setFont(new Font("Arial", Font.BOLD, 15));
        tf1 = new JTextField();
        id.setBounds(7, 55, 100, 15);
        tf1.setBounds(80, 53, 200, 20);
        Panel1.add(id);
        Panel1.add(tf1);

        id1 = new JLabel("ID");
        id1.setFont(new Font("Arial", Font.BOLD, 15));
        tf14 = new JTextField();
        id1.setBounds(7, 55, 100, 15);
        tf14.setBounds(80, 53, 200, 20);
        Panel11.add(id1);
        Panel11.add(tf14);

        // Name
        name = new JLabel("Name");
        name.setFont(new Font("Arial", Font.BOLD, 15));
        tf2 = new JTextField();
        name.setBounds(470, 55, 100, 15);
        tf2.setBounds(573, 53, 200, 20);
        Panel1.add(name);
        Panel1.add(tf2);

        name1 = new JLabel("Name");
        name1.setFont(new Font("Arial", Font.BOLD, 15));
        tf15 = new JTextField();
        name1.setBounds(470, 55, 100, 15);
        tf15.setBounds(573, 53, 200, 20);
        Panel11.add(name1);
        Panel11.add(tf15);

        // Location
        location = new JLabel("Location");
        location.setFont(new Font("Arial", Font.BOLD, 15));
        tf3 = new JTextField();
        location.setBounds(7, 100, 100, 15);
        tf3.setBounds(80, 98, 200, 20);
        Panel1.add(location);
        Panel1.add(tf3);

        location1 = new JLabel("Location");
        location1.setFont(new Font("Arial", Font.BOLD, 15));
        tf16 = new JTextField();
        location1.setBounds(7, 100, 100, 15);
        tf16.setBounds(80, 98, 200, 20);
        Panel11.add(location1);
        Panel11.add(tf16);

        // Phone
        phone = new JLabel("Phone");
        phone.setFont(new Font("Arial", Font.BOLD, 15));
        tf4 = new JTextField();
        phone.setBounds(470, 100, 100, 15);
        tf4.setBounds(573, 98, 200, 20);
        Panel1.add(phone);
        Panel1.add(tf4);

        phone1 = new JLabel("Phone");
        phone1.setFont(new Font("Arial", Font.BOLD, 15));
        tf17 = new JTextField();
        phone1.setBounds(470, 100, 100, 15);
        tf17.setBounds(573, 98, 200, 20);
        Panel11.add(phone1);
        Panel11.add(tf17);

        // Email
        email = new JLabel("Email");
        email.setFont(new Font("Arial", Font.BOLD, 15));
        tf5 = new JTextField();
        email.setBounds(7, 145, 100, 15);
        tf5.setBounds(80, 143, 200, 20);
        Panel1.add(email);
        Panel1.add(tf5);

        email1 = new JLabel("Email");
        email1.setFont(new Font("Arial", Font.BOLD, 15));
        tf18 = new JTextField();
        email1.setBounds(7, 145, 100, 15);
        tf18.setBounds(80, 143, 200, 20);
        Panel11.add(email1);
        Panel11.add(tf18);

        // Gender
        gender = new JLabel("Gender");
        gender.setFont(new Font("Arial", Font.BOLD, 15));
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);
        gender.setBounds(470, 145, 100, 15);
        male.setBounds(573, 143, 70, 20);
        female.setBounds(650, 143, 100, 20);
        Panel1.add(gender);
        Panel1.add(male);
        Panel1.add(female);

        gender1 = new JLabel("Gender");
        gender1.setFont(new Font("Arial", Font.BOLD, 15));
        male1 = new JRadioButton("Male");
        female1 = new JRadioButton("Female");
        bg1 = new ButtonGroup();
        bg1.add(male1);
        bg1.add(female1);
        gender1.setBounds(470, 145, 100, 15);
        male1.setBounds(573, 143, 70, 20);
        female1.setBounds(650, 143, 100, 20);
        Panel11.add(gender1);
        Panel11.add(male1);
        Panel11.add(female1);

        // DOB
        dob = new JLabel("DOB");
        dob.setFont(new Font("Arial", Font.BOLD, 15));
        Integer[] day = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
        Integer[] year = {2000, 2001, 2002, 2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019, 2020, 2021, 2022, 2023, 2024, 2025};
        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        cbday = new JComboBox<>(day);
        cbmonth = new JComboBox<>(month);
        cbyear = new JComboBox<>(year);
        dob.setBounds(7, 190, 100, 15); 
        cbday.setBounds(80, 188, 50, 19);
        cbmonth.setBounds(135, 188, 80, 19);
        cbyear.setBounds(220, 188, 60, 20);
        Panel1.add(dob);
        Panel1.add(cbday);
        Panel1.add(cbmonth);
        Panel1.add(cbyear);

        dob1 = new JLabel("DOB");
        dob1.setFont(new Font("Arial", Font.BOLD, 15));
        Integer[] dayy = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
        Integer[] yearr = {2000, 2001, 2002, 2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019, 2020, 2021, 2022, 2023, 2024, 2025};
        String[] monthh = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        cbdayy = new JComboBox<>(dayy);
        cbmonthh = new JComboBox<>(monthh);
        cbyearr = new JComboBox<>(yearr);
        dob1.setBounds(7, 190, 100, 15);
        cbdayy.setBounds(80, 188, 50, 19);
        cbmonthh.setBounds(135, 188, 80, 19);
        cbyearr.setBounds(220, 188, 60, 20);
        Panel11.add(dob1);
        Panel11.add(cbdayy);
        Panel11.add(cbmonthh);
        Panel11.add(cbyearr);

        // Membership Start Date
        membershipstartdate = new JLabel("Membership Start Date");
        membershipstartdate.setFont(new Font("Arial", Font.BOLD, 15));
        membershipstartdate.setBounds(370, 190, 200, 15);
        cbday1 = new JComboBox<>(day);
        cbmonth1 = new JComboBox<>(month);
        cbyear1 = new JComboBox<>(year);
        cbday1.setBounds(573, 188, 50, 20);
        cbmonth1.setBounds(628, 188, 80, 20);
        cbyear1.setBounds(713, 188, 60, 20);
        Panel1.add(membershipstartdate);
        Panel1.add(cbday1);
        Panel1.add(cbmonth1);
        Panel1.add(cbyear1);

        membershipstartdate1 = new JLabel("Membership Start Date");
        membershipstartdate1.setFont(new Font("Arial", Font.BOLD, 15));
        membershipstartdate1.setBounds(370, 190, 200, 15);
        cbdayy1 = new JComboBox<>(day);
        cbmonthh1 = new JComboBox<>(month);
        cbyearr1 = new JComboBox<>(year);
        cbdayy1.setBounds(573, 188, 50, 20);
        cbmonthh1.setBounds(628, 188, 80, 20);
        cbyearr1.setBounds(713, 188, 60, 20);
        Panel11.add(membershipstartdate1);
        Panel11.add(cbdayy1);
        Panel11.add(cbmonthh1);
        Panel11.add(cbyearr1);

        trainer = new JLabel("Trainer");
        trainer.setFont(new Font("Arial",Font.BOLD, 15));
        trainer.setBounds(7, 235, 100, 15);
        tf27 = new JTextField();
        tf27.setBounds(80, 235, 200, 20);
        Panel11.add(tf27);
        Panel11.add(trainer);

        //Add member button
        add = new JButton("Add Member");
        add.setBounds(320,235,200,18);
        Panel1.add(add);
        add.addActionListener(this);

        add1 = new JButton("Add Member");
        add1.setBounds(320,235,200,18);
        Panel11.add(add1);
        add1.addActionListener(this);

        //Add member button
        activate = new JButton("Activate Member");
        activate.setBounds(575,235,200,18);
        Panel1.add(activate);
        activate.addActionListener(this);

        activate1 = new JButton("Activate Member");
        activate1.setBounds(575,235,200,18);
        Panel11.add(activate1);
        activate1.addActionListener(this);

        //Panel 2 for account and loyalty infos    
        Panel2 = new JPanel();
        Panel2.setLayout(null);
        Panel2.setVisible(true);
        Panel2.setBounds(7, 330, 250, 300);
        Panel2.setBackground(new Color(240, 248, 255));
        fr.add(Panel2);

        Panel22 = new JPanel();
        Panel22.setLayout(null);
        Panel22.setVisible(true);
        Panel22.setBounds(7, 330, 250, 300);
        Panel22.setBackground(new Color(255, 255, 240));
        fr1.add(Panel22);

        //panel 2's title
        p2title = new JLabel("2.Account and Loyalty Info");
        p2title.setFont(new Font("Arial", Font.BOLD, 14));
        p2title.setBounds(7, 10, 200, 20);
        Panel2.add(p2title);

        p22title = new JLabel("2.Account and Loyalty Info");
        p22title.setFont(new Font("Arial", Font.BOLD, 14));
        p22title.setBounds(7, 10, 200, 20);
        Panel22.add(p22title);

        //Attendance
        attendancetitle = new JLabel("Mark Attendance");
        attendancetitle.setFont(new Font("Arial", Font.PLAIN, 13));
        attendancetitle.setBounds(7, 60, 100, 20);
        attendance = new JButton("Attendance");
        attendance.setBounds(110, 60, 120, 20);
        Panel2.add(attendance);
        Panel2.add(attendancetitle);
        attendance.addActionListener(this);

        attendancetitle1 = new JLabel("Mark Attendance");
        attendancetitle1.setFont(new Font("Arial", Font.PLAIN, 13));
        attendancetitle1.setBounds(7, 60, 100, 20);
        attendance1 = new JButton("Attendance");
        attendance1.setBounds(110, 60, 120, 20);
        Panel22.add(attendance1);
        Panel22.add(attendancetitle1);
        attendance1.addActionListener(this);

        //Loyalty points
        loyaltypoints = new JLabel("Loyalty Points");
        loyaltypoints.setFont(new Font("Arial", Font.PLAIN, 13));
        loyaltypoints.setBounds(7, 100, 100, 20);
        tf6 = new JTextField();
        tf6.setBounds(110, 100, 120, 20);
        tf6.setText(String.valueOf(0.0));
        Panel2.add(loyaltypoints);
        Panel2.add(tf6);

        loyaltypoints1 = new JLabel("Loyalty Points");
        loyaltypoints1.setFont(new Font("Arial", Font.PLAIN, 13));
        loyaltypoints1.setBounds(7, 100, 100, 20);
        tf19 = new JTextField();
        tf19.setBounds(110, 100, 120, 20);
        tf19.setText(String.valueOf(0.0));
        Panel22.add(loyaltypoints1);
        Panel22.add(tf19);

        //Referral Source
        referralsource = new JLabel("Referral Source");
        referralsource.setFont(new Font("Arial", Font.PLAIN, 13));
        referralsource.setBounds(7, 140, 100, 20);
        ta1 = new JTextArea();
        ta1.setBounds(7, 170, 223, 50);
        Panel2.add(referralsource);
        Panel2.add(ta1);

        referralsource1 = new JLabel("Referral Source");
        referralsource1.setFont(new Font("Arial", Font.PLAIN, 13));
        referralsource1.setBounds(7, 140, 100, 20);
        ta3 = new JTextArea();
        ta3.setBounds(7, 170, 223, 50);
        Panel22.add(referralsource1);
        Panel22.add(ta3);

        //Status (checkbox if active)
        status = new JCheckBox("Active Status");
        status.setFont(new Font("Arial", Font.PLAIN, 13));
        status.setBounds(7, 235, 200, 20);

        status1 = new JCheckBox("Active Status");
        status1.setFont(new Font("Arial", Font.PLAIN, 13));
        status1.setBounds(7, 235, 200, 20);

        // Panel 3
        Panel4 = new JPanel();
        Panel4.setLayout(null);
        Panel4.setVisible(true);
        Panel4.setBounds(267, 330, 250, 300);
        Panel4.setBackground(new Color(240, 248, 255));
        fr.add(Panel4);

        Panel33 = new JPanel();
        Panel33.setLayout(null);
        Panel33.setVisible(true);
        Panel33.setBounds(267, 330, 250, 300);
        Panel33.setBackground(new Color(255, 255, 240));
        fr1.add(Panel33);

        //Title of panel 3 
        p4title = new JLabel("4.Plan and Upgrade");
        p4title.setFont(new Font("Arial", Font.BOLD, 14));
        p4title.setBounds(7, 10, 200, 20);
        Panel4.add(p4title);

        p33title = new JLabel("3.Transaction and Payment");
        p33title.setFont(new Font("Arial", Font.BOLD, 14));
        p33title.setBounds(7, 10, 200, 20);
        Panel33.add(p33title);

        //Amount to be paid 
        plans = new JLabel("Plans:");
        plans.setFont(new Font("Arial", Font.PLAIN, 13));
        plans.setBounds(7, 60, 100, 20);
        Panel4.add(plans);

        topay1 = new JLabel("To Pay");
        topay1.setFont(new Font("Arial", Font.PLAIN, 13));
        topay1.setBounds(7, 60, 100, 20);
        tf20 = new JTextField();
        tf20.setEditable(false);
        tf20.setText("50000.0");
        tf20.setBounds(110, 60, 120, 20);
        Panel33.add(topay1);
        Panel33.add(tf20);

        //Paid Amount
        basic = new JLabel("Basic: Rs 6500");
        basic.setFont(new Font("Arial", Font.PLAIN, 13));
        basic.setBounds(120, 60, 150, 20);
        Panel4.add(basic);

        standard = new JLabel("Standard: Rs 12500");
        standard.setFont(new Font("Arial", Font.PLAIN, 13));
        standard.setBounds(120, 80, 150, 20);
        Panel4.add(standard);

        paidamount1 = new JLabel("Paid Amount");
        paidamount1.setFont(new Font("Arial", Font.PLAIN, 13));
        paidamount1.setBounds(7, 100, 100, 20);
        tf21 = new JTextField();
        tf21.setBounds(110, 100, 120, 20);
        Panel33.add(paidamount1);
        Panel33.add(tf21);

        //Pay due 
        deluxe = new JLabel("Deluxe: Rs 18500");
        deluxe.setFont(new Font("Arial", Font.PLAIN, 13));
        deluxe.setBounds(120, 100, 150, 20);
        Panel4.add(deluxe);

        paydue1 = new JLabel("Pay Due");
        paydue1.setFont(new Font("Arial", Font.PLAIN, 13));
        paydue1.setBounds(7, 140, 100, 20);
        Panel33.add(paydue1);

        due = new JButton("Pay Due");
        due.setBounds(110,140,120,20);
        Panel33.add(due);
        due.addActionListener(this);

        //Discount Amount(if)
        cbplan = new JComboBox<>(new String[]{"Basic", "Standard", "Deluxe"});
        cbplan.setBounds(120, 140, 90, 25);
        Panel4.add(cbplan);

        discount1 = new JLabel("Discount");
        discount1.setFont(new Font("Arial", Font.PLAIN, 13));
        discount1.setBounds(7, 180, 100, 20);
        tf23 = new JTextField();
        tf23.setBounds(110, 180, 115, 20);
        tf23.setEditable(false);
        Panel33.add(discount1);
        Panel33.add(tf23);

        discount11 = new JButton("Calculate Discount");
        discount11.setBounds(100,215,140,20);
        Panel33.add(discount11);
        discount11.addActionListener(this);

        upgrade = new JButton("Upgrade plan");
        upgrade.setBounds(100,180,130,20);
        Panel4.add(upgrade);
        upgrade.addActionListener(this);

        revert= new JButton("Revert Member");
        revert.setBounds(13,230,220,20);
        Panel4.add(revert);
        revert.addActionListener(this);

        // Panel 4
        Panel44 = new JPanel();
        Panel44.setLayout(null);
        Panel44.setVisible(true);
        Panel44.setBounds(527, 330, 270, 140);
        Panel44.setBackground(new Color(255, 255, 240));
        fr1.add(Panel44);

        //Title of panel 4    
        p44title = new JLabel("4.Plan and Upgrade");
        p44title.setFont(new Font("Arial", Font.BOLD, 14));
        p44title.setBounds(7, 10, 200, 20);
        Panel44.add(p44title);

        //Plans    
        plans1 = new JLabel("Plan:");
        plans1.setFont(new Font("Arial", Font.PLAIN, 13));
        plans1.setBounds(7, 35, 100, 20);
        Panel44.add(plans1);

        tf0 = new JTextField ();
        tf0.setBounds (110,35,100,20);
        Panel44.add(tf0);
        tf0.setEditable(false);
        tf0.setText("50000.0");

        revert1= new JButton("Revert Member");
        revert1.setBounds(13,80,220,20);
        Panel44.add(revert1);
        revert1.addActionListener(this);

        // Panel 5
        Panel5 = new JPanel();
        Panel5.setLayout(null);
        Panel5.setVisible(true);
        Panel5.setBounds(527, 330, 270, 300);
        Panel5.setBackground(new Color(240, 248, 255));
        fr.add(Panel5);

        Panel55 = new JPanel();
        Panel55.setLayout(null);
        Panel55.setVisible(true);
        Panel55.setBounds(527, 480, 270, 150);
        Panel55.setBackground(new Color(255, 255, 240));
        fr1.add(Panel55);

        //Title for panel 5
        p5title = new JLabel("5.Deactivation and Removal");
        p5title.setFont(new Font("Arial", Font.BOLD, 14));
        p5title.setBounds(7, 10, 270, 20);
        Panel5.add(p5title);

        p55title = new JLabel("5.Deactivation and Removal");
        p55title.setFont(new Font("Arial", Font.BOLD, 14));
        p55title.setBounds(7, 10, 270, 20);
        Panel55.add(p55title);

        //Deactivation 
        deactivate = new JButton("Deactivate");
        deactivate.setBounds(7, 60, 255, 20);
        Panel5.add(deactivate);
        deactivate.addActionListener(this);

        deactivate1 = new JButton("Deactivate");
        deactivate1.setBounds(7, 35, 255, 20);
        Panel55.add(deactivate1);
        deactivate1.addActionListener(this);

        //Removal Reason
        removalreason = new JLabel("Removal Reason");
        removalreason.setFont(new Font("Arial", Font.PLAIN, 13));
        removalreason.setBounds(7, 100, 150, 20);
        ta2 = new JTextArea();
        ta2.setBounds(7, 130, 250, 70);
        Panel5.add(removalreason);
        Panel5.add(ta2);

        removalreason1 = new JLabel("Removal Reason");
        removalreason1.setFont(new Font("Arial", Font.PLAIN, 13));
        removalreason1.setBounds(7, 60, 150, 20);
        ta4 = new JTextArea();
        ta4.setBounds(7, 85, 250, 50);
        Panel5.add(removalreason1);
        Panel55.add(ta4);
        ;
        //Panel 6
        Panel6 = new JPanel();
        Panel6.setLayout(null);
        Panel6.setVisible(true);
        Panel6.setBounds(10, 650, 790, 60);
        Panel6.setBackground(Color.WHITE);
        fr.add(Panel6);

        Panel66 = new JPanel();
        Panel66.setLayout(null);
        Panel66.setVisible(true);
        Panel66.setBounds(10, 650, 790, 60);
        Panel66.setBackground(Color.WHITE);
        fr1.add(Panel66);

        //Display button
        display = new JButton("Display");
        display.setBounds(130,15,80,30);
        Panel6.add(display);
        display.addActionListener(this);

        display1 = new JButton("Display");
        display1.setBounds(130,15,80,30);
        Panel66.add(display1); 
        display1.addActionListener(this);

        //Clear button
        clear = new JButton("Clear");
        clear.setBounds(240, 15, 80, 30);
        Panel6.add(clear);
        clear.addActionListener(this);

        clear1 = new JButton("Clear");
        clear1.setBounds(240, 15, 80, 30);
        Panel66.add(clear1); 
        clear1.addActionListener(this);

        //Save button
        save = new JButton("Save");
        save.setBounds(350, 15, 80, 30);
        Panel6.add(save);
        save.addActionListener(this);

        save1 = new JButton("Save");
        save1.setBounds(350, 15, 80, 30);
        Panel66.add(save1);
        save1.addActionListener(this);

        //Cancel button
        cancel = new JButton("Back");
        cancel.setBounds(460, 15, 80, 30);
        Panel6.add(cancel);
        cancel.addActionListener(this);

        cancel1 = new JButton("Back");
        cancel1.setBounds(460, 15, 80, 30);
        Panel66.add(cancel1);
        cancel1.addActionListener(this);

        //read button 
        read = new JButton("Read");
        read.setBounds(570, 15, 80, 30);
        Panel6.add(read);
        read.addActionListener(this);

        read1 = new JButton("Read");
        read1.setBounds(570, 15, 80, 30);
        Panel66.add(read1);
        read1.addActionListener(this);

    }    

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            //Add Button
            if (ae.getSource() == add) {
                System.out.println("Add button clicked for Regular Member!");

                // Validate ID field
                String idText = tf1.getText().trim();
                if (idText.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid numeric ID.");
                    return;
                }

                int id;
                try {
                    id = Integer.parseInt(idText);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid numeric ID.");
                    return;
                }
                System.out.println(id+"    "+"  "+frame.getObj().size());
                // Check if ID already exists
                boolean idExists = false;
                for (GymMember member : frame.getObj()) {
                    if (member.getId() == id) {
                        System.out.println(id+"    "+member.getId()+"  "+frame.getObj().size());
                        idExists = true;
                        JOptionPane.showMessageDialog(null, "Member ID already exists. Please use a unique ID.");
                        break;
                    }
                }

                if (idExists==true) {
                    return; // Exit if ID exists
                }
                else
                {

                    // Gather and validate other fields
                    String name = tf2.getText().trim();
                    String location = tf3.getText().trim();
                    String phone = tf4.getText().trim();
                    String email = tf5.getText().trim();
                    String loyaltyText = tf6.getText().trim();

                    int phoneNo;
                    try {
                        phoneNo = Integer.parseInt(phone);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Please enter a valid numeric ID in Phone Number.");
                        return;
                    }

                    if (name.isEmpty() || location.isEmpty() || phone.isEmpty() || email.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Please fill in all fields.");
                        return;
                    }

                    if (!email.contains("@")) {
                        JOptionPane.showMessageDialog(null, "Please enter a valid email address containing '@'.");
                        return;
                    }

                    double loyaltypoints = Double.parseDouble(loyaltyText);

                    String day = cbday.getSelectedItem().toString();
                    String month = cbmonth.getSelectedItem().toString();
                    String year = cbyear.getSelectedItem().toString();
                    String dob = day + "/" + month + "/" + year;

                    String day1 = cbday1.getSelectedItem().toString();
                    String month1 = cbmonth1.getSelectedItem().toString();
                    String year1 = cbyear1.getSelectedItem().toString();
                    String membershipstartdate = day1 + "/" + month1 + "/" + year1;

                    String gender = "";
                    if (male.isSelected()) {
                        gender = "Male";
                    } else if (female.isSelected()) {
                        gender = "Female";
                    } else {
                        JOptionPane.showMessageDialog(null, "Please select gender.");
                        return;
                    }

                    boolean isActive = status.isSelected();

                    RegularMember GymMember = new RegularMember(
                            id, name, location, phone, email, gender, dob, membershipstartdate,
                            ta1.getText().trim(), loyaltypoints, isActive
                        );

                    frame.getObj().add(GymMember);
                    JOptionPane.showMessageDialog(null, "Regular member added successfully!");
                }
            } 
            //To activate membership (calling activateMembership();)
            else  if (ae.getSource() == activate) {
                System.out.println("Activate Membership button clicked.");
                int id = Integer.parseInt(tf1.getText());
                boolean idExists = false;
                for (GymMember member : frame.getObj()) {
                    if (member.getId() == id) {
                        member.activateMembership(); // Call the method to activate membership
                        JOptionPane.showMessageDialog(null, "Membership activated for Member ID: " + id);
                        idExists = true; 
                        break;
                    }
                }

                if (idExists==false) {
                    JOptionPane.showMessageDialog(null, "Member ID not found.");
                }
            }
            //To deactivate membership (calling activateMembership();)
            else  if (ae.getSource() == deactivate) {
                System.out.println("Dectivate Membership button clicked.");
                int id = Integer.parseInt(tf1.getText());
                boolean idExists = false;
                for (GymMember member : frame.getObj()) {
                    if (member.getId() == id) {
                        if (member.getActiveStatus()) {
                            member.deactivateMembership(); // Call the method to deactivate membership
                            JOptionPane.showMessageDialog(null, "Membership deactivated for Member ID: " + id);
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Membership is not active.Can't Deactivate.");
                        }
                        idExists = true; 
                        break;
                    }
                }

                if (idExists==false) {
                    JOptionPane.showMessageDialog(null, "Member ID not found.");
                }
            }

            //To upgrade 
            else if (ae.getSource() == upgrade) {
                String selectedPlan = ((String) cbplan.getSelectedItem()).toLowerCase(); // Convert to lowercase
                int id = Integer.parseInt(tf1.getText());
                boolean idExists = false;
                for (GymMember member : frame.getObj()) {
                    if (member.getId() == id) { 
                        if (member.getActiveStatus()) { // Checking if the member is active
                            RegularMember regularMember = (RegularMember) member; // Cast to RegularMember
                            String upgradeMessage = regularMember.upgradePlan(selectedPlan); // Capture the message
                            JOptionPane.showMessageDialog(null, upgradeMessage); // Display the message
                        } else {
                            JOptionPane.showMessageDialog(null, "Membership is not active. Cannot upgrade plan.");
                        }
                        idExists = true; 
                        break; 
                    }
                }

                if (!idExists) {
                    JOptionPane.showMessageDialog(null, "Member ID not found.");
                }
            }

            //Marking attendence by calling markAttendance
            else if (ae.getSource() == attendance) {
                System.out.println("Attendance button is clicked ");
                int id = Integer.parseInt(tf1.getText());
                boolean idExists = false;
                for (GymMember member : frame.getObj()) {
                    if (member.getId() == id) {
                        if (member.getActiveStatus()==true) {
                            member.markAttendance(); // Call the appropriate method based on the actual frame.getObj()ect type
                            tf6.setText(String.valueOf(member.getloyaltyPoints()));
                            JOptionPane.showMessageDialog(null, "Attendance marked!");
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Membership is not active.Can't mark Attendance.");
                        }
                        idExists = true; 
                        break;
                    }
                }

                if (idExists==false) {
                    JOptionPane.showMessageDialog(null, "Member ID not found.");
                }
            }

            //Reverting member
            else if (ae.getSource() == revert) {
                System.out.println("Revert button clicked.");
                int id = Integer.parseInt(tf1.getText());
                boolean idExists = false;
                for (GymMember member : frame.getObj()) {
                    if (member.getId() == id) {
                        if (member instanceof RegularMember) { // Check for RegularMember
                            RegularMember regularMember = (RegularMember) member; // Cast to RegularMember
                            regularMember.revertRegularMember(ta2.getText().trim()); // Pass removal reason
                            JOptionPane.showMessageDialog(null, "Member reverted successfully for ID: " + id);
                            idExists = true; 
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "This member is not a Regular Member.");
                        }
                    }
                }

                if (idExists==false) {
                    JOptionPane.showMessageDialog(null, "Member ID not found.");
                }
            }
            else if (ae.getSource() == display) {
                fr.dispose();
                new displayFrame(frame.getObj(),"Regular"); // Open the display frame and pass the frame.getObj() ArrayList
            }
            else if (ae.getSource() == save){
                File f = new File("MemberDetails.txt");
                try{
                    FileWriter w = new FileWriter(f); // creating a filewriter to write text into the file

                    for(GymMember member : frame.getObj()){

                        w.write(member.toString()+"\n");
                        w.write("\n");
                    }
                    JOptionPane.showMessageDialog(null, "Member details saved successfully!");

                    w.close();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "An error occurred while saving.");

                }
            }

            else if (ae.getSource() == read){
                fr.dispose();
                new readFrame("Regular");
            }

            else if (ae.getSource() == display1) {
                fr1.dispose();
                new displayFrame(frame.getObj(),"Premium"); // Open the     frame and pass the frame.getObj() ArrayList
            }

        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter valid numeric values.");
            e.printStackTrace();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Something went wrong. Please check inputs.");
            e.printStackTrace();
        }

        try {
            if (ae.getSource() == add1) {
                System.out.println("Add button clicked for Regular Member!");

                // Validate ID field
                String idText1 = tf14.getText().trim();
                if (idText1.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid numeric ID.");
                    return;
                }

                int id;
                try {
                    id = Integer.parseInt(idText1);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid numeric ID.");
                    return;
                }

                // Check if ID already exists
                boolean idExists = false;
                for (GymMember member : frame.getObj()) {
                    if (member.getId() == id) {

                        idExists = true;
                        JOptionPane.showMessageDialog(null, "Member ID already exists. Please use a unique ID.");
                        break;
                    }
                }

                if (idExists) {
                    return; // Exit if ID exists
                }
                else{
                    // Gather and validate other fields

                    String name1 = tf15.getText().trim();
                    String location1 = tf16.getText().trim();
                    String phone1 = tf17.getText().trim();
                    String email1 = tf18.getText().trim();
                    String loyaltyText1 = tf19.getText().trim();
                    String trainer = tf27.getText().trim();

                    int phoneNo1;
                    try {
                        phoneNo1 = Integer.parseInt(phone1);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Please enter a valid numeric ID in Phone Number.");
                        return;
                    }

                    if (name1.isEmpty() || location1.isEmpty() || phone1.isEmpty() || email1.isEmpty() || trainer.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Please fill in all fields.");
                        return;
                    }
                    if (!email1.contains("@")) {
                        JOptionPane.showMessageDialog(null, "Please enter a valid email address containing '@'.");
                        return;
                    }

                    double loyaltypoints1 = Double.parseDouble(loyaltyText1);
                    String dayy = cbdayy.getSelectedItem().toString();
                    String monthh = cbmonthh.getSelectedItem().toString();
                    String yearr = cbyearr.getSelectedItem().toString();
                    String dob1 = dayy + "/" + monthh + "/" + yearr;

                    String dayy1 = cbdayy1.getSelectedItem().toString();
                    String monthh1 = cbmonthh1.getSelectedItem().toString();
                    String yearr1 = cbyearr1.getSelectedItem().toString();
                    String membershipstartdate1 = dayy1 + "/" + monthh1 + "/" + yearr1;

                    String gender1 = "";
                    if (male1.isSelected()) {
                        gender1 = "Male";
                    } else if (female1.isSelected()) {
                        gender1 = "Female";
                    } else {
                        JOptionPane.showMessageDialog(null, "Please select gender.");
                        return;
                    }

                    boolean isActive1 = status.isSelected();
                    PremiumMember GymMember = new PremiumMember(
                            id, name1, location1, phone1, email1, gender1, dob1, membershipstartdate1,
                            ta3.getText().trim(), loyaltypoints1, isActive1);

                    frame.getObj().add(GymMember);
                    JOptionPane.showMessageDialog(null, "Premium member added successfully!");
                }   
            }

            //To activate membership (calling activateMembership();)
            else  if (ae.getSource() == activate1) {
                System.out.println("Activate Membership button clicked.");
                int id = Integer.parseInt(tf14.getText());
                boolean idExists = false;
                for (GymMember member : frame.getObj()) {
                    if (member.getId() == id) {
                        member.activateMembership(); // Call the method to activate membership
                        JOptionPane.showMessageDialog(null, "Membership activated for Member ID: " + id);
                        idExists = true; 
                        break;
                    }
                }

                if (idExists==false) {
                    JOptionPane.showMessageDialog(null, "Member ID not found.");
                }
            }
            //To deactivate membership (calling activateMembership();)
            else  if (ae.getSource() == deactivate1) {
                System.out.println("Dectivate Membership button clicked.");
                int id = Integer.parseInt(tf14.getText());
                boolean idExists = false;
                for (GymMember member : frame.getObj()) {
                    if (member.getId() == id) {
                        if (member.getActiveStatus()) {
                            member.deactivateMembership(); // Call the method to deactivate membership
                            JOptionPane.showMessageDialog(null, "Membership deactivated for Member ID: " + id);
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Membership is not active.Can't Deactivate.");
                        }
                        idExists = true; 
                        break;
                    }
                }

                if (idExists==false) {
                    JOptionPane.showMessageDialog(null, "Member ID not found.");
                }
            }
            //Due amount to be paid 
            else if (ae.getSource()==due){
                int id = Integer.parseInt(tf14.getText());
                boolean idExists = false;
                double paidAmount=Double.parseDouble(tf21.getText().trim());
                for (GymMember member : frame.getObj()) {
                    if (member.getId() == id) {
                        if(member.getActiveStatus()==true){
                            idExists = true;

                            if (member instanceof PremiumMember) {
                                PremiumMember premiumMember = (PremiumMember) member;
                                String message = premiumMember.payDueAmount(paidAmount);  // Get the returned message
                                JOptionPane.showMessageDialog(null, message);             // Show that message

                            } else {
                                JOptionPane.showMessageDialog(null, "This member is not a Premium Member.");
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Membership is not active.Can't mark Attendance.");
                        }
                        break;

                    }

                }
                if (idExists==false) {
                    JOptionPane.showMessageDialog(null, "Member ID not found.");
                }

            } 

            //Discount amount 
            else if (ae.getSource()==discount11){
                int id = Integer.parseInt(tf14.getText());
                boolean idExists = false;
                for (GymMember member : frame.getObj()) {
                    if (member.getId() == id) {
                        if(member.getActiveStatus()==true){

                            idExists = true;

                            if (member instanceof PremiumMember) {
                                PremiumMember premiumMember = (PremiumMember) member;
                                String message = premiumMember.calculateDiscount();
                                premiumMember.calculateDiscount();
                                tf23.setText(String.valueOf(premiumMember.getDiscountAmount()));
                                JOptionPane.showMessageDialog(null, message);
                            } else {
                                JOptionPane.showMessageDialog(null, "This member is not a Premium Member.");
                            }

                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Membership is not active.Can't calculate Discount.");
                        }
                        break;
                    }
                }
                if (idExists==false) {
                    JOptionPane.showMessageDialog(null, "Member ID not found.");
                }

            } 
            else if (ae.getSource() == revert1) {
                System.out.println("Revert button clicked.");
                int id = Integer.parseInt(tf14.getText());
                boolean idExists = false;
                for (GymMember member : frame.getObj()) {
                    if (member.getId() == id) {
                        if (member instanceof PremiumMember) { // Check for RegularMember
                            PremiumMember premiumMember = (PremiumMember) member; // Cast to RegularMember
                            premiumMember.revertPremiumMember(ta4.getText().trim()); // Pass removal reason
                            JOptionPane.showMessageDialog(null, "Member reverted successfully for ID: " + id);
                            idExists = true; 
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "This member is not a Regular Member.");
                        }
                    }
                }

                if (idExists==false) {
                    JOptionPane.showMessageDialog(null, "Member ID not found.");
                }
            }
            else if (ae.getSource() == save1){
                File f = new File("MemberDetails.txt");
                try{
                    FileWriter w = new FileWriter(f); // creating a filewriter to write text into the file

                    for(GymMember member : frame.getObj()){
                        w.write("______________________________________________________________________________________________________________________________________________________________________________________________________________");    

                        w.write(member.toString()+"\n");

                        w.write("______________________________________________________________________________________________________________________________________________________________________________________________________________");
                        w.write("\n");
                    }
                    JOptionPane.showMessageDialog(null, "Member details saved successfully!");

                    w.close();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "An error occurred while saving.");

                }
            }

            else if (ae.getSource() == read1){
                fr1.dispose();
                new readFrame("Premium");
            }
            else if (ae.getSource() == attendance1) {
                System.out.println("Attendance button is clicked ");
                String idText1 = tf14.getText().trim();
                if (idText1.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid numeric ID.");
                    return;
                }

                int id;
                try {
                    id = Integer.parseInt(idText1);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid numeric ID.");
                    return;
                }

                boolean idExists = false;
                for (GymMember member : frame.getObj()) {
                    if (member.getId() == id) {                    
                        if (member.getActiveStatus()) {
                            member.markAttendance(); // Call the appropriate method based on the actual frame.getObj()ect type
                            tf19.setText(String.valueOf(member.getloyaltyPoints()));
                            JOptionPane.showMessageDialog(null, "Attendance marked!");
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Membership is not active.Can't mark Attendance.");
                        }
                        idExists = true; // Set flag to true if ID is found
                        break;
                    }
                }

                if (idExists==false) {
                    JOptionPane.showMessageDialog(null, "Member ID not found.");
                }

            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter valid numeric values.");
            e.printStackTrace();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Something went wrong. Please check inputs.");
            e.printStackTrace();
        }

        if (ae.getSource() == clear) {
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
            tf4.setText("");
            tf5.setText("");
            tf6.setText("");
            tf7.setText("");
            tf8.setText("");
            tf9.setText("");
            tf10.setText("");
            ta1.setText("");
            ta2.setText("");
            bg.clearSelection();
            cbday.setSelectedIndex(0);
            cbmonth.setSelectedIndex(0);
            cbyear.setSelectedIndex(0);
            cbday1.setSelectedIndex(0);
            cbmonth1.setSelectedIndex(0);
            cbyear1.setSelectedIndex(0);
            cbplan.setSelectedIndex(0);
            status.setSelected(false);
            System.out.println("Clicked");
        }

        else if (ae.getSource() == clear1) {
            tf14.setText("");
            tf15.setText("");
            tf16.setText("");
            tf17.setText("");
            tf18.setText("");
            tf19.setText("");
            tf20.setText("");
            tf21.setText("");
            tf22.setText("");
            tf23.setText("");
            tf24.setText("");
            tf25.setText("");
            tf26.setText("");
            tf27.setText("");
            ta3.setText("");
            ta4.setText("");
            bg1.clearSelection();
            cbdayy.setSelectedIndex(0);
            cbmonthh.setSelectedIndex(0);
            cbyearr.setSelectedIndex(0);
            cbdayy1.setSelectedIndex(0);
            cbmonthh1.setSelectedIndex(0);
            cbyearr1.setSelectedIndex(0);
            cbplan1.setSelectedIndex(0);
            status1.setSelected(false);
        }

        else if (ae.getSource() == cancel) {
            fr.dispose();
            new frame();
        }

        else if (ae.getSource() == cancel1) {
            fr1.dispose();
            new frame();
        }
    }
}
class readFrame implements ActionListener{
    private JFrame rframe;
    private JLabel rtitle;
    private JTextArea rtextArea;
    private JButton back;
    private String type;
    public readFrame(String type){
        this.type=type;
        rframe = new JFrame("Member Details");
        rframe.setSize(700, 700);
        rframe.setLayout(null);
        rframe.getContentPane().setBackground(Color.WHITE);
        rframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        rtitle = new JLabel("Reading from File");
        rtitle.setFont(new Font("Arial", Font.BOLD, 18));
        rtitle.setBounds(270, 20, 400, 20);
        rframe.add(rtitle);

        rtextArea = new JTextArea();
        rtextArea.setBounds(20, 60, 650, 600);
        rtextArea.setEditable(false);

        back = new JButton("Back");
        back.addActionListener(this);
        back.setBounds(570, 620, 80, 30);
        back.setBackground(new Color(255, 240, 245)); // RGB for light pink
        rframe.add(back);
        rframe.add(rtextArea);

        rframe.getContentPane().setBackground(new Color(255, 240, 245));
        rtextArea.setBackground(new Color(255, 248, 250));
        try {
            BufferedReader r = new BufferedReader(new FileReader("MemberDetails.txt"));
            String line;
            while ((line = r.readLine()) != null) {
                rtextArea.append(line + "\n");

            }

            r.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rframe, "Error reading file: " + e.getMessage());
        }

        rframe.setVisible(true);
    } 

    public void actionPerformed (ActionEvent e){
        if(e.getSource()==back){
            rframe.dispose();
            if (type.equals("Regular")) {
                new GymGUI("Regular");
            } else if (type.equals("Premium")) {
                new GymGUI("Premium"); 
            }
        }
    }
}
class displayFrame implements ActionListener{

    private JFrame dframe;
    private JLabel dtitle;
    private JTextArea textArea;
    private ArrayList <GymMember> members;
    private JButton back;
    private String type; 

    public displayFrame(ArrayList<GymMember> members,String type) {
        this.members = members;
        this.type=type;
        dframe = new JFrame("Member Details");
        dframe.setSize(700, 700);
        dframe.setLayout(null);

        dtitle = new JLabel("Displaying member details");
        dtitle.setFont(new Font("Arial", Font.BOLD, 18));
        dtitle.setBounds(200, 20, 400, 20);
        dframe.add(dtitle);

        textArea = new JTextArea();
        textArea.setBounds(20, 60, 650, 600);
        textArea.setEditable(false);

        back = new JButton("Back");
        back.addActionListener(this);
        back.setBounds(570, 620, 80, 30);
        back.setBackground(new Color(255, 240, 245)); // RGB for light pink
        dframe.add(back);
        dframe.add(textArea);

        dframe.getContentPane().setBackground(new Color(255, 240, 245));
        textArea.setBackground(new Color(255, 248, 250));

        ArrayList<String> memberDetails = new ArrayList<>();
        for (GymMember member : members) {
            memberDetails.add(member.toString()); //  GymMember's toString() method
        }

        // Join the details and set to text area
        String details = String.join("\n\n\n\n", memberDetails);
        textArea.setText(details);

        dframe.setVisible(true);
    }

    @Override 
    public void actionPerformed (ActionEvent e){
        if(e.getSource()==back){
            dframe.dispose();
            if (type.equals("Regular")) {
                new GymGUI("Regular");
            } else if (type.equals("Premium")) {
                new GymGUI("Premium"); 
            }
        }
    }
}

class frame implements ActionListener {
    private static ArrayList <GymMember> obj=new ArrayList<>();;
    private JFrame frame;
    private JLabel frtitle;
    private JButton RegularMember,PremiumMember;
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == RegularMember) {
            frame.dispose(); // Close current window
            new GymGUI("Regular"); 
        } else if (e.getSource() == PremiumMember) {
            frame.dispose();
            new GymGUI("Premium"); 
        }
    }
    // Static method to provide access to the shared ArrayList of GymMember objects
    public static ArrayList<GymMember> getObj()
    {
        // This method returns that list so it can be accessed from other classes.
        return obj;
    }

    public frame(){
        frame = new JFrame("Frame");

        frtitle = new JLabel("Which one do you want to sign up for?");
        frtitle.setBounds(85,100,500,20);
        frame.add(frtitle);

        RegularMember = new JButton("RegularMember");RegularMember.setBounds(90,140,200,30);
        frame.add(RegularMember);
        RegularMember.addActionListener(this);

        PremiumMember = new JButton("PremiumMember");
        PremiumMember.setBounds(90,180,200,30);
        frame.add(PremiumMember);
        PremiumMember.addActionListener(this);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(400, 400);
        frame.getContentPane().setBackground(Color.WHITE);

    }

}
