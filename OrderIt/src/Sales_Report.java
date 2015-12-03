import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JFormattedTextField.AbstractFormatter;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DateFormatter;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

public class Sales_Report implements ActionListener 
{
	static String item[] = { "aaaaaa", "bbbbbb", "cccccc" };
	static String column[] = new String[] { "Order No", "Inovoice No","DateTime", "Name", "Address", "Phone", "PostalCode", "User Name","Total", "Service", "Tax", "TotalPa" };
	JButton button_search, button_print, button_export, button_close;
	JFrame MainFrame = new JFrame("Sales Report");
	JCheckBox checkbox_type,checkbox_table,checkbox_orderno,checkbox_inovoiceno,checkbox_user,checkbox_date;
	JComboBox combobox_type,combobox_table,combobox_user;
	JTextField text_order,text_inovoice,text_date;
	JDatePickerImpl datePicker_date_from,datePicker_date_to ;

	/*public static void main(String[] args) {
		Sales_Report sr = new Sales_Report();
	}*/

	public void Sales_Report() {
		JPanel panel_main = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel_main.setBackground(Color.GRAY);

		JPanel panel_search = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel_search.setBackground(Color.GRAY);
		panel_search.setBorder(new TitledBorder("Search"));
	    panel_search.setPreferredSize(new Dimension(1400, 250));

		JPanel panel_report = new JPanel();
		panel_report.setBackground(Color.GRAY);
		panel_report.setBorder(new TitledBorder("Report"));
		panel_report.setPreferredSize(new Dimension(500, 120));

		JPanel panel_checkbox = new JPanel();
		panel_checkbox.setBackground(Color.GRAY);
		panel_checkbox.setPreferredSize(new Dimension(300, 200));
		panel_checkbox.setLayout(new GridLayout(6, 2, 10, 10));

		JPanel panel_button = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel_button.setBackground(Color.GRAY);
		panel_button.setPreferredSize(new Dimension(700, 200));

		checkbox_type = new JCheckBox("Type");
		checkbox_type.addActionListener(this);
		checkbox_type.setBackground(Color.GRAY);
		
		checkbox_date = new JCheckBox("Date");
		checkbox_date.setBackground(Color.GRAY);
		checkbox_date.setBackground(Color.GRAY);
		
		checkbox_table = new JCheckBox("Table");
		checkbox_table.setBackground(Color.GRAY);
		checkbox_table.addActionListener(this);
		
		checkbox_orderno = new JCheckBox("Order No");
		checkbox_orderno.setBackground(Color.GRAY);
		checkbox_orderno.addActionListener(this);

		checkbox_inovoiceno = new JCheckBox("Inovoice No");
		checkbox_inovoiceno.setBackground(Color.GRAY);
		checkbox_inovoiceno.addActionListener(this);
		
		checkbox_user = new JCheckBox("User");
		checkbox_user.setBackground(Color.GRAY);
		checkbox_user.addActionListener(this);

		combobox_type = new JComboBox(item);
		combobox_type.setEnabled(false);
		combobox_type.addActionListener(this);

		combobox_table = new JComboBox(item);
		combobox_table.setEnabled(false);
		combobox_table.addActionListener(this);

		combobox_user = new JComboBox(item);
		combobox_user.setEnabled(false);
		combobox_user.addActionListener(this);

		text_order = new JTextField(7);
		text_order.setEnabled(false);
		
		text_inovoice = new JTextField(7);
		text_inovoice.setEnabled(false);

		text_date = new JTextField(7);
		text_date.setEnabled(false);


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

		JLabel label_totalservicecost = new JLabel("Total Service Cost:");
		JLabel label_totaltax = new JLabel("Total Tax:");
		JLabel label_totalsales = new JLabel("Total Salse:");
		JLabel label_totaltransectioncost = new JLabel("Total Transection Cost:");
		JLabel label_totaldiscount = new JLabel("Total Discount:");
		JLabel label_totalcount = new JLabel("Total Count:");
		JLabel label_to = new JLabel("To");

		JTextField text_servicecost = new JTextField("0.00", 5);
		text_servicecost.setBackground(Color.GRAY);
		JTextField text_tax = new JTextField("0.00", 5);
		text_tax.setBackground(Color.GRAY);
		JTextField text_sales = new JTextField("0.00", 5);
		text_sales.setBackground(Color.GRAY);
		JTextField text_transectioncost = new JTextField("0", 5);
		text_transectioncost.setBackground(Color.GRAY);
		JTextField text_discount = new JTextField("0", 5);
		text_discount.setBackground(Color.GRAY);
		JTextField text_count = new JTextField("0", 5);
		text_count.setBackground(Color.GRAY);

		UtilDateModel model = new UtilDateModel();
		Properties p = new Properties();
		JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
		datePicker_date_from = new JDatePickerImpl(datePanel, null);
		datePicker_date_from.setEnabled(false);
		datePicker_date_to = new JDatePickerImpl(datePanel, null);
	
		DefaultTableModel model_table;

		model_table = new DefaultTableModel(column, 0);
		JTable table = new JTable(model_table);

		JScrollPane pane = new JScrollPane(table);
		pane.setPreferredSize(new Dimension(1350, 1000));
		table.setBackground(Color.GRAY);

		panel_checkbox.add(checkbox_type);
		panel_checkbox.add(combobox_type);
		panel_checkbox.add(checkbox_date);

		panel_checkbox.add(datePicker_date_from);
		panel_checkbox.add(checkbox_table);
		panel_checkbox.add(combobox_table);
		panel_checkbox.add(checkbox_orderno);
		panel_checkbox.add(text_order);
		panel_checkbox.add(checkbox_inovoiceno);
		panel_checkbox.add(text_inovoice);
		panel_checkbox.add(checkbox_user);
		panel_checkbox.add(combobox_user);

		panel_button.add(label_to);
		panel_button.add(datePicker_date_to);
		panel_button.add(button_search);
		panel_button.add(button_print);
		panel_button.add(button_export);
		panel_button.add(button_close);

		panel_report.add(label_totalservicecost);
		panel_report.add(text_servicecost);
		panel_report.add(label_totaltax);
		panel_report.add(text_tax);
		panel_report.add(label_totalsales);
		panel_report.add(text_sales);
		panel_report.add(label_totaltransectioncost);
		panel_report.add(text_transectioncost);
		panel_report.add(label_totaldiscount);
		panel_report.add(text_discount);
		panel_report.add(label_totalcount);
		panel_report.add(text_count);
		panel_report.setLayout(new GridLayout(3, 4));

		panel_main.add(panel_search);
		panel_main.add(pane);

		panel_search.add(panel_checkbox);
		panel_search.add(panel_button);
		panel_button.add(panel_report);

		MainFrame.add(panel_main);

		MainFrame.setVisible(true);
		MainFrame.setSize(1000, 1000);
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
		if (checkbox_type.isSelected())
		{
			combobox_type.setEnabled(true);
		}
		else
		{
			combobox_type.setEnabled(false);
		}
	//	JCheckBox check_table=(JCheckBox) ae.getSource();
		if (checkbox_table.isSelected())
		{
			combobox_table.setEnabled(true);
		}
		else
		{
			combobox_table.setEnabled(false);

		}
	//	JCheckBox check_user=(JCheckBox) ae.getSource();
		if (checkbox_user.isSelected())
		{
			combobox_user.setEnabled(true);
		}
		else
		{
			combobox_user.setEnabled(false);

		}
	//	JCheckBox check_order=(JCheckBox) ae.getSource();
		if (checkbox_orderno.isSelected())
		{
			text_order.setEnabled(true);
		}
		else
		{
			text_order.setEnabled(false);

		}
		
	//	JCheckBox check_inovoice=(JCheckBox) ae.getSource();
		if (checkbox_inovoiceno.isSelected())
		{
			text_inovoice.setEnabled(true);
		}
		else
		{
			text_inovoice.setEnabled(false);

		}
	
	}

}
