import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;


public class OderIt_POS_Lisence_Activation implements ActionListener
{
	JButton button_close,button_proxy,button_activation;
	JFrame MainFrame=new JFrame("OrderIt Manager License Activation");
	public static void main(String[] args) 
	{
		OderIt_POS_Lisence_Activation la=new OderIt_POS_Lisence_Activation();
	}
	public OderIt_POS_Lisence_Activation()
	{
		JPanel panel_main=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		panel_main.setBackground(Color.GRAY);
		panel_main.setPreferredSize(new Dimension(450,400));

		JPanel panel_activation=new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel_activation.setBackground(Color.GRAY);
		panel_activation.setBorder(new TitledBorder(""));
		panel_activation.setPreferredSize(new Dimension(440,200));

		JPanel panel_result=new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel_result.setBackground(Color.GRAY);
		panel_result.setBorder(new TitledBorder("Result"));
		panel_result.setPreferredSize(new Dimension(440,80));	

		button_close=new JButton("Close");
		button_close.setPreferredSize(new Dimension(100,30));
		button_close.addActionListener(this);

		button_proxy=new JButton("Proxy");
		button_proxy.setPreferredSize(new Dimension(100,30));
		button_proxy.addActionListener(this);

		button_activation=new JButton("Activation");
		button_activation.setPreferredSize(new Dimension(100,30));
		button_activation.addActionListener(this);
		
		JLabel label_activation_key=new JLabel("Activation Key");
		JLabel label_computer2=new JLabel("Computer 2");
		label_computer2.setPreferredSize(new Dimension(80,50));
		JLabel label_computer_k=new JLabel("Computer K");
		label_computer_k.setPreferredSize(new Dimension(80,50));
		

		JRadioButton radiobutton_online_activation= new JRadioButton("Online Activation");
		radiobutton_online_activation.setBackground(Color.gray);
		JRadioButton  radiobutton_manual_activation= new JRadioButton("Manual Activation");
		radiobutton_manual_activation.setBackground(Color.gray);
		ButtonGroup buttongroup = new ButtonGroup();
		buttongroup .add(radiobutton_online_activation);
		buttongroup .add(radiobutton_manual_activation);
		
		JTextField text_activation_key=new JTextField(30);
		JTextField text_computer2=new JTextField(30);
		JTextField text_computer_k=new JTextField(30);
		
		JTextArea textarea_result=new JTextArea(3,20);
		textarea_result.setBackground(Color.gray);
		
		panel_activation.add(label_activation_key);
		panel_activation.add(text_activation_key);
		panel_activation.add(label_computer2);
		panel_activation.add(text_computer2);
		panel_activation.add(label_computer_k);
		panel_activation.add(text_computer_k);
		panel_activation.add(radiobutton_online_activation);
		panel_activation.add(radiobutton_manual_activation);
		
		panel_result.add(textarea_result);
		
		panel_main.add(panel_activation);
		panel_main.add(button_proxy);
		panel_main.add(button_activation);
		panel_main.add(button_close);
		panel_main.add(panel_result);
		MainFrame.add(panel_main);
		MainFrame.setVisible(true);
		MainFrame.setSize(500,500);
		MainFrame.pack();
		MainFrame.setLocation(400, 100);
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == button_close)
		{
			MainFrame.dispose();
		}
		if (ae.getSource() == button_proxy)
		{

		}
		if (ae.getSource() == button_activation)
		{

		}
		
	}

}
