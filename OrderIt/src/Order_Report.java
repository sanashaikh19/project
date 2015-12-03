import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;


public class Order_Report implements ActionListener 
{
	static String item[]={"aaaaaa","bbbbbb","cccccc"};
	static String column[]=new String[]{"Order NO"," Menu Name ","Department","Quantity","Recieved time","Recieved User","Preparing Time","Preparing User","Served Time","Served User","Table"};
	JButton button_search, button_print, button_export, button_close;
	JFrame MainFrame=new JFrame("Order_Report");
	JCheckBox checkbox_type,checkbox_date,checkbox_tablename,checkbox_orderno,checkbox_status,checkbox_user;
	JTextField text_orderno;
	JComboBox combobox_type,combobox_tablename,combobox_user,combobox_status;
/*	public static void main(String[] args) 
	{
		Order_Report or=new Order_Report();
	}*/
	public void Order_Report()
	{
		JPanel panel_main=new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel_main.setBackground(Color.GRAY);
		
		JPanel panel_table=new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		JPanel panel_order_log_list=new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel_order_log_list.setPreferredSize(new Dimension(1300,20));
		panel_order_log_list.setBackground(Color.GRAY);
	
		JPanel panel_checkbox=new JPanel();
		panel_checkbox.setLayout(new GridLayout(5,2,10,10));
		panel_checkbox.setBackground(Color.GRAY);
		
		JPanel panel_date=new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		panel_date.setBackground(Color.GRAY);
		panel_date.setPreferredSize(new Dimension(1200,60));
		
		DefaultTableModel model_table;
		   
		model_table=new DefaultTableModel(column,0);
		JTable table = new JTable(model_table );
		
		JScrollPane pane=new JScrollPane(table);
		pane.setPreferredSize(new Dimension(1330,1100));
		table.setBackground(Color.GRAY);
		
		panel_table.add(pane);
		
		UtilDateModel model = new UtilDateModel();
		model.setSelected(true);
        Properties p = new Properties();
		JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
		JDatePickerImpl datePicker_date_from = new JDatePickerImpl(datePanel, null);
		datePicker_date_from.setPreferredSize(new Dimension(200,25));
		JDatePickerImpl datePicker_date_to= new JDatePickerImpl(datePanel, null);
		
		checkbox_type=new JCheckBox("Type");
		checkbox_type.setBackground(Color.GRAY);
		checkbox_type.addActionListener(this);
		
		checkbox_date=new JCheckBox("Date");
		checkbox_date.setBackground(Color.GRAY);
		checkbox_date.setPreferredSize(new Dimension(100,20));
		checkbox_date.addActionListener(this);
		
		checkbox_tablename=new JCheckBox("Table Name");
		checkbox_tablename.setBackground(Color.GRAY);
		checkbox_tablename.addActionListener(this);
		
		checkbox_orderno=new JCheckBox("Order No");
		checkbox_orderno.setBackground(Color.GRAY);
		checkbox_orderno.addActionListener(this);
		
		checkbox_status=new JCheckBox("Status");
		checkbox_status.setBackground(Color.GRAY);
		checkbox_status.addActionListener(this);
		
		checkbox_user=new JCheckBox("User");
		checkbox_user.setBackground(Color.GRAY);
		checkbox_user.addActionListener(this);
		
		JLabel label_from=new JLabel("From");
		
		JLabel label_to=new JLabel("To");
		JLabel label_order_log_list=new JLabel("Order Log List");
		
		button_search = new JButton("Search");
		button_search.setPreferredSize(new Dimension(100, 50));
		button_search.addActionListener((ActionListener) this);
		button_print = new JButton("Print");
		button_print.setPreferredSize(new Dimension(100, 50));
		button_print.addActionListener((ActionListener) this);
		button_export = new JButton("Export");
		button_export.setPreferredSize(new Dimension(100, 50));
		button_export.addActionListener((ActionListener) this);
		button_close = new JButton("Close");
		button_close.setPreferredSize(new Dimension(100, 50));
		button_close.addActionListener((ActionListener) this);
		
		text_orderno=new JTextField(10);
		text_orderno.setEnabled(false);

		combobox_type=new JComboBox(item);
		combobox_type.setPreferredSize(new Dimension(170,20));
		combobox_type.setEnabled(false);
		
		combobox_tablename=new JComboBox(item);
		combobox_tablename.setEnabled(false);
		
		combobox_user=new JComboBox(item);
		combobox_user.setEnabled(false);

		combobox_status=new JComboBox(item);
		combobox_status.setEnabled(false);

		
		panel_date.add(checkbox_date);
		panel_date.add(label_from);
		
		panel_date.add(datePicker_date_from);
		panel_date.add(label_to);
		panel_date.add(datePicker_date_to);
		panel_date.add(button_search);
		panel_date.add(button_print);
		panel_date.add(button_export);
		panel_date.add(button_close);
		
		panel_checkbox.add(checkbox_orderno);
		panel_checkbox.add(text_orderno);
		panel_checkbox.add(checkbox_tablename);
		panel_checkbox.add(combobox_tablename);
		panel_checkbox.add(checkbox_user);
		panel_checkbox.add(combobox_user);
		panel_checkbox.add(checkbox_type);
		panel_checkbox.add(combobox_type);
		panel_checkbox.add(checkbox_status);
		panel_checkbox.add(combobox_status);
		
		panel_order_log_list.add(label_order_log_list);
		
		panel_main.add(panel_date);
		panel_main.add(panel_checkbox);
		panel_main.add(panel_order_log_list);
		panel_main.add(panel_table);
		
		MainFrame.add(panel_main);
		MainFrame.setVisible(true);
		MainFrame.setSize(500,500);
		MainFrame.pack();
		MainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
	public void actionPerformed(ActionEvent ae) 
	{
		if (ae.getSource() == button_close)
		{
			MainFrame.dispose();
		}
		if (ae.getSource() == button_search)
		{

		}
		if (ae.getSource() == button_export)
		{

		}
		if (ae.getSource() == button_print)
		{
			
		}
	//	JCheckBox check_order=(JCheckBox) ae.getSource();
		if(checkbox_orderno.isSelected())
		{
			text_orderno.setEnabled(true);
		}
		else
		{
			text_orderno.setEnabled(false);
		}
		if (ae.getSource() == button_print)
		{
			
		}
	//	JCheckBox check_type=(JCheckBox) ae.getSource();
		if(	checkbox_type.isSelected())
		{
			combobox_type.setEnabled(true);
		}
		else
		{
			combobox_type.setEnabled(false);
		}
	//	JCheckBox check_tablename=(JCheckBox) ae.getSource();
		if(	checkbox_tablename.isSelected())
		{
			combobox_tablename.setEnabled(true);
		}
		else
		{
			combobox_tablename.setEnabled(false);
		}
	//	JCheckBox check_user=(JCheckBox) ae.getSource();
		if(	checkbox_user.isSelected())
		{
			combobox_user.setEnabled(true);
		}
		else
		{
			combobox_user.setEnabled(false);
		}
//		JCheckBox check_status=(JCheckBox) ae.getSource();
		if(	checkbox_status.isSelected())
		{
			combobox_status.setEnabled(true);
		}
		else
		{
			combobox_status.setEnabled(false);
		}

	
	}

}
