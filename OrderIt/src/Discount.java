import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

public class Discount implements ActionListener
{
	static String printer[] = { " ", " ", " " };
	JFrame MainFrame = new JFrame("Discount");
	JButton button_cancel;
	public static void main(String[] args) 
	{
		Discount d=new Discount();
	}
	public Discount()
	{

		JPanel panel_main = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel_main.setBackground(Color.GRAY);
		panel_main.setPreferredSize(new Dimension(400, 350));
		
		JLabel label_name= new JLabel("Name");
		label_name.setPreferredSize(new Dimension(100,50));
		JLabel label_type= new JLabel("Type");
		label_type.setPreferredSize(new Dimension(170,50));
		JLabel label_value = new JLabel("Value");
		label_value .setPreferredSize(new Dimension(100,50));
		JLabel label_from = new JLabel("From");
		label_from.setPreferredSize(new Dimension(100,50));
		JLabel label_to = new JLabel("To");
		label_to.setPreferredSize(new Dimension(100,50));
		
		JTextField text_name=new JTextField(18);
		text_name.setBackground(Color.LIGHT_GRAY);
		
		JTextField text_value=new JTextField(18);
		text_value.setBackground(Color.LIGHT_GRAY);
		
		UtilDateModel model = new UtilDateModel();
		model.setSelected(true);
        Properties p = new Properties();
		JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
		JDatePickerImpl datePicker_date_from = new JDatePickerImpl(datePanel, null);
		datePicker_date_from.setPreferredSize(new Dimension(200,25));
		JDatePickerImpl datePicker_date_to= new JDatePickerImpl(datePanel, null);
		
		JButton button_save=new JButton("Save");
		button_save.setPreferredSize(new Dimension(100,50));
		button_cancel=new JButton("Cancel");
		button_cancel.setPreferredSize(new Dimension(100,50));
		button_cancel.addActionListener(this);
		
		JRadioButton radiobutton_percent= new JRadioButton("Percent");
		radiobutton_percent.setBackground(Color.gray);
		JRadioButton  radiobutton_value= new JRadioButton("Value");
		radiobutton_value.setBackground(Color.gray);
		ButtonGroup buttongroup_environment = new ButtonGroup();
		buttongroup_environment.add(radiobutton_percent);
		buttongroup_environment.add(radiobutton_value);
		
		panel_main .add(label_name);
		panel_main .add(text_name);
		panel_main .add(label_type);
		panel_main .add(radiobutton_percent);
		panel_main .add(radiobutton_value);
		panel_main .add(label_value);
		panel_main .add(text_value);
		panel_main.add(label_from);
		panel_main.add(datePicker_date_from);
		panel_main .add(label_to);
		panel_main.add(datePicker_date_to);
		panel_main .add(button_save);
		panel_main.add(button_cancel);
		
		MainFrame.add(panel_main);
		MainFrame.setVisible(true);
		MainFrame.setSize(500, 600);
		MainFrame.pack();
		MainFrame.setLocation(450, 100);

	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==button_cancel)
		{
			MainFrame.dispose();
		}
		
	}

}
