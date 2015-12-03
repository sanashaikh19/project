import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.TitledBorder;


public class Management_Promotion_Add extends JFrame 
{
	public void Management_Promotion_Add() 
	{
		final JFrame frame=new JFrame("Promotion Details");	
		
		JPanel Jpanel_MasterPage_ManagementMenu_Promotion_Add_Mainpanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		Jpanel_MasterPage_ManagementMenu_Promotion_Add_Mainpanel.setBackground(Color.GRAY);
		
		JLabel JLabel_MasterPage_ManagementMenu_Promotion_Add_MainPanel_ItemLabel=new JLabel("Item");
		JLabel_MasterPage_ManagementMenu_Promotion_Add_MainPanel_ItemLabel.setPreferredSize(new Dimension(120,30));
		
		String Department_Combo[]=new String[]{"Falafel"};
		JComboBox JCombobox_MasterPage_ManagementMenu_Promotion_Add_MainPanel_ItemCombo=new JComboBox(Department_Combo);
		JCombobox_MasterPage_ManagementMenu_Promotion_Add_MainPanel_ItemCombo.setPreferredSize(new Dimension(230,30));
		JCombobox_MasterPage_ManagementMenu_Promotion_Add_MainPanel_ItemCombo.setBackground(Color.LIGHT_GRAY);
		
		JLabel JLabel_MasterPage_ManagementMenu_Promotion_Add_MainPanel_OldPriceLabel=new JLabel("Old Price");
		JLabel_MasterPage_ManagementMenu_Promotion_Add_MainPanel_OldPriceLabel.setPreferredSize(new Dimension(120,30));
		JTextField JTextField_MasterPage_ManagementMenu_Promotion_Add_MainPanel_OldPriceTextF=new JTextField();
		JTextField_MasterPage_ManagementMenu_Promotion_Add_MainPanel_OldPriceTextF.setPreferredSize(new Dimension(230,30));
		
		JLabel JLabel_MasterPage_ManagementMenu_Promotion_Add_MainPanel_PromotePriceLabel=new JLabel("Promote Price");
		JLabel_MasterPage_ManagementMenu_Promotion_Add_MainPanel_PromotePriceLabel.setPreferredSize(new Dimension(120,30));
		JTextField JTextField_MasterPage_ManagementMenu_Promotion_Add_MainPanel_PromotePriceTextF=new JTextField();
		JTextField_MasterPage_ManagementMenu_Promotion_Add_MainPanel_PromotePriceTextF.setPreferredSize(new Dimension(230,30));
		
		JLabel JLabel_MasterPage_ManagementMenu_Promotion_Add_MainPanel_PromoteTextLabel=new JLabel("Promote Text");
		JLabel_MasterPage_ManagementMenu_Promotion_Add_MainPanel_PromoteTextLabel.setPreferredSize(new Dimension(120,30));
		JTextArea JTextArea_MasterPage_ManagementMenu_Promotion_Add_MainPanel_PromoteTextTextA=new JTextArea();
		JTextArea_MasterPage_ManagementMenu_Promotion_Add_MainPanel_PromoteTextTextA.setPreferredSize(new Dimension(230,70));
		
		JLabel JLabel_MasterPage_ManagementMenu_Promotion_Add_MainPanel_PromoteColorLabel=new JLabel("Promote Color");
		JLabel_MasterPage_ManagementMenu_Promotion_Add_MainPanel_PromoteColorLabel.setPreferredSize(new Dimension(120,30));
		
		JColorChooser JColorChooser_MasterPage_ManagementMenu_Promotion_Add_MainPanel_Color=new JColorChooser();
		JColorChooser_MasterPage_ManagementMenu_Promotion_Add_MainPanel_Color.setPreferredSize(new Dimension(230,30));

		
		
		JLabel JLabel_MasterPage_ManagementMenu_Promotion_Add_MainPanel_CouponCodeLabel=new JLabel("Coupon Code");
		JLabel_MasterPage_ManagementMenu_Promotion_Add_MainPanel_CouponCodeLabel.setPreferredSize(new Dimension(120,30));
		JTextField JTextField_MasterPage_ManagementMenu_Promotion_Add_MainPanel_CouponCodeTextF=new JTextField();
		JTextField_MasterPage_ManagementMenu_Promotion_Add_MainPanel_CouponCodeTextF.setPreferredSize(new Dimension(230,30));
		
		JLabel JLabel_MasterPage_ManagementMenu_Promotion_Add_MainPanel_PictureLabel=new JLabel("Picture");
		JLabel_MasterPage_ManagementMenu_Promotion_Add_MainPanel_PictureLabel.setPreferredSize(new Dimension(120,30));
		
		JPanel Jpanel_MasterPage_ManagementMenu_Promotion_Add_Mainpanel_PicturePanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		Jpanel_MasterPage_ManagementMenu_Promotion_Add_Mainpanel_PicturePanel.setBackground(Color.GRAY);
		Jpanel_MasterPage_ManagementMenu_Promotion_Add_Mainpanel_PicturePanel.setBorder(new TitledBorder(""));
		Jpanel_MasterPage_ManagementMenu_Promotion_Add_Mainpanel_PicturePanel.setPreferredSize(new Dimension(230,150));
		
		JLabel JLabel_MasterPage_ManagementMenu_Promotion_Add_MainPanel_EmptyLabel=new JLabel("");
		JLabel_MasterPage_ManagementMenu_Promotion_Add_MainPanel_EmptyLabel.setPreferredSize(new Dimension(120,30));
		JTextField JTextField_MasterPage_ManagementMenu_Promotion_Add_MainPanel_PictureTextF=new JTextField();
		JTextField_MasterPage_ManagementMenu_Promotion_Add_MainPanel_PictureTextF.setPreferredSize(new Dimension(130,30));
		
		JButton JButton_MasterPage_ManagementMenu_Promotion_Add_MainPanel_BrowseButton=new JButton("Browse");
		JButton_MasterPage_ManagementMenu_Promotion_Add_MainPanel_BrowseButton.setPreferredSize(new Dimension(90,30));
		JButton_MasterPage_ManagementMenu_Promotion_Add_MainPanel_BrowseButton.setBackground(Color.LIGHT_GRAY);
		
		JButton JButton_MasterPage_ManagementMenu_Promotion_Add_MainPanel_SaveButton=new JButton("Save");
		JButton_MasterPage_ManagementMenu_Promotion_Add_MainPanel_SaveButton.setPreferredSize(new Dimension(120,55));
		JButton_MasterPage_ManagementMenu_Promotion_Add_MainPanel_SaveButton.setBackground(Color.LIGHT_GRAY);
		
		JLabel JLabel_MasterPage_ManagementMenu_Promotion_Add_MainPanel_EmptyL=new JLabel("");
		JLabel_MasterPage_ManagementMenu_Promotion_Add_MainPanel_EmptyL.setPreferredSize(new Dimension(90,55));
		
		JButton JButton_MasterPage_ManagementMenu_Promotion_Add_MainPanel_CancelButton=new JButton("Cancel");
		JButton_MasterPage_ManagementMenu_Promotion_Add_MainPanel_CancelButton.setPreferredSize(new Dimension(120,55));
		JButton_MasterPage_ManagementMenu_Promotion_Add_MainPanel_CancelButton.setBackground(Color.LIGHT_GRAY);
		
		JButton_MasterPage_ManagementMenu_Promotion_Add_MainPanel_CancelButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	frame.dispose();
            }
        });
		
		Jpanel_MasterPage_ManagementMenu_Promotion_Add_Mainpanel.add(JLabel_MasterPage_ManagementMenu_Promotion_Add_MainPanel_ItemLabel);
		Jpanel_MasterPage_ManagementMenu_Promotion_Add_Mainpanel.add(JCombobox_MasterPage_ManagementMenu_Promotion_Add_MainPanel_ItemCombo);
		Jpanel_MasterPage_ManagementMenu_Promotion_Add_Mainpanel.add(JLabel_MasterPage_ManagementMenu_Promotion_Add_MainPanel_OldPriceLabel);
		Jpanel_MasterPage_ManagementMenu_Promotion_Add_Mainpanel.add(JTextField_MasterPage_ManagementMenu_Promotion_Add_MainPanel_OldPriceTextF);
		Jpanel_MasterPage_ManagementMenu_Promotion_Add_Mainpanel.add(JLabel_MasterPage_ManagementMenu_Promotion_Add_MainPanel_PromotePriceLabel);
		Jpanel_MasterPage_ManagementMenu_Promotion_Add_Mainpanel.add(JTextField_MasterPage_ManagementMenu_Promotion_Add_MainPanel_PromotePriceTextF);
		Jpanel_MasterPage_ManagementMenu_Promotion_Add_Mainpanel.add(JLabel_MasterPage_ManagementMenu_Promotion_Add_MainPanel_PromoteTextLabel);
		Jpanel_MasterPage_ManagementMenu_Promotion_Add_Mainpanel.add(JTextArea_MasterPage_ManagementMenu_Promotion_Add_MainPanel_PromoteTextTextA);
		Jpanel_MasterPage_ManagementMenu_Promotion_Add_Mainpanel.add(JLabel_MasterPage_ManagementMenu_Promotion_Add_MainPanel_PromoteColorLabel);
		Jpanel_MasterPage_ManagementMenu_Promotion_Add_Mainpanel.add(JColorChooser_MasterPage_ManagementMenu_Promotion_Add_MainPanel_Color);
		Jpanel_MasterPage_ManagementMenu_Promotion_Add_Mainpanel.add(JLabel_MasterPage_ManagementMenu_Promotion_Add_MainPanel_CouponCodeLabel);
		Jpanel_MasterPage_ManagementMenu_Promotion_Add_Mainpanel.add(JTextField_MasterPage_ManagementMenu_Promotion_Add_MainPanel_CouponCodeTextF);
		Jpanel_MasterPage_ManagementMenu_Promotion_Add_Mainpanel.add(JLabel_MasterPage_ManagementMenu_Promotion_Add_MainPanel_PictureLabel);
		Jpanel_MasterPage_ManagementMenu_Promotion_Add_Mainpanel.add(Jpanel_MasterPage_ManagementMenu_Promotion_Add_Mainpanel_PicturePanel);
		Jpanel_MasterPage_ManagementMenu_Promotion_Add_Mainpanel.add(JLabel_MasterPage_ManagementMenu_Promotion_Add_MainPanel_EmptyLabel);
		Jpanel_MasterPage_ManagementMenu_Promotion_Add_Mainpanel.add(JTextField_MasterPage_ManagementMenu_Promotion_Add_MainPanel_PictureTextF);
		Jpanel_MasterPage_ManagementMenu_Promotion_Add_Mainpanel.add(JButton_MasterPage_ManagementMenu_Promotion_Add_MainPanel_BrowseButton);
		Jpanel_MasterPage_ManagementMenu_Promotion_Add_Mainpanel.add(JButton_MasterPage_ManagementMenu_Promotion_Add_MainPanel_SaveButton);
		Jpanel_MasterPage_ManagementMenu_Promotion_Add_Mainpanel.add(JLabel_MasterPage_ManagementMenu_Promotion_Add_MainPanel_EmptyL);
		Jpanel_MasterPage_ManagementMenu_Promotion_Add_Mainpanel.add(JButton_MasterPage_ManagementMenu_Promotion_Add_MainPanel_CancelButton);
		
		
		frame.add(Jpanel_MasterPage_ManagementMenu_Promotion_Add_Mainpanel);
		frame.setVisible(true);
		frame.setSize(380,550);
		frame.setLocation(450,80);
	//	frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setResizable(false);
	//	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
}
