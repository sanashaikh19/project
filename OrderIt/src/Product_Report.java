import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;


public class Product_Report implements ActionListener
{
	static String column[]=new String[]{" Item NO  ","  Name  ","  Price ","  Count  ","  Total Sales Values  "};
	JButton button_search, button_print, button_export, button_close,button_add,button_addall,button_remove,button_removall;
	JFrame MainFrame=new JFrame("Product Report");
	JCheckBox checkbox_date,checkbox_category;
	JList list_category=new JList();
	JList list_item=new JList();
	JList list_selected_item=new JList();

	JPanel panel_category=new JPanel(new FlowLayout(FlowLayout.LEFT));
	JPanel panel_item=new JPanel(new FlowLayout(FlowLayout.LEFT));
	JPanel panel_selected_item=new JPanel(new FlowLayout(FlowLayout.LEFT));
	JPanel panel_button=new JPanel(new FlowLayout(FlowLayout.CENTER));
	/*public static void main(String[] args) 
	{
		Product_Report pr=new Product_Report();
	}*/
	public void Product_Report()
	{
		JPanel panel_main=new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel_main.setBackground(Color.GRAY);
		
		JPanel panel_search=new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel_search.setBackground(Color.GRAY);
		panel_search.setBorder(new TitledBorder("Search"));
		panel_search.setPreferredSize(new Dimension(1350,120));
		
		panel_button.setPreferredSize(new Dimension(150,200));
		panel_button.setVisible(false);
		panel_button.setBackground(Color.GRAY);
		
		panel_category.setPreferredSize(new Dimension(150,200));
		panel_category.setBorder(new TitledBorder("Category"));
		panel_category.setBackground(Color.GRAY);
		
		panel_item.setPreferredSize(new Dimension(150,200));
		panel_item.setBorder(new TitledBorder("Items"));
		panel_item.setBackground(Color.GRAY);
		
		panel_selected_item.setPreferredSize(new Dimension(150,200));
		panel_selected_item.setBorder(new TitledBorder("Selected Items"));
		panel_selected_item.setBackground(Color.GRAY);

	
		list_item.setPreferredSize(new Dimension(130,170));
		list_selected_item.setPreferredSize(new Dimension(130,170));
		
		DefaultListModel listModel = new DefaultListModel();
		listModel.addElement("A");
		listModel.addElement("A");
		listModel.addElement("A");
		listModel.addElement("A");
		listModel.addElement("A");
		listModel.addElement("A");
		listModel.addElement("A");
		listModel.addElement("A");
		listModel.addElement("A");
		listModel.addElement("A");
		listModel.addElement("A");
		listModel.addElement("A");
		listModel.addElement("A");
		listModel.addElement("A");
		
		list_category=new JList(listModel);
		
	    JScrollPane pane_category=new JScrollPane(list_category);
		pane_category.setPreferredSize(new Dimension(130,170));
		
		list_item=new JList(listModel);
		
		JScrollPane pane_item=new JScrollPane(list_item);
		pane_item.setPreferredSize(new Dimension(130,170));
		
		JScrollPane pane_selected_item=new JScrollPane(list_selected_item);
		pane_selected_item.setPreferredSize(new Dimension(130,170));
		
		panel_category.add(pane_category);
		panel_category.setVisible(false);
		
		panel_item.add(pane_item);
		panel_item.setVisible(false);
		
		panel_selected_item.add(pane_selected_item);
		panel_selected_item.setVisible(false);
		
		checkbox_date=new JCheckBox("Date");
		checkbox_date.setBackground(Color.GRAY);
		
		checkbox_category=new JCheckBox("Category");
		checkbox_category.setPreferredSize(new Dimension(1170,20));
		checkbox_category.addActionListener((ActionListener)this);

		checkbox_category.setBackground(Color.GRAY);
		
		UtilDateModel model = new UtilDateModel();
		model.setSelected(true);
        Properties properties= new Properties();
		JDatePanelImpl datePanel= new JDatePanelImpl(model, properties);
		JDatePickerImpl datePicker_date_from = new JDatePickerImpl(datePanel, null);
		
		JDatePickerImpl datePicker_date_to = new JDatePickerImpl(datePanel, null);

		JLabel label_to=new JLabel("To");
		
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
		
		JLabel label_product_report=new JLabel("Product Report");
		label_product_report.setPreferredSize(new Dimension(420,50));
		
		JLabel label_total_count=new JLabel("Total Count");
		label_total_count.setPreferredSize(new Dimension(70,50));
		
		JTextField text_total_count=new JTextField("0",5);
		text_total_count.setBackground(Color.GRAY);
		
		DefaultTableModel model_table;
		   
		model_table=new DefaultTableModel(column,0);
		JTable table = new JTable(model_table );
		
		JScrollPane pane=new JScrollPane(table);
		pane.setPreferredSize(new Dimension(1350,700));
		table.setBackground(Color.GRAY);
		
		button_add=new JButton("Add");
		button_add.setPreferredSize(new Dimension(120, 42));

		button_addall=new JButton("Add All");
		button_addall.setPreferredSize(new Dimension(120, 42));

		button_remove=new JButton("Remove");
		button_remove.setPreferredSize(new Dimension(120, 42));

		button_removall=new JButton("Remove All");
		button_removall.setPreferredSize(new Dimension(120, 42));
		
		panel_button.add(button_addall);
		panel_button.add(button_add);
		panel_button.add(button_remove);
		panel_button.add(button_removall);
		
		panel_search.add(checkbox_date);
		panel_search.add(datePicker_date_from);
		panel_search.add(label_to);
		panel_search.add(datePicker_date_to);
		panel_search.add(button_search);
		
		panel_search.add(button_print);
		panel_search.add(button_export);
		panel_search.add(label_product_report);
		panel_search.add(button_close);
		panel_search.add(checkbox_category);
		panel_search.add(label_total_count);
		panel_search.add(text_total_count);
		panel_main.add(panel_search);
		panel_main.add(panel_category);
		panel_main.add(panel_item);
		panel_main.add(panel_button);
		panel_main.add(panel_selected_item);
		panel_main.add(pane);
		
		MainFrame.add(panel_main);
		MainFrame.setVisible(true);
		MainFrame.setSize(600, 600);
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
	
		if(checkbox_category.isSelected())
		{
			panel_category.setVisible(true);
			panel_item.setVisible(true);
			panel_selected_item.setVisible(true);
			panel_button.setVisible(true);
		}
		else
		{
			panel_category.setVisible(false);
			panel_item.setVisible(false);
			panel_selected_item.setVisible(false);
			panel_button.setVisible(false);
		}
		
	}

}
