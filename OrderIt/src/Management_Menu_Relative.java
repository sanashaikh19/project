import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Management_Menu_Relative extends JFrame
{
	static String column[]=new String[]{"","Menu Name","Sub Menu Name"};
	
	public void Management_Menu_Relative() 
	{
		final JFrame frame=new JFrame(" Menu Relative ");
		
		JPanel Jpanel_MasterPage_ManagementMenu_MenuRelative_Mainpanel=new JPanel();
		//Jpanel_MasterPage_ManagementMenu_MenuRelative_Mainpanel.setBackground(Color.gray);
			
		JPanel Jpanel_MasterPage_ManagementMenu_MenuRelative_ButtonPanel=new JPanel();
		Jpanel_MasterPage_ManagementMenu_MenuRelative_ButtonPanel.setBackground(Color.GRAY);
		Jpanel_MasterPage_ManagementMenu_MenuRelative_ButtonPanel.setPreferredSize(new Dimension(1345,60));
		
		JLabel empty=new JLabel("");
		empty.setPreferredSize(new Dimension(550,50));
		
		JLabel JLabel_MasterPage_ManagementMenu_MenuRelative_ButtonPanel_MenuRelativeListLabel=new JLabel("Menu Relative List");
		JLabel_MasterPage_ManagementMenu_MenuRelative_ButtonPanel_MenuRelativeListLabel.setPreferredSize(new Dimension(150,50));
		
		JButton Jbutton_MasterPage_ManagementMenu_MenuRelative_ButtonPanel_AddButton=new JButton("Add");
		Jbutton_MasterPage_ManagementMenu_MenuRelative_ButtonPanel_AddButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_MenuRelative_ButtonPanel_AddButton.setPreferredSize(new Dimension(150,50));
		
		Jbutton_MasterPage_ManagementMenu_MenuRelative_ButtonPanel_AddButton.addActionListener(new ActionListener() 
	    {
			public void actionPerformed(ActionEvent e) 
	        {
				Management_MenuRelative_Add menurelative_add=new Management_MenuRelative_Add();
				menurelative_add.Management_MenuRelative_Add();
	        }
	    });		
		
		JButton Jbutton_MasterPage_ManagementMenu_MenuRelative_ButtonPanel_EditButton=new JButton("Edit");
		Jbutton_MasterPage_ManagementMenu_MenuRelative_ButtonPanel_EditButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_MenuRelative_ButtonPanel_EditButton.setPreferredSize(new Dimension(150,50));
		
		Jbutton_MasterPage_ManagementMenu_MenuRelative_ButtonPanel_EditButton.addActionListener(new ActionListener() 
	    {
			public void actionPerformed(ActionEvent e) 
	        {
				Management_MenuRelative_Add menurelative_add=new Management_MenuRelative_Add();
				menurelative_add.Management_MenuRelative_Add();
	        }
	    });
		
		JButton Jbutton_MasterPage_ManagementMenu_MenuRelative_ButtonPanel_DeleteButton=new JButton("Delete");
		Jbutton_MasterPage_ManagementMenu_MenuRelative_ButtonPanel_DeleteButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_MenuRelative_ButtonPanel_DeleteButton.setPreferredSize(new Dimension(150,50));
		
		JButton Jbutton_MasterPage_ManagementMenu_MenuRelative_ButtonPanel_CloseButton=new JButton("Close");
		Jbutton_MasterPage_ManagementMenu_MenuRelative_ButtonPanel_CloseButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_MenuRelative_ButtonPanel_CloseButton.setPreferredSize(new Dimension(150,50));
		
		Jbutton_MasterPage_ManagementMenu_MenuRelative_ButtonPanel_CloseButton.addActionListener(new ActionListener() 
	    {
			public void actionPerformed(ActionEvent e) 
	        {
				frame.dispose();
	        }
	    });
		
		Jpanel_MasterPage_ManagementMenu_MenuRelative_ButtonPanel.add(empty);
		Jpanel_MasterPage_ManagementMenu_MenuRelative_ButtonPanel.add(JLabel_MasterPage_ManagementMenu_MenuRelative_ButtonPanel_MenuRelativeListLabel);
		Jpanel_MasterPage_ManagementMenu_MenuRelative_ButtonPanel.add(Jbutton_MasterPage_ManagementMenu_MenuRelative_ButtonPanel_AddButton);
		Jpanel_MasterPage_ManagementMenu_MenuRelative_ButtonPanel.add(Jbutton_MasterPage_ManagementMenu_MenuRelative_ButtonPanel_EditButton);
		Jpanel_MasterPage_ManagementMenu_MenuRelative_ButtonPanel.add(Jbutton_MasterPage_ManagementMenu_MenuRelative_ButtonPanel_DeleteButton);
		Jpanel_MasterPage_ManagementMenu_MenuRelative_ButtonPanel.add(Jbutton_MasterPage_ManagementMenu_MenuRelative_ButtonPanel_CloseButton);
		
		
		
		JPanel Jpanel_MasterPage_ManagementMenu_MenuRelative_TablePanel=new JPanel();
		Jpanel_MasterPage_ManagementMenu_MenuRelative_TablePanel.setBackground(Color.GRAY);
		Jpanel_MasterPage_ManagementMenu_MenuRelative_TablePanel.setPreferredSize(new Dimension(1345,620));
		
		
		
		DefaultTableModel table_model=new DefaultTableModel(column,0);
		JTable JTable_MasterPage_ManagementMenu_MenuRelative_TablePanel_table = new JTable(table_model );
		JScrollPane jsp=new JScrollPane(JTable_MasterPage_ManagementMenu_MenuRelative_TablePanel_table);
		jsp.setPreferredSize(new Dimension(1340,615));
		
		Jpanel_MasterPage_ManagementMenu_MenuRelative_TablePanel.add(jsp);
		
		Jpanel_MasterPage_ManagementMenu_MenuRelative_Mainpanel.add(Jpanel_MasterPage_ManagementMenu_MenuRelative_ButtonPanel);
		Jpanel_MasterPage_ManagementMenu_MenuRelative_Mainpanel.add(Jpanel_MasterPage_ManagementMenu_MenuRelative_TablePanel);
		
		frame.add(Jpanel_MasterPage_ManagementMenu_MenuRelative_Mainpanel);
        frame.setVisible(true);
        frame.setSize(1370,730);
    //    frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setResizable(false);
      //  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}