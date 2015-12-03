
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class Management_Promotion extends JFrame
{
	static String column[]=new String[]{" ID. "," Picture "," Name "," Coupon Code "," Promote Price "," Promote Text "," Language "};
	
	public void Management_Promotion() 
	{
		final JFrame frame=new JFrame("Promotion");
		
		JPanel Jpanel_MasterPage_ManagementMenu_Promotion_Mainpanel=new JPanel();
		Jpanel_MasterPage_ManagementMenu_Promotion_Mainpanel.setBackground(Color.gray);
		
		JPanel Jpanel_MasterPage_ManagementMenu_Promotion_ListPanel=new JPanel();
		Jpanel_MasterPage_ManagementMenu_Promotion_ListPanel.setBorder(new TitledBorder("Promotion List"));
		Jpanel_MasterPage_ManagementMenu_Promotion_ListPanel.setBackground(Color.GRAY);
		Jpanel_MasterPage_ManagementMenu_Promotion_ListPanel.setPreferredSize(new Dimension(1340,90));
        		
		JLabel empty=new JLabel("");
		empty.setPreferredSize(new Dimension(550,50));
		
		JLabel JLabel_MasterPage_ManagementMenu_Promotion_ListPanel_PromoLabel=new JLabel("Promotion List");
		JLabel_MasterPage_ManagementMenu_Promotion_ListPanel_PromoLabel.setPreferredSize(new Dimension(150,50));
		
		JButton Jbutton_MasterPage_ManagementMenu_Promotion_ListPanel_AddButton=new JButton("Add");
		Jbutton_MasterPage_ManagementMenu_Promotion_ListPanel_AddButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_Promotion_ListPanel_AddButton.setPreferredSize(new Dimension(150,50));
		
		Jbutton_MasterPage_ManagementMenu_Promotion_ListPanel_AddButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	Management_Promotion_Add management_promotion_add=new Management_Promotion_Add();
            	management_promotion_add.Management_Promotion_Add();
            }
        });
		
		JButton Jbutton_MasterPage_ManagementMenu_Promotion_ListPanel_EditButton=new JButton("Edit");
		Jbutton_MasterPage_ManagementMenu_Promotion_ListPanel_EditButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_Promotion_ListPanel_EditButton.setPreferredSize(new Dimension(150,50));
		
		Jbutton_MasterPage_ManagementMenu_Promotion_ListPanel_EditButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	Management_Promotion_Add management_promotion_add=new Management_Promotion_Add();
            	management_promotion_add.Management_Promotion_Add();
            }
        });
		
		JButton Jbutton_MasterPage_ManagementMenu_Promotion_ListPanel_DeleteButton=new JButton("Delete");
		Jbutton_MasterPage_ManagementMenu_Promotion_ListPanel_DeleteButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_Promotion_ListPanel_DeleteButton.setPreferredSize(new Dimension(150,50));
		
		JButton Jbutton_MasterPage_ManagementMenu_Promotion_ListPanel_CloseButton=new JButton("Close");
		Jbutton_MasterPage_ManagementMenu_Promotion_ListPanel_CloseButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_ManagementMenu_Promotion_ListPanel_CloseButton.setPreferredSize(new Dimension(150,50));

		Jbutton_MasterPage_ManagementMenu_Promotion_ListPanel_CloseButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	frame.dispose();
            }
        });
		
		Jpanel_MasterPage_ManagementMenu_Promotion_ListPanel.add(empty);
		Jpanel_MasterPage_ManagementMenu_Promotion_ListPanel.add(JLabel_MasterPage_ManagementMenu_Promotion_ListPanel_PromoLabel);
		Jpanel_MasterPage_ManagementMenu_Promotion_ListPanel.add(Jbutton_MasterPage_ManagementMenu_Promotion_ListPanel_AddButton);
		Jpanel_MasterPage_ManagementMenu_Promotion_ListPanel.add(Jbutton_MasterPage_ManagementMenu_Promotion_ListPanel_EditButton);
		Jpanel_MasterPage_ManagementMenu_Promotion_ListPanel.add(Jbutton_MasterPage_ManagementMenu_Promotion_ListPanel_DeleteButton);
		Jpanel_MasterPage_ManagementMenu_Promotion_ListPanel.add(Jbutton_MasterPage_ManagementMenu_Promotion_ListPanel_CloseButton);
		
		
		JPanel Jpanel_MasterPage_ManagementMenu_Promotion_tablePanel=new JPanel();
		Jpanel_MasterPage_ManagementMenu_Promotion_tablePanel.setPreferredSize(new Dimension(1350,590));
		Jpanel_MasterPage_ManagementMenu_Promotion_tablePanel.setBackground(Color.gray);
		
		DefaultTableModel table_model=new DefaultTableModel(column,0);
		JTable Jpanel_MasterPage_ManagementMenu_Promotion_tablePanel_table = new JTable(table_model );
		
		JScrollPane jsp=new JScrollPane(Jpanel_MasterPage_ManagementMenu_Promotion_tablePanel_table);
		jsp.setPreferredSize(new Dimension(1330,580));
		
		Jpanel_MasterPage_ManagementMenu_Promotion_tablePanel.add(jsp);
			
		Jpanel_MasterPage_ManagementMenu_Promotion_Mainpanel.add(Jpanel_MasterPage_ManagementMenu_Promotion_ListPanel);
		Jpanel_MasterPage_ManagementMenu_Promotion_Mainpanel.add(Jpanel_MasterPage_ManagementMenu_Promotion_tablePanel);
				
		frame.add(Jpanel_MasterPage_ManagementMenu_Promotion_Mainpanel);
        frame.setVisible(true);
        frame.setSize(1370,730);
   //     frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setResizable(false);
  //      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
