import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class Management_Items_Add extends JFrame 
{
	static String column[]=new String[]{"Name","Price"};
	
	public void Management_Items_Add() 
	{
		final JFrame frame=new JFrame("Item Details");
		
		JPanel Jpanel_MasterPage_ManagementMenu_Item_Add_Mainpanel=new JPanel();
		Jpanel_MasterPage_ManagementMenu_Item_Add_Mainpanel.setBackground(Color.GRAY);
	
		JPanel Jpanel_MasterPage_ManagementMenu_Item_Add_CategoryPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		Jpanel_MasterPage_ManagementMenu_Item_Add_CategoryPanel.setPreferredSize(new Dimension(300,500));
		Jpanel_MasterPage_ManagementMenu_Item_Add_CategoryPanel.setBackground(Color.GRAY);
		
		JLabel JLabel_MasterPage_ManagementMenu_Item_Add_CategoryPanel_NameLabel=new JLabel("Name");
		JLabel_MasterPage_ManagementMenu_Item_Add_CategoryPanel_NameLabel.setPreferredSize(new Dimension(100,30));
		JTextField JTextField_MasterPage_ManagementMenu_Item_Add_CategoryPanel_NameTextF=new JTextField();
		JTextField_MasterPage_ManagementMenu_Item_Add_CategoryPanel_NameTextF.setPreferredSize(new Dimension(180,30));
		
		JLabel JLabel_MasterPage_ManagementMenu_Item_Add_CategoryPanel_DefaultNameLabel=new JLabel("Default Name");
		JLabel_MasterPage_ManagementMenu_Item_Add_CategoryPanel_DefaultNameLabel.setPreferredSize(new Dimension(100,30));
		JTextField JTextField_MasterPage_ManagementMenu_Item_Add_CategoryPanel_DefaultNameTextF=new JTextField();
		JTextField_MasterPage_ManagementMenu_Item_Add_CategoryPanel_DefaultNameTextF.setPreferredSize(new Dimension(180,30));
		
		JLabel JLabel_MasterPage_ManagementMenu_Item_Add_CategoryPanel_EnoughForLabel=new JLabel("Enough For");
		JLabel_MasterPage_ManagementMenu_Item_Add_CategoryPanel_EnoughForLabel.setPreferredSize(new Dimension(100,30));
		JTextField JTextField_MasterPage_ManagementMenu_Item_Add_CategoryPanel_EnoughForTextF=new JTextField();
		JTextField_MasterPage_ManagementMenu_Item_Add_CategoryPanel_EnoughForTextF.setPreferredSize(new Dimension(180,30));
		
		JLabel JLabel_MasterPage_ManagementMenu_Item_Add_CategoryPanel_PriceLabel=new JLabel("Price");
		JLabel_MasterPage_ManagementMenu_Item_Add_CategoryPanel_PriceLabel.setPreferredSize(new Dimension(100,30));
		JTextField JTextField_MasterPage_ManagementMenu_Item_Add_CategoryPanel_PriceTextF=new JTextField();
		JTextField_MasterPage_ManagementMenu_Item_Add_CategoryPanel_PriceTextF.setPreferredSize(new Dimension(180,30));
		
		JLabel JLabel_MasterPage_ManagementMenu_Item_Add_CategoryPanel_DepartmentLabel=new JLabel("Department");
		JLabel_MasterPage_ManagementMenu_Item_Add_CategoryPanel_DepartmentLabel.setPreferredSize(new Dimension(100,30));
		
		String Department_Combo[]=new String[]{"Kitchen","Bar","Startered"};
		JComboBox JCombobox_MasterPage_ManagementMenu_Item_Add_CategoryPanel_DepartmentCombo=new JComboBox(Department_Combo);
		JCombobox_MasterPage_ManagementMenu_Item_Add_CategoryPanel_DepartmentCombo.setPreferredSize(new Dimension(180,30));
		
		JLabel JLabel_MasterPage_ManagementMenu_Item_Add_CategoryPanel_CategoryLabel=new JLabel("Category");
		JLabel_MasterPage_ManagementMenu_Item_Add_CategoryPanel_CategoryLabel.setPreferredSize(new Dimension(100,30));
		
		String Category_Combo[]=new String[]{"Appentizer","Naan","Sphaghetti","Rice Variety","Thai Food","Indian Non-Veg","Indian Vegitarian","Arabic Curries","Grilled & Fried","Deserts & Fruits","Drinks","Shisha","Soup","Sandwich & Burger","Burmese Food"};
		JComboBox JCombobox_MasterPage_ManagementMenu_Item_Add_CategoryPanel_CategoryCombo=new JComboBox(Category_Combo);
		JCombobox_MasterPage_ManagementMenu_Item_Add_CategoryPanel_CategoryCombo.setPreferredSize(new Dimension(180,30));
		
		JLabel JLabel_MasterPage_ManagementMenu_Item_Add_CategoryPanel_TaxLabel=new JLabel("Tax(%)");
		JLabel_MasterPage_ManagementMenu_Item_Add_CategoryPanel_TaxLabel.setPreferredSize(new Dimension(100,30));
		JTextField JTextField_MasterPage_ManagementMenu_Item_Add_CategoryPanel_TaxTextf=new JTextField();
		JTextField_MasterPage_ManagementMenu_Item_Add_CategoryPanel_TaxTextf.setPreferredSize(new Dimension(180,30));
		
		JLabel JLabel_MasterPage_ManagementMenu_Item_Add_CategoryPanel_ImageLabel=new JLabel("Image");
		JLabel_MasterPage_ManagementMenu_Item_Add_CategoryPanel_ImageLabel.setPreferredSize(new Dimension(100,30));
		
		JPanel JPanel_MasterPage_ManagementMenu_Item_Add_CategoryPanel_ImagePanel=new JPanel();
		JPanel_MasterPage_ManagementMenu_Item_Add_CategoryPanel_ImagePanel.setPreferredSize(new Dimension(180,100));
		JPanel_MasterPage_ManagementMenu_Item_Add_CategoryPanel_ImagePanel.setBackground(Color.GRAY);
		JPanel_MasterPage_ManagementMenu_Item_Add_CategoryPanel_ImagePanel.setBorder(new TitledBorder(""));
		
		JLabel EmptyLabel=new JLabel();
		EmptyLabel.setPreferredSize(new Dimension(100,30));
		
		JTextField JTextField_MasterPage_ManagementMenu_Item_Add_CategoryPanel_ImageTextF=new JTextField();
		JTextField_MasterPage_ManagementMenu_Item_Add_CategoryPanel_ImageTextF.setPreferredSize(new Dimension(95,30));
					
		JButton JButton_MasterPage_ManagementMenu_Item_Add_CategoryPanel_BrowseButton=new JButton("Browse"); 
		JButton_MasterPage_ManagementMenu_Item_Add_CategoryPanel_BrowseButton.setBackground(Color.LIGHT_GRAY);
		JButton_MasterPage_ManagementMenu_Item_Add_CategoryPanel_BrowseButton.setPreferredSize(new Dimension(80,35));
		
		JLabel JLabel_MasterPage_ManagementMenu_Item_Add_CategoryPanel_DescriptionLabel=new JLabel("Description");
		JLabel_MasterPage_ManagementMenu_Item_Add_CategoryPanel_DescriptionLabel.setPreferredSize(new Dimension(100,30));
		
		JTextArea JTextArea_MasterPage_ManagementMenu_Item_Add_CategoryPanel_DescriptionTextA=new JTextArea();
		JTextArea_MasterPage_ManagementMenu_Item_Add_CategoryPanel_DescriptionTextA.setPreferredSize(new Dimension(180,90));
		
		Jpanel_MasterPage_ManagementMenu_Item_Add_CategoryPanel.add(JLabel_MasterPage_ManagementMenu_Item_Add_CategoryPanel_NameLabel);		
		Jpanel_MasterPage_ManagementMenu_Item_Add_CategoryPanel.add(JTextField_MasterPage_ManagementMenu_Item_Add_CategoryPanel_NameTextF);
		Jpanel_MasterPage_ManagementMenu_Item_Add_CategoryPanel.add(JLabel_MasterPage_ManagementMenu_Item_Add_CategoryPanel_DefaultNameLabel);
		Jpanel_MasterPage_ManagementMenu_Item_Add_CategoryPanel.add(JTextField_MasterPage_ManagementMenu_Item_Add_CategoryPanel_DefaultNameTextF);
		Jpanel_MasterPage_ManagementMenu_Item_Add_CategoryPanel.add(JLabel_MasterPage_ManagementMenu_Item_Add_CategoryPanel_EnoughForLabel);
		Jpanel_MasterPage_ManagementMenu_Item_Add_CategoryPanel.add(JTextField_MasterPage_ManagementMenu_Item_Add_CategoryPanel_EnoughForTextF);
		Jpanel_MasterPage_ManagementMenu_Item_Add_CategoryPanel.add(JLabel_MasterPage_ManagementMenu_Item_Add_CategoryPanel_PriceLabel);
		Jpanel_MasterPage_ManagementMenu_Item_Add_CategoryPanel.add(JTextField_MasterPage_ManagementMenu_Item_Add_CategoryPanel_PriceTextF);
		Jpanel_MasterPage_ManagementMenu_Item_Add_CategoryPanel.add(JLabel_MasterPage_ManagementMenu_Item_Add_CategoryPanel_DepartmentLabel);
		Jpanel_MasterPage_ManagementMenu_Item_Add_CategoryPanel.add(JCombobox_MasterPage_ManagementMenu_Item_Add_CategoryPanel_DepartmentCombo);
		Jpanel_MasterPage_ManagementMenu_Item_Add_CategoryPanel.add(JLabel_MasterPage_ManagementMenu_Item_Add_CategoryPanel_CategoryLabel);
		Jpanel_MasterPage_ManagementMenu_Item_Add_CategoryPanel.add(JCombobox_MasterPage_ManagementMenu_Item_Add_CategoryPanel_CategoryCombo);
		Jpanel_MasterPage_ManagementMenu_Item_Add_CategoryPanel.add(JLabel_MasterPage_ManagementMenu_Item_Add_CategoryPanel_TaxLabel);
		Jpanel_MasterPage_ManagementMenu_Item_Add_CategoryPanel.add(JTextField_MasterPage_ManagementMenu_Item_Add_CategoryPanel_TaxTextf);
		Jpanel_MasterPage_ManagementMenu_Item_Add_CategoryPanel.add(JLabel_MasterPage_ManagementMenu_Item_Add_CategoryPanel_ImageLabel);
		Jpanel_MasterPage_ManagementMenu_Item_Add_CategoryPanel.add(JPanel_MasterPage_ManagementMenu_Item_Add_CategoryPanel_ImagePanel);
		Jpanel_MasterPage_ManagementMenu_Item_Add_CategoryPanel.add(EmptyLabel);
		Jpanel_MasterPage_ManagementMenu_Item_Add_CategoryPanel.add(JTextField_MasterPage_ManagementMenu_Item_Add_CategoryPanel_ImageTextF);
		Jpanel_MasterPage_ManagementMenu_Item_Add_CategoryPanel.add(JButton_MasterPage_ManagementMenu_Item_Add_CategoryPanel_BrowseButton);
		Jpanel_MasterPage_ManagementMenu_Item_Add_CategoryPanel.add(JLabel_MasterPage_ManagementMenu_Item_Add_CategoryPanel_DescriptionLabel);
		Jpanel_MasterPage_ManagementMenu_Item_Add_CategoryPanel.add(JTextArea_MasterPage_ManagementMenu_Item_Add_CategoryPanel_DescriptionTextA);
		
		JPanel Jpanel_MasterPage_ManagementMenu_Item_Add_TablePanel=new JPanel();
		Jpanel_MasterPage_ManagementMenu_Item_Add_TablePanel.setPreferredSize(new Dimension(300,500));
		Jpanel_MasterPage_ManagementMenu_Item_Add_TablePanel.setBackground(Color.GRAY);
		
		JPanel Jpanel_MasterPage_ManagementMenu_Item_Add_ItemPanel=new JPanel();
		Jpanel_MasterPage_ManagementMenu_Item_Add_ItemPanel.setBackground(Color.GRAY);
		Jpanel_MasterPage_ManagementMenu_Item_Add_ItemPanel.setPreferredSize(new Dimension(280,280));
		
		JPanel Jpanel_MasterPage_ManagementMenu_Item_Add_ItemModifierPanel=new JPanel();
		Jpanel_MasterPage_ManagementMenu_Item_Add_ItemModifierPanel.setBackground(Color.GRAY);
		Jpanel_MasterPage_ManagementMenu_Item_Add_ItemModifierPanel.setBorder(new TitledBorder("Item Modifier"));
		Jpanel_MasterPage_ManagementMenu_Item_Add_ItemModifierPanel.setPreferredSize(new Dimension(260,230));
		
		String Item_Combo[]=new String[]{"None"};
		JComboBox JCombobox_MasterPage_ManagementMenu_Item_Add_ItemModifierPanel_ItemCombo=new JComboBox(Item_Combo);
		JCombobox_MasterPage_ManagementMenu_Item_Add_ItemModifierPanel_ItemCombo.setPreferredSize(new Dimension(240,30));

		DefaultTableModel table_model=new DefaultTableModel(column,0);
		JTable JTable_MasterPage_ManagementMenu_Item_Add_ItemModifierPanel_Table=new JTable(table_model);
		JScrollPane jsp=new JScrollPane(JTable_MasterPage_ManagementMenu_Item_Add_ItemModifierPanel_Table);
		jsp.setPreferredSize(new Dimension(245,165));
		
		Jpanel_MasterPage_ManagementMenu_Item_Add_ItemModifierPanel.add(JCombobox_MasterPage_ManagementMenu_Item_Add_ItemModifierPanel_ItemCombo);
		Jpanel_MasterPage_ManagementMenu_Item_Add_ItemModifierPanel.add(jsp);
		
		JButton JButton_MasterPage_ManagementMenu_Item_Add_ItemModifierPanel_addModifierButton=new JButton("Add Item Modifier");
		JButton_MasterPage_ManagementMenu_Item_Add_ItemModifierPanel_addModifierButton.setPreferredSize(new Dimension(250,35));
		JButton_MasterPage_ManagementMenu_Item_Add_ItemModifierPanel_addModifierButton.setBackground(Color.LIGHT_GRAY);
		
		Jpanel_MasterPage_ManagementMenu_Item_Add_ItemPanel.add(Jpanel_MasterPage_ManagementMenu_Item_Add_ItemModifierPanel);
		Jpanel_MasterPage_ManagementMenu_Item_Add_ItemPanel.add(JButton_MasterPage_ManagementMenu_Item_Add_ItemModifierPanel_addModifierButton);
		
		JPanel Jpanel_MasterPage_ManagementMenu_Item_Add_IngredientPanel=new JPanel();
		Jpanel_MasterPage_ManagementMenu_Item_Add_IngredientPanel.setPreferredSize(new Dimension(250,250));
		Jpanel_MasterPage_ManagementMenu_Item_Add_IngredientPanel.setBackground(Color.GRAY);
		
		JLabel JLabel_MasterPage_ManagementMenu_Item_Add_IngredientPanel_IngridientLabel=new JLabel("Ingridient");
		JLabel_MasterPage_ManagementMenu_Item_Add_IngredientPanel_IngridientLabel.setPreferredSize(new Dimension(200,30)); 
		
		JTextArea JTextArea_MasterPage_ManagementMenu_Item_Add_IngredientPanel_IngridientTextA=new JTextArea();
		JTextArea_MasterPage_ManagementMenu_Item_Add_IngredientPanel_IngridientTextA.setPreferredSize(new Dimension(230,155));
		
		Jpanel_MasterPage_ManagementMenu_Item_Add_IngredientPanel.add(JLabel_MasterPage_ManagementMenu_Item_Add_IngredientPanel_IngridientLabel);
		Jpanel_MasterPage_ManagementMenu_Item_Add_IngredientPanel.add(JTextArea_MasterPage_ManagementMenu_Item_Add_IngredientPanel_IngridientTextA);
		
		Jpanel_MasterPage_ManagementMenu_Item_Add_TablePanel.add(Jpanel_MasterPage_ManagementMenu_Item_Add_ItemPanel);
		Jpanel_MasterPage_ManagementMenu_Item_Add_TablePanel.add(Jpanel_MasterPage_ManagementMenu_Item_Add_IngredientPanel);
		
		JButton JButton_MasterPage_ManagementMenu_Item_Add_MainPanel_SaveButton=new JButton("Save");
		JButton_MasterPage_ManagementMenu_Item_Add_MainPanel_SaveButton.setBackground(Color.LIGHT_GRAY);
		JButton_MasterPage_ManagementMenu_Item_Add_MainPanel_SaveButton.setPreferredSize(new Dimension(100,50));
		
		JButton JButton_MasterPage_ManagementMenu_Item_Add_MainPanel_CancelButton=new JButton("Cancel");
		JButton_MasterPage_ManagementMenu_Item_Add_MainPanel_CancelButton.setBackground(Color.LIGHT_GRAY);
		JButton_MasterPage_ManagementMenu_Item_Add_MainPanel_CancelButton.setPreferredSize(new Dimension(100,50));
		
		JButton_MasterPage_ManagementMenu_Item_Add_MainPanel_CancelButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	frame.dispose();
            }
        });
		
		Jpanel_MasterPage_ManagementMenu_Item_Add_Mainpanel.add(Jpanel_MasterPage_ManagementMenu_Item_Add_CategoryPanel);
		Jpanel_MasterPage_ManagementMenu_Item_Add_Mainpanel.add(Jpanel_MasterPage_ManagementMenu_Item_Add_TablePanel);
		Jpanel_MasterPage_ManagementMenu_Item_Add_Mainpanel.add(JButton_MasterPage_ManagementMenu_Item_Add_MainPanel_SaveButton);
		Jpanel_MasterPage_ManagementMenu_Item_Add_Mainpanel.add(JButton_MasterPage_ManagementMenu_Item_Add_MainPanel_CancelButton);
		
		frame.add(Jpanel_MasterPage_ManagementMenu_Item_Add_Mainpanel);
		frame.setVisible(true);
		frame.setSize(630,610);
		frame.setLocation(400,30);
		//frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setResizable(false);
	//	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}	
}
