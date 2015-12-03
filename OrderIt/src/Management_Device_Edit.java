import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Management_Device_Edit extends JFrame
{
	public void Management_Device_Edit()
	{		
		final JFrame frame=new JFrame("Client Details");	
		JPanel Jpanel_MasterPage_ManagementMenu_Device_Edit_Mainpanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		Jpanel_MasterPage_ManagementMenu_Device_Edit_Mainpanel.setBackground(Color.GRAY);
		
		JLabel JLabel_MasterPage_ManagementMenu_Device_Edit_MainPanel_ClientNameLabel=new JLabel("Client Name");
		JLabel_MasterPage_ManagementMenu_Device_Edit_MainPanel_ClientNameLabel.setPreferredSize(new Dimension(70,30));
		JTextField JTextField_MasterPage_ManagementMenu_Device_Edit_MainPanel_ClientNameTextF=new JTextField();
		JTextField_MasterPage_ManagementMenu_Device_Edit_MainPanel_ClientNameTextF.setPreferredSize(new Dimension(200,25));
		
		JLabel JLabel_MasterPage_ManagementMenu_Device_Edit_MainPanel_ClientTypeLabel=new JLabel("Client Type");
		JLabel_MasterPage_ManagementMenu_Device_Edit_MainPanel_ClientTypeLabel.setPreferredSize(new Dimension(70,30));
		JTextField JTextField_MasterPage_ManagementMenu_Device_Edit_MainPanel_ClientTypeTextF=new JTextField();
		JTextField_MasterPage_ManagementMenu_Device_Edit_MainPanel_ClientTypeTextF.setPreferredSize(new Dimension(200,25));
				
		JLabel JLabel_MasterPage_ManagementMenu_Device_Edit_MainPanel_ClientIDLabel=new JLabel("Client ID");
		JLabel_MasterPage_ManagementMenu_Device_Edit_MainPanel_ClientIDLabel.setPreferredSize(new Dimension(70,30));
		JTextArea JTextArea_MasterPage_ManagementMenu_Device_Edit_MainPanel_ClientIDTextA=new JTextArea();
		JTextArea_MasterPage_ManagementMenu_Device_Edit_MainPanel_ClientIDTextA.setPreferredSize(new Dimension(200,100));
		
		JLabel JLabel_MasterPage_ManagementMenu_Device_Edit_MainPanel_EmptyLabel=new JLabel("");
		JLabel_MasterPage_ManagementMenu_Device_Edit_MainPanel_EmptyLabel.setPreferredSize(new Dimension(20,45));
		
		JButton JButton_MasterPage_ManagementMenu_Device_Edit_MainPanel_SaveButton=new JButton("Save");
		JButton_MasterPage_ManagementMenu_Device_Edit_MainPanel_SaveButton.setPreferredSize(new Dimension(100,45));
		JButton_MasterPage_ManagementMenu_Device_Edit_MainPanel_SaveButton.setBackground(Color.LIGHT_GRAY);
		
		JLabel JLabel_MasterPage_ManagementMenu_Device_Edit_MainPanel_EmptyL=new JLabel("");
		JLabel_MasterPage_ManagementMenu_Device_Edit_MainPanel_EmptyL.setPreferredSize(new Dimension(30,45));
		
		JButton JButton_MasterPage_ManagementMenu_Device_Edit_MainPanel_CancelButton=new JButton("Cancel");
		JButton_MasterPage_ManagementMenu_Device_Edit_MainPanel_CancelButton.setPreferredSize(new Dimension(100,45));
		JButton_MasterPage_ManagementMenu_Device_Edit_MainPanel_CancelButton.setBackground(Color.LIGHT_GRAY);
		
		JButton_MasterPage_ManagementMenu_Device_Edit_MainPanel_CancelButton.addActionListener(new ActionListener() 
	    {
			public void actionPerformed(ActionEvent e) 
	        {
				frame.dispose();
	        }
	    });
		
		Jpanel_MasterPage_ManagementMenu_Device_Edit_Mainpanel.add(JLabel_MasterPage_ManagementMenu_Device_Edit_MainPanel_ClientNameLabel);
		Jpanel_MasterPage_ManagementMenu_Device_Edit_Mainpanel.add(JTextField_MasterPage_ManagementMenu_Device_Edit_MainPanel_ClientNameTextF);
		Jpanel_MasterPage_ManagementMenu_Device_Edit_Mainpanel.add(JLabel_MasterPage_ManagementMenu_Device_Edit_MainPanel_ClientTypeLabel);
		Jpanel_MasterPage_ManagementMenu_Device_Edit_Mainpanel.add(JTextField_MasterPage_ManagementMenu_Device_Edit_MainPanel_ClientTypeTextF);
		Jpanel_MasterPage_ManagementMenu_Device_Edit_Mainpanel.add(JLabel_MasterPage_ManagementMenu_Device_Edit_MainPanel_ClientIDLabel);
		Jpanel_MasterPage_ManagementMenu_Device_Edit_Mainpanel.add(JTextArea_MasterPage_ManagementMenu_Device_Edit_MainPanel_ClientIDTextA);
		Jpanel_MasterPage_ManagementMenu_Device_Edit_Mainpanel.add(JLabel_MasterPage_ManagementMenu_Device_Edit_MainPanel_EmptyLabel);
		Jpanel_MasterPage_ManagementMenu_Device_Edit_Mainpanel.add(JButton_MasterPage_ManagementMenu_Device_Edit_MainPanel_SaveButton);
		Jpanel_MasterPage_ManagementMenu_Device_Edit_Mainpanel.add(JLabel_MasterPage_ManagementMenu_Device_Edit_MainPanel_EmptyL);
		Jpanel_MasterPage_ManagementMenu_Device_Edit_Mainpanel.add(JButton_MasterPage_ManagementMenu_Device_Edit_MainPanel_CancelButton);
		
		
		
		frame.add(Jpanel_MasterPage_ManagementMenu_Device_Edit_Mainpanel);
		frame.setVisible(true);
		frame.setSize(320,290);
		frame.setLocation(500,250);
	//	frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setResizable(false);
	//	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

