import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class Management_MenuRelative_Add extends JFrame
{
	public void Management_MenuRelative_Add() 
	{
		final JFrame frame=new JFrame("Select Product");	
		JPanel Jpanel_MasterPage_ManagementMenu_MenuRelative_Add_Mainpanel=new JPanel();
		Jpanel_MasterPage_ManagementMenu_MenuRelative_Add_Mainpanel.setBackground(Color.GRAY);		
		
		JPanel Jpanel_MasterPage_ManagementMenu_MenuRelative_Add_CategoriesPanel=new JPanel();
		Jpanel_MasterPage_ManagementMenu_MenuRelative_Add_CategoriesPanel.setBorder(new TitledBorder("Categories"));
		Jpanel_MasterPage_ManagementMenu_MenuRelative_Add_CategoriesPanel.setBackground(Color.LIGHT_GRAY);
		Jpanel_MasterPage_ManagementMenu_MenuRelative_Add_CategoriesPanel.setPreferredSize(new Dimension(920,180));
		
		JPanel Jpanel_MasterPage_ManagementMenu_MenuRelative_Add_SubCategoriesPanel=new JPanel();
		Jpanel_MasterPage_ManagementMenu_MenuRelative_Add_SubCategoriesPanel.setBackground(Color.LIGHT_GRAY);
		Jpanel_MasterPage_ManagementMenu_MenuRelative_Add_SubCategoriesPanel.setPreferredSize(new Dimension(920,435));
		
		JPanel Jpanel_MasterPage_ManagementMenu_MenuRelative_Add_ButtonPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		Jpanel_MasterPage_ManagementMenu_MenuRelative_Add_ButtonPanel.setBackground(Color.LIGHT_GRAY);
		Jpanel_MasterPage_ManagementMenu_MenuRelative_Add_ButtonPanel.setPreferredSize(new Dimension(920,55));
		
		JButton JButton_MasterPage_ManagementMenu_MenuRelative_Add_ButtonPanel_SaveButton=new JButton("Save");
		JButton_MasterPage_ManagementMenu_MenuRelative_Add_ButtonPanel_SaveButton.setPreferredSize(new Dimension(100,45));
		JButton_MasterPage_ManagementMenu_MenuRelative_Add_ButtonPanel_SaveButton.setBackground(Color.LIGHT_GRAY);
		
		JLabel JLabel_EmptyLabel=new JLabel("");
		JLabel_EmptyLabel.setPreferredSize(new Dimension(700,45));
		
		JButton JButton_MasterPage_ManagementMenu_MenuRelative_Add_ButtonPanel_CancelLButton=new JButton("Cancel");
		JButton_MasterPage_ManagementMenu_MenuRelative_Add_ButtonPanel_CancelLButton.setPreferredSize(new Dimension(100,45));
		JButton_MasterPage_ManagementMenu_MenuRelative_Add_ButtonPanel_CancelLButton.setBackground(Color.LIGHT_GRAY);
		
		JButton_MasterPage_ManagementMenu_MenuRelative_Add_ButtonPanel_CancelLButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	frame.dispose();
            }
        });
		
		Jpanel_MasterPage_ManagementMenu_MenuRelative_Add_ButtonPanel.add(JButton_MasterPage_ManagementMenu_MenuRelative_Add_ButtonPanel_SaveButton);
		Jpanel_MasterPage_ManagementMenu_MenuRelative_Add_ButtonPanel.add(JLabel_EmptyLabel);
		Jpanel_MasterPage_ManagementMenu_MenuRelative_Add_ButtonPanel.add(JButton_MasterPage_ManagementMenu_MenuRelative_Add_ButtonPanel_CancelLButton);
		
		Jpanel_MasterPage_ManagementMenu_MenuRelative_Add_Mainpanel.add(Jpanel_MasterPage_ManagementMenu_MenuRelative_Add_CategoriesPanel);
		Jpanel_MasterPage_ManagementMenu_MenuRelative_Add_Mainpanel.add(Jpanel_MasterPage_ManagementMenu_MenuRelative_Add_SubCategoriesPanel);
		Jpanel_MasterPage_ManagementMenu_MenuRelative_Add_Mainpanel.add(Jpanel_MasterPage_ManagementMenu_MenuRelative_Add_ButtonPanel);
		
		
		
		frame.add(Jpanel_MasterPage_ManagementMenu_MenuRelative_Add_Mainpanel);
		frame.setVisible(true);
		frame.setSize(950,730);
		frame.setLocation(230,0);
	//	frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setResizable(false);
	//	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
