import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;


public class About implements ActionListener
{
	JButton button_close;
	JFrame MainFrame=new JFrame("About");
	public static void main(String[] args) 
	{
		About a=new About();
	}
	public About()
	{
		JPanel panel_main=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		panel_main.setBackground(Color.GRAY);
		panel_main.setPreferredSize(new Dimension(330,250));
		
		JPanel panel_manager=new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel_manager.setBackground(Color.GRAY);
		panel_manager.setPreferredSize(new Dimension(200,180));
		
		String string_mail_id = "sanarashidshaikh@gmail.com";
		JLabel label_mail_id = new JLabel("<html><a href=\" " + string_mail_id+ "\">sanarashidshaikh@gmail.com</a></html>");
		label_mail_id.setPreferredSize(new Dimension(175,50));
		
		String string_websit = "http://www.orderit.com";
		JLabel label_website = new JLabel("<html><a href=\" " +string_websit+ "\">http://www.orderit.com</a></html>");
		
		ImageIcon image_logo= new ImageIcon("a.jpg");
		JLabel label_logo=new JLabel(image_logo);
		label_logo.setPreferredSize(new Dimension(120,165));
		
		button_close=new JButton("Close");
		button_close.setPreferredSize(new Dimension(100,50));
		button_close.addActionListener(this);
		
		JLabel label_version=new JLabel("version");
		label_version.setPreferredSize(new Dimension(100,50));
		JLabel label_manager=new JLabel("OderIT Manager");
	
		panel_manager.add(label_manager);
		panel_manager.add(label_version);
		panel_manager.add(label_mail_id);
		panel_manager.add(label_website);
		
		panel_main.add(panel_manager);
		panel_main.add(label_logo);
		panel_main.add(button_close);
		
		MainFrame.add(panel_main);
		MainFrame.setVisible(true);
		MainFrame.setSize(1000, 1000);
		MainFrame.pack();
		MainFrame.setLocation(450, 200);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button_close)
		{
			MainFrame.dispose();
		}
		
	}

}
