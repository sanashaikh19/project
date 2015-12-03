import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.swing.JButton;
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


public class Z_History implements ActionListener 
{
	static String column[]=new String[]{"Service Quality","Food Quality","Hygein","Customer Satisfaction","Environment","Date","Comment"};
	JButton button_search, button_print, button_close;
	JFrame MainFrame = new JFrame("Z History");
	/*public static void main(String[] args) 
	{
		Z_History zh=new Z_History();
	}*/
	public void Z_History()
	{
		JPanel panel_main = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		panel_main.setBackground(Color.GRAY);
		
		JPanel panel_search=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		panel_search.setBackground(Color.GRAY);
		panel_search.setBorder(new TitledBorder("Search"));
		panel_search.setPreferredSize(new Dimension(1360,100));
	
		DefaultTableModel model;
		model=new DefaultTableModel(column,0);
		JTable table_feedback_list = new JTable(model);
		
		JScrollPane pane=new JScrollPane(table_feedback_list );
		pane.setPreferredSize(new Dimension(1360,580));
		
	    JLabel label_from=new JLabel("From");
		JLabel label_to=new JLabel("To");
		JLabel label_total_count=new JLabel("Total Count");	
		 label_total_count.setPreferredSize(new Dimension(100,50));
	    JLabel label_total=new JLabel("Total");
	    label_total.setPreferredSize(new Dimension(70,50));
	    
	    button_search = new JButton("Search");
		button_search.setPreferredSize(new Dimension(100, 50));
		button_search.addActionListener((ActionListener) this);
		button_print = new JButton("Print");
		button_print.setPreferredSize(new Dimension(100, 50));
		button_print.addActionListener((ActionListener) this);
		button_close = new JButton("Close");
		button_close.setPreferredSize(new Dimension(100, 50));
		button_close.addActionListener((ActionListener) this);
		
		UtilDateModel model_date = new UtilDateModel();
		model_date .setSelected(true);
        Properties p = new Properties();
		JDatePanelImpl datePanel = new JDatePanelImpl(model_date , p);
		JDatePickerImpl datePicker_date_from = new JDatePickerImpl(datePanel, null);
		datePicker_date_from.setPreferredSize(new Dimension(200,25));
		JDatePickerImpl datePicker_date_to= new JDatePickerImpl(datePanel, null);
		
		JTextField text_total_count=new JTextField("0",13);
		JTextField text_total=new JTextField("0.00",13);
		
		panel_search.add(label_from);
		panel_search.add(datePicker_date_from);
		panel_search.add(label_to);
		panel_search.add(datePicker_date_to);
		panel_search.add(button_search);
		panel_search.add(button_print);
		panel_search.add(label_total_count);
		panel_search.add(text_total_count);
		panel_search.add(label_total);
		panel_search.add(text_total);
		panel_search.add(button_close);
		
		panel_main.add(panel_search);
		panel_main.add(pane);
		
		MainFrame.add(panel_main);
		MainFrame.setVisible(true);
		MainFrame.setSize(500, 600);
		MainFrame.pack();
		MainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
	@Override
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
		
	}

}
