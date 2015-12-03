import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;


public class Backup_Restore
{

	public static void main(String[] args) 
	{
		
		JFrame MainFrame = new JFrame("Backup and Restore");

		JPanel panel_main = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		panel_main.setBackground(Color.GRAY);
		panel_main.setPreferredSize(new Dimension(460, 500));
		
		JPanel panel_backup_restore = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel_backup_restore.setBackground(Color.GRAY);
		panel_backup_restore.setPreferredSize(new Dimension(450, 250));
		panel_backup_restore.setBorder(new TitledBorder("Backup and Restore"));
		
		JButton button_cancel=new JButton("Cancel");
		button_cancel.setPreferredSize(new Dimension(100,50));
		button_cancel.setBackground(Color.LIGHT_GRAY);
		
		JButton button_backup=new JButton("Backup");
		button_backup.setPreferredSize(new Dimension(150,50));
		button_backup.setBackground(Color.LIGHT_GRAY);
		
		JButton button_Restore=new JButton("Restore");
		button_Restore.setPreferredSize(new Dimension(150,50));
		button_Restore.setBackground(Color.LIGHT_GRAY);
		
		panel_backup_restore.add(button_backup);
		panel_backup_restore.add(button_Restore);
		
		panel_main.add(panel_backup_restore);
		panel_main.add(button_cancel);
		
		MainFrame.add(panel_main);
		MainFrame.setVisible(true);
		MainFrame.setSize(500, 600);
		MainFrame.pack();

	}

}
