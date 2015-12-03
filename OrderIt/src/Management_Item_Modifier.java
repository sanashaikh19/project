import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class Management_Item_Modifier extends JFrame
{
	static String column[]=new String[]{"  "," Name "};
	
	public void Management_Item_Modifier()
	{
		final JFrame frame=new JFrame("Prorperty List");
		
		JPanel Jpanel_MasterPage_ManagementMenu_ItemModifier_Mainpanel=new JPanel();
	//	Jpanel_MasterPage_ManagementMenu_ItemModifier_Mainpanel.setBackground(Color.gray);
		
		JPanel Jpanel_MasterPage_ManagementMenu_ItemModifier_ItemTypeListPanel=new JPanel();
		Jpanel_MasterPage_ManagementMenu_ItemModifier_ItemTypeListPanel.setBorder(new TitledBorder("Item Type List"));
		Jpanel_MasterPage_ManagementMenu_ItemModifier_ItemTypeListPanel.setBackground(Color.GRAY);
		Jpanel_MasterPage_ManagementMenu_ItemModifier_ItemTypeListPanel.setPreferredSize(new Dimension(300,685));
		
		JPanel Jpanel_MasterPage_ManagementMenu_ItemModifier_ItemTypeListPanel_ButtonPanel=new JPanel();
		Jpanel_MasterPage_ManagementMenu_ItemModifier_ItemTypeListPanel_ButtonPanel.setBackground(Color.GRAY);
		Jpanel_MasterPage_ManagementMenu_ItemModifier_ItemTypeListPanel_ButtonPanel.setPreferredSize(new Dimension(270,50));
		
		JButton Jbutton_MasterPage_ManagementMenu_ItemModifier_ItemTypeListPanel_ButtonPanel_AddButton=new JButton("Add");
		Jbutton_MasterPage_ManagementMenu_ItemModifier_ItemTypeListPanel_ButtonPanel_AddButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_ItemModifier_ItemTypeListPanel_ButtonPanel_AddButton.setPreferredSize(new Dimension(85,50));
		
		Jbutton_MasterPage_ManagementMenu_ItemModifier_ItemTypeListPanel_ButtonPanel_AddButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	Management_ItemModifier_Item_Add management_item_add=new Management_ItemModifier_Item_Add();
            	management_item_add.Management_ItemModifier_Item_Add();
            }
        });
		
		JButton Jbutton_MasterPage_ManagementMenu_ItemModifier_ItemTypeListPanel_ButtonPanel_EditButton=new JButton("Edit");
		Jbutton_MasterPage_ManagementMenu_ItemModifier_ItemTypeListPanel_ButtonPanel_EditButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_ItemModifier_ItemTypeListPanel_ButtonPanel_EditButton.setPreferredSize(new Dimension(85,50));
		
		Jbutton_MasterPage_ManagementMenu_ItemModifier_ItemTypeListPanel_ButtonPanel_EditButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	Management_ItemModifier_Item_Add management_item_add=new Management_ItemModifier_Item_Add();
            	management_item_add.Management_ItemModifier_Item_Add();
            }
        });
		
		JButton Jbutton_MasterPage_ManagementMenu_ItemModifier_ItemTypeListPanel_ButtonPanel_DeleteButton=new JButton("Delete");
		Jbutton_MasterPage_ManagementMenu_ItemModifier_ItemTypeListPanel_ButtonPanel_DeleteButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_ItemModifier_ItemTypeListPanel_ButtonPanel_DeleteButton.setPreferredSize(new Dimension(85,50));
		
		Jpanel_MasterPage_ManagementMenu_ItemModifier_ItemTypeListPanel_ButtonPanel.add(Jbutton_MasterPage_ManagementMenu_ItemModifier_ItemTypeListPanel_ButtonPanel_AddButton);
		Jpanel_MasterPage_ManagementMenu_ItemModifier_ItemTypeListPanel_ButtonPanel.add(Jbutton_MasterPage_ManagementMenu_ItemModifier_ItemTypeListPanel_ButtonPanel_EditButton);
		Jpanel_MasterPage_ManagementMenu_ItemModifier_ItemTypeListPanel_ButtonPanel.add(Jbutton_MasterPage_ManagementMenu_ItemModifier_ItemTypeListPanel_ButtonPanel_DeleteButton);
		
		

		JPanel Jpanel_MasterPage_ManagementMenu_ItemModifier_ItemTypeListPanel_tablePanel=new JPanel();
		Jpanel_MasterPage_ManagementMenu_ItemModifier_ItemTypeListPanel_tablePanel.setBackground(Color.LIGHT_GRAY);
		Jpanel_MasterPage_ManagementMenu_ItemModifier_ItemTypeListPanel_tablePanel.setPreferredSize(new Dimension(270,600));
		
		
		//2nd empty panel
		
		Jpanel_MasterPage_ManagementMenu_ItemModifier_ItemTypeListPanel.add(Jpanel_MasterPage_ManagementMenu_ItemModifier_ItemTypeListPanel_ButtonPanel);
		Jpanel_MasterPage_ManagementMenu_ItemModifier_ItemTypeListPanel.add(Jpanel_MasterPage_ManagementMenu_ItemModifier_ItemTypeListPanel_tablePanel);
				
		JPanel Jpanel_MasterPage_ManagementMenu_ItemModifier_PropertyListPanel=new JPanel();
		Jpanel_MasterPage_ManagementMenu_ItemModifier_PropertyListPanel.setBackground(Color.GRAY);
		Jpanel_MasterPage_ManagementMenu_ItemModifier_PropertyListPanel.setPreferredSize(new Dimension(1035,685));
		
		JPanel Jpanel_MasterPage_ManagementMenu_ItemModifier_PropertyListPanel_ButtonPanel=new JPanel();
		Jpanel_MasterPage_ManagementMenu_ItemModifier_PropertyListPanel_ButtonPanel.setBorder(new TitledBorder("Property List"));
		Jpanel_MasterPage_ManagementMenu_ItemModifier_PropertyListPanel_ButtonPanel.setBackground(Color.GRAY);
		Jpanel_MasterPage_ManagementMenu_ItemModifier_PropertyListPanel_ButtonPanel.setPreferredSize(new Dimension(1030,80));
		
		JLabel empty=new JLabel("");
		empty.setBackground(Color.LIGHT_GRAY);
		empty.setPreferredSize(new Dimension(550,50));
		
		JButton Jbutton_MasterPage_ManagementMenu_ItemModifier_PropertyListPanel_ButtonPanel_AddButton=new JButton("Add");
		Jbutton_MasterPage_ManagementMenu_ItemModifier_PropertyListPanel_ButtonPanel_AddButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_ItemModifier_PropertyListPanel_ButtonPanel_AddButton.setPreferredSize(new Dimension(110,50));
		
		Jbutton_MasterPage_ManagementMenu_ItemModifier_PropertyListPanel_ButtonPanel_AddButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	Management_ItemModifier_Property management_property_add=new Management_ItemModifier_Property();
            	management_property_add.Management_ItemModifier_Property();
            }
        });
		
		JButton Jbutton_MasterPage_ManagementMenu_ItemModifier_PropertyListPanel_ButtonPanel_EditButton=new JButton("Edit");
		Jbutton_MasterPage_ManagementMenu_ItemModifier_PropertyListPanel_ButtonPanel_EditButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_ItemModifier_PropertyListPanel_ButtonPanel_EditButton.setPreferredSize(new Dimension(110,50));
		
		Jbutton_MasterPage_ManagementMenu_ItemModifier_PropertyListPanel_ButtonPanel_EditButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	Management_ItemModifier_Property management_property_add=new Management_ItemModifier_Property();
            	management_property_add.Management_ItemModifier_Property();
            }
        });
		
		JButton Jbutton_MasterPage_ManagementMenu_ItemModifier_PropertyListPanel_ButtonPanel_DeleteButton=new JButton("Delete");
		Jbutton_MasterPage_ManagementMenu_ItemModifier_PropertyListPanel_ButtonPanel_DeleteButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_ItemModifier_PropertyListPanel_ButtonPanel_DeleteButton.setPreferredSize(new Dimension(110,50));
		
		JButton Jbutton_MasterPage_ManagementMenu_ItemModifier_PropertyListPanel_ButtonPanel_CloseButton=new JButton("Close");
		Jbutton_MasterPage_ManagementMenu_ItemModifier_PropertyListPanel_ButtonPanel_CloseButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_ItemModifier_PropertyListPanel_ButtonPanel_CloseButton.setPreferredSize(new Dimension(110,50));
		
		Jbutton_MasterPage_ManagementMenu_ItemModifier_PropertyListPanel_ButtonPanel_CloseButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	frame.dispose();
            }
        });
		
		Jpanel_MasterPage_ManagementMenu_ItemModifier_PropertyListPanel_ButtonPanel.add(empty);
		Jpanel_MasterPage_ManagementMenu_ItemModifier_PropertyListPanel_ButtonPanel.add(Jbutton_MasterPage_ManagementMenu_ItemModifier_PropertyListPanel_ButtonPanel_AddButton);
		Jpanel_MasterPage_ManagementMenu_ItemModifier_PropertyListPanel_ButtonPanel.add(Jbutton_MasterPage_ManagementMenu_ItemModifier_PropertyListPanel_ButtonPanel_EditButton);
		Jpanel_MasterPage_ManagementMenu_ItemModifier_PropertyListPanel_ButtonPanel.add(Jbutton_MasterPage_ManagementMenu_ItemModifier_PropertyListPanel_ButtonPanel_DeleteButton);
		Jpanel_MasterPage_ManagementMenu_ItemModifier_PropertyListPanel_ButtonPanel.add(Jbutton_MasterPage_ManagementMenu_ItemModifier_PropertyListPanel_ButtonPanel_CloseButton);
		
		JPanel Jpanel_MasterPage_ManagementMenu_ItemModifier_PropertyListPanel_TablePanel=new JPanel();
		Jpanel_MasterPage_ManagementMenu_ItemModifier_PropertyListPanel_TablePanel.setBackground(Color.LIGHT_GRAY);
		Jpanel_MasterPage_ManagementMenu_ItemModifier_PropertyListPanel_TablePanel.setPreferredSize(new Dimension(1035,600));
		
		DefaultTableModel table_model=new DefaultTableModel(column,0);
		JTable JTable_MasterPage_ManagementMenu_ItemModifier_PropertyListPanel_TablePanel_table=new JTable(table_model);
		JScrollPane jsp=new JScrollPane(JTable_MasterPage_ManagementMenu_ItemModifier_PropertyListPanel_TablePanel_table);
		jsp.setPreferredSize(new Dimension(1030,590));
		
		Jpanel_MasterPage_ManagementMenu_ItemModifier_PropertyListPanel_TablePanel.add(jsp);
		
		
		Jpanel_MasterPage_ManagementMenu_ItemModifier_PropertyListPanel.add(Jpanel_MasterPage_ManagementMenu_ItemModifier_PropertyListPanel_ButtonPanel);
		Jpanel_MasterPage_ManagementMenu_ItemModifier_PropertyListPanel.add(Jpanel_MasterPage_ManagementMenu_ItemModifier_PropertyListPanel_TablePanel);
		
		
		Jpanel_MasterPage_ManagementMenu_ItemModifier_Mainpanel.add(Jpanel_MasterPage_ManagementMenu_ItemModifier_ItemTypeListPanel);
		Jpanel_MasterPage_ManagementMenu_ItemModifier_Mainpanel.add(Jpanel_MasterPage_ManagementMenu_ItemModifier_PropertyListPanel);
				
		frame.add(Jpanel_MasterPage_ManagementMenu_ItemModifier_Mainpanel);
        frame.setVisible(true);
        frame.setSize(1370,730);
        //frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setResizable(false);
    //    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
}
