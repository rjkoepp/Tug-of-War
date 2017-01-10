import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JButton;

public class FinalDriverRopeTug  {
    public static JFrame f = new JFrame();

      public FinalDriverRopeTug() {


        }
      
    public static void main (String args [])
    {

        f.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        f.setSize(800, 600);
        f.setResizable(false);
        f.setVisible(true);
        
        JLabel lblWelcomeToTug = new JLabel("Welcome to Tug of War, choose your poison");
        lblWelcomeToTug.setFont(new Font("Palatino Linotype", Font.BOLD, 16));
        lblWelcomeToTug.setHorizontalAlignment(SwingConstants.CENTER);
        lblWelcomeToTug.setBounds(208, 104, 366, 83);
        f.getContentPane().add(lblWelcomeToTug);
        
        JButton btnNewButton = new JButton("Versus Opponent\r\n");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                f.getContentPane().removeAll();
                Player_V_Player a = new Player_V_Player();
                f.getContentPane().add(a);
                f.setVisible(true);
            }
        });
        btnNewButton.setBounds(67, 268, 138, 25);
        f.getContentPane().add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("Versus Computer\r\n");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.getContentPane().removeAll();
                Player_VS_Comp PC = new Player_VS_Comp();
                f.getContentPane().add(PC);
                f.setVisible(true);
            }
        });
        
        btnNewButton_1.setBounds(574, 268, 138, 25);
        f.getContentPane().add(btnNewButton_1);

    }
    public static JFrame getFrame()
    {
        return f;
        
    }
}