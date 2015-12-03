import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class Management_Category extends JFrame
{
	static String column[]=new String[]{"  ","  "," Category ID "," Name "," Picture "};
		
	public void Management_Category() 
	{
		final JFrame frame=new JFrame("Category");
		
		JPanel Jpanel_MasterPage_ManagementMenu_Category_Mainpanel=new JPanel();
		Jpanel_MasterPage_ManagementMenu_Category_Mainpanel.setBackground(Color.GRAY);
		
		JPanel Jpanel_MasterPage_ManagementMenu_Category_CategoryListPanel=new JPanel();
		Jpanel_MasterPage_ManagementMenu_Category_CategoryListPanel.setBorder(new TitledBorder("Category List"));
		Jpanel_MasterPage_ManagementMenu_Category_CategoryListPanel.setBackground(Color.GRAY);
		Jpanel_MasterPage_ManagementMenu_Category_CategoryListPanel.setPreferredSize(new Dimension(1340,90));
        		
		JTextField JTextField_MasterPage_ManagementMenu_Category_CategoryListPanel_textF=new JTextField();
		JTextField_MasterPage_ManagementMenu_Category_CategoryListPanel_textF.setPreferredSize(new Dimension(150,40));
		
		JButton Jbutton_MasterPage_ManagementMenu_Category_CategoryListPanel_SearchButton=new JButton("Search");
		Jbutton_MasterPage_ManagementMenu_Category_CategoryListPanel_SearchButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_Category_CategoryListPanel_SearchButton.setPreferredSize(new Dimension(150,50));
		
		JLabel empty=new JLabel("");
		empty.setBackground(Color.GRAY);
		empty.setPreferredSize(new Dimension(225,50));
		
		JButton Jbutton_MasterPage_ManagementMenu_Category_CategoryListPanel_ExportButton=new JButton("Export");
		Jbutton_MasterPage_ManagementMenu_Category_CategoryListPanel_ExportButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_Category_CategoryListPanel_ExportButton.setPreferredSize(new Dimension(150,50));
		
		JButton Jbutton_MasterPage_ManagementMenu_Category_CategoryListPanel_AddButton=new JButton("Add");
		Jbutton_MasterPage_ManagementMenu_Category_CategoryListPanel_AddButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_Category_CategoryListPanel_AddButton.setPreferredSize(new Dimension(150,50));
		
		Jbutton_MasterPage_ManagementMenu_Category_CategoryListPanel_AddButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	Management_Categoty_Add category_add=new Management_Categoty_Add();            	        
            	category_add.Management_Categoty_Add();
            }
        });
		
		JButton Jbutton_MasterPage_ManagementMenu_Category_CategoryListPanel_EditButton=new JButton("Edit");
		Jbutton_MasterPage_ManagementMenu_Category_CategoryListPanel_EditButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_Category_CategoryListPanel_EditButton.setPreferredSize(new Dimension(150,50));
		
		Jbutton_MasterPage_ManagementMenu_Category_CategoryListPanel_EditButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	Management_Categoty_Add category_add=new Management_Categoty_Add();            	        
            	category_add.Management_Categoty_Add();
            }
        });
		
		JButton Jbutton_MasterPage_ManagementMenu_Category_CategoryListPanel_DeleteButton=new JButton("Delete");
		Jbutton_MasterPage_ManagementMenu_Category_CategoryListPanel_DeleteButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_Category_CategoryListPanel_DeleteButton.setPreferredSize(new Dimension(150,50));
		
		JButton Jbutton_MasterPage_ManagementMenu_Category_CategoryListPanel_CloseButton=new JButton("Close");
		Jbutton_MasterPage_ManagementMenu_Category_CategoryListPanel_CloseButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_Category_CategoryListPanel_CloseButton.setPreferredSize(new Dimension(150,50));

		Jbutton_MasterPage_ManagementMenu_Category_CategoryListPanel_CloseButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	frame.dispose();
            }
        });
		
		Jpanel_MasterPage_ManagementMenu_Category_CategoryListPanel.add(JTextField_MasterPage_ManagementMenu_Category_CategoryListPanel_textF);
		Jpanel_MasterPage_ManagementMenu_Category_CategoryListPanel.add(Jbutton_MasterPage_ManagementMenu_Category_CategoryListPanel_SearchButton);
		Jpanel_MasterPage_ManagementMenu_Category_CategoryListPanel.add(empty);
		Jpanel_MasterPage_ManagementMenu_Category_CategoryListPanel.add(Jbutton_MasterPage_ManagementMenu_Category_CategoryListPanel_ExportButton);
		Jpanel_MasterPage_ManagementMenu_Category_CategoryListPanel.add(Jbutton_MasterPage_ManagementMenu_Category_CategoryListPanel_AddButton);
		Jpanel_MasterPage_ManagementMenu_Category_CategoryListPanel.add(Jbutton_MasterPage_ManagementMenu_Category_CategoryListPanel_EditButton);
		Jpanel_MasterPage_ManagementMenu_Category_CategoryListPanel.add(Jbutton_MasterPage_ManagementMenu_Category_CategoryListPanel_DeleteButton);
		Jpanel_MasterPage_ManagementMenu_Category_CategoryListPanel.add(Jbutton_MasterPage_ManagementMenu_Category_CategoryListPanel_CloseButton);
		
		
		JPanel Jpanel_MasterPage_ManagementMenu_Category_tablePanel=new JPanel();
		Jpanel_MasterPage_ManagementMenu_Category_tablePanel.setPreferredSize(new Dimension(1255,590));
		Jpanel_MasterPage_ManagementMenu_Category_tablePanel.setBackground(Color.GRAY);
		
		DefaultTableModel table_model=new DefaultTableModel(column,0);
		JTable JTable_MasterPage_ManagementMenu_Category_tablePanel_table = new JTable(table_model );
		JScrollPane jsp=new JScrollPane(JTable_MasterPage_ManagementMenu_Category_tablePanel_table);
		jsp.setPreferredSize(new Dimension(1250,580));
		
		
		Jpanel_MasterPage_ManagementMenu_Category_tablePanel.add(jsp);
		
		JPanel Jpanel_MasterPage_ManagementMenu_Category_ScrollPanel=new JPanel();
		Jpanel_MasterPage_ManagementMenu_Category_ScrollPanel.setPreferredSize(new Dimension(70,500));
		Jpanel_MasterPage_ManagementMenu_Category_ScrollPanel.setBackground(Color.GRAY);
		
		
		JButton Jbutton_MasterPage_ManagementMenu_Category_ScrollPanel_UpButton=new JButton("UP");
		Jbutton_MasterPage_ManagementMenu_Category_ScrollPanel_UpButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_Category_ScrollPanel_UpButton.setPreferredSize(new Dimension(65,75));
        
		JButton Jbutton_MasterPage_ManagementMenu_Category_ScrollPanel_DownButton=new JButton("Down");
		Jbutton_MasterPage_ManagementMenu_Category_ScrollPanel_DownButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_Category_ScrollPanel_DownButton.setPreferredSize(new Dimension(65,75));
        
        Jpanel_MasterPage_ManagementMenu_Category_ScrollPanel.add(Jbutton_MasterPage_ManagementMenu_Category_ScrollPanel_UpButton);
        Jpanel_MasterPage_ManagementMenu_Category_ScrollPanel.add(Jbutton_MasterPage_ManagementMenu_Category_ScrollPanel_DownButton);
		
		Jpanel_MasterPage_ManagementMenu_Category_Mainpanel.add(Jpanel_MasterPage_ManagementMenu_Category_CategoryListPanel);
		Jpanel_MasterPage_ManagementMenu_Category_Mainpanel.add(Jpanel_MasterPage_ManagementMenu_Category_tablePanel);
		Jpanel_MasterPage_ManagementMenu_Category_Mainpanel.add(Jpanel_MasterPage_ManagementMenu_Category_ScrollPanel);
		
		frame.add(Jpanel_MasterPage_ManagementMenu_Category_Mainpanel);
        frame.setVisible(true);
        frame.setSize(1370,730);
        //frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setResizable(false);
   //     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
}