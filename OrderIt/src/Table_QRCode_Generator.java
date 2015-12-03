import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Table_QRCode_Generator implements ActionListener
{
	static String item[]={"aaaaaa","bbbbbb","cccccc"};
	JFrame MainFrame = new JFrame("Table QRCode Generator");
	JButton button_download,button_generate,button_close;
	public static void main(String[] args) 
	{
		Table_QRCode_Generator TQRCode=new Table_QRCode_Generator();
	}
	public Table_QRCode_Generator()
	{
		JPanel panel_main = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel_main.setBackground(Color.GRAY);
		panel_main.setPreferredSize(new Dimension(500, 250));
		
		JPanel panel_combobox= new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel_combobox.setBackground(Color.GRAY);
		panel_combobox.setPreferredSize(new Dimension(250, 70));
		panel_combobox.setLayout(new GridLayout(2,2,10,10));
		
		
		ImageIcon image_qrcode= new ImageIcon("a.jpg");
		JLabel label_qrcode =new JLabel(image_qrcode);
		label_qrcode.setPreferredSize(new Dimension(150,150));
		
		JLabel label_floor=new JLabel("Floor");
		label_floor.setBackground(Color.GRAY);
		label_floor.setPreferredSize(new Dimension(120,30));
		JLabel label_table=new JLabel("Table");
		label_table.setBackground(Color.GRAY);
		label_table.setPreferredSize(new Dimension(120,30));
		
		JComboBox combobox_floor=new JComboBox(item);
		combobox_floor.setPreferredSize(new Dimension(130,30));
		JComboBox combobox_table=new JComboBox(item);
		combobox_table.setPreferredSize(new Dimension(130,30));
		
		button_download=new JButton("Download");
		button_download.setPreferredSize(new Dimension(100,50));
		button_download.addActionListener(this);
		button_generate=new JButton("Generate");
		button_generate.setPreferredSize(new Dimension(100,50));
		button_generate.addActionListener(this);
		button_close=new JButton("Close");
		button_close.setPreferredSize(new Dimension(100,50));
		button_close.addActionListener(this);
		
		panel_combobox.add(label_floor);
		panel_combobox.add(combobox_floor);
		panel_combobox.add(label_table);
		panel_combobox.add(combobox_table);
		
		panel_main.add(label_qrcode);
		panel_main.add(panel_combobox);
		panel_main.add(button_generate);
		panel_main.add(button_download);
		panel_main.add(button_close);
		
		MainFrame.add(panel_main);
		MainFrame.setVisible(true);
		MainFrame.setSize(500, 600);
		MainFrame.pack();
		MainFrame.setLocation(400, 150);
	}
	@Override
	public void actionPerformed(ActionEvent ae)
	{
		if (ae.getSource() == button_close)
		{
			MainFrame.dispose();
		}
		if (ae.getSource() == button_download)
		{

		}
		if (ae.getSource() == button_generate)
		{

		}
		
	}

}
