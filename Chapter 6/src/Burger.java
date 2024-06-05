import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Burger extends JButton {
    static JFrame idk = new JFrame();
    static JPanel whatamidoing = new JPanel();
    static JButton heheheheheheclickything = new JButton("Clicky");
    static JLabel wordythigny = new JLabel();
    public static int county = 0;
    public static void main(String[] args) {
        whatamidoing.setBorder(BorderFactory.createEmptyBorder(100, 200, -100, -100));

        idk.setSize(720,405);
        idk.setLayout(new GridLayout(10, 10));

        idk.add(whatamidoing, BorderLayout.CENTER);
        idk.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        idk.setTitle("Andrew Rogers");
        idk.pack();
        idk.setVisible(true);
        idk.add(heheheheheheclickything, CENTER);
        idk.add(wordythigny, CENTER);
        heheheheheheclickything.setPreferredSize(new Dimension(0, 0));
    
        
        heheheheheheclickything.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                double rand = (1920- 0) * Math.random() + 0;
                double rand2 = (1080 - 0) * Math.random() + 0;
                heheheheheheclickything.setLocation((int)rand, (int)rand2);;
                
                //throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
            
            
        });
    }

}
