package multiplication.table;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.TextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MultiplicationTable extends JFrame {

    private Container c;
    private JLabel imgLabel, textLabel;
    private JTextArea ta, ta1;
    private JTextField tf;
    private JButton Clear, view;
    private ImageIcon img;
    private Font f;
    private JScrollPane js;
    private Cursor cursor;

    MultiplicationTable() {
        initComponents();

    }

    public void initComponents() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
        f = new Font("Tahoma", Font.BOLD, 25);

        img = new ImageIcon(getClass().getResource("multi.png"));
        imgLabel = new JLabel(img);
        imgLabel.setBounds(20, 10, img.getIconWidth(), img.getIconHeight());
        c.add(imgLabel);

        textLabel = new JLabel("Enter Any Number:");
        textLabel.setBounds(20, 270, 250, 50);
        textLabel.setForeground(Color.magenta);
        textLabel.setFont(f);
        c.add(textLabel);

        tf = new JTextField();
        tf.setBounds(300, 270, 150, 50);
        tf.setHorizontalAlignment(JTextField.CENTER);
        tf.setBackground(Color.green);
        tf.setFont(f);
        c.add(tf);
        cursor = new Cursor(Cursor.HAND_CURSOR);
        view = new JButton("View");
        view.setBounds(150, 350, 100, 50);
        view.setCursor(cursor);
        c.add(view);

        Clear = new JButton("Clear");
        Clear.setBounds(270, 350, 100, 50);
        Clear.setCursor(cursor);
        c.add(Clear);

        ta1 = new JTextArea();
        ta1.setBounds(20, 400, 510, 500);
        ta1.setBackground(Color.green);
        ta1.setFont(f);
        //   c.add(ta1);

        js = new JScrollPane(ta1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        js.setBounds(20, 400, 510, 250);
        c.add(js);

        view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String value = tf.getText();
                if (value.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter a number");
                } else {
                    int num = Integer.parseInt(tf.getText());
                    for (int i = 1; i <= 10; i++) {
                        int result = num * i;

                        String r = String.valueOf(result);
                        String n = String.valueOf(num);
                        String incr = String.valueOf(i);

                        ta1.append(n + " X " + incr + " = " + r + "\n");
                    }
                }

            }
        });

        Clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta1.setText("");
                tf.setText("");
            }
        });

    }

    public static void main(String[] args) {
        MultiplicationTable frame = new MultiplicationTable();
        frame.setVisible(true);
        frame.setBounds(300, 20, 570, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Multiplication Table");
        frame.setResizable(true);
    }
}
