package swe;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Table1 extends javax.swing.JFrame {

    JTable table;
    JButton button1;
    JButton button2;
    JButton button3;

    public static void main(String[] args) {
       
        // create JFrame and JTable
        JFrame frame = new JFrame("List of all Table");
         final JTable table = new JTable();
        Object[] columns = {"              ", "               "};
          final DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table.setModel(model);
        table.setBackground(Color.LIGHT_GRAY);
        table.setForeground(Color.black);
        Font font = new Font("", 1, 14);
        table.setFont(font);
        table.setRowHeight(30);
        JScrollPane pane = new JScrollPane(table);
        table.setTableHeader(null);
        pane.setBounds(50, 70, 500, 250);
        frame.add(pane);
        ImageIcon Create = new ImageIcon("C:\\Users\\COPY CENTER\\Documents\\NetBeansProject\\Swe\\src\\swe\\C.png");
        JButton button1 = new JButton(Create);
        button1.setIcon(Create);
        button1.setBounds(20, 10, 40, 40);
        ImageIcon delete = new ImageIcon("C:\\Users\\COPY CENTER\\Documents\\NetBeansProject\\Swe\\src\\swe\\delete.png");
        final JButton button2 = new JButton(delete);
        button2.setIcon(delete);
        button2.setBounds(450, 10, 50, 50);
        ImageIcon edit = new ImageIcon("C:\\Users\\COPY CENTER\\Documents\\NetBeansProject\\Swe\\src\\swe\\edit.png");
        JButton button3 = new JButton(edit);
        button3.setIcon(edit);
        button3.setBounds(500, 10, 50, 50);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AddTable add = new AddTable(table);
                add.setVisible(true);
                
            }
        });
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ea) {
                Edit_table edit = new Edit_table(table);
                edit.setVisible(true);
            }
        });
        button2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                //SHOW delete massage
                JDialog.setDefaultLookAndFeelDecorated(true);
    int response = JOptionPane.showConfirmDialog(null, "you are sure to delete this row", "Confirm",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    if (response == JOptionPane.NO_OPTION) {
      
    } else if (response == JOptionPane.YES_OPTION) {
        int i = table.getSelectedRow();
                if (i >= 0) {

                    model.removeRow(i);
                }
      
    } else if (response == JOptionPane.CLOSED_OPTION) {
      
    }

               
            }
        });
        JLabel label1 = new JLabel("add new table");
        label1.setBounds(70, 20, 100, 25);
        label1.setFont(font);
        frame.add(label1);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.setLayout(null);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}
