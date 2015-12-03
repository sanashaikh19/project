import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class Management_Currency extends JFrame 
{
	static String column[]=new String[]{" Name "," Value "," OrderIndex "};
	
	public void Management_Currency() 
	{
		final JFrame frame=new JFrame("Currency");
		
		JPanel Jpanel_MasterPage_ManagementMenu_Currency_Mainpanel=new JPanel();
		Jpanel_MasterPage_ManagementMenu_Currency_Mainpanel.setBackground(Color.gray);
		
		JPanel Jpanel_MasterPage_ManagementMenu_Currency_ListPanel=new JPanel();
		Jpanel_MasterPage_ManagementMenu_Currency_ListPanel.setBorder(new TitledBorder("Currency List"));
		Jpanel_MasterPage_ManagementMenu_Currency_ListPanel.setBackground(Color.GRAY);
		Jpanel_MasterPage_ManagementMenu_Currency_ListPanel.setPreferredSize(new Dimension(1340,90));
		
		JLabel empty=new JLabel("");
		empty.setPreferredSize(new Dimension(550,50));
		
		JLabel JLabel_MasterPage_ManagementMenu_Currency_ListPanel_CurrencyLabel=new JLabel("Currency List");
		JLabel_MasterPage_ManagementMenu_Currency_ListPanel_CurrencyLabel.setPreferredSize(new Dimension(150,50));
				
		JButton Jbutton_MasterPage_ManagementMenu_Currency_ListPanel_AddButton=new JButton("Add");
		Jbutton_MasterPage_ManagementMenu_Currency_ListPanel_AddButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_Currency_ListPanel_AddButton.setPreferredSize(new Dimension(150,50));
		
		Jbutton_MasterPage_ManagementMenu_Currency_ListPanel_AddButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	Management_Currency_Add management_currency_add=new Management_Currency_Add();
            	management_currency_add.Management_Currency_Add();
            }
        });
		
		JButton Jbutton_MasterPage_ManagementMenu_Currency_ListPanel_EditButton=new JButton("Edit");
		Jbutton_MasterPage_ManagementMenu_Currency_ListPanel_EditButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_Currency_ListPanel_EditButton.setPreferredSize(new Dimension(150,50));
		
		Jbutton_MasterPage_ManagementMenu_Currency_ListPanel_EditButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	Management_Currency_Add management_currency_add=new Management_Currency_Add();
            	management_currency_add.Management_Currency_Add();
            }
        });
		
		JButton Jbutton_MasterPage_ManagementMenu_Currency_ListPanel_DeleteButton=new JButton("Delete");
		Jbutton_MasterPage_ManagementMenu_Currency_ListPanel_DeleteButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_Currency_ListPanel_DeleteButton.setPreferredSize(new Dimension(150,50));
		
		JButton Jbutton_MasterPage_ManagementMenu_Currency_ListPanel_CloseButton=new JButton("Close");
		Jbutton_MasterPage_ManagementMenu_Currency_ListPanel_CloseButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_Currency_ListPanel_CloseButton.setPreferredSize(new Dimension(150,50));
		
		Jbutton_MasterPage_ManagementMenu_Currency_ListPanel_CloseButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	frame.dispose();
            }
        });
		
		Jpanel_MasterPage_ManagementMenu_Currency_ListPanel.add(empty);
		Jpanel_MasterPage_ManagementMenu_Currency_ListPanel.add(JLabel_MasterPage_ManagementMenu_Currency_ListPanel_CurrencyLabel);
		Jpanel_MasterPage_ManagementMenu_Currency_ListPanel.add(Jbutton_MasterPage_ManagementMenu_Currency_ListPanel_AddButton);
		Jpanel_MasterPage_ManagementMenu_Currency_ListPanel.add(Jbutton_MasterPage_ManagementMenu_Currency_ListPanel_EditButton);
		Jpanel_MasterPage_ManagementMenu_Currency_ListPanel.add(Jbutton_MasterPage_ManagementMenu_Currency_ListPanel_DeleteButton);
		Jpanel_MasterPage_ManagementMenu_Currency_ListPanel.add(Jbutton_MasterPage_ManagementMenu_Currency_ListPanel_CloseButton);
		
		
		JPanel Jpanel_MasterPage_ManagementMenu_Currency_TablePanel=new JPanel();
		Jpanel_MasterPage_ManagementMenu_Currency_TablePanel.setBackground(Color.GRAY);
		Jpanel_MasterPage_ManagementMenu_Currency_TablePanel.setPreferredSize(new Dimension(1235,590));
		
		DefaultTableModel table_model=new DefaultTableModel(column,0);
		JTable JTable_MasterPage_ManagementMenu_Currency_TablePanel_table = new JTable(table_model );
		JScrollPane jsp=new JScrollPane(JTable_MasterPage_ManagementMenu_Currency_TablePanel_table);
		jsp.setPreferredSize(new Dimension(1225,580));
		
		Jpanel_MasterPage_ManagementMenu_Currency_TablePanel.add(jsp);
		
		JPanel Jpanel_MasterPage_ManagementMenu_Currency_RearrangePanel=new JPanel();
		Jpanel_MasterPage_ManagementMenu_Currency_RearrangePanel.setBorder(new TitledBorder("Rearrange"));
		Jpanel_MasterPage_ManagementMenu_Currency_RearrangePanel.setBackground(Color.GRAY);
		Jpanel_MasterPage_ManagementMenu_Currency_RearrangePanel.setPreferredSize(new Dimension(100,590));
		
		JButton Jbutton_MasterPage_ManagementMenu_Currency_RearrangePanel_UpButton=new JButton("UP");
		Jbutton_MasterPage_ManagementMenu_Currency_RearrangePanel_UpButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_Currency_RearrangePanel_UpButton.setPreferredSize(new Dimension(70,85));
        
		JButton Jbutton_MasterPage_ManagementMenu_Currency_RearrangePanel_DownButton=new JButton("Down");
		Jbutton_MasterPage_ManagementMenu_Currency_RearrangePanel_DownButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_Currency_RearrangePanel_DownButton.setPreferredSize(new Dimension(70,85));
		
		Jpanel_MasterPage_ManagementMenu_Currency_RearrangePanel.add(Jbutton_MasterPage_ManagementMenu_Currency_RearrangePanel_UpButton);
		Jpanel_MasterPage_ManagementMenu_Currency_RearrangePanel.add(Jbutton_MasterPage_ManagementMenu_Currency_RearrangePanel_DownButton);
		
		Jpanel_MasterPage_ManagementMenu_Currency_Mainpanel.add(Jpanel_MasterPage_ManagementMenu_Currency_ListPanel);
		Jpanel_MasterPage_ManagementMenu_Currency_Mainpanel.add(Jpanel_MasterPage_ManagementMenu_Currency_TablePanel);
		Jpanel_MasterPage_ManagementMenu_Currency_Mainpanel.add(Jpanel_MasterPage_ManagementMenu_Currency_RearrangePanel);
		
		frame.add(Jpanel_MasterPage_ManagementMenu_Currency_Mainpanel);
        frame.setVisible(true);
        frame.setSize(1370,730);
    //    frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setResizable(false);
       // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
