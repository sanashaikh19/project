import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
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
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;


public class Cash_Drawer implements ActionListener
{
	static String column[]=new String[]{"ID","Client","User Name","Date","Beginning Cash","Ending Cash","Cash Till Difference","Checks","Credit Cards","Gift Cards","Travelars Check","Total Cash Drawer","Total Sales","Credit Card Tip Fees","On Account Sale","Cash Drawer Payouts","Total Deposit","Cash Drawer Off By"};
	static String item[]={"aaaaaa","bbbbbb","cccccc"};
	JButton button_search, button_print, button_close;
	JFrame MainFrame = new JFrame("Cash Drawer");
	JCheckBox checkbox_user,checkbox_date,checkbox_client;
	JComboBox combobox_user,combobox_client;
/*	public static void main(String[] args) 
	{
		Cash_Drawer cd=new Cash_Drawer();
	}*/
	public void Cash_Drawer()
	{
		JPanel panel_main = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		panel_main.setBackground(Color.GRAY);

		JPanel panel_search=new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel_search.setBackground(Color.GRAY);
		panel_search.setBorder(new TitledBorder("Search"));
		panel_search.setPreferredSize(new Dimension(1360,120));

		DefaultTableModel model;
		model=new DefaultTableModel(column,0);
		JTable table = new JTable(model);

		JScrollPane pane=new JScrollPane(table);
		pane.setPreferredSize(new Dimension(1360,580));

		UtilDateModel model_date = new UtilDateModel();
		model_date.setSelected(true);
		Properties p = new Properties();
		JDatePanelImpl datePanel = new JDatePanelImpl(model_date , p);
		JDatePickerImpl datePicker_date_from = new JDatePickerImpl(datePanel, null);
		datePicker_date_from.setPreferredSize(new Dimension(200,25));
		JDatePickerImpl datePicker_date_to= new JDatePickerImpl(datePanel, null);

		checkbox_user=new JCheckBox("User");
		checkbox_user.setBackground(Color.GRAY);
		checkbox_user.addActionListener(this);
		checkbox_user.setPreferredSize(new Dimension(100,20));
		
		checkbox_date=new JCheckBox("Date");
		checkbox_date.setBackground(Color.GRAY);
		checkbox_date.setPreferredSize(new Dimension(100,20));
		
		checkbox_client=new JCheckBox("Client");
		checkbox_client.setBackground(Color.GRAY);
		checkbox_client.addActionListener(this);

		JLabel label_to=new JLabel("To");

		JLabel label_cash_drawer_report=new JLabel("Cash Drawe Report");
		label_cash_drawer_report.setPreferredSize(new Dimension(470,50));

		button_search = new JButton("Search");
		button_search.setPreferredSize(new Dimension(100, 50));
		button_search.addActionListener((ActionListener) this);
		button_print = new JButton("Print");
		button_print.setPreferredSize(new Dimension(100, 50));
		button_print.addActionListener((ActionListener) this);
		button_close = new JButton("Close");
		button_close.setPreferredSize(new Dimension(100, 50));
		button_close.addActionListener((ActionListener) this);

		combobox_user=new JComboBox(item);
		combobox_user.setPreferredSize(new Dimension(100,20));
		combobox_user.setEnabled(false);
		combobox_client=new JComboBox(item);
		combobox_client.setPreferredSize(new Dimension(100,20));
		combobox_client.setEnabled(false);

		panel_search.add(checkbox_date);
		panel_search.add(datePicker_date_from);
		panel_search.add(label_to);
		panel_search.add(datePicker_date_to);
		panel_search.add(button_search);
		panel_search.add(button_print);
		panel_search.add(label_cash_drawer_report);
		panel_search.add(button_close);
		panel_search.add(checkbox_user);
		panel_search.add(combobox_user);
		panel_search.add(checkbox_client);
		panel_search.add(combobox_client);

		panel_main.add(panel_search);
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
		if (ae.getSource() == button_print)
		{

		}
	//	JCheckBox check_user=(JCheckBox) ae.getSource();
		if(checkbox_user.isSelected())
		{
			combobox_user.setEnabled(true);
		}
		else
		{
			combobox_user.setEnabled(false);
		}
	//	JCheckBox check_client=(JCheckBox) ae.getSource();
		if(checkbox_client.isSelected())
		{
			combobox_client.setEnabled(true);
		}
		else
		{
			combobox_client.setEnabled(false);
		}

	}

}
