import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class General_Setting extends Frame implements ActionListener {
	static String tablename[] = { " ", " ", " " };
	static JTabbedPane tabbedpane_general_setting = new JTabbedPane();
	static JPanel panel_general_settings = new JPanel(new FlowLayout(FlowLayout.RIGHT));
	static JPanel panel_printer_settings = new JPanel(new FlowLayout(FlowLayout.RIGHT));;
	static JPanel panel_inovoice_settings = new JPanel(new FlowLayout(FlowLayout.RIGHT));;
	static JPanel panel_payment_settings = new JPanel(new FlowLayout(FlowLayout.RIGHT));;
	static JPanel panel_backup_restores = new JPanel(new FlowLayout(FlowLayout.RIGHT));;
	static JPanel panel_import_exports = new JPanel(new FlowLayout(FlowLayout.RIGHT));;
	static JPanel panel_comments = new JPanel(new FlowLayout(FlowLayout.LEFT));;
	static JPanel panel_item_list = new JPanel(new FlowLayout(FlowLayout.LEFT));;
	static JFrame MainFrame = new JFrame("General Setting");
	static JButton button_cancel;
	static JButton button_save;
	static String currency[] = { "BHT", "$", "cccccc" };
	static String Language[] = { "English", "Spanish" };
	static String printer[] = { " ", " ", " " };
	static JPanel panel_main = new JPanel();
	static String size[] = { "1", "2", "3" };
	static String text_item[] = { " ", " " };

	public void General_Setting() {
		printer_setting();
		general_setting();
		payment_setting();
		backup_restore();
		import_export();
		invoice_setting();
		item_list();
		comment();

		tabbedpane_general_setting.add("General Setting",panel_general_settings);
		tabbedpane_general_setting.add("Printer Setting",panel_printer_settings);
		tabbedpane_general_setting.add("Inovoice Setting",panel_inovoice_settings);
		tabbedpane_general_setting.add("Payment Setting",panel_payment_settings);
		tabbedpane_general_setting.add("Backup and Restore",panel_backup_restores);
		tabbedpane_general_setting.add("Import/Export", panel_import_exports);

		tabbedpane_general_setting.setTabPlacement(JTabbedPane.LEFT);
		tabbedpane_general_setting.setPreferredSize(new Dimension(600, 600));

		panel_main.add(tabbedpane_general_setting);

		MainFrame.add(panel_main);
		MainFrame.setVisible(true);
		MainFrame.setSize(500, 600);
		MainFrame.pack();
		MainFrame.setLocation(350, 50);
	}

	public void general_setting() {
		JPanel panel_general_setting = new JPanel();
		panel_general_setting.setBackground(Color.GRAY);
		panel_general_setting.setBorder(new TitledBorder("General Setting"));
		panel_general_setting.setPreferredSize(new Dimension(450, 400));
		panel_general_setting.setLayout(new GridLayout(11, 2, 10, 10));

		JLabel label_currency = new JLabel("Currency");
		JLabel label_desimal_format = new JLabel("Decimal Format");
		JLabel label_client_password = new JLabel("Client Password");
		JLabel label_menu_language = new JLabel("Menu Language");
		JLabel label_twiter_consumer_key = new JLabel("TWitter Consumer Key");
		JLabel label_twiter_secret_key = new JLabel("TWitter Secret Key");
		JLabel label_facebook_app_id = new JLabel("Facebook App ID");
		JLabel label_no_table_per_row = new JLabel("Number of Tables per Row");

		JComboBox combobox_currency = new JComboBox(currency);
		JComboBox combobox_menu_language = new JComboBox(Language);

		JTextField text_decimal_format = new JTextField("0.00", 10);
		text_decimal_format.setBackground(Color.gray);

		JTextField text_client_password = new JTextField();
		text_client_password.setBackground(Color.gray);

		JTextField text_twiter_consumer_key = new JTextField();
		text_twiter_consumer_key.setBackground(Color.gray);

		JTextField text_twiter_secret_key = new JTextField();
		text_twiter_secret_key.setBackground(Color.gray);

		JTextField text_facebook_app_id = new JTextField();
		text_facebook_app_id.setBackground(Color.gray);

		JTextField text_no_table_per_row = new JTextField();
		text_no_table_per_row.setBackground(Color.gray);

		button_cancel = new JButton("Close");
		button_cancel.setPreferredSize(new Dimension(130, 50));
		button_cancel.addActionListener((ActionListener) this);

		button_save = new JButton("Save");
		button_save.setPreferredSize(new Dimension(130, 50));

		JCheckBox checkbox_sound_alert = new JCheckBox("Sound Alert");
		checkbox_sound_alert.setBackground(Color.GRAY);

		JCheckBox checkbox_enable_kitchen_view = new JCheckBox("Enable Kitchen View");
		checkbox_enable_kitchen_view.setBackground(Color.GRAY);

		JCheckBox checkbox_enable_bar_view = new JCheckBox("Enable Bar View");
		checkbox_enable_bar_view.setBackground(Color.GRAY);

		JCheckBox checkbox_enable_starters_view = new JCheckBox("Enable Starters View");
		checkbox_enable_starters_view.setBackground(Color.GRAY);
		JCheckBox checkbox_alow_waiter_to_delete_order = new JCheckBox("Alow Waiter to Delete Order");
		checkbox_alow_waiter_to_delete_order.setBackground(Color.GRAY);

		JCheckBox checkbox_check_table_status_before_endday = new JCheckBox("Check Table Status Before End Day");
		checkbox_check_table_status_before_endday.setBackground(Color.GRAY);

		panel_general_setting.add(label_currency);
		panel_general_setting.add(combobox_currency);
		panel_general_setting.add(label_desimal_format);
		panel_general_setting.add(text_decimal_format);
		panel_general_setting.add(label_client_password);
		panel_general_setting.add(text_client_password);
		panel_general_setting.add(label_menu_language);
		panel_general_setting.add(combobox_menu_language);
		panel_general_setting.add(label_twiter_consumer_key);
		panel_general_setting.add(text_twiter_consumer_key);
		panel_general_setting.add(label_twiter_secret_key);
		panel_general_setting.add(text_twiter_secret_key);
		panel_general_setting.add(label_facebook_app_id);
		panel_general_setting.add(text_facebook_app_id);
		panel_general_setting.add(label_no_table_per_row);
		panel_general_setting.add(text_no_table_per_row);
		panel_general_setting.add(checkbox_sound_alert);
		panel_general_setting.add(checkbox_enable_kitchen_view);
		panel_general_setting.add(checkbox_enable_bar_view);
		panel_general_setting.add(checkbox_enable_starters_view);
		panel_general_setting.add(checkbox_alow_waiter_to_delete_order);
		panel_general_setting.add(checkbox_check_table_status_before_endday);

		panel_general_settings.add(panel_general_setting);
		panel_general_settings.add(button_save);
		panel_general_settings.add(button_cancel);
	}

	public void printer_setting() {
		JPanel panel_printer = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel_printer.setBackground(Color.GRAY);
		panel_printer.setPreferredSize(new Dimension(450, 170));
		panel_printer.setBorder(new TitledBorder("Printer Setting"));
		panel_printer.setLayout(new GridLayout(5, 2, 10, 10));

		JPanel panel_print_option = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel_print_option.setBackground(Color.GRAY);
		panel_print_option.setPreferredSize(new Dimension(450, 170));
		panel_print_option.setBorder(new TitledBorder("Print Option"));
		panel_print_option.setLayout(new GridLayout(4, 2, 10, 10));

		JPanel panel_after_recieve_order = new JPanel(new FlowLayout(
				FlowLayout.LEFT));
		panel_after_recieve_order.setBackground(Color.GRAY);
		panel_after_recieve_order.setPreferredSize(new Dimension(450, 60));
		panel_after_recieve_order.setBorder(new TitledBorder("After Recieve Order"));

		JPanel panel_print_after_cancel_order = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel_print_after_cancel_order.setBackground(Color.GRAY);
		panel_print_after_cancel_order.setPreferredSize(new Dimension(450, 100));
		panel_print_after_cancel_order.setBorder(new TitledBorder("Print After Cancel Order"));
		panel_print_after_cancel_order.setLayout(new GridLayout(2, 2, 10, 10));

		button_cancel = new JButton("Close");
		button_cancel.setPreferredSize(new Dimension(130, 50));
		button_cancel.addActionListener((ActionListener) this);

		button_save = new JButton("Save");
		button_save.setPreferredSize(new Dimension(130, 50));

		JLabel label_counter_printer = new JLabel("Counter Printer");
		JLabel label_kitchen_printer = new JLabel("Kitchen Printer");
		JLabel label_bar_printer = new JLabel("Bar Printer");
		JLabel label_Starter_printer = new JLabel("Starter Printer");
		JLabel label_print_bill_printer = new JLabel("Print Bill Printer");
		JLabel label_print_copies = new JLabel("Print Copies");
		label_print_copies.setPreferredSize(new Dimension(100, 30));
		JLabel label_cash_box = new JLabel("Cash Box");

		SpinnerModel spinnerModel_print_copies = new SpinnerNumberModel(1, 0,
				100, 1);
		JSpinner spinner_print_copies = new JSpinner(spinnerModel_print_copies);

		JComboBox combobox_counter_printer = new JComboBox(printer);
		JComboBox combobox_kitchen_printer = new JComboBox(printer);
		JComboBox combobox_bar_printer = new JComboBox(printer);
		JComboBox combobox_Starter_printer = new JComboBox(printer);
		JComboBox combobox_print_bill_printer = new JComboBox(printer);
		JComboBox combobox_cash_box = new JComboBox(printer);
		combobox_cash_box.setPreferredSize(new Dimension(100, 50));

		JCheckBox checkbox_print_to_counter = new JCheckBox("Print to Counter");
		checkbox_print_to_counter.setBackground(Color.GRAY);

		JCheckBox checkbox_print_to_kitchen = new JCheckBox("Print to Kitchen");
		checkbox_print_to_kitchen.setBackground(Color.GRAY);

		JCheckBox checkbox_print_to_bar = new JCheckBox("Print to Bar");
		checkbox_print_to_bar.setBackground(Color.GRAY);

		JCheckBox checkbox_print_to_staters = new JCheckBox("Print to Staters");
		checkbox_print_to_staters.setBackground(Color.GRAY);

		JCheckBox checkbox_print_from_pad = new JCheckBox("Print From Pad");
		checkbox_print_from_pad.setBackground(Color.GRAY);

		JRadioButton radiobutton_print_all_order = new JRadioButton("Print All Orders");
		radiobutton_print_all_order.setBackground(Color.gray);
		JRadioButton radiobutton_print_new_orders_only = new JRadioButton("Print New Orders Only");
		radiobutton_print_new_orders_only.setBackground(Color.gray);
		ButtonGroup buttongroup = new ButtonGroup();
		buttongroup.add(radiobutton_print_all_order);
		buttongroup.add(radiobutton_print_new_orders_only);

		button_cancel = new JButton("Cancel");
		button_cancel.setPreferredSize(new Dimension(100, 50));
		button_cancel.addActionListener(this);

		button_save = new JButton("Save");
		button_save.setPreferredSize(new Dimension(100, 50));

		panel_printer.add(label_counter_printer);
		panel_printer.add(combobox_counter_printer);
		panel_printer.add(label_kitchen_printer);
		panel_printer.add(combobox_kitchen_printer);
		panel_printer.add(label_bar_printer);
		panel_printer.add(combobox_bar_printer);
		panel_printer.add(label_Starter_printer);
		panel_printer.add(combobox_Starter_printer);
		panel_printer.add(label_print_bill_printer);
		panel_printer.add(combobox_print_bill_printer);

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

		panel_print_after_cancel_order.add(checkbox_print_to_counter);
		
		panel_printer_settings.add(panel_printer);
		panel_printer_settings.add(panel_print_option);
		panel_printer_settings.add(panel_after_recieve_order);
		panel_printer_settings.add(panel_print_after_cancel_order);
		panel_printer_settings.add(button_save);
		panel_printer_settings.add(button_cancel);
	}

	public void payment_setting() {
		JPanel panel_payable_settings = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel_payable_settings.setBackground(Color.GRAY);
		panel_payable_settings.setPreferredSize(new Dimension(450, 250));
		panel_payable_settings.setBorder(new TitledBorder("Payable Setting"));

		JPanel panel_service_cost = new JPanel(	new FlowLayout(FlowLayout.CENTER));
		panel_service_cost.setBackground(Color.GRAY);
		panel_service_cost.setPreferredSize(new Dimension(450, 150));
		panel_service_cost.setBorder(new TitledBorder("Service Cost"));
		panel_service_cost.setLayout(new GridLayout(3, 3));

		JLabel label_payable = new JLabel("Payable");
		label_payable.setPreferredSize(new Dimension(130, 50));

		JLabel label_client_id = new JLabel("Client ID");
		label_client_id.setPreferredSize(new Dimension(130, 50));

		JLabel label_secret = new JLabel("Secret");
		label_secret.setPreferredSize(new Dimension(130, 50));

		JLabel label_environment = new JLabel("Environment");
		label_environment.setPreferredSize(new Dimension(130, 50));

		JLabel label_transection_cost = new JLabel("Transection Cost");
		label_transection_cost.setPreferredSize(new Dimension(130, 50));

		JLabel label_transection_cost_value = new JLabel("Transection Cost Value");
		label_transection_cost_value.setPreferredSize(new Dimension(130, 50));

		JLabel label_service = new JLabel("Service");
		JLabel label_service_cost = new JLabel("Service Cost");

		JLabel label_service_cost_value = new JLabel("Service Cost Value");

		button_cancel = new JButton("Cancel");
		button_cancel.setPreferredSize(new Dimension(100, 50));
		button_cancel.addActionListener(this);

		button_save = new JButton("Save");
		button_save.setPreferredSize(new Dimension(100, 50));

		JRadioButton radiobutton_enable = new JRadioButton("Enable");
		radiobutton_enable.setBackground(Color.gray);
		radiobutton_enable.setPreferredSize(new Dimension(100, 50));
		JRadioButton radiobutton_disable = new JRadioButton("Disable");
		radiobutton_disable.setBackground(Color.gray);
		radiobutton_disable.setPreferredSize(new Dimension(100, 50));
		ButtonGroup buttongroup_payable = new ButtonGroup();
		buttongroup_payable.add(radiobutton_enable);
		buttongroup_payable.add(radiobutton_disable);

		JRadioButton radiobutton_live = new JRadioButton("Live");
		radiobutton_live.setBackground(Color.gray);
		radiobutton_live.setPreferredSize(new Dimension(100, 50));

		JRadioButton radiobutton_sand_box = new JRadioButton("Sand Box");
		radiobutton_sand_box.setBackground(Color.gray);
		radiobutton_sand_box.setPreferredSize(new Dimension(100, 50));

		ButtonGroup buttongroup_environment = new ButtonGroup();
		buttongroup_environment.add(radiobutton_live);
		buttongroup_environment.add(radiobutton_sand_box);

		JRadioButton radiobutton_percent = new JRadioButton("Percent");
		radiobutton_percent.setBackground(Color.gray);
		JRadioButton radiobutton_value = new JRadioButton("Value");
		radiobutton_value.setBackground(Color.gray);
		ButtonGroup buttongroup_Transection_cost = new ButtonGroup();
		buttongroup_Transection_cost.add(radiobutton_percent);
		buttongroup_Transection_cost.add(radiobutton_value);

		JRadioButton radiobutton_percent_service_cost = new JRadioButton("Percent");
		radiobutton_percent_service_cost.setBackground(Color.gray);
		JRadioButton radiobutton_value_service_cost = new JRadioButton("Value");
		radiobutton_value_service_cost.setBackground(Color.gray);
		ButtonGroup buttongroup_service_cost = new ButtonGroup();
		buttongroup_service_cost.add(radiobutton_percent_service_cost);
		buttongroup_service_cost.add(radiobutton_value_service_cost);

		JRadioButton radiobutton_enable_service = new JRadioButton("Enable");
		radiobutton_enable_service.setBackground(Color.gray);
		JRadioButton radiobutton_disable_service = new JRadioButton("Disable");
		radiobutton_disable_service.setBackground(Color.gray);
		ButtonGroup buttongroup_service = new ButtonGroup();
		buttongroup_service.add(radiobutton_enable_service);
		buttongroup_service.add(radiobutton_disable_service);

		JTextField text_client_id = new JTextField(20);
		text_client_id.setBackground(Color.LIGHT_GRAY);

		JTextField text_secret = new JTextField(20);
		text_secret.setBackground(Color.LIGHT_GRAY);

		JTextField text_transection_cost_value = new JTextField(20);
		text_transection_cost_value.setBackground(Color.LIGHT_GRAY);

		JTextField text_service_cost_value = new JTextField(20);
		text_service_cost_value.setBackground(Color.LIGHT_GRAY);

		panel_payable_settings.add(label_payable);
		panel_payable_settings.add(radiobutton_enable);
		panel_payable_settings.add(radiobutton_disable);
		panel_payable_settings.add(label_client_id);
		panel_payable_settings.add(text_client_id);
		panel_payable_settings.add(label_secret);
		panel_payable_settings.add(text_secret);
		panel_payable_settings.add(label_environment);
		panel_payable_settings.add(radiobutton_live);
		panel_payable_settings.add(radiobutton_sand_box);
		panel_payable_settings.add(label_transection_cost);
		panel_payable_settings.add(radiobutton_percent);
		panel_payable_settings.add(radiobutton_value);
		panel_payable_settings.add(label_transection_cost_value);
		panel_payable_settings.add(text_transection_cost_value);

		panel_service_cost.add(label_service);
		panel_service_cost.add(radiobutton_enable_service);
		panel_service_cost.add(radiobutton_disable_service);
		panel_service_cost.add(label_service_cost);
		panel_service_cost.add(radiobutton_percent_service_cost);
		panel_service_cost.add(radiobutton_value_service_cost);
		panel_service_cost.add(label_service_cost_value);
		panel_service_cost.add(text_service_cost_value);

		panel_payment_settings.add(panel_payable_settings);
		panel_payment_settings.add(panel_service_cost);
		panel_payment_settings.add(button_save);
		panel_payment_settings.add(button_cancel);
	}

	public void backup_restore() {
		JPanel panel_backup_restore = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel_backup_restore.setBackground(Color.GRAY);
		panel_backup_restore.setPreferredSize(new Dimension(450, 250));
		panel_backup_restore.setBorder(new TitledBorder("Backup and Restore"));

		button_cancel = new JButton("Cancel");
		button_cancel.setPreferredSize(new Dimension(100, 50));
		button_cancel.setBackground(Color.LIGHT_GRAY);
		button_cancel.addActionListener(this);

		JButton button_backup = new JButton("Backup");
		button_backup.setPreferredSize(new Dimension(150, 50));
		button_backup.setBackground(Color.LIGHT_GRAY);

		JButton button_Restore = new JButton("Restore");
		button_Restore.setPreferredSize(new Dimension(150, 50));
		button_Restore.setBackground(Color.LIGHT_GRAY);

		panel_backup_restore.add(button_backup);
		panel_backup_restore.add(button_Restore);

		panel_backup_restores.add(panel_backup_restore);
		panel_backup_restores.add(button_cancel);
	}

	public void import_export() {
		JPanel panel_import = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel_import.setBackground(Color.GRAY);

		JPanel panel_export = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel_export.setBackground(Color.GRAY);

		JTabbedPane tabbedpane_import_export = new JTabbedPane();
		tabbedpane_import_export.add("Import", panel_import);
		tabbedpane_import_export.add("Export", panel_export);
		tabbedpane_import_export.setPreferredSize(new Dimension(450, 300));

		JLabel label_import_select_table = new JLabel("Select Table");
		label_import_select_table.setPreferredSize(new Dimension(120, 50));

		JLabel label_export_select_table = new JLabel("Select Table");
		label_export_select_table.setPreferredSize(new Dimension(120, 50));

		JLabel label_select_file = new JLabel("Select File");
		label_select_file.setPreferredSize(new Dimension(120, 50));

		JComboBox combobox_import_select_table = new JComboBox(tablename);
		combobox_import_select_table.setPreferredSize(new Dimension(140, 30));

		JComboBox combobox_export_select_table = new JComboBox(tablename);
		combobox_export_select_table.setPreferredSize(new Dimension(140, 30));

		JButton button_brows = new JButton("Brows");
		button_brows.setPreferredSize(new Dimension(100, 40));

		JButton button_import = new JButton("Import");
		button_import.setPreferredSize(new Dimension(100, 40));

		JButton button_export = new JButton("Export");
		button_export.setPreferredSize(new Dimension(100, 40));

		button_cancel = new JButton("Cancel");
		button_cancel.setPreferredSize(new Dimension(100, 50));
		button_cancel.addActionListener(this);

		JTextField text_select_file = new JTextField(12);
		text_select_file.setBackground(Color.LIGHT_GRAY);

		panel_import.add(label_import_select_table);
		panel_import.add(combobox_import_select_table);
		panel_import.add(label_select_file);
		panel_import.add(text_select_file);
		panel_import.add(button_brows);
		panel_import.add(button_import);

		panel_export.add(label_export_select_table);
		panel_export.add(combobox_export_select_table);
		panel_export.add(button_export);

		panel_import_exports.add(tabbedpane_import_export);
		panel_import_exports.add(button_cancel);
	}

	public void invoice_setting() {
		JTabbedPane tabbedpane_inovoice_setting = new JTabbedPane();
		tabbedpane_inovoice_setting.setPreferredSize(new Dimension(450, 530));

		JPanel panel_inovoice_setting = new JPanel(new FlowLayout(
				FlowLayout.LEFT));

		JPanel panel_bill_setting = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel_bill_setting.setBackground(Color.GRAY);

		JPanel panel_takeaway_setting = new JPanel(new FlowLayout(
				FlowLayout.LEFT));
		panel_takeaway_setting.setBackground(Color.GRAY);

		JPanel panel_kitchen_setting = new JPanel(new FlowLayout(
				FlowLayout.LEFT));
		panel_kitchen_setting.setBackground(Color.GRAY);

		/*
		 * JPanel panel_comments=new JPanel(new FlowLayout(FlowLayout.LEFT));
		 * JPanel panel_item_list=new JPanel(new FlowLayout(FlowLayout.LEFT));
		 */

		button_cancel = new JButton("Cancel");
		button_cancel.setPreferredSize(new Dimension(100, 50));
		button_cancel.addActionListener(this);

		button_save = new JButton("Save");
		button_save.setPreferredSize(new Dimension(100, 50));

		// inovoice setting
		JPanel panel_inovoice_option = new JPanel(new FlowLayout(
				FlowLayout.LEFT));
		panel_inovoice_option.setBackground(Color.GRAY);
		panel_inovoice_option.setBorder(new TitledBorder("Inovoice Option"));
		panel_inovoice_option.setPreferredSize(new Dimension(440, 80));

		JPanel panel_inovoice_numbering = new JPanel(new FlowLayout(
				FlowLayout.LEFT));
		panel_inovoice_numbering.setBackground(Color.GRAY);
		panel_inovoice_numbering.setBorder(new TitledBorder(
				"Inovoice Numbering"));
		panel_inovoice_numbering.setPreferredSize(new Dimension(440, 70));

		JPanel panel_inovoice_text = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel_inovoice_text.setBackground(Color.GRAY);
		panel_inovoice_text.setBorder(new TitledBorder("Inovoice Text"));
		panel_inovoice_text.setPreferredSize(new Dimension(440, 100));

		JLabel label_prefix = new JLabel("Prefix(Optional)");
		label_prefix.setPreferredSize(new Dimension(90, 15));
		JLabel label_number = new JLabel("Number");

		JLabel label_inovoice_text_item = new JLabel("Inovoice Text Item");
		label_inovoice_text_item.setPreferredSize(new Dimension(90, 30));
		JLabel label_font_size = new JLabel("Font Size");
		label_font_size.setPreferredSize(new Dimension(90, 30));

		JCheckBox checkbox_print_sales_person_name = new JCheckBox(
				"Print Sales Person Name");
		checkbox_print_sales_person_name.setBackground(Color.GRAY);

		JCheckBox checkbox_add_paid_text = new JCheckBox(
				"Add Paid Text on Inovoice That here been paid");
		checkbox_add_paid_text.setBackground(Color.GRAY);

		JComboBox combobox_inovoice_text_item = new JComboBox(text_item);
		combobox_inovoice_text_item.setPreferredSize(new Dimension(170, 22));
		JComboBox combobox_font_size = new JComboBox(size);
		combobox_font_size.setPreferredSize(new Dimension(170, 22));

		JTextField text_prefix = new JTextField(12);
		text_prefix.setBackground(Color.LIGHT_GRAY);

		JTextField text_number = new JTextField(12);
		text_number.setBackground(Color.LIGHT_GRAY);

		JTextField text_inovoice_text_items = new JTextField(13);
		text_inovoice_text_items.setBackground(Color.LIGHT_GRAY);

		panel_inovoice_text.add(label_inovoice_text_item);
		panel_inovoice_text.add(combobox_inovoice_text_item);
		panel_inovoice_text.add(text_inovoice_text_items);
		panel_inovoice_text.add(label_font_size);
		panel_inovoice_text.add(combobox_font_size);

		panel_inovoice_setting.add(panel_inovoice_option);
		panel_inovoice_setting.add(panel_inovoice_numbering);
		panel_inovoice_setting.add(panel_inovoice_text);
		comment();
		item_list();
		panel_inovoice_setting.add(panel_item_list);
		panel_inovoice_setting.add(panel_comments);

		panel_inovoice_option.add(checkbox_print_sales_person_name);
		panel_inovoice_option.add(checkbox_add_paid_text);

		panel_inovoice_numbering.add(label_prefix);
		panel_inovoice_numbering.add(text_prefix);
		panel_inovoice_numbering.add(label_number);
		panel_inovoice_numbering.add(text_number);

		// bill setting
		JPanel panel_bill_templet_text = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel_bill_templet_text.setBackground(Color.GRAY);
		panel_bill_templet_text.setBorder(new TitledBorder("Bill Templet Text"));
		panel_bill_templet_text.setPreferredSize(new Dimension(440, 100));

		JLabel label_bill_text_item = new JLabel("Bill Text Item");
		label_bill_text_item.setPreferredSize(new Dimension(90, 30));

		label_font_size = new JLabel("Font Size");
		label_font_size.setPreferredSize(new Dimension(90, 30));

		JComboBox combobox_bill_text_item = new JComboBox(size);
		combobox_bill_text_item.setPreferredSize(new Dimension(150, 22));

		combobox_font_size = new JComboBox(size);
		combobox_font_size.setPreferredSize(new Dimension(150, 22));

		JComboBox combobox_item_list_font_size = new JComboBox(size);
		combobox_item_list_font_size.setPreferredSize(new Dimension(150, 22));

		JTextField text_bill_text_item = new JTextField(12);
		text_bill_text_item.setBackground(Color.LIGHT_GRAY);

		panel_bill_setting.add(panel_bill_templet_text);
		comment();
		item_list();
		panel_bill_setting.add(panel_item_list);
		panel_bill_setting.add(panel_comments);

		panel_bill_templet_text.add(label_bill_text_item);
		panel_bill_templet_text.add(combobox_bill_text_item);
		panel_bill_templet_text.add(text_bill_text_item);
		panel_bill_templet_text.add(label_font_size);
		panel_bill_templet_text.add(combobox_font_size);

		// takeaway setting

		JPanel panel_takeaway_templet_text = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel_takeaway_templet_text.setBackground(Color.GRAY);
		panel_takeaway_templet_text.setBorder(new TitledBorder("Kitchen Templet Text"));
		panel_takeaway_templet_text.setPreferredSize(new Dimension(440, 100));

		JLabel label_takeaway_text_item = new JLabel("takeaway Text Item");
		label_takeaway_text_item.setPreferredSize(new Dimension(90, 30));

		label_font_size = new JLabel("Font Size");
		label_font_size.setPreferredSize(new Dimension(90, 30));

		JComboBox combobox_takeaway_text_item = new JComboBox(size);
		combobox_takeaway_text_item.setPreferredSize(new Dimension(150, 22));

		combobox_font_size = new JComboBox(size);
		combobox_font_size.setPreferredSize(new Dimension(150, 22));

		JTextField text_takeaway_text_item = new JTextField(12);
		text_takeaway_text_item.setBackground(Color.LIGHT_GRAY);

		panel_takeaway_templet_text.add(label_takeaway_text_item);
		panel_takeaway_templet_text.add(combobox_takeaway_text_item);
		panel_takeaway_templet_text.add(text_takeaway_text_item);
		panel_takeaway_templet_text.add(label_font_size);
		panel_takeaway_templet_text.add(combobox_font_size);

		panel_takeaway_setting.add(panel_takeaway_templet_text);
		comment();
		item_list();
		panel_takeaway_setting.add(panel_item_list);
		panel_takeaway_setting.add(panel_comments);

		// kitchen setting
		JPanel panel_kitchen_templet_text = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel_kitchen_templet_text.setBackground(Color.GRAY);
		panel_kitchen_templet_text.setBorder(new TitledBorder("Kitchen Templet Text"));
		panel_kitchen_templet_text.setPreferredSize(new Dimension(440, 100));

		JLabel label_kitchen_text_item = new JLabel("kitchen Text Item");
		label_kitchen_text_item.setPreferredSize(new Dimension(90, 30));

		label_font_size = new JLabel("Font Size");
		label_font_size.setPreferredSize(new Dimension(90, 30));

		JComboBox combobox_kitchen_text_item = new JComboBox(size);
		combobox_kitchen_text_item.setPreferredSize(new Dimension(150, 22));

		combobox_font_size = new JComboBox(size);
		combobox_font_size.setPreferredSize(new Dimension(150, 22));

		JTextField text_kitchen_text_item = new JTextField(12);
		text_kitchen_text_item.setBackground(Color.LIGHT_GRAY);

		panel_kitchen_templet_text.add(label_kitchen_text_item);
		panel_kitchen_templet_text.add(combobox_kitchen_text_item);
		panel_kitchen_templet_text.add(text_kitchen_text_item);
		panel_kitchen_templet_text.add(label_font_size);
		panel_kitchen_templet_text.add(combobox_font_size);

		panel_kitchen_setting.add(panel_kitchen_templet_text);
		comment();
		item_list();
		panel_kitchen_setting.add(panel_item_list);
		panel_kitchen_setting.add(panel_comments);

		tabbedpane_inovoice_setting.add("Inovoice Setting",
				panel_inovoice_setting);
		tabbedpane_inovoice_setting.add("Bill Setting", panel_bill_setting);
		tabbedpane_inovoice_setting.add("Takeaway Setting",
				panel_takeaway_setting);
		tabbedpane_inovoice_setting.add("Kitchen Setting",
				panel_kitchen_setting);

		panel_inovoice_settings.add(tabbedpane_inovoice_setting);
		panel_inovoice_settings.add(button_save);
		panel_inovoice_settings.add(button_cancel);
	}

	public void comment() {
		panel_comments.setBackground(Color.GRAY);
		panel_comments.setBorder(new TitledBorder("Comments"));
		panel_comments.setPreferredSize(new Dimension(440, 170));

		JLabel label_note_comment = new JLabel("Note Comment");
		label_note_comment.setPreferredSize(new Dimension(90, 15));

		JLabel label_note_comment_alignment = new JLabel("Alignment");
		label_note_comment_alignment.setPreferredSize(new Dimension(90, 30));
		JLabel label_note_comment_font_size = new JLabel("Font Size");
		label_note_comment_font_size.setPreferredSize(new Dimension(90, 30));

		JLabel label_foot_comment = new JLabel("Foot Comment");
		label_foot_comment.setPreferredSize(new Dimension(90, 15));

		JLabel label_foot_comment_alignment = new JLabel("Alignment");
		label_foot_comment_alignment.setPreferredSize(new Dimension(90, 30));
		JLabel label_foot_comment_font_size = new JLabel("Font Size");
		label_foot_comment_font_size.setPreferredSize(new Dimension(90, 30));

		JTextArea textarea_note_comment = new JTextArea(2, 30);
		textarea_note_comment.setBackground(Color.LIGHT_GRAY);

		JTextArea textarea_foot_comment = new JTextArea(2, 30);
		textarea_foot_comment.setBackground(Color.LIGHT_GRAY);

		JComboBox combobox_note_comment_alignment = new JComboBox(text_item);
		combobox_note_comment_alignment
				.setPreferredSize(new Dimension(100, 22));
		JComboBox combobox_note_comment_font_size = new JComboBox(size);
		combobox_note_comment_font_size
				.setPreferredSize(new Dimension(100, 22));

		JComboBox combobox_foot_comment_alignment = new JComboBox(size);
		combobox_foot_comment_alignment
				.setPreferredSize(new Dimension(100, 22));

		JComboBox combobox_foot_comment_font_size = new JComboBox(size);
		combobox_foot_comment_font_size
				.setPreferredSize(new Dimension(100, 22));

		panel_comments.add(label_note_comment);
		panel_comments.add(textarea_note_comment);
		panel_comments.add(label_note_comment_alignment);
		panel_comments.add(combobox_note_comment_alignment);
		panel_comments.add(label_note_comment_font_size);
		panel_comments.add(combobox_note_comment_font_size);
		panel_comments.add(label_foot_comment);
		panel_comments.add(textarea_foot_comment);
		panel_comments.add(label_foot_comment_alignment);
		panel_comments.add(combobox_foot_comment_alignment);
		panel_comments.add(label_foot_comment_font_size);
		panel_comments.add(combobox_foot_comment_font_size);
	}
	public void item_list() {
		panel_item_list.setBackground(Color.GRAY);
		panel_item_list.setBorder(new TitledBorder("Item List"));
		panel_item_list.setPreferredSize(new Dimension(440, 55));

		JLabel label_item_list_font_size = new JLabel("Item List Font Size");
		label_item_list_font_size.setPreferredSize(new Dimension(90, 15));

		JComboBox combobox_item_list_font_size = new JComboBox(size);
		combobox_item_list_font_size.setPreferredSize(new Dimension(170, 22));

		panel_item_list.add(label_item_list_font_size);
		panel_item_list.add(combobox_item_list_font_size);
	}

	/*public static void main(String[] args) {
		General_Setting gs = new General_Setting();
	}*/

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == button_cancel) {
			MainFrame.dispose();
		}
	}

}
