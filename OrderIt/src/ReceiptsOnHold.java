import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

public class ReceiptsOnHold 
{
	static String column[]=new String[]{" Order NO "," Name "," Phone "," Address "," Date "," Postal Code "," Total ","Status "};
	
	public void ReceiptsOnHold() 
	{
		JFrame frame = new JFrame("Receipt On Hold");
		
		JPanel Jpanel_MasterPage_ViewPanel_POS_ButtonPanel_Delivery_Mainpanel=new JPanel();
		Jpanel_MasterPage_ViewPanel_POS_ButtonPanel_Delivery_Mainpanel.setBackground(Color.GRAY);
        
        JPanel Jpanel_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel=new JPanel();
        Jpanel_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel.setBackground(Color.GRAY);
        Jpanel_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel.setPreferredSize(new Dimension(1330,100));
                
        JPanel Jpanel_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_GridPanel=new JPanel();
        Jpanel_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_GridPanel.setLayout(new GridLayout(2,4,5,30));
        Jpanel_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_GridPanel.setBackground(Color.GRAY);
        Jpanel_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_GridPanel.setPreferredSize(new Dimension(400,90));
                
        JRadioButton Jbutton_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_date=new JRadioButton("Date");
        Jbutton_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_date.setBackground(Color.GRAY);
        Jbutton_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_date.setPreferredSize(new Dimension(160,30));
        
        UtilDateModel model;
        JDatePanelImpl datePanel;
        model = new UtilDateModel();
        model.setSelected(true);
        Properties p = new Properties();
        datePanel = new JDatePanelImpl(model,p);
        JDatePickerImpl JDatePicker_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_datePicker = new JDatePickerImpl(datePanel,null);
        JDatePicker_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_datePicker.setBounds(530,45,110,30);
        JDatePicker_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_datePicker.setBackground(Color.GRAY);
        
        JLabel JLabel_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_To=new JLabel("            TO");
        JLabel_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_To.setBackground(Color.GRAY);
        JLabel_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_To.setPreferredSize(new Dimension(30,30));
            
        UtilDateModel model1;
        JDatePanelImpl datePanel1;
        model1 = new UtilDateModel();
        model1.setSelected(true);
        datePanel1 = new JDatePanelImpl(model,p);
        JDatePickerImpl JDatePicker_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_datePicker1 = new JDatePickerImpl(datePanel,null);
        JDatePicker_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_datePicker1.setBounds(530,45,110,30);
        JDatePicker_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_datePicker1.setBackground(Color.GRAY);
        
        
        JRadioButton Jbutton_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_keyword=new JRadioButton("Keyword");
        Jbutton_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_keyword.setBackground(Color.GRAY);
        Jbutton_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_keyword.setPreferredSize(new Dimension(120,30));
        
        JTextField JTextField_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_KeywordText=new JTextField();
        JTextField_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_KeywordText.setBackground(Color.white);
        JTextField_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_KeywordText.setPreferredSize(new Dimension(120,30));
        
        JLabel empty=new JLabel("");
        empty.setBackground(Color.GRAY);
        empty.setPreferredSize(new Dimension(30,30));
        
        JLabel empty1=new JLabel("");
        empty1.setBackground(Color.GRAY);
        empty1.setPreferredSize(new Dimension(30,30));
        
        JLabel empty2=new JLabel("");
        empty2.setBackground(Color.GRAY);
        empty2.setPreferredSize(new Dimension(30,30));
        
        JButton Jbutton_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_search=new JButton("Search");
        Jbutton_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_search.setBackground(Color.LIGHT_GRAY);
        Jbutton_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_search.setPreferredSize(new Dimension(150,90));
        
        JLabel empty3=new JLabel("");
        empty3.setBackground(Color.GRAY);
        empty3.setPreferredSize(new Dimension(30,30));
        
        JPanel Jpanel_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_GridPanel1=new JPanel();
        Jpanel_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_GridPanel1.setLayout(new GridLayout(2,2,10,30));
        Jpanel_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_GridPanel1.setBackground(Color.GRAY);
        Jpanel_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_GridPanel1.setPreferredSize(new Dimension(300,90));
        
        JLabel JLabel_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_TotalOnHold=new JLabel("Total On Hold");
        JLabel_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_TotalOnHold.setBackground(Color.GRAY);
        JLabel_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_TotalOnHold.setPreferredSize(new Dimension(110,30));
        
        JTextField JTextField_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_ReceiptsOnHoldText=new JTextField();
        JTextField_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_ReceiptsOnHoldText.setBackground(Color.white);
        JTextField_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_ReceiptsOnHoldText.setPreferredSize(new Dimension(120,30));
        
        JLabel JLabel_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_TotalSales=new JLabel("Total Sales");
        JLabel_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_TotalSales.setBackground(Color.GRAY);
        JLabel_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_TotalSales.setPreferredSize(new Dimension(80,30));
              
        JTextField JTextField_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_SalesText=new JTextField();
        JTextField_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_SalesText.setBackground(Color.white);
        JTextField_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_SalesText.setPreferredSize(new Dimension(120,30));
        
        JLabel empty4=new JLabel("");
        empty4.setBackground(Color.GRAY);
        empty4.setPreferredSize(new Dimension(230,30));
        
        JButton Jbutton_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_edit=new JButton("Edit");
        Jbutton_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_edit.setBackground(Color.LIGHT_GRAY);
        Jbutton_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_edit.setPreferredSize(new Dimension(70,85));
        
        Jbutton_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_edit.addActionListener(new ActionListener() 
	    {
			public void actionPerformed(ActionEvent e) 
	        {
				POS_Reservation_Addd reser_add=new POS_Reservation_Addd();
				reser_add.POS_Reservation_Addd();
	        }
	    });
        
        JButton Jbutton_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_delete=new JButton("Delete");
        Jbutton_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_delete.setBackground(Color.LIGHT_GRAY);
        Jbutton_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_delete.setPreferredSize(new Dimension(70,85));
        
        Jpanel_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_GridPanel.add(Jbutton_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_date);
        Jpanel_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_GridPanel.add(JDatePicker_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_datePicker);
        Jpanel_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_GridPanel.add(JLabel_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_To);
        Jpanel_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_GridPanel.add(JDatePicker_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_datePicker1);
        Jpanel_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_GridPanel.add(Jbutton_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_keyword);
        Jpanel_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_GridPanel.add(JTextField_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_KeywordText);
        Jpanel_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_GridPanel.add(empty);
        Jpanel_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_GridPanel.add(empty1);
        
        Jpanel_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_GridPanel1.add(JLabel_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_TotalOnHold);
        Jpanel_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_GridPanel1.add(JTextField_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_ReceiptsOnHoldText);
        Jpanel_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_GridPanel1.add(JLabel_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_TotalSales);
        Jpanel_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_GridPanel1.add(JTextField_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_SalesText);
            
        Jpanel_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel.add(Jpanel_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_GridPanel);
        Jpanel_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel.add(empty2);
        Jpanel_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel.add(Jbutton_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_search);
        Jpanel_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel.add(empty3);
        Jpanel_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel.add(Jpanel_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_GridPanel1);
        Jpanel_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel.add(empty4);
        Jpanel_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel.add(Jbutton_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_edit);
        Jpanel_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel.add(Jbutton_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel_delete);
        
        JPanel Jpanel_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_tablePanel=new JPanel();
        Jpanel_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_tablePanel.setBackground(Color.GRAY);
        
        DefaultTableModel table_model=new DefaultTableModel(column,0);
		JTable JTable_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_tablePanel_table = new JTable(table_model );
		JScrollPane jsp=new JScrollPane(JTable_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_tablePanel_table);
		jsp.setPreferredSize(new Dimension(1330,290));
		
		Jpanel_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_tablePanel.add(jsp);
        
        Jpanel_MasterPage_ViewPanel_POS_ButtonPanel_Delivery_Mainpanel.add(Jpanel_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_typePanel);
        Jpanel_MasterPage_ViewPanel_POS_ButtonPanel_Delivery_Mainpanel.add(Jpanel_MasterPage_ViewPanel_POS_ButtonPanel_receiptsOnHoldButton_tablePanel);
        
        frame.add(Jpanel_MasterPage_ViewPanel_POS_ButtonPanel_Delivery_Mainpanel);
        frame.setVisible(true);
        frame.setSize(1350,450);
        frame.setLocation(10,270);
    //    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
}