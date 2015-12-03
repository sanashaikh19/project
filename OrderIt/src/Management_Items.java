import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class Management_Items extends JFrame
{
	static String column[]=new String[]{" Item No. "," Name "," Price "," Picture "," Enable ","Order"};
	
	public void Management_Items() 
	{	
		final JFrame frame=new JFrame("Items");
		
		JPanel Jpanel_MasterPage_ManagementMenu_Items_Mainpanel=new JPanel();
		Jpanel_MasterPage_ManagementMenu_Items_Mainpanel.setBackground(Color.GRAY);
		
		JPanel Jpanel_MasterPage_ManagementMenu_Items_ItemsListPanel=new JPanel();
		Jpanel_MasterPage_ManagementMenu_Items_ItemsListPanel.setBorder(new TitledBorder("Category List"));
		Jpanel_MasterPage_ManagementMenu_Items_ItemsListPanel.setBackground(Color.GRAY);
		Jpanel_MasterPage_ManagementMenu_Items_ItemsListPanel.setPreferredSize(new Dimension(1340,80));
        		
		JTextField JTextField_MasterPage_ManagementMenu_Items_ItemsListPanel_textF=new JTextField();
		JTextField_MasterPage_ManagementMenu_Items_ItemsListPanel_textF.setPreferredSize(new Dimension(150,40));
		
		JButton Jbutton_MasterPage_ManagementMenu_Items_ItemsListPanel_SearchButton=new JButton("Search");
		Jbutton_MasterPage_ManagementMenu_Items_ItemsListPanel_SearchButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_Items_ItemsListPanel_SearchButton.setPreferredSize(new Dimension(150,50));
		
		JLabel empty=new JLabel("");
		empty.setBackground(Color.GRAY);
		empty.setPreferredSize(new Dimension(210,50));
		
		JButton Jbutton_MasterPage_ManagementMenu_Items_ItemsListPanel_ExportButton=new JButton("Export");
		Jbutton_MasterPage_ManagementMenu_Items_ItemsListPanel_ExportButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_Items_ItemsListPanel_ExportButton.setPreferredSize(new Dimension(150,50));
		
		JButton Jbutton_MasterPage_ManagementMenu_Items_ItemsListPanel_AddButton=new JButton("Add");
		Jbutton_MasterPage_ManagementMenu_Items_ItemsListPanel_AddButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_Items_ItemsListPanel_AddButton.setPreferredSize(new Dimension(150,50));
		
		Jbutton_MasterPage_ManagementMenu_Items_ItemsListPanel_AddButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	Management_Items_Add management_items_add=new Management_Items_Add();
            	management_items_add.Management_Items_Add();
            }
        });
		
		JButton Jbutton_MasterPage_ManagementMenu_Items_ItemsListPanel_EditButton=new JButton("Edit");
		Jbutton_MasterPage_ManagementMenu_Items_ItemsListPanel_EditButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_Items_ItemsListPanel_EditButton.setPreferredSize(new Dimension(150,50));
		
		Jbutton_MasterPage_ManagementMenu_Items_ItemsListPanel_EditButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	Management_Items_Add management_items_add=new Management_Items_Add();
            	management_items_add.Management_Items_Add();
            }
        });
		
		JButton Jbutton_MasterPage_ManagementMenu_Items_ItemsListPanel_DeleteButton=new JButton("Delete");
		Jbutton_MasterPage_ManagementMenu_Items_ItemsListPanel_DeleteButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_Items_ItemsListPanel_DeleteButton.setPreferredSize(new Dimension(150,50));
		
		JButton Jbutton_MasterPage_ManagementMenu_Items_ItemsListPanel_CloseButton=new JButton("Close");
		Jbutton_MasterPage_ManagementMenu_Items_ItemsListPanel_CloseButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_Items_ItemsListPanel_CloseButton.setPreferredSize(new Dimension(150,50));

		Jbutton_MasterPage_ManagementMenu_Items_ItemsListPanel_CloseButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	frame.dispose();
            }
        });
		
		Jpanel_MasterPage_ManagementMenu_Items_ItemsListPanel.add(JTextField_MasterPage_ManagementMenu_Items_ItemsListPanel_textF);
		Jpanel_MasterPage_ManagementMenu_Items_ItemsListPanel.add(Jbutton_MasterPage_ManagementMenu_Items_ItemsListPanel_SearchButton);
		Jpanel_MasterPage_ManagementMenu_Items_ItemsListPanel.add(empty);
		Jpanel_MasterPage_ManagementMenu_Items_ItemsListPanel.add(Jbutton_MasterPage_ManagementMenu_Items_ItemsListPanel_ExportButton);
		Jpanel_MasterPage_ManagementMenu_Items_ItemsListPanel.add(Jbutton_MasterPage_ManagementMenu_Items_ItemsListPanel_AddButton);
		Jpanel_MasterPage_ManagementMenu_Items_ItemsListPanel.add(Jbutton_MasterPage_ManagementMenu_Items_ItemsListPanel_EditButton);
		Jpanel_MasterPage_ManagementMenu_Items_ItemsListPanel.add(Jbutton_MasterPage_ManagementMenu_Items_ItemsListPanel_DeleteButton);
		Jpanel_MasterPage_ManagementMenu_Items_ItemsListPanel.add(Jbutton_MasterPage_ManagementMenu_Items_ItemsListPanel_CloseButton);
		
		
		JPanel Jpanel_MasterPage_ManagementMenu_Items_tablePanel=new JPanel();
		Jpanel_MasterPage_ManagementMenu_Items_tablePanel.setPreferredSize(new Dimension(1255,590));
		
		DefaultTableModel table_model=new DefaultTableModel(column,0);
		JTable Jpanel_MasterPage_ManagementMenu_Items_tablePanel_table = new JTable(table_model );
		
		JScrollPane jsp=new JScrollPane(Jpanel_MasterPage_ManagementMenu_Items_tablePanel_table);
		jsp.setPreferredSize(new Dimension(1250,580));
		
		Jpanel_MasterPage_ManagementMenu_Items_tablePanel.add(jsp);
		
		JPanel Jpanel_MasterPage_ManagementMenu_Items_ScrollPanel=new JPanel();
		Jpanel_MasterPage_ManagementMenu_Items_ScrollPanel.setPreferredSize(new Dimension(70,500));
		Jpanel_MasterPage_ManagementMenu_Items_ScrollPanel.setBackground(Color.gray);
		
		JButton Jbutton_MasterPage_ManagementMenu_Items_ScrollPanel_UpButton=new JButton("UP");
		Jbutton_MasterPage_ManagementMenu_Items_ScrollPanel_UpButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_Items_ScrollPanel_UpButton.setPreferredSize(new Dimension(65,75));
        
		JButton Jbutton_MasterPage_ManagementMenu_Items_ScrollPanel_DownButton=new JButton("Down");
		Jbutton_MasterPage_ManagementMenu_Items_ScrollPanel_DownButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_Items_ScrollPanel_DownButton.setPreferredSize(new Dimension(65,75));
        
        Jpanel_MasterPage_ManagementMenu_Items_ScrollPanel.add(Jbutton_MasterPage_ManagementMenu_Items_ScrollPanel_UpButton);
        Jpanel_MasterPage_ManagementMenu_Items_ScrollPanel.add(Jbutton_MasterPage_ManagementMenu_Items_ScrollPanel_DownButton);
		
		Jpanel_MasterPage_ManagementMenu_Items_Mainpanel.add(Jpanel_MasterPage_ManagementMenu_Items_ItemsListPanel);
		Jpanel_MasterPage_ManagementMenu_Items_Mainpanel.add(Jpanel_MasterPage_ManagementMenu_Items_tablePanel);
		Jpanel_MasterPage_ManagementMenu_Items_Mainpanel.add(Jpanel_MasterPage_ManagementMenu_Items_ScrollPanel);
		
		frame.add(Jpanel_MasterPage_ManagementMenu_Items_Mainpanel);
        frame.setVisible(true);
        frame.setSize(1370,730);
  //      frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setResizable(false);
     //   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			
	}
}
