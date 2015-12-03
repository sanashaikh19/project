import java.awt.*;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class Management_Special_Instruction extends JFrame 
{
	static String column[]=new String[]{"Value"};
	
	public void Management_Special_Instruction() 
	{
		JFrame frame=new JFrame("Customer List");	
		
		JPanel Jpanel_MasterPage_ManagementMenu_SpecialInstruction_Mainpanel=new JPanel();	
		Jpanel_MasterPage_ManagementMenu_SpecialInstruction_Mainpanel.setBackground(Color.gray);
		
		JPanel Jpanel_MasterPage_ManagementMenu_SpecialInstruction_CategoryPanel=new JPanel();
		Jpanel_MasterPage_ManagementMenu_SpecialInstruction_CategoryPanel.setBorder(new TitledBorder("Category"));
		Jpanel_MasterPage_ManagementMenu_SpecialInstruction_CategoryPanel.setBackground(Color.GRAY);
		Jpanel_MasterPage_ManagementMenu_SpecialInstruction_CategoryPanel.setPreferredSize(new Dimension(1340,170));
		
		
	/*	JScrollPane jsp1=new JScrollPane(Jpanel_MasterPage_ManagementMenu_SpecialInstruction_CategoryPanel);
		Jpanel_MasterPage_ManagementMenu_SpecialInstruction_CategoryPanel.add(jsp1);
		*/
		
		
		JPanel Jpanel_MasterPage_ManagementMenu_SpecialInstruction_AppentizerPanel=new JPanel();
		Jpanel_MasterPage_ManagementMenu_SpecialInstruction_AppentizerPanel.setBorder(new TitledBorder(""));
		Jpanel_MasterPage_ManagementMenu_SpecialInstruction_AppentizerPanel.setBackground(Color.GRAY);
		Jpanel_MasterPage_ManagementMenu_SpecialInstruction_AppentizerPanel.setPreferredSize(new Dimension(870,500));
	
		
		JPanel Jpanel_MasterPage_ManagementMenu_SpecialInstruction_TablePanel=new JPanel();
		Jpanel_MasterPage_ManagementMenu_SpecialInstruction_TablePanel.setBackground(Color.GRAY);
		Jpanel_MasterPage_ManagementMenu_SpecialInstruction_TablePanel.setPreferredSize(new Dimension(450,500));
		
		JLabel empty=new JLabel("");
		empty.setBackground(Color.LIGHT_GRAY);
		empty.setPreferredSize(new Dimension(70,50));
		
		JButton Jbutton_MasterPage_ManagementMenu_SpecialInstruction_TablePanel_AddButton=new JButton("Add");
		Jbutton_MasterPage_ManagementMenu_SpecialInstruction_TablePanel_AddButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_SpecialInstruction_TablePanel_AddButton.setPreferredSize(new Dimension(120,50));
		
		JButton Jbutton_MasterPage_ManagementMenu_SpecialInstruction_TablePanel_EditButton=new JButton("Edit");
		Jbutton_MasterPage_ManagementMenu_SpecialInstruction_TablePanel_EditButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_SpecialInstruction_TablePanel_EditButton.setPreferredSize(new Dimension(120,50));
		
		JButton Jbutton_MasterPage_ManagementMenu_SpecialInstruction_TablePanel_DeleteButton=new JButton("Delete");
		Jbutton_MasterPage_ManagementMenu_SpecialInstruction_TablePanel_DeleteButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_SpecialInstruction_TablePanel_DeleteButton.setPreferredSize(new Dimension(120,50));
		
		DefaultTableModel table_model=new DefaultTableModel(column,0);
		JTable JTable_MasterPage_ManagementMenu_SpecialInstruction_TablePanel_table = new JTable(table_model );
		JScrollPane jsp=new JScrollPane(JTable_MasterPage_ManagementMenu_SpecialInstruction_TablePanel_table);
		jsp.setPreferredSize(new Dimension(750,430));
		
		Jpanel_MasterPage_ManagementMenu_SpecialInstruction_TablePanel.add(empty);
		Jpanel_MasterPage_ManagementMenu_SpecialInstruction_TablePanel.add(Jbutton_MasterPage_ManagementMenu_SpecialInstruction_TablePanel_AddButton);
		Jpanel_MasterPage_ManagementMenu_SpecialInstruction_TablePanel.add(Jbutton_MasterPage_ManagementMenu_SpecialInstruction_TablePanel_EditButton);
		Jpanel_MasterPage_ManagementMenu_SpecialInstruction_TablePanel.add(Jbutton_MasterPage_ManagementMenu_SpecialInstruction_TablePanel_DeleteButton);
		Jpanel_MasterPage_ManagementMenu_SpecialInstruction_TablePanel.add(jsp);
		
		
		Jpanel_MasterPage_ManagementMenu_SpecialInstruction_Mainpanel.add(Jpanel_MasterPage_ManagementMenu_SpecialInstruction_CategoryPanel);
		Jpanel_MasterPage_ManagementMenu_SpecialInstruction_Mainpanel.add(Jpanel_MasterPage_ManagementMenu_SpecialInstruction_AppentizerPanel);
		Jpanel_MasterPage_ManagementMenu_SpecialInstruction_Mainpanel.add(Jpanel_MasterPage_ManagementMenu_SpecialInstruction_TablePanel);
		
		
		frame.add(Jpanel_MasterPage_ManagementMenu_SpecialInstruction_Mainpanel);
        frame.setVisible(true);
        frame.setSize(1370,730);
       // frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setResizable(false);
   //     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}