import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;


public class Select_Table 
{
	public static void main(String[] args) 
	{

		JFrame MainFrame=new JFrame("Product Report");
		
		JPanel panel_main=new JPanel();
		panel_main.setPreferredSize(new Dimension(530,350));
		
		JPanel panel_category=new JPanel();
		panel_category.setPreferredSize(new Dimension(600,110));
		
		JPanel panel_search=new JPanel();
		panel_search.setPreferredSize(new Dimension(600,120));
		
		JPanel panel_table=new JPanel();
		panel_table.setPreferredSize(new Dimension(600,300));
		
		JButton button_all=new JButton("All");
		button_all.setPreferredSize(new Dimension(100,100));
		button_all.setBackground(Color.ORANGE);
		JButton button_inside=new JButton("Inside");
		button_inside.setPreferredSize(new Dimension(100,100));
		button_inside.setBackground(Color.ORANGE);
		JButton button_outside=new JButton("Outside");
		button_outside.setPreferredSize(new Dimension(100,100));
		button_outside.setBackground(Color.ORANGE);
		JButton button_acrooms=new JButton("AC Rooms");
		button_acrooms.setPreferredSize(new Dimension(100,100));
		button_acrooms.setBackground(Color.ORANGE);
		JButton button_myfloor=new JButton("My Floor");
		button_myfloor.setPreferredSize(new Dimension(100,100));
		button_myfloor.setBackground(Color.ORANGE);
		JButton button_3floor=new JButton("3rd Floor");
		button_3floor.setPreferredSize(new Dimension(100,100));
		button_3floor.setBackground(Color.ORANGE);
		
		JButton button_search=new JButton("Serach");
		button_search.setPreferredSize(new Dimension(90,50));
		
		JTextField text_search=new JTextField(38);
		text_search.setPreferredSize(new Dimension(300,50));
		
		panel_category.add(button_all);
		panel_category.add(button_inside);
		panel_category.add(button_outside);
		panel_category.add(button_acrooms);
		panel_category.add(button_myfloor);
		
		panel_search.add(text_search);
		panel_search.add(button_search);
		
		panel_main.add(panel_category);
		panel_main.add(panel_search);
		panel_main.add(panel_table);
		
		MainFrame.add(panel_main);
		MainFrame.setVisible(true);
		MainFrame.setSize(500,500);
		MainFrame.pack();

	}

}
