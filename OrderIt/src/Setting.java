import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Setting extends JFrame implements ActionListener
{
	JButton button_SetupWizard,button_General_setting,button_Users,button_Discount,button_Sync,button_Close;
	JFrame frame=new JFrame("Setting ");
	/*public static void main(String args[])
	{
		Setting s=new Setting();
	}*/
	public void Setting()
	{
		JPanel panel_Main=new JPanel();
		panel_Main.setBackground(Color.GRAY);
		
		JPanel panel_button=new JPanel();
		panel_button.setBackground(Color.GRAY);
		
		button_SetupWizard=new JButton("Setup Wizard");
		button_SetupWizard.setPreferredSize(new Dimension(105,140));
		button_SetupWizard.setBackground(Color.LIGHT_GRAY);
		button_SetupWizard.addActionListener((ActionListener) this);
		
		button_General_setting=new JButton("General Setting");
		button_General_setting.setPreferredSize(new Dimension(105,140));
		button_General_setting.setBackground(Color.LIGHT_GRAY);
		button_General_setting.addActionListener((ActionListener) this);

		
		button_Users=new JButton("Users");
		button_Users.setPreferredSize(new Dimension(105,140));
		button_Users.setBackground(Color.LIGHT_GRAY);
		button_Users.addActionListener((ActionListener) this);
		
		button_Sync=new JButton("Sync");
		button_Sync.setPreferredSize(new Dimension(105,140));
		button_Sync.setBackground(Color.LIGHT_GRAY);
		button_Sync.addActionListener((ActionListener) this);
		
		button_Discount=new JButton("Discount Settings");
		button_Discount.setPreferredSize(new Dimension(100,140));
		button_Discount.setBackground(Color.LIGHT_GRAY);
		button_Discount.addActionListener((ActionListener) this);
		
		panel_button.setLayout(new GridLayout(1,5,8,8));
		panel_button.add(button_SetupWizard);
		panel_button.add(button_General_setting);
		panel_button.add(button_Users);
		panel_button.add(button_Sync);
		panel_button.add(button_Discount);
		
		button_Close=new JButton("Close");
		button_Close.setPreferredSize(new Dimension(570,80));
		button_Close.setBackground(Color.LIGHT_GRAY);
		button_Close.addActionListener((ActionListener) this);
		
		panel_Main.add(panel_button);
		panel_Main.add(button_Close);
		
		frame.add(panel_Main);
		frame.setVisible(true);
		frame.setSize(600,280);
		frame.setLocation(350, 150);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==button_General_setting)
		{
			General_Setting gs = new General_Setting();
			gs.General_Setting();
		}
		if(ae.getSource()==button_Users)
		{
			User_List ul=new User_List();
			ul.User_List();		
		}
		if(ae.getSource()==button_Discount)
		{
			Discount_List dl=new Discount_List();
			dl.Discount_List();
		}
		if(ae.getSource()==button_Close)
		{
			 frame.dispose();
		}
		if(ae.getSource()==button_Sync)
		{
			
		}
		if(ae.getSource()==button_SetupWizard)
		{
			
		}
	}
	
	
}
