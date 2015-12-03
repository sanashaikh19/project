import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class Management_Table extends JFrame 
{
	//static String column[]=new String[]{" Name "};
	static String column1[]=new String[]{" Name "};
	
	public void Management_Table() 
	{
		final JFrame frame=new JFrame("Table");
		
		JPanel Jpanel_MasterPage_ManagementMenu_Table_Mainpanel=new JPanel();

		JPanel Jpanel_MasterPage_ManagementMenu_Table_FloorListPanel=new JPanel();
		Jpanel_MasterPage_ManagementMenu_Table_FloorListPanel.setBorder(new TitledBorder("Floor List"));
		Jpanel_MasterPage_ManagementMenu_Table_FloorListPanel.setBackground(Color.GRAY);
		Jpanel_MasterPage_ManagementMenu_Table_FloorListPanel.setPreferredSize(new Dimension(380,685));
		
		JPanel Jpanel_MasterPage_ManagementMenu_Table_FloorListPanel_ButtonPanel=new JPanel();
		Jpanel_MasterPage_ManagementMenu_Table_FloorListPanel_ButtonPanel.setBackground(Color.GRAY);
		
		JButton Jbutton_MasterPage_ManagementMenu_Table_FloorListPanel_ButtonPanel_AddButton=new JButton("Add");
		Jbutton_MasterPage_ManagementMenu_Table_FloorListPanel_ButtonPanel_AddButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_Table_FloorListPanel_ButtonPanel_AddButton.setPreferredSize(new Dimension(105,50));
		
		Jbutton_MasterPage_ManagementMenu_Table_FloorListPanel_ButtonPanel_AddButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	Management_TableFloor_Add management_tablefloor_add=new Management_TableFloor_Add();
            	management_tablefloor_add.Management_TableFloor_Add();
            }
        });
		
		JButton Jbutton_MasterPage_ManagementMenu_Table_FloorListPanel_ButtonPanel_EditButton=new JButton("Edit");
		Jbutton_MasterPage_ManagementMenu_Table_FloorListPanel_ButtonPanel_EditButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_Table_FloorListPanel_ButtonPanel_EditButton.setPreferredSize(new Dimension(105,50));
		
		Jbutton_MasterPage_ManagementMenu_Table_FloorListPanel_ButtonPanel_EditButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	Management_TableFloor_Add management_tablefloor_add=new Management_TableFloor_Add();
            	management_tablefloor_add.Management_TableFloor_Add();
            }
        });
		
		JButton Jbutton_MasterPage_ManagementMenu_Table_FloorListPanel_ButtonPanel_DeleteButton=new JButton("Delete");
		Jbutton_MasterPage_ManagementMenu_Table_FloorListPanel_ButtonPanel_DeleteButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_Table_FloorListPanel_ButtonPanel_DeleteButton.setPreferredSize(new Dimension(105,50));
		
		Jpanel_MasterPage_ManagementMenu_Table_FloorListPanel_ButtonPanel.add(Jbutton_MasterPage_ManagementMenu_Table_FloorListPanel_ButtonPanel_AddButton);
		Jpanel_MasterPage_ManagementMenu_Table_FloorListPanel_ButtonPanel.add(Jbutton_MasterPage_ManagementMenu_Table_FloorListPanel_ButtonPanel_EditButton);
		Jpanel_MasterPage_ManagementMenu_Table_FloorListPanel_ButtonPanel.add(Jbutton_MasterPage_ManagementMenu_Table_FloorListPanel_ButtonPanel_DeleteButton);

		/*	List List1=new List();
		List1.add("element1");
		List1.add("element2");
		List1.add("element3");
		*/
		
	/*	DefaultTableModel table_model=new DefaultTableModel(column,0);
		JTable JTable_MasterPage_ManagementMenu_Table_FloorListPanel_table = new JTable(table_model );
		JScrollPane jsp=new JScrollPane(JTable_MasterPage_ManagementMenu_Table_FloorListPanel_table);
		jsp.setPreferredSize(new Dimension(360,560));
		*/
		
		JPanel Jpanel_MasterPage_ManagementMenu_Table_FloorListPanel_TablePanel=new JPanel();
		Jpanel_MasterPage_ManagementMenu_Table_FloorListPanel_ButtonPanel.setBackground(Color.GRAY);
		
		Jpanel_MasterPage_ManagementMenu_Table_FloorListPanel_TablePanel.setLayout(new java.awt.GridLayout(10, 1));
		 
		for (int i = 0; i < 10; i++) 
	    {
	    	 JButton JButton_MasterPage_ManagementMenu_Table_FloorListPanel_TablePanel_button = new JButton(String.valueOf(i));
	    	 JButton_MasterPage_ManagementMenu_Table_FloorListPanel_TablePanel_button.setPreferredSize(new Dimension(330,50));
	    	 JButton_MasterPage_ManagementMenu_Table_FloorListPanel_TablePanel_button.setBackground(Color.ORANGE);
	    	 JButton_MasterPage_ManagementMenu_Table_FloorListPanel_TablePanel_button.addActionListener(new java.awt.event.ActionListener() 
	         {
	        	 public void actionPerformed(java.awt.event.ActionEvent e) 
	             {        		              
	        		 
	             }
	         });	    	 
	    	 Jpanel_MasterPage_ManagementMenu_Table_FloorListPanel_TablePanel.add(JButton_MasterPage_ManagementMenu_Table_FloorListPanel_TablePanel_button);
	    }
		
		
		Jpanel_MasterPage_ManagementMenu_Table_FloorListPanel.add(Jpanel_MasterPage_ManagementMenu_Table_FloorListPanel_ButtonPanel);
		Jpanel_MasterPage_ManagementMenu_Table_FloorListPanel.add(Jpanel_MasterPage_ManagementMenu_Table_FloorListPanel_TablePanel);
		
		
		JPanel Jpanel_MasterPage_ManagementMenu_Table_TableListPanel=new JPanel();
		Jpanel_MasterPage_ManagementMenu_Table_TableListPanel.setBorder(new TitledBorder("Table List"));
		Jpanel_MasterPage_ManagementMenu_Table_TableListPanel.setBackground(Color.GRAY);
		Jpanel_MasterPage_ManagementMenu_Table_TableListPanel.setPreferredSize(new Dimension(950,685));
		
	
		JPanel Jpanel_MasterPage_ManagementMenu_Table_TableListPanel_ButtonPanel=new JPanel();
		Jpanel_MasterPage_ManagementMenu_Table_TableListPanel_ButtonPanel.setBackground(Color.GRAY);
		
		JLabel empty=new JLabel("");
		empty.setBackground(Color.LIGHT_GRAY);
		empty.setPreferredSize(new Dimension(300,50));
				 
		JButton Jbutton_MasterPage_ManagementMenu_Table_TableListPanel_ButtonPanel_AddButton=new JButton("Add");
		Jbutton_MasterPage_ManagementMenu_Table_TableListPanel_ButtonPanel_AddButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_Table_TableListPanel_ButtonPanel_AddButton.setPreferredSize(new Dimension(150,50));
		
		Jbutton_MasterPage_ManagementMenu_Table_TableListPanel_ButtonPanel_AddButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	Management_Table_Add management_table_add=new Management_Table_Add();
            	management_table_add.Management_Table_Add();
            }
        });
		
		JButton Jbutton_MasterPage_ManagementMenu_Table_TableListPanel_ButtonPanel_EditButton=new JButton("Edit");
		Jbutton_MasterPage_ManagementMenu_Table_TableListPanel_ButtonPanel_EditButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_Table_TableListPanel_ButtonPanel_EditButton.setPreferredSize(new Dimension(150,50));
		
		Jbutton_MasterPage_ManagementMenu_Table_TableListPanel_ButtonPanel_EditButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	Management_Table_Add management_table_add=new Management_Table_Add();
            	management_table_add.Management_Table_Add();
            }
        });
		
		JButton Jbutton_MasterPage_ManagementMenu_Table_TableListPanel_ButtonPanel_DeleteButton=new JButton("Delete");
		Jbutton_MasterPage_ManagementMenu_Table_TableListPanel_ButtonPanel_DeleteButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_Table_TableListPanel_ButtonPanel_DeleteButton.setPreferredSize(new Dimension(150,50));
		
		JButton Jbutton_MasterPage_ManagementMenu_Table_TableListPanel_ButtonPanel_CloseButton=new JButton("Close");
		Jbutton_MasterPage_ManagementMenu_Table_TableListPanel_ButtonPanel_CloseButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_Table_TableListPanel_ButtonPanel_CloseButton.setPreferredSize(new Dimension(150,50));
		
		Jbutton_MasterPage_ManagementMenu_Table_TableListPanel_ButtonPanel_CloseButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	frame.dispose();
            }
        });
		
		Jpanel_MasterPage_ManagementMenu_Table_TableListPanel_ButtonPanel.add(empty);
		Jpanel_MasterPage_ManagementMenu_Table_TableListPanel_ButtonPanel.add(Jbutton_MasterPage_ManagementMenu_Table_TableListPanel_ButtonPanel_AddButton);
		Jpanel_MasterPage_ManagementMenu_Table_TableListPanel_ButtonPanel.add(Jbutton_MasterPage_ManagementMenu_Table_TableListPanel_ButtonPanel_EditButton);
		Jpanel_MasterPage_ManagementMenu_Table_TableListPanel_ButtonPanel.add(Jbutton_MasterPage_ManagementMenu_Table_TableListPanel_ButtonPanel_DeleteButton);
		Jpanel_MasterPage_ManagementMenu_Table_TableListPanel_ButtonPanel.add(Jbutton_MasterPage_ManagementMenu_Table_TableListPanel_ButtonPanel_CloseButton);
	
		
		JPanel Jpanel_MasterPage_ManagementMenu_Table_TableListPanel_TablePanel=new JPanel();
		Jpanel_MasterPage_ManagementMenu_Table_TableListPanel_TablePanel.setBackground(Color.GRAY);
		
		DefaultTableModel table_model1=new DefaultTableModel(column1,0);
		JTable JTable_MasterPage_ManagementMenu_Table_TableListPanel_TablePanel_table = new JTable(table_model1 );
		JTable_MasterPage_ManagementMenu_Table_TableListPanel_TablePanel_table.setBackground(Color.LIGHT_GRAY); 		 
		
		JScrollPane jsp1=new JScrollPane(JTable_MasterPage_ManagementMenu_Table_TableListPanel_TablePanel_table);
		jsp1.setPreferredSize(new Dimension(930,580));

		Jpanel_MasterPage_ManagementMenu_Table_TableListPanel_TablePanel.add(jsp1);
			
		
		Jpanel_MasterPage_ManagementMenu_Table_TableListPanel.add(Jpanel_MasterPage_ManagementMenu_Table_TableListPanel_ButtonPanel);
		Jpanel_MasterPage_ManagementMenu_Table_TableListPanel.add(Jpanel_MasterPage_ManagementMenu_Table_TableListPanel_TablePanel);
		
		Jpanel_MasterPage_ManagementMenu_Table_Mainpanel.add(Jpanel_MasterPage_ManagementMenu_Table_FloorListPanel);
		Jpanel_MasterPage_ManagementMenu_Table_Mainpanel.add(Jpanel_MasterPage_ManagementMenu_Table_TableListPanel);
		
		frame.add(Jpanel_MasterPage_ManagementMenu_Table_Mainpanel);
        frame.setVisible(true);
        frame.setSize(1370,730);
  //      frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setResizable(false);
     //   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
