import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Discount_List implements ActionListener
{
	static String column[]=new String[]{" Name ","Discount Type","Value","From","To"};
	JButton button_add,button_edit,button_delete,button_close;
	JFrame MainFrame=new JFrame("Discount List");
	/*public static void main(String[] args)
	{
		Discount_List dl=new Discount_List();
	}*/
	public void Discount_List()
	{
		JPanel panel_main=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		panel_main.setBackground(Color.GRAY);
		panel_main.setPreferredSize(new Dimension(1400, 1000));
		
		JPanel panel_discount_list=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		panel_discount_list.setBackground(Color.GRAY);
		panel_main.setPreferredSize(new Dimension(1400, 1000));
		
		button_add=new JButton("Add");
		button_add.setPreferredSize(new Dimension(100,50));
		button_edit=new JButton("Edit");
		button_edit.setPreferredSize(new Dimension(100,50));
		button_delete=new JButton("Delete");
		button_delete.setPreferredSize(new Dimension(100,50));
		button_close=new JButton("Close");
		button_close.setPreferredSize(new Dimension(100,50));
		
		button_add.addActionListener(this);
		button_edit.addActionListener(this);
		button_delete.addActionListener(this);
		button_close.addActionListener(this);
		
		JLabel label_discount_list=new JLabel("Discount List");
		label_discount_list.setPreferredSize(new Dimension(350,50));
		
		DefaultTableModel model_table;
		   
		model_table=new DefaultTableModel(column,0);
		JTable table = new JTable(model_table );
		
		JScrollPane pane=new JScrollPane(table);
		pane.setPreferredSize(new Dimension(1350,1000));
		table.setBackground(Color.GRAY);
		
		panel_main.add(pane);
		
		panel_discount_list.add(label_discount_list);
		panel_discount_list.add(button_add);
		panel_discount_list.add(button_edit);
		panel_discount_list.add(button_delete);
		panel_discount_list.add(button_close);
		
		panel_main.add(panel_discount_list);
		panel_main.add(pane);
		MainFrame.add(panel_main);
		MainFrame.setVisible(true);
		MainFrame.setSize(500,500);
		MainFrame.pack();

	}
	public void actionPerformed(ActionEvent ae) 
	{
		if(ae.getSource()==button_add)
		{
			Discount d=new Discount();
		}
		if(ae.getSource()==button_edit)
		{
			Discount d=new Discount();
		}
		if(ae.getSource()==button_delete)
		{
		
		}
		if(ae.getSource()==button_close)
		{
			MainFrame.dispose();
		}		
	}

}
