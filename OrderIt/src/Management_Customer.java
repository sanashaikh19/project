import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class Management_Customer extends JFrame 
{
	static String column[]=new String[]{"Name","","","Address"};
	
	public void Management_Customer() 
	{
		final JFrame frame=new JFrame("Customer List");	
		
		JPanel Jpanel_MasterPage_ManagementMenu_Customer_Mainpanel=new JPanel();
		Jpanel_MasterPage_ManagementMenu_Customer_Mainpanel.setBackground(Color.gray);
	
		JPanel Jpanel_MasterPage_ManagementMenu_Customer_ListPanel=new JPanel();
		Jpanel_MasterPage_ManagementMenu_Customer_ListPanel.setBorder(new TitledBorder("Customer List"));
		Jpanel_MasterPage_ManagementMenu_Customer_ListPanel.setBackground(Color.GRAY);
		Jpanel_MasterPage_ManagementMenu_Customer_ListPanel.setPreferredSize(new Dimension(1340,80));
		
		JLabel empty=new JLabel("");
		empty.setBackground(Color.LIGHT_GRAY);
		empty.setPreferredSize(new Dimension(195,50));
		
		JTextField JTextField_MasterPage_ManagementMenu_Customer_ListPanel_SearchTextF=new JTextField();
		JTextField_MasterPage_ManagementMenu_Customer_ListPanel_SearchTextF.setPreferredSize(new Dimension(185,45));
		
		JButton Jbutton_MasterPage_ManagementMenu_Customer_ListPanel_SearchButton=new JButton("Search");
		Jbutton_MasterPage_ManagementMenu_Customer_ListPanel_SearchButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_Customer_ListPanel_SearchButton.setPreferredSize(new Dimension(150,50));
		
		JButton Jbutton_MasterPage_ManagementMenu_Customer_ListPanel_ExportButton=new JButton("Export");
		Jbutton_MasterPage_ManagementMenu_Customer_ListPanel_ExportButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_Customer_ListPanel_ExportButton.setPreferredSize(new Dimension(150,50));
		
		JButton Jbutton_MasterPage_ManagementMenu_Customer_ListPanel_AddButton=new JButton("Add");
		Jbutton_MasterPage_ManagementMenu_Customer_ListPanel_AddButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_Customer_ListPanel_AddButton.setPreferredSize(new Dimension(150,50));
		
		Jbutton_MasterPage_ManagementMenu_Customer_ListPanel_AddButton.addActionListener(new ActionListener() 
	    {
			public void actionPerformed(ActionEvent e) 
	        {
				Management_Customer_Add customer_add=new Management_Customer_Add();
				customer_add.Management_Customer_Add();
	        }
	    });
		
		JButton Jbutton_MasterPage_ManagementMenu_Customer_ListPanel_EditButton=new JButton("Edit");
		Jbutton_MasterPage_ManagementMenu_Customer_ListPanel_EditButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_Customer_ListPanel_EditButton.setPreferredSize(new Dimension(150,50));
		
		Jbutton_MasterPage_ManagementMenu_Customer_ListPanel_EditButton.addActionListener(new ActionListener() 
	    {
			public void actionPerformed(ActionEvent e) 
	        {
				Management_Customer_Add customer_add=new Management_Customer_Add();
				customer_add.Management_Customer_Add();
	        }
	    });
		
		JButton Jbutton_MasterPage_ManagementMenu_Customer_ListPanel_DeleteButton=new JButton("Delete");
		Jbutton_MasterPage_ManagementMenu_Customer_ListPanel_DeleteButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_Customer_ListPanel_DeleteButton.setPreferredSize(new Dimension(150,50));
		
		JButton Jbutton_MasterPage_ManagementMenu_Customer_ListPanel_CloseButton=new JButton("Close");
		Jbutton_MasterPage_ManagementMenu_Customer_ListPanel_CloseButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_Customer_ListPanel_CloseButton.setPreferredSize(new Dimension(150,50));
		
		Jbutton_MasterPage_ManagementMenu_Customer_ListPanel_CloseButton.addActionListener(new ActionListener() 
	    {
			public void actionPerformed(ActionEvent e) 
	        {
				frame.dispose();
	        }
	    });
		
		Jpanel_MasterPage_ManagementMenu_Customer_ListPanel.add(empty);
		Jpanel_MasterPage_ManagementMenu_Customer_ListPanel.add(JTextField_MasterPage_ManagementMenu_Customer_ListPanel_SearchTextF);
		Jpanel_MasterPage_ManagementMenu_Customer_ListPanel.add(Jbutton_MasterPage_ManagementMenu_Customer_ListPanel_SearchButton);
		Jpanel_MasterPage_ManagementMenu_Customer_ListPanel.add(Jbutton_MasterPage_ManagementMenu_Customer_ListPanel_ExportButton);
		Jpanel_MasterPage_ManagementMenu_Customer_ListPanel.add(Jbutton_MasterPage_ManagementMenu_Customer_ListPanel_AddButton);
		Jpanel_MasterPage_ManagementMenu_Customer_ListPanel.add(Jbutton_MasterPage_ManagementMenu_Customer_ListPanel_EditButton);
		Jpanel_MasterPage_ManagementMenu_Customer_ListPanel.add(Jbutton_MasterPage_ManagementMenu_Customer_ListPanel_DeleteButton);
		Jpanel_MasterPage_ManagementMenu_Customer_ListPanel.add(Jbutton_MasterPage_ManagementMenu_Customer_ListPanel_CloseButton);
		
		
		
		
		JPanel Jpanel_MasterPage_ManagementMenu_Customer_TablePanel=new JPanel();
		Jpanel_MasterPage_ManagementMenu_Customer_TablePanel.setBackground(Color.GRAY);
		Jpanel_MasterPage_ManagementMenu_Customer_TablePanel.setPreferredSize(new Dimension(1340,600));
		
		DefaultTableModel table_model=new DefaultTableModel(column,0);
		JTable JTable_MasterPage_ManagementMenu_Customer_TablePanel_table = new JTable(table_model );
		JScrollPane jsp=new JScrollPane(JTable_MasterPage_ManagementMenu_Customer_TablePanel_table);
		jsp.setPreferredSize(new Dimension(1330,590));
		
		Jpanel_MasterPage_ManagementMenu_Customer_TablePanel.add(jsp);
				
		
		Jpanel_MasterPage_ManagementMenu_Customer_Mainpanel.add(Jpanel_MasterPage_ManagementMenu_Customer_ListPanel);
		Jpanel_MasterPage_ManagementMenu_Customer_Mainpanel.add(Jpanel_MasterPage_ManagementMenu_Customer_TablePanel);
			
		frame.add(Jpanel_MasterPage_ManagementMenu_Customer_Mainpanel);
        frame.setVisible(true);
        frame.setSize(1370,730);
      //  frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setResizable(false);
     //   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
