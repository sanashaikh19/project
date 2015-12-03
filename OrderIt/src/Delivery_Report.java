import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;


public class Delivery_Report implements ActionListener
{
	static String column[]=new String[]{"User Name","Pickup Date","Pickup Time","Delivery Date","Delivery Time","Updated By"};
	JButton button_search, button_print, button_export, button_close;
	JFrame MainFrame = new JFrame("DeliveryManReport");
	JCheckBox checkbox_picked_up_date,checkbox_delivery_date,checkbox_order_id;
	JTextField text_order_id;
/*	public static void main(String[] args) 
	{
		Delivery_Report dr=new Delivery_Report();
	}*/
	public void Delivery_Report()
	{
		JPanel panel_main = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		panel_main.setBackground(Color.GRAY);

		JPanel panel_delivery_report=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		panel_delivery_report.setBackground(Color.GRAY);
		panel_delivery_report.setPreferredSize(new Dimension(1360,110));

		JPanel panel_date = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel_date.setBackground(Color.GRAY);
		panel_date.setPreferredSize(new Dimension(800, 100));

		DefaultTableModel model;
		model=new DefaultTableModel(column,0);
		JTable table = new JTable(model);

		JScrollPane pane=new JScrollPane(table);
		pane.setPreferredSize(new Dimension(1360,580));

		JTableHeader header_delivery_report = table.getTableHeader();
		header_delivery_report.setBackground(Color.LIGHT_GRAY);

		checkbox_picked_up_date=new JCheckBox("Picke UP Date From");
		checkbox_picked_up_date.setBackground(Color.GRAY);

		checkbox_delivery_date=new JCheckBox("Delivery Date");
		checkbox_delivery_date.setBackground(Color.GRAY);
		checkbox_delivery_date.setPreferredSize(new Dimension(137,20));

		checkbox_order_id=new JCheckBox("Order ID");
		checkbox_order_id.setBackground(Color.GRAY);
		checkbox_order_id.setPreferredSize(new Dimension(170,20));
		checkbox_order_id.addActionListener(this);

		JLabel label_pickup_date_to=new JLabel("To");
		JLabel label_pickup_date_from=new JLabel("From");
		JLabel label_delivery_date_to=new JLabel("To");
		JLabel label_delivery_date_from=new JLabel("From");

		text_order_id=new JTextField(10);
		text_order_id.setEnabled(false);

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

		UtilDateModel model_date = new UtilDateModel();
		model_date.setSelected(true);
		Properties p = new Properties();
		JDatePanelImpl datePanel = new JDatePanelImpl(model_date , p);
		JDatePickerImpl datePicker_picked_up_date_from = new JDatePickerImpl(datePanel, null);
		JDatePickerImpl datePicker_picked_up_date_to= new JDatePickerImpl(datePanel, null);
		JDatePickerImpl datePicker_delivery_date_from= new JDatePickerImpl(datePanel, null);
		JDatePickerImpl datePicker_delivery_date_to= new JDatePickerImpl(datePanel, null);

		JSpinner spinner_pickup_date_from,spinner_pickup_date_to,spinner_delivery_date_from,spinner_delivery_date_to;

		SpinnerDateModel model_pickup_from = new SpinnerDateModel();
		model_pickup_from.setCalendarField(Calendar.MINUTE);
		
		spinner_pickup_date_from=new JSpinner();
		spinner_pickup_date_from.setModel(model_pickup_from);
		spinner_pickup_date_from.setEditor(new JSpinner.DateEditor(spinner_pickup_date_from, "hh:mm a"));
		
		SpinnerDateModel model_pickup_to = new SpinnerDateModel();
		model_pickup_to.setCalendarField(Calendar.MINUTE);
		
		spinner_pickup_date_to=new JSpinner();
		spinner_pickup_date_to.setModel(model_pickup_to);
		spinner_pickup_date_to.setEditor(new JSpinner.DateEditor(spinner_pickup_date_to, "hh:mm a"));
		
		SpinnerDateModel model_delivery_from = new SpinnerDateModel();
		model_delivery_from.setCalendarField(Calendar.MINUTE);
		
		spinner_delivery_date_from=new JSpinner();
		spinner_delivery_date_from.setModel(model_delivery_from);
		spinner_delivery_date_from.setEditor(new JSpinner.DateEditor(spinner_delivery_date_from, "hh:mm a"));
		
		SpinnerDateModel model_delivery_to = new SpinnerDateModel();
		model_delivery_to.setCalendarField(Calendar.MINUTE);
		
		spinner_delivery_date_to=new JSpinner();
		spinner_delivery_date_to.setModel(model_delivery_to);
		spinner_delivery_date_to.setEditor(new JSpinner.DateEditor(spinner_delivery_date_to, "hh:mm a"));
		
		panel_date.add(checkbox_picked_up_date);
		panel_date.add(label_pickup_date_from);
		panel_date.add(datePicker_picked_up_date_from);
		panel_date.add(spinner_pickup_date_from);
		panel_date.add(label_pickup_date_to);
		panel_date.add(datePicker_picked_up_date_to);
		panel_date.add(spinner_pickup_date_to);
		panel_date.add(checkbox_delivery_date);
		panel_date.add(label_delivery_date_from);
		panel_date.add(datePicker_delivery_date_from);
		panel_date.add(spinner_delivery_date_from);
		panel_date.add(label_delivery_date_to);
		panel_date.add(datePicker_delivery_date_to);
		panel_date.add(spinner_delivery_date_to);
		panel_date.add(checkbox_order_id);
		panel_date.add(text_order_id);

		panel_delivery_report.add(panel_date);
		panel_delivery_report.add(button_search);
		panel_delivery_report.add(button_export);
		panel_delivery_report.add(button_print);
		panel_delivery_report.add(button_close);

		panel_main.add(panel_delivery_report);
		panel_main.add(pane);
		MainFrame.add(panel_main);
		MainFrame.setVisible(true);
		MainFrame.setSize(500, 600);
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
		if(checkbox_order_id.isSelected())
		{
			text_order_id.setEnabled(true);
		}
		else
		{
			text_order_id.setEnabled(false);
		}
	}

}
