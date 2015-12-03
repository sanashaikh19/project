import java.awt.Color;
import java.awt.Component;
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


public class Wastage_Report implements ActionListener 
{
	static String column[]=new String[]{"Reference No","Date","Table Name","Order Type","Menu Name","Price","Quantity","Total Price"};
	static String item[]={"aaaaaa","bbbbbb","cccccc"};
	JButton button_search, button_print, button_export, button_close;
	JFrame MainFrame = new JFrame("Cash Drawer");
	JCheckBox checkbox_type,checkbox_date,checkbox_table,checkbox_order_no;
	JTextField text_orderno,text_total_price,text_total_count;
	JComboBox combobox_type,combobox_table;
	/*public static void main(String[] args) 
	{
		Wastage_Report wr=new Wastage_Report();
	}*/
	public void Wastage_Report()
	{
		JPanel panel_main = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		panel_main.setBackground(Color.GRAY);
		panel_main.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		
		JPanel panel_wastage=new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel_wastage.setBackground(Color.GRAY);
		panel_wastage.setBorder(new TitledBorder("Wastage"));
		panel_wastage.setPreferredSize(new Dimension(1340,170));
		
		JPanel panel_checkbox=new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel_checkbox.setBackground(Color.GRAY);
		panel_checkbox.setLayout(new GridLayout(4,2,15,15));
		panel_checkbox.setPreferredSize(new Dimension(300,140));
		
		JPanel panel_button=new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel_button.setBackground(Color.GRAY);
		panel_button.setPreferredSize(new Dimension(1000,140));
		
		DefaultTableModel model;
		model=new DefaultTableModel(column,0);
		JTable table = new JTable(model);
		
		JScrollPane pane=new JScrollPane(table);
		pane.setPreferredSize(new Dimension(1340,530));
		
		UtilDateModel model_date = new UtilDateModel();
		model_date.setSelected(true);
        Properties p = new Properties();
		JDatePanelImpl datePanel = new JDatePanelImpl(model_date , p);
		JDatePickerImpl datePicker_date_from = new JDatePickerImpl(datePanel, null);
		datePicker_date_from.setPreferredSize(new Dimension(200,25));
		JDatePickerImpl datePicker_date_to= new JDatePickerImpl(datePanel, null);
		
		checkbox_type=new JCheckBox("Type");
		checkbox_type.setBackground(Color.GRAY);
		checkbox_type.setPreferredSize(new Dimension(100,20));
		checkbox_type.addActionListener(this);
		
		checkbox_date=new JCheckBox("Date");
		checkbox_date.setBackground(Color.GRAY);
		checkbox_date.setPreferredSize(new Dimension(100,20));
		checkbox_date.addActionListener(this);
		
		checkbox_table=new JCheckBox("Table");
		checkbox_table.setBackground(Color.GRAY);
		checkbox_table.addActionListener(this);
		
		checkbox_order_no=new JCheckBox("Order No");
		checkbox_order_no.setBackground(Color.GRAY);
		checkbox_order_no.addActionListener(this);
		
		JLabel label_to=new JLabel("To");
		JLabel label_total_price=new JLabel("Total Price");
		label_total_price.setPreferredSize(new Dimension(70,50));
		JLabel label_total_count=new JLabel("Total Count");
		label_total_count.setPreferredSize(new Dimension(70,50));
		
		text_orderno=new JTextField(10);
		text_orderno.setEnabled(false);
		text_total_price=new JTextField("0.00",8);
		text_total_count=new JTextField("0",8);

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
		
		combobox_type=new JComboBox(item);
		combobox_type.setEnabled(false);
		combobox_type.setPreferredSize(new Dimension(170,20));
		combobox_table=new JComboBox(item);
		combobox_table.setEnabled(false);
		
		panel_checkbox.add(checkbox_date);
		panel_checkbox.add(datePicker_date_from);
		panel_checkbox.add(checkbox_type);
		panel_checkbox.add(combobox_type);
		panel_checkbox.add(checkbox_table);
		panel_checkbox.add(combobox_table);
		panel_checkbox.add(checkbox_order_no);
		panel_checkbox.add(text_orderno);
		
		panel_wastage.add(panel_checkbox);
		panel_wastage.add(panel_button);
		
		panel_button.add(label_to);
		panel_button.add(datePicker_date_to);
		panel_button.add(label_total_price);
		panel_button.add(text_total_price);
		panel_button.add(label_total_count);
		panel_button.add(text_total_count);
		panel_button.add(button_search);
		panel_button.add(button_print);
		panel_button.add(button_export);
		panel_button.add(button_close);
	
		panel_main.add(panel_wastage);
		panel_main.add(pane);
		MainFrame.add(panel_main);
		MainFrame.setVisible(true);
		MainFrame.setSize(500, 600);
		MainFrame.pack();
		MainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);

	}
	public void actionPerformed(ActionEvent ae) {
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
	//	JCheckBox check_type=(JCheckBox) ae.getSource();
		if(checkbox_type.isSelected())
		{
			combobox_type.setEnabled(true);
		}
		else
		{
			combobox_type.setEnabled(false);
		}
		
	//	JCheckBox check_table=(JCheckBox) ae.getSource();
		if(checkbox_table.isSelected())
		{
			combobox_table.setEnabled(true);
		}
		else
		{
			combobox_table.setEnabled(false);
		}
	//	JCheckBox check_order=(JCheckBox) ae.getSource();
		if(checkbox_order_no.isSelected())
		{
			text_orderno.setEnabled(true);
		}
		else
		{
			text_orderno.setEnabled(false);
		}
	}
}
