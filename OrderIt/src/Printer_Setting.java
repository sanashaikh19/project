import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.TitledBorder;

public class Printer_Setting {
	static String printer[] = { " ", " ", " " };

	public static void main(String[] args) {

		JFrame MainFrame = new JFrame("Printer Setting");

		JPanel panel_main = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		panel_main.setBackground(Color.GRAY);
		panel_main.setPreferredSize(new Dimension(460, 580));

		JPanel panel_printer_setting = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel_printer_setting.setBackground(Color.GRAY);
		panel_printer_setting.setPreferredSize(new Dimension(450, 170));
		panel_printer_setting.setBorder(new TitledBorder("Printer Setting"));
		panel_printer_setting.setLayout(new GridLayout(5, 2, 10, 10));

		JPanel panel_print_option = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel_print_option.setBackground(Color.GRAY);
		panel_print_option.setPreferredSize(new Dimension(450, 170));
		panel_print_option.setBorder(new TitledBorder("Print Option"));
		panel_print_option.setLayout(new GridLayout(4, 2, 10, 10));

		JPanel panel_after_recieve_order = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel_after_recieve_order.setBackground(Color.GRAY);
		panel_after_recieve_order.setPreferredSize(new Dimension(450, 60));
		panel_after_recieve_order.setBorder(new TitledBorder("After Recieve Order"));

		JPanel panel_print_after_cancel_order = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel_print_after_cancel_order.setBackground(Color.GRAY);
		panel_print_after_cancel_order.setPreferredSize(new Dimension(450, 100));
		panel_print_after_cancel_order.setBorder(new TitledBorder("Print After Cancel Order"));
		panel_print_after_cancel_order.setLayout(new GridLayout(2, 2, 10, 10));

		JLabel label_counter_printer = new JLabel("Counter Printer");
		JLabel label_kitchen_printer = new JLabel("Kitchen Printer");
		JLabel label_bar_printer = new JLabel("Bar Printer");
		JLabel label_Starter_printer = new JLabel("Starter Printer");
		JLabel label_print_bill_printer = new JLabel("Print Bill Printer");
		JLabel label_print_copies = new JLabel("Print Copies");
		label_print_copies.setPreferredSize(new Dimension(100,30));
		JLabel label_cash_box = new JLabel("Cash Box");

		SpinnerModel spinnerModel_print_copies = new SpinnerNumberModel(1,0,100, 1);
		JSpinner spinner_print_copies = new JSpinner(spinnerModel_print_copies);
		

		JComboBox combobox_counter_printer = new JComboBox(printer);
		JComboBox combobox_kitchen_printer = new JComboBox(printer);
		JComboBox combobox_bar_printer = new JComboBox(printer);
		JComboBox combobox_Starter_printer = new JComboBox(printer);
		JComboBox combobox_print_bill_printer = new JComboBox(printer);
		JComboBox combobox_cash_box = new JComboBox(printer);
		combobox_cash_box.setPreferredSize(new Dimension(100,50));

		JCheckBox checkbox_print_to_counter=new JCheckBox("Print to Counter");
		checkbox_print_to_counter.setBackground(Color.GRAY);

		JCheckBox checkbox_print_to_kitchen=new JCheckBox("Print to Kitchen");
		checkbox_print_to_kitchen.setBackground(Color.GRAY);

		JCheckBox checkbox_print_to_bar=new JCheckBox("Print to Bar");
		checkbox_print_to_bar.setBackground(Color.GRAY);

		JCheckBox checkbox_print_to_staters=new JCheckBox("Print to Staters");
		checkbox_print_to_staters.setBackground(Color.GRAY);

		JCheckBox checkbox_print_from_pad=new JCheckBox("Print From Pad");
		checkbox_print_from_pad.setBackground(Color.GRAY);

		JRadioButton radiobutton_print_all_order = new JRadioButton("Print All Orders");
		radiobutton_print_all_order .setBackground(Color.gray);
		JRadioButton  radiobutton_print_new_orders_only= new JRadioButton("Print New Orders Only");
		radiobutton_print_new_orders_only.setBackground(Color.gray);
		ButtonGroup buttongroup = new ButtonGroup();
		buttongroup .add(radiobutton_print_all_order );
		buttongroup .add(radiobutton_print_new_orders_only);

		JButton button_cancel=new JButton("Cancel");
		button_cancel.setPreferredSize(new Dimension(100,50));

		JButton button_save=new JButton("Save");
		button_save.setPreferredSize(new Dimension(100,50));

		panel_printer_setting.add(label_counter_printer);
		panel_printer_setting.add(combobox_counter_printer);
		panel_printer_setting.add(label_kitchen_printer);
		panel_printer_setting.add(combobox_kitchen_printer);
		panel_printer_setting.add(label_bar_printer);
		panel_printer_setting.add(combobox_bar_printer);
		panel_printer_setting.add(label_Starter_printer);
		panel_printer_setting.add(combobox_Starter_printer);
		panel_printer_setting.add(label_print_bill_printer);
		panel_printer_setting.add(combobox_print_bill_printer);

		panel_print_option.add(label_print_copies);
		panel_print_option.add(spinner_print_copies);
		panel_print_option.add(label_cash_box);
		panel_print_option.add(combobox_cash_box);

		panel_print_option.add(checkbox_print_to_counter);
		panel_print_option.add(checkbox_print_to_kitchen);
		panel_print_option.add(checkbox_print_to_bar);
		panel_print_option.add(checkbox_print_to_staters);

		panel_after_recieve_order.add(checkbox_print_from_pad);
		panel_after_recieve_order.add(radiobutton_print_all_order);
		panel_after_recieve_order.add(radiobutton_print_new_orders_only);

		/*panel_print_after_cancel_order.add(checkbox_print_to_counter);
		panel_print_after_cancel_order.add(checkbox_print_to_kitchen);
		panel_print_after_cancel_order.add(checkbox_print_to_bar);
		panel_print_after_cancel_order.add(checkbox_print_to_staters);*/

		panel_main.add(panel_printer_setting);
		panel_main.add(panel_print_option);
		panel_main.add(panel_after_recieve_order);
		panel_main.add(panel_print_after_cancel_order);
		panel_main.add(button_save);
		panel_main.add(button_cancel);

		MainFrame.add(panel_main);
		MainFrame.setVisible(true);
		MainFrame.setSize(500, 600);
		MainFrame.pack();
	}

}
