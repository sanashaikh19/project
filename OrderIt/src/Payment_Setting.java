import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;


public class Payment_Setting 
{
	public static void main(String[] args)
	{
		JFrame MainFrame = new JFrame("Payment Setting");

		JPanel panel_main = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		panel_main.setBackground(Color.GRAY);
		panel_main.setPreferredSize(new Dimension(460, 500));
		
		JPanel panel_payable_settings = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel_payable_settings.setBackground(Color.GRAY);
		panel_payable_settings.setPreferredSize(new Dimension(450, 250));
		panel_payable_settings.setBorder(new TitledBorder("Payable Setting"));
		panel_payable_settings.setLayout(new GridLayout(5,3));
		
		JPanel panel_service_cost = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel_service_cost .setBackground(Color.GRAY);
		panel_service_cost .setPreferredSize(new Dimension(450, 150));
		panel_service_cost .setBorder(new TitledBorder("Service Cost"));
		panel_service_cost.setLayout(new GridLayout(3,3));
		
		JLabel label_payable = new JLabel("Payable");
		label_payable.setPreferredSize(new Dimension(100,50));
		JLabel label_client_id = new JLabel("Client ID");
		JLabel label_secret= new JLabel("Secret");
		JLabel label_environment = new JLabel("Environment");
		JLabel label_transection_cost = new JLabel("Transection Cost");
		JLabel label_transection_cost_value = new JLabel("Transection Cost Value");
		JLabel label_service = new JLabel("Service");
		JLabel label_service_cost= new JLabel("Service Cost");
		JLabel label_service_cost_value= new JLabel("Service Cost Value");
		
		JButton button_cancel=new JButton("Cancel");
		button_cancel.setPreferredSize(new Dimension(100,50));

		JButton button_save=new JButton("Save");
		button_save.setPreferredSize(new Dimension(100,50));
		
		JRadioButton radiobutton_enable = new JRadioButton("Enable");
		radiobutton_enable.setBackground(Color.gray);
		radiobutton_enable.setPreferredSize(new Dimension(100,50));
		JRadioButton  radiobutton_disable= new JRadioButton("Disable");
		radiobutton_disable.setBackground(Color.gray);
		radiobutton_disable.setPreferredSize(new Dimension(100,50));
		ButtonGroup buttongroup_payable = new ButtonGroup();
		buttongroup_payable.add(radiobutton_enable);
		buttongroup_payable.add(radiobutton_disable);

		JRadioButton radiobutton_live= new JRadioButton("Live");
		radiobutton_live.setBackground(Color.gray);
		JRadioButton  radiobutton_sand_box= new JRadioButton("Sand Box");
		radiobutton_sand_box.setBackground(Color.gray);
		ButtonGroup buttongroup_environment = new ButtonGroup();
		buttongroup_environment.add(radiobutton_live);
		buttongroup_environment.add(radiobutton_sand_box);

		JRadioButton radiobutton_percent= new JRadioButton("Percent");
		radiobutton_percent.setBackground(Color.gray);
		JRadioButton  radiobutton_value= new JRadioButton("Value");
		radiobutton_value.setBackground(Color.gray);
		ButtonGroup buttongroup_Transection_cost= new ButtonGroup();
		buttongroup_Transection_cost.add(radiobutton_percent);
		buttongroup_Transection_cost.add(radiobutton_value);

		JRadioButton radiobutton_percent_service_cost= new JRadioButton("Percent");
		radiobutton_percent_service_cost.setBackground(Color.gray);
		JRadioButton  radiobutton_value_service_cost= new JRadioButton("Value");
		radiobutton_value_service_cost.setBackground(Color.gray);
		ButtonGroup buttongroup_service_cost = new ButtonGroup();
		buttongroup_service_cost.add(radiobutton_percent_service_cost);
		buttongroup_service_cost.add(radiobutton_value_service_cost);
		
		JRadioButton radiobutton_enable_service= new JRadioButton("Enable");
		radiobutton_enable_service.setBackground(Color.gray);
		JRadioButton  radiobutton_disable_service= new JRadioButton("Disable");
		radiobutton_disable_service.setBackground(Color.gray);
		ButtonGroup buttongroup_service = new ButtonGroup();
		buttongroup_service .add(radiobutton_enable_service);
		buttongroup_service .add(radiobutton_disable_service);
		
		JTextField text_client_id=new JTextField(15);
		text_client_id.setBackground(Color.LIGHT_GRAY);
		
		JTextField text_secret=new JTextField(15);
		text_secret.setBackground(Color.LIGHT_GRAY);
		
		JTextField text_transection_cost_value=new JTextField(15);
		text_transection_cost_value.setBackground(Color.LIGHT_GRAY);
		
		JTextField text_service_cost_value=new JTextField(15);
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
		
		panel_main.add(panel_payable_settings);
		panel_main.add(panel_service_cost);
		panel_main.add(button_save);
		panel_main.add(button_cancel);
		
		MainFrame.add(panel_main);
		MainFrame.setVisible(true);
		MainFrame.setSize(500, 600);
		MainFrame.pack();

	}

}
