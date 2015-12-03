import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class Management_Device extends JFrame 
{
	static String column[]=new String[]{" Device Name "," Device ID ","Device Type"};
	
	public void Management_Device() 
	{
		final JFrame frame=new JFrame("Device");
		JPanel Jpanel_MasterPage_ManagementMenu_Device_Mainpanel=new JPanel();
		Jpanel_MasterPage_ManagementMenu_Device_Mainpanel.setBackground(Color.gray);
		
		JPanel Jpanel_MasterPage_ManagementMenu_Device_CatagoryPanel=new JPanel();
		Jpanel_MasterPage_ManagementMenu_Device_CatagoryPanel.setBackground(Color.GRAY);
		Jpanel_MasterPage_ManagementMenu_Device_CatagoryPanel.setPreferredSize(new Dimension(1340,90));
		
		JLabel empty=new JLabel(""); 
		empty.setPreferredSize(new Dimension(800,80));
		
		JLabel JLabel_MasterPage_ManagementMenu_Device_CatagoryPanel_DeviceLabel=new JLabel("Device List"); 
		JLabel_MasterPage_ManagementMenu_Device_CatagoryPanel_DeviceLabel.setPreferredSize(new Dimension(200,80));

		JButton JButton_MasterPage_ManagementMenu_Device_CatagoryPanel_EditButton=new JButton("Edit");
		JButton_MasterPage_ManagementMenu_Device_CatagoryPanel_EditButton.setPreferredSize(new Dimension(150,70));
		JButton_MasterPage_ManagementMenu_Device_CatagoryPanel_EditButton.setBackground(Color.LIGHT_GRAY);
		
		JButton_MasterPage_ManagementMenu_Device_CatagoryPanel_EditButton.addActionListener(new ActionListener() 
	    {
			public void actionPerformed(ActionEvent e) 
	        {
				Management_Device_Edit device_edit=new Management_Device_Edit();
				device_edit.Management_Device_Edit();
	        }
	    });
		
		JButton JButton_MasterPage_ManagementMenu_Device_CatagoryPanel_CloseButton=new JButton("Close");
		JButton_MasterPage_ManagementMenu_Device_CatagoryPanel_CloseButton.setPreferredSize(new Dimension(150,70));
		JButton_MasterPage_ManagementMenu_Device_CatagoryPanel_CloseButton.setBackground(Color.LIGHT_GRAY);
		
		JButton_MasterPage_ManagementMenu_Device_CatagoryPanel_CloseButton.addActionListener(new ActionListener() 
	    {
			public void actionPerformed(ActionEvent e) 
	        {
				frame.dispose();
	        }
	    });
		
		Jpanel_MasterPage_ManagementMenu_Device_CatagoryPanel.add(empty);
		Jpanel_MasterPage_ManagementMenu_Device_CatagoryPanel.add(JLabel_MasterPage_ManagementMenu_Device_CatagoryPanel_DeviceLabel);
		Jpanel_MasterPage_ManagementMenu_Device_CatagoryPanel.add(JButton_MasterPage_ManagementMenu_Device_CatagoryPanel_EditButton);
		Jpanel_MasterPage_ManagementMenu_Device_CatagoryPanel.add(JButton_MasterPage_ManagementMenu_Device_CatagoryPanel_CloseButton);
		
		
		JPanel Jpanel_MasterPage_ManagementMenu_Device_TablePanel=new JPanel();
		Jpanel_MasterPage_ManagementMenu_Device_TablePanel.setBackground(Color.GRAY);
		Jpanel_MasterPage_ManagementMenu_Device_TablePanel.setPreferredSize(new Dimension(1340,600));
		
		DefaultTableModel table_model=new DefaultTableModel(column,0);
		JTable JTable_MasterPage_ManagementMenu_Device_TablePanel_table=new JTable(table_model);
		JScrollPane jsp=new JScrollPane(JTable_MasterPage_ManagementMenu_Device_TablePanel_table);
		jsp.setPreferredSize(new Dimension(1335,580));
		
		Jpanel_MasterPage_ManagementMenu_Device_TablePanel.add(jsp);
		
		Jpanel_MasterPage_ManagementMenu_Device_Mainpanel.add(Jpanel_MasterPage_ManagementMenu_Device_CatagoryPanel);
		Jpanel_MasterPage_ManagementMenu_Device_Mainpanel.add(Jpanel_MasterPage_ManagementMenu_Device_TablePanel);
		
		
		frame.add(Jpanel_MasterPage_ManagementMenu_Device_Mainpanel);
		frame.setVisible(true);
		frame.setSize(1370,730);
//		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setResizable(false);
	  //  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
}
