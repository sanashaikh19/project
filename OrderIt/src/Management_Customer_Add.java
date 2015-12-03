import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Management_Customer_Add extends JFrame 
{
	public void Management_Customer_Add() 
	{
		final JFrame frame=new JFrame("Customer");	
		JPanel Jpanel_MasterPage_ManagementMenu_Customer_Add_Mainpanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		Jpanel_MasterPage_ManagementMenu_Customer_Add_Mainpanel.setBackground(Color.GRAY);
		
		JPanel Jpanel_MasterPage_ManagementMenu_Customer_Add_Categorypanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		Jpanel_MasterPage_ManagementMenu_Customer_Add_Categorypanel.setBackground(Color.GRAY);
		Jpanel_MasterPage_ManagementMenu_Customer_Add_Categorypanel.setPreferredSize(new Dimension(350,240));
		
		JLabel JLabel_MasterPage_ManagementMenu_Customer_Add_Categorypanel_NameLabel=new JLabel("Name");
		JLabel_MasterPage_ManagementMenu_Customer_Add_Categorypanel_NameLabel.setPreferredSize(new Dimension(90,30));
		JTextField JTextField_MasterPage_ManagementMenu_Customer_Add_Categorypanel_NameTextF=new JTextField();
		JTextField_MasterPage_ManagementMenu_Customer_Add_Categorypanel_NameTextF.setPreferredSize(new Dimension(220,25));
		
		JLabel JLabel_MasterPage_ManagementMenu_Customer_Add_Categorypanel_PhoneLabel=new JLabel("Phone");
		JLabel_MasterPage_ManagementMenu_Customer_Add_Categorypanel_PhoneLabel.setPreferredSize(new Dimension(90,30));
		JTextField JTextField_MasterPage_ManagementMenu_Customer_Add_Categorypanel_PhoneTextF=new JTextField();
		JTextField_MasterPage_ManagementMenu_Customer_Add_Categorypanel_PhoneTextF.setPreferredSize(new Dimension(220,25));
		
		JLabel JLabel_MasterPage_ManagementMenu_Customer_Add_Categorypanel_PostalCodeLabel=new JLabel("Postal Code");
		JLabel_MasterPage_ManagementMenu_Customer_Add_Categorypanel_PostalCodeLabel.setPreferredSize(new Dimension(90,30));
		JTextField JTextField_MasterPage_ManagementMenu_Customer_Add_Categorypanel_PostalCodeTextF=new JTextField();
		JTextField_MasterPage_ManagementMenu_Customer_Add_Categorypanel_PostalCodeTextF.setPreferredSize(new Dimension(220,25));
		
		JLabel JLabel_MasterPage_ManagementMenu_Customer_Add_Categorypanel_EmailLabel=new JLabel("Email");
		JLabel_MasterPage_ManagementMenu_Customer_Add_Categorypanel_EmailLabel.setPreferredSize(new Dimension(90,30));
		JTextField JTextField_MasterPage_ManagementMenu_Customer_Add_Categorypanel_EmailTextF=new JTextField();
		JTextField_MasterPage_ManagementMenu_Customer_Add_Categorypanel_EmailTextF.setPreferredSize(new Dimension(220,25));
		
		JLabel JLabel_MasterPage_ManagementMenu_Customer_Add_Categorypanel_AddressLabel=new JLabel("Address");
		JLabel_MasterPage_ManagementMenu_Customer_Add_Categorypanel_AddressLabel.setPreferredSize(new Dimension(90,30));
		JTextArea JTextArea_MasterPage_ManagementMenu_Customer_Add_Categorypanel_AddressTextA=new JTextArea();
		JTextArea_MasterPage_ManagementMenu_Customer_Add_Categorypanel_AddressTextA.setPreferredSize(new Dimension(220,80));
		
		
		Jpanel_MasterPage_ManagementMenu_Customer_Add_Categorypanel.add(JLabel_MasterPage_ManagementMenu_Customer_Add_Categorypanel_NameLabel);
		Jpanel_MasterPage_ManagementMenu_Customer_Add_Categorypanel.add(JTextField_MasterPage_ManagementMenu_Customer_Add_Categorypanel_NameTextF);
		Jpanel_MasterPage_ManagementMenu_Customer_Add_Categorypanel.add(JLabel_MasterPage_ManagementMenu_Customer_Add_Categorypanel_PhoneLabel);
		Jpanel_MasterPage_ManagementMenu_Customer_Add_Categorypanel.add(JTextField_MasterPage_ManagementMenu_Customer_Add_Categorypanel_PhoneTextF);
		Jpanel_MasterPage_ManagementMenu_Customer_Add_Categorypanel.add(JLabel_MasterPage_ManagementMenu_Customer_Add_Categorypanel_PostalCodeLabel);
		Jpanel_MasterPage_ManagementMenu_Customer_Add_Categorypanel.add(JTextField_MasterPage_ManagementMenu_Customer_Add_Categorypanel_PostalCodeTextF);
		Jpanel_MasterPage_ManagementMenu_Customer_Add_Categorypanel.add(JLabel_MasterPage_ManagementMenu_Customer_Add_Categorypanel_EmailLabel);
		Jpanel_MasterPage_ManagementMenu_Customer_Add_Categorypanel.add(JTextField_MasterPage_ManagementMenu_Customer_Add_Categorypanel_EmailTextF);
		Jpanel_MasterPage_ManagementMenu_Customer_Add_Categorypanel.add(JLabel_MasterPage_ManagementMenu_Customer_Add_Categorypanel_AddressLabel);
		Jpanel_MasterPage_ManagementMenu_Customer_Add_Categorypanel.add(JTextArea_MasterPage_ManagementMenu_Customer_Add_Categorypanel_AddressTextA);
		
		JLabel JLabel_MasterPage_ManagementMenu_Customer_Add_MainPanel_EmptyLabel=new JLabel("");
		JLabel_MasterPage_ManagementMenu_Customer_Add_MainPanel_EmptyLabel.setPreferredSize(new Dimension(30,45));
		
		JButton JButton_MasterPage_ManagementMenu_Customer_Add_MainPanel_SaveButton=new JButton("Save");
		JButton_MasterPage_ManagementMenu_Customer_Add_MainPanel_SaveButton.setPreferredSize(new Dimension(100,45));
		JButton_MasterPage_ManagementMenu_Customer_Add_MainPanel_SaveButton.setBackground(Color.LIGHT_GRAY);
		
		JLabel JLabel_MasterPage_ManagementMenu_Customer_Add_MainPanel_EmptyL=new JLabel("");
		JLabel_MasterPage_ManagementMenu_Customer_Add_MainPanel_EmptyL.setPreferredSize(new Dimension(50,45));
		
		JButton JButton_MasterPage_ManagementMenu_Customer_Add_MainPanel_CancelButton=new JButton("Cancel");
		JButton_MasterPage_ManagementMenu_Customer_Add_MainPanel_CancelButton.setPreferredSize(new Dimension(100,45));
		JButton_MasterPage_ManagementMenu_Customer_Add_MainPanel_CancelButton.setBackground(Color.LIGHT_GRAY);
		
		JButton_MasterPage_ManagementMenu_Customer_Add_MainPanel_CancelButton.addActionListener(new ActionListener() 
	    {
			public void actionPerformed(ActionEvent e) 
	        {
				frame.dispose();
	        }
	    });
		
		Jpanel_MasterPage_ManagementMenu_Customer_Add_Mainpanel.add(Jpanel_MasterPage_ManagementMenu_Customer_Add_Categorypanel);
		Jpanel_MasterPage_ManagementMenu_Customer_Add_Mainpanel.add(JLabel_MasterPage_ManagementMenu_Customer_Add_MainPanel_EmptyLabel);
		Jpanel_MasterPage_ManagementMenu_Customer_Add_Mainpanel.add(JButton_MasterPage_ManagementMenu_Customer_Add_MainPanel_SaveButton);
		Jpanel_MasterPage_ManagementMenu_Customer_Add_Mainpanel.add(JLabel_MasterPage_ManagementMenu_Customer_Add_MainPanel_EmptyL);
		Jpanel_MasterPage_ManagementMenu_Customer_Add_Mainpanel.add(JButton_MasterPage_ManagementMenu_Customer_Add_MainPanel_CancelButton);
		
		frame.add(Jpanel_MasterPage_ManagementMenu_Customer_Add_Mainpanel);
		frame.setVisible(true);
		frame.setSize(350,350);
		frame.setLocation(500,200);
	//	frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setResizable(false);
	//	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	
	}
}
