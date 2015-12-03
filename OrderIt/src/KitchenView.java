
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class KitchenView 
{
	static String column[]=new String[]{"  Order NO  ","  Name  ","  Quantity ","  Table  ","  Order Type  ","  Status  ","  Taken By User  "};
	
	public void KitchenView()
	{
		final JFrame MainFrame=new JFrame("Kitchen View");
	           
		DefaultTableModel model;
	   
		model=new DefaultTableModel(column,0);
		JTable table = new JTable(model );
		
		JScrollPane pane=new JScrollPane(table);
		pane.setPreferredSize(new Dimension(1270,500));
		
		JPanel Panel_main=new JPanel(new FlowLayout(FlowLayout.LEFT));
		Panel_main.setPreferredSize(new Dimension(900,900));
		JPanel panel_show=new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel_show.setBackground(Color.GRAY);
		panel_show.setPreferredSize(new Dimension(1400,80));
		
		JPanel panel_change_status=new JPanel();
		panel_change_status.setBackground(Color.GRAY);
		panel_change_status.setBorder(new TitledBorder("Change Status"));
		
		JPanel panel_item_remark=new JPanel();
		panel_item_remark.setBackground(Color.GRAY);
		panel_item_remark.setBorder(new TitledBorder("Item Remarks"));
		
		JPanel panel_order_remark=new JPanel();
		panel_order_remark.setBackground(Color.GRAY);
		panel_order_remark.setBorder(new TitledBorder("Order Remark"));
		
		JPanel panel_kitchen_view_mode=new JPanel();
		panel_kitchen_view_mode.setBackground(Color.GRAY);
		
		JPanel panel_table=new JPanel();
		panel_table.setBackground(Color.GRAY);
		
		JPanel panel_up_down=new JPanel();
		panel_up_down.setBorder(new TitledBorder(""));
		panel_up_down.setBackground(Color.GRAY);
		panel_up_down.setPreferredSize(new Dimension(80,500));

		JButton button_showall=new JButton("Show All");
		button_showall.setPreferredSize(new Dimension(90,70));
		JButton button_showrecieved=new JButton("Show Recieved (F2)");
		button_showrecieved.setPreferredSize(new Dimension(140,70));
		JButton button_showpreparing=new JButton("Show Prepairing (F3)");
		button_showpreparing.setPreferredSize(new Dimension(140,70));
		JButton button_showprepared=new JButton("Show Prepared (F4)");
		button_showprepared.setPreferredSize(new Dimension(140,70));
		JButton button_showserved=new JButton("Show Served (F5)");
		button_showserved.setPreferredSize(new Dimension(140,70));
		JButton button_showbytable=new JButton("Show By Table (F6)");
		button_showbytable.setPreferredSize(new Dimension(140,70));
		JButton button_showbytakeaway=new JButton("Show By Takeaway (F7)");
		button_showbytakeaway.setPreferredSize(new Dimension(140,70));
		JButton button_showbydining=new JButton("Show By Dining (F8)");
		button_showbydining.setPreferredSize(new Dimension(140,70));
		JButton button_showbydelivery=new JButton("Show By Delivery (F9)");
		button_showbydelivery.setPreferredSize(new Dimension(140,70));
		JButton button_close=new JButton("Close(ESC)");
		button_close.setPreferredSize(new Dimension(100,70));
		
		button_close.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	MainFrame.dispose();            	
            }
        });
		
		panel_show.add(button_showall);
		panel_show.add(button_showrecieved);
		panel_show.add(button_showpreparing);
		panel_show.add( button_showprepared);
		panel_show.add(button_showserved);
		panel_show.add(button_showbytable);
		panel_show.add(button_showbytakeaway);
		panel_show.add(button_showbydining);
		panel_show.add(button_showbydelivery);
		panel_show.add(button_close);
		
		//Change Status
		JButton button_preparing=new JButton("Button_preparing (F9)");
		button_preparing.setPreferredSize(new Dimension(140,70));
		JButton button_prepared=new JButton("Button_prepared (F10)");
		button_prepared.setPreferredSize(new Dimension(140,70));
		JButton button_served=new JButton("Button_served (F11)");
		button_served.setPreferredSize(new Dimension(140,70));
		panel_change_status.add(button_preparing);
		panel_change_status.add(button_prepared);
		panel_change_status.add(button_served);

		//text_itemremark
		JTextField text_itemremark=new JTextField();
		text_itemremark.setPreferredSize(new Dimension(160,70));
		panel_item_remark.add(text_itemremark);
		
		//Text_orderremark
		JTextField text_orderremark=new JTextField();
		text_orderremark.setPreferredSize(new Dimension(160,70));
		panel_order_remark.add(text_orderremark);
		
		//Kitchen Mode
		JLabel label_kitchenmode=new JLabel("Kitchen View Mode");
		panel_kitchen_view_mode.add(label_kitchenmode);
		
		
		
		JButton button_up=new JButton("UP");
		button_up.setPreferredSize(new Dimension(70,70));
		
		JButton button_down=new JButton("DOWN");
		button_down.setPreferredSize(new Dimension(70,70));
		
		panel_table.add(pane);
		panel_up_down.add(button_up);
		panel_up_down.add(button_down);
		panel_table.add(panel_up_down);
		panel_table.add(panel_up_down,BorderLayout.EAST);
		
		Panel_main.add(panel_show);
		Panel_main.add(panel_change_status);
		Panel_main.add(panel_item_remark);
		Panel_main.add(panel_order_remark);
		Panel_main.add(panel_kitchen_view_mode);
		Panel_main.add(panel_table);
		
		MainFrame.add(Panel_main);
		MainFrame.setVisible(true);
		MainFrame.setSize(1000, 1000);
		MainFrame.pack();
		MainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		Panel_main.setBackground(Color.GRAY);
	}

}
