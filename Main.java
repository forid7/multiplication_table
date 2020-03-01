
package multiplication.table;

import javax.swing.JFrame;


public class Main {
    public static void main(String[] args) {
        MultiplicationTable frame = new MultiplicationTable();
        frame.setVisible(true);
        frame.setBounds(300, 20, 570, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Multiplication Table");
        frame.setResizable(true);
    }
}
