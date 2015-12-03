import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class User_Detail implements ActionListener 
{
	static String role[] = { "Admin", " ", " " };
	JFrame MainFrame = new JFrame("User");
	JButton button_cancel;

	public static void main(String[] args) {
		User_Detail ud = new User_Detail();
	}

	public User_Detail() {
	

		JPanel panel_main = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		panel_main.setBackground(Color.GRAY);
		panel_main.setPreferredSize(new Dimension(560, 360));
		
		JPanel panel_detail = new JPanel();
		panel_detail.setBackground(Color.GRAY);
		panel_detail.setPreferredSize(new Dimension(400, 300));
		panel_detail.setLayout(new GridLayout(7, 2, 10, 10));

		JPanel panel_image = new JPanel();
		panel_image.setBackground(Color.GRAY);
		panel_image.setPreferredSize(new Dimension(130, 140));
		panel_image.setBorder(new TitledBorder(""));

		JPanel panel_photo = new JPanel();
		panel_photo.setBackground(Color.GRAY);
		panel_photo.setPreferredSize(new Dimension(130, 300));

		JLabel label_user_name = new JLabel("User Name");
		JLabel label_password = new JLabel("Password");
		JLabel label_email = new JLabel("Email");
		JLabel label_phone = new JLabel("Phone");
		JLabel label_address = new JLabel("Address");
		JLabel label_role = new JLabel("Role");

		JTextField text_user_name = new JTextField();
		text_user_name.setBackground(Color.LIGHT_GRAY);

		JTextField text_password = new JTextField();
		text_password.setBackground(Color.LIGHT_GRAY);

		JTextField text_email = new JTextField();
		text_email.setBackground(Color.LIGHT_GRAY);

		JTextField text_phone = new JTextField();
		text_phone.setBackground(Color.LIGHT_GRAY);

		JTextArea textarea_address = new JTextArea(4, 1);
		textarea_address.setBackground(Color.LIGHT_GRAY);

		JTextField text_brows = new JTextField(6);
		text_brows.setBackground(Color.LIGHT_GRAY);
		text_brows.setPreferredSize(new Dimension(50, 30));

		JButton button_save = new JButton("Save");
		button_save.setPreferredSize(new Dimension(100, 50));

		button_cancel = new JButton("Cancel");
		button_cancel.setPreferredSize(new Dimension(100, 50));
		button_cancel.addActionListener((ActionListener) this);

		JButton button_brows = new JButton("Brows");
		button_brows.setPreferredSize(new Dimension(50, 30));

		JComboBox combobox_role = new JComboBox(role);
		combobox_role.setPreferredSize(new Dimension(200, 25));

		panel_detail.add(label_user_name);
		panel_detail.add(text_user_name);
		panel_detail.add(label_password);
		panel_detail.add(text_password);
		panel_detail.add(label_email);
		panel_detail.add(text_email);
		panel_detail.add(label_phone);
		panel_detail.add(text_phone);
		panel_detail.add(label_address);
		panel_detail.add(textarea_address);
		panel_detail.add(label_role);
		panel_detail.add(combobox_role);

		panel_photo.add(panel_image);
		panel_photo.add(text_brows);
		panel_photo.add(button_brows);

		panel_main.add(panel_detail);
		panel_main.add(panel_photo);
		panel_main.add(button_save);
		panel_main.add(button_cancel);
		MainFrame.add(panel_main);
		MainFrame.setVisible(true);
		MainFrame.setSize(700, 650);
		MainFrame.pack();
		MainFrame.setLocation(350, 100);

	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==button_cancel)
			MainFrame.dispose();
		
	}

}
