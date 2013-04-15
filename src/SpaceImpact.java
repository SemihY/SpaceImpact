

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class SpaceImpact extends JFrame implements Commons {

	private static final long serialVersionUID = 1L;
	private JMenuItem jmiRestart, jmiClose;
	public SpaceImpact()
    {
		JMenuBar jmb = new JMenuBar();
		
	  // Set menu bar to the applet
	   setJMenuBar(jmb);
	 
		 // Add menu "Operation" to menu bar
	   JMenu operationMenu = new JMenu("Restart");
	   operationMenu.setMnemonic('O');
	   jmb.add(operationMenu);
		 
		   // Add menu "Exit" to menu bar System.exit(0);
		    JMenu exitMenu = new JMenu("Exit");
		    exitMenu.setMnemonic('E');
		      jmb.add(exitMenu);
		      
		operationMenu.add(jmiRestart= new JMenuItem("Restart", 'R'));
		jmiRestart.addActionListener(new ActionListener() {
		      @Override
		      public void actionPerformed(ActionEvent e) {
		    	  new SpaceImpact();
		      }
		    });
		exitMenu.add(jmiClose = new JMenuItem("Close", 'C'));
		jmiClose.addActionListener(new ActionListener() {
		      @Override
		      public void actionPerformed(ActionEvent e) {
		        System.exit(1);
		      }
		    });
		  
		      
		      
        add(new Board());
        setTitle("SPACE IMPACT");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(BOARD_WIDTH, BOARD_HEIGTH);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }

    public static void main(String[] args) {
        new SpaceImpact();
    }
}
