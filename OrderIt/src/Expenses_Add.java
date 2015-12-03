import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Expenses_Add implements ActionListener
{
	JFrame MainFrame = new JFrame("Discount");
	JButton button_cancel,button_save;
	static String size[] = { "1", "2", "3" };
	public void Expenses_Add()
	{
		JPanel panel_main = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel_main.setBackground(Color.GRAY);
		panel_main.setPreferredSize(new Dimension(400, 350));

		JLabel label_type= new JLabel("Type");
		label_type.setPreferredSize(new Dimension(120,50));
		JLabel label_user= new JLabel("User");
		label_user.setPreferredSize(new Dimension(120,50));
		JLabel label_value = new JLabel("Value");
		label_value.setPreferredSize(new Dimension(120,50));
		JLabel label_comment= new JLabel("Comment");
		label_comment.setPreferredSize(new Dimension(120,50));

		JTextArea text_comment=new JTextArea(5,15);
		text_comment.setBackground(Color.LIGHT_GRAY);

		JTextField text_value=new JTextField(13);
		text_value.setBackground(Color.LIGHT_GRAY);

		JComboBox combobox_type = new JComboBox(size);
		combobox_type.setPreferredSize(new Dimension(150, 22));

		JComboBox combobox_user= new JComboBox(size);
		combobox_user.setPreferredSize(new Dimension(150, 22));
		
		button_save=new JButton("Save");
		button_save.setPreferredSize(new Dimension(130,50));
		
		button_cancel=new JButton("Cancel");
		button_cancel.setPreferredSize(new Dimension(130,50));
		button_cancel.addActionListener((ActionListener) this);

		panel_main.add(label_user);
		panel_main.add(combobox_user);

		panel_main.add(label_type);
		panel_main.add(combobox_type);

		panel_main.add(label_value);
		panel_main.add(text_value);

		panel_main.add(label_comment);
		panel_main.add(text_comment);

		panel_main.add(button_save);
		panel_main.add(button_cancel);

		MainFrame.add(panel_main);
		MainFrame.setVisible(true);
		MainFrame.setSize(500, 600);
		MainFrame.pack();
		MainFrame.setLocation(450, 100);
	}
/*	public static void main(String[] args)
	{
		Expenses_Add ea=new Expenses_Add();
	//	ea.Expenses_Add();
	}*/
	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		if(ae.getSource()==button_cancel)
		{
			MainFrame.dispose();
		}
		
	}

}
