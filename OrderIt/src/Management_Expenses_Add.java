import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Management_Expenses_Add extends JFrame
{
	public void Management_Expenses_Add()
	{
		final JFrame frame=new JFrame("Expenses");	
		JPanel Jpanel_MasterPage_ManagementMenu_Expenses_Add_Mainpanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		Jpanel_MasterPage_ManagementMenu_Expenses_Add_Mainpanel.setBackground(Color.GRAY);
		
		JLabel JLabel_MasterPage_ManagementMenu_Expenses_Add_MainPanel_UserLabel=new JLabel("User");
		JLabel_MasterPage_ManagementMenu_Expenses_Add_MainPanel_UserLabel.setPreferredSize(new Dimension(70,30));
		
		String User_Combo[]=new String[]{"admin","waiter","Customer","Tarif","Santosh","Shyam"};
		JComboBox JCombobox_MasterPage_ManagementMenu_Expenses_Add_MainPanel_UserCombo=new JComboBox(User_Combo);
		JCombobox_MasterPage_ManagementMenu_Expenses_Add_MainPanel_UserCombo.setPreferredSize(new Dimension(150,30));
		//JCombobox_MasterPage_ManagementMenu_Expenses_Add_MainPanel_UserCombo.setBackground(Color.LIGHT_GRAY);
		
		JLabel JLabel_EmptyLabel=new JLabel("");
		JLabel_EmptyLabel.setPreferredSize(new Dimension(90,45));
		
		JLabel JLabel_MasterPage_ManagementMenu_Expenses_Add_MainPanel_TypeLabel=new JLabel("Type");
		JLabel_MasterPage_ManagementMenu_Expenses_Add_MainPanel_TypeLabel.setPreferredSize(new Dimension(70,30));
		
		String Type_Combo[]=new String[]{"Out","In"};
		JComboBox JCombobox_MasterPage_ManagementMenu_Expenses_Add_MainPanel_TypeCombo=new JComboBox(Type_Combo);
		JCombobox_MasterPage_ManagementMenu_Expenses_Add_MainPanel_TypeCombo.setPreferredSize(new Dimension(150,30));
		//JCombobox_MasterPage_ManagementMenu_Expenses_Add_MainPanel_UserCombo.setBackground(Color.LIGHT_GRAY);
		
		JLabel JLabel_EmptyLabel1=new JLabel("");
		JLabel_EmptyLabel1.setPreferredSize(new Dimension(90,45));
		
		JLabel JLabel_MasterPage_ManagementMenu_Expenses_Add_MainPanel_ValueLabel=new JLabel("Value");
		JLabel_MasterPage_ManagementMenu_Expenses_Add_MainPanel_ValueLabel.setPreferredSize(new Dimension(70,30));
		
		JTextField JTextField_MasterPage_ManagementMenu_Expenses_Add_Mainpanel_ValueTextF=new JTextField();
		JTextField_MasterPage_ManagementMenu_Expenses_Add_Mainpanel_ValueTextF.setPreferredSize(new Dimension(150,25));
		
		JLabel JLabel_EmptyLabel2=new JLabel("");
		JLabel_EmptyLabel2.setPreferredSize(new Dimension(90,45));
		
		JLabel JLabel_MasterPage_ManagementMenu_Expenses_Add_MainPanel_CommentLabel=new JLabel("Comment");
		JLabel_MasterPage_ManagementMenu_Expenses_Add_MainPanel_CommentLabel.setPreferredSize(new Dimension(70,30));
		
		JTextArea JTextArea_MasterPage_ManagementMenu_Expenses_Add_Mainpanel_CommentTextA=new JTextArea();
		JTextArea_MasterPage_ManagementMenu_Expenses_Add_Mainpanel_CommentTextA.setPreferredSize(new Dimension(270,110));
		
		JLabel JLabel_EmptyLabel3=new JLabel("");
		JLabel_EmptyLabel3.setPreferredSize(new Dimension(70,45));
				
		JButton JButton_MasterPage_ManagementMenu_Expenses_Add_MainPanel_SaveButton=new JButton("Save");
		JButton_MasterPage_ManagementMenu_Expenses_Add_MainPanel_SaveButton.setPreferredSize(new Dimension(100,45));
		JButton_MasterPage_ManagementMenu_Expenses_Add_MainPanel_SaveButton.setBackground(Color.LIGHT_GRAY);
		
		JLabel JLabel_EmptyLabel4=new JLabel("");
		JLabel_EmptyLabel4.setPreferredSize(new Dimension(60,45));
		
		JButton JButton_MasterPage_ManagementMenu_Expenses_Add_MainPanel_CancelButton=new JButton("Cancel");
		JButton_MasterPage_ManagementMenu_Expenses_Add_MainPanel_CancelButton.setPreferredSize(new Dimension(100,45));
		JButton_MasterPage_ManagementMenu_Expenses_Add_MainPanel_CancelButton.setBackground(Color.LIGHT_GRAY);
		
		JButton_MasterPage_ManagementMenu_Expenses_Add_MainPanel_CancelButton.addActionListener(new ActionListener() 
	    {
			public void actionPerformed(ActionEvent e) 
	        {
				frame.dispose();
	        }
	    });
		
		Jpanel_MasterPage_ManagementMenu_Expenses_Add_Mainpanel.add(JLabel_MasterPage_ManagementMenu_Expenses_Add_MainPanel_UserLabel);
		Jpanel_MasterPage_ManagementMenu_Expenses_Add_Mainpanel.add(JCombobox_MasterPage_ManagementMenu_Expenses_Add_MainPanel_UserCombo);
		Jpanel_MasterPage_ManagementMenu_Expenses_Add_Mainpanel.add(JLabel_EmptyLabel);
		Jpanel_MasterPage_ManagementMenu_Expenses_Add_Mainpanel.add(JLabel_MasterPage_ManagementMenu_Expenses_Add_MainPanel_TypeLabel);
		Jpanel_MasterPage_ManagementMenu_Expenses_Add_Mainpanel.add(JCombobox_MasterPage_ManagementMenu_Expenses_Add_MainPanel_TypeCombo);
		Jpanel_MasterPage_ManagementMenu_Expenses_Add_Mainpanel.add(JLabel_EmptyLabel1);
		Jpanel_MasterPage_ManagementMenu_Expenses_Add_Mainpanel.add(JLabel_MasterPage_ManagementMenu_Expenses_Add_MainPanel_ValueLabel);
		Jpanel_MasterPage_ManagementMenu_Expenses_Add_Mainpanel.add(JTextField_MasterPage_ManagementMenu_Expenses_Add_Mainpanel_ValueTextF);
		Jpanel_MasterPage_ManagementMenu_Expenses_Add_Mainpanel.add(JLabel_EmptyLabel2);
		Jpanel_MasterPage_ManagementMenu_Expenses_Add_Mainpanel.add(JLabel_MasterPage_ManagementMenu_Expenses_Add_MainPanel_CommentLabel);
		Jpanel_MasterPage_ManagementMenu_Expenses_Add_Mainpanel.add(JTextArea_MasterPage_ManagementMenu_Expenses_Add_Mainpanel_CommentTextA);
		Jpanel_MasterPage_ManagementMenu_Expenses_Add_Mainpanel.add(JLabel_EmptyLabel3);
		Jpanel_MasterPage_ManagementMenu_Expenses_Add_Mainpanel.add(JButton_MasterPage_ManagementMenu_Expenses_Add_MainPanel_SaveButton);
		Jpanel_MasterPage_ManagementMenu_Expenses_Add_Mainpanel.add(JLabel_EmptyLabel4);
		Jpanel_MasterPage_ManagementMenu_Expenses_Add_Mainpanel.add(JButton_MasterPage_ManagementMenu_Expenses_Add_MainPanel_CancelButton);
		
		
		
		frame.add(Jpanel_MasterPage_ManagementMenu_Expenses_Add_Mainpanel);
		frame.setVisible(true);
		frame.setSize(400,380);
	//	frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setResizable(false);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
