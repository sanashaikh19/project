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
import javax.swing.table.JTableHeader;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;


public class Expenses 
{
	static String item[]={"aaaaaa","bbbbbb","cccccc"};
	static String column[]=new String[]{"User Name","Type","Value","Date","Comment","Admin"};
	public void Expenses()
	{
		
		final JFrame MainFrame=new JFrame("Expenses");

		JPanel panel_main=new JPanel();
		panel_main.setBackground(Color.GRAY);
		panel_main.setPreferredSize(new Dimension(1400,700));
		
		JPanel panel_search=new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel_search.setBackground(Color.GRAY);
		panel_search.setBorder(new TitledBorder("Search"));
		panel_search.setPreferredSize(new Dimension(1360,110));

		JPanel panel_expenses=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		panel_expenses.setBackground(Color.GRAY);
		panel_expenses.setPreferredSize(new Dimension(1350,50));
		
		JPanel panel_checkbox=new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel_checkbox.setBackground(Color.GRAY);
		panel_checkbox.setPreferredSize(new Dimension(300,80));
		panel_checkbox.setLayout(new GridLayout(3,2,5,5));
		
		JPanel panel_total=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		panel_total.setBackground(Color.GRAY);
		panel_total.setPreferredSize(new Dimension(300,80));
		panel_total.setLayout(new GridLayout(3,2,5,5));
		
		DefaultTableModel model_table;
		   
		model_table=new DefaultTableModel(column,0);
		JTable table = new JTable(model_table );
		
		JScrollPane pane=new JScrollPane(table);
		pane.setPreferredSize(new Dimension(1360,900));
		table.setBackground(Color.GRAY);
		
		JTableHeader header=table.getTableHeader();
		header.setBackground(Color.LIGHT_GRAY);
		
        JLabel label_expenses=new JLabel("Expenses");
        label_expenses.setPreferredSize(new Dimension(450,50));
		
		JLabel label_to=new JLabel("To");
		JLabel label_total_in=new JLabel("Total In");
		JLabel label_total_out=new JLabel("Total Out");
		JLabel label_total_expense=new JLabel("Total Expenses");
		
		JTextField text_total_in=new JTextField("0.00",10);
		JTextField text_total_out=new JTextField("0.00",10);
		JTextField text_total_expenses=new JTextField("0.00",10);
		
		JButton button_search=new JButton("Search");
		button_search.setPreferredSize(new Dimension(100,50));
		JButton button_print=new JButton("Print");
		button_print.setPreferredSize(new Dimension(100,50));
		JButton button_export=new JButton("Export");
		button_export.setPreferredSize(new Dimension(100,50));
		JButton button_close=new JButton("Close");
		button_close.setPreferredSize(new Dimension(100,50));
		
		button_close.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	MainFrame.dispose();            	
            }
        });
		
		JButton button_edit=new JButton("Edit");
		button_edit.setPreferredSize(new Dimension(100,50));
		
		button_edit.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	Expenses_Add k=new Expenses_Add();
            	k.Expenses_Add();            	
            }
        });
		
		JButton button_delete=new JButton("Delete");
		button_delete.setPreferredSize(new Dimension(100,50));
		
		
		
		JButton button_add=new JButton("Add");
		button_add.setPreferredSize(new Dimension(100,50));
		
		button_add.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	Expenses_Add k=new Expenses_Add();
            	k.Expenses_Add();            	
            }
        });
		
		JComboBox combobox_type=new JComboBox(item);
		combobox_type.setPreferredSize(new Dimension(170,20));
		JComboBox combobox_user=new JComboBox(item);
		
		UtilDateModel model = new UtilDateModel();
		model.setSelected(true);
        Properties p = new Properties();
		JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
		JDatePickerImpl datePicker_date_from = new JDatePickerImpl(datePanel, null);
		datePicker_date_from.setPreferredSize(new Dimension(200,25));
		JDatePickerImpl datePicker_date_to= new JDatePickerImpl(datePanel, null);
		
		JCheckBox checkbox_type=new JCheckBox("Type");
		checkbox_type.setBackground(Color.GRAY);
		JCheckBox checkbox_date=new JCheckBox("Date");
		checkbox_date.setBackground(Color.GRAY);
		checkbox_date.setPreferredSize(new Dimension(100,20));
		JCheckBox checkbox_user=new JCheckBox("User");
		checkbox_user.setBackground(Color.GRAY);
		
		panel_total.add(label_total_in);
		panel_total.add(text_total_in);
		panel_total.add(label_total_out);
		panel_total.add(text_total_out);
		panel_total.add(label_total_expense);
		panel_total.add(text_total_expenses);
		
		panel_checkbox.add(checkbox_type);
		panel_checkbox.add(combobox_type);
		panel_checkbox.add(checkbox_date);
		panel_checkbox.add(datePicker_date_from);
		panel_checkbox.add(checkbox_user);
		panel_checkbox.add(combobox_user);
		
		panel_expenses.add(label_expenses);
		panel_expenses.add(button_export);
		panel_expenses.add(button_print);
		panel_expenses.add(button_add);
		panel_expenses.add(button_edit);
		panel_expenses.add(button_delete);		
		panel_expenses.add(button_close);
		
		panel_search.add(panel_checkbox);
		panel_search.add(label_to);
		panel_search.add(datePicker_date_to);
		panel_search.add(button_search);
		panel_search.add(panel_total);
		
		panel_main.add(panel_expenses);
		panel_main.add(panel_search);
		panel_main.add(pane);
		
		MainFrame.add(panel_main);

		MainFrame.setVisible(true);
		MainFrame.setSize(1000, 1000);
		MainFrame.pack();

	}

}
