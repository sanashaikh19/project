import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class Management_Categoty_Add extends JFrame 
{
	public void Management_Categoty_Add()
	{
		final JFrame frame=new JFrame("Category List");
		
		JPanel Jpanel_MasterPage_ManagementMenu_Category_Add_Mainpanel=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		Jpanel_MasterPage_ManagementMenu_Category_Add_Mainpanel.setBackground(Color.GRAY);
		
		JLabel JLabel_MasterPage_ManagementMenu_Category_Add_Mainpanel_NameLabel=new JLabel("Name");
		JLabel_MasterPage_ManagementMenu_Category_Add_Mainpanel_NameLabel.setPreferredSize(new Dimension(80,50));
		
		JTextField JTextField_MasterPage_ManagementMenu_Category_Add_Mainpanel_NameTextF=new JTextField();
		JTextField_MasterPage_ManagementMenu_Category_Add_Mainpanel_NameTextF.setPreferredSize(new Dimension(200,35));
		
		JLabel JLabel_MasterPage_ManagementMenu_Category_Add_Mainpanel_ImageLabel=new JLabel("Image");
		JLabel_MasterPage_ManagementMenu_Category_Add_Mainpanel_ImageLabel.setPreferredSize(new Dimension(80,50));
		
		JPanel JPanel_MasterPage_ManagementMenu_Category_Add_Mainpanel_ImageLabel_Panel=new JPanel();
		JPanel_MasterPage_ManagementMenu_Category_Add_Mainpanel_ImageLabel_Panel.setPreferredSize(new Dimension(200,120));
		JPanel_MasterPage_ManagementMenu_Category_Add_Mainpanel_ImageLabel_Panel.setBackground(Color.gray);
		JPanel_MasterPage_ManagementMenu_Category_Add_Mainpanel_ImageLabel_Panel.setBorder(new TitledBorder(""));
		
		JTextField JTextField_MasterPage_ManagementMenu_Category_Add_Mainpanel_ImageTextF=new JTextField();
		JTextField_MasterPage_ManagementMenu_Category_Add_Mainpanel_ImageTextF.setPreferredSize(new Dimension(105,30));

		JButton JButton_MasterPage_ManagementMenu_Category_Add_Mainpanel_BrowseButton=new JButton("Browse");
		JButton_MasterPage_ManagementMenu_Category_Add_Mainpanel_BrowseButton.setBackground(Color.LIGHT_GRAY);
		JButton_MasterPage_ManagementMenu_Category_Add_Mainpanel_BrowseButton.setPreferredSize(new Dimension(90,30));
		
		JButton JButton_MasterPage_ManagementMenu_Category_Add_Mainpanel_SaveButton=new JButton("Save");
		JButton_MasterPage_ManagementMenu_Category_Add_Mainpanel_SaveButton.setBackground(Color.LIGHT_GRAY);
		JButton_MasterPage_ManagementMenu_Category_Add_Mainpanel_SaveButton.setPreferredSize(new Dimension(150,50));
		
		
		JButton JButton_MasterPage_ManagementMenu_Category_Add_Mainpanel_CancelButton=new JButton("Cancel");
		JButton_MasterPage_ManagementMenu_Category_Add_Mainpanel_CancelButton.setBackground(Color.LIGHT_GRAY);
		JButton_MasterPage_ManagementMenu_Category_Add_Mainpanel_CancelButton.setPreferredSize(new Dimension(150,50));
		
		JButton_MasterPage_ManagementMenu_Category_Add_Mainpanel_CancelButton.addActionListener(new ActionListener() 
	    {
			public void actionPerformed(ActionEvent e) 
	        {
				frame.dispose();
	        }
	    });
		
		Jpanel_MasterPage_ManagementMenu_Category_Add_Mainpanel.add(JLabel_MasterPage_ManagementMenu_Category_Add_Mainpanel_NameLabel);
		Jpanel_MasterPage_ManagementMenu_Category_Add_Mainpanel.add(JTextField_MasterPage_ManagementMenu_Category_Add_Mainpanel_NameTextF);
		Jpanel_MasterPage_ManagementMenu_Category_Add_Mainpanel.add(JLabel_MasterPage_ManagementMenu_Category_Add_Mainpanel_ImageLabel);
		Jpanel_MasterPage_ManagementMenu_Category_Add_Mainpanel.add(JPanel_MasterPage_ManagementMenu_Category_Add_Mainpanel_ImageLabel_Panel);
		Jpanel_MasterPage_ManagementMenu_Category_Add_Mainpanel.add(JTextField_MasterPage_ManagementMenu_Category_Add_Mainpanel_ImageTextF);
		Jpanel_MasterPage_ManagementMenu_Category_Add_Mainpanel.add(JButton_MasterPage_ManagementMenu_Category_Add_Mainpanel_BrowseButton);
		Jpanel_MasterPage_ManagementMenu_Category_Add_Mainpanel.add(JButton_MasterPage_ManagementMenu_Category_Add_Mainpanel_SaveButton);
		Jpanel_MasterPage_ManagementMenu_Category_Add_Mainpanel.add(JButton_MasterPage_ManagementMenu_Category_Add_Mainpanel_CancelButton);
		
		frame.add(Jpanel_MasterPage_ManagementMenu_Category_Add_Mainpanel);
		frame.setVisible(true);
		frame.setSize(340,320);
	//	frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocation(450,210);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
}