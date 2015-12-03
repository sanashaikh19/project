import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;


public class Import_Export
{
	
	static String tablename[] = { " ", " ", " " };
	public static void main(String[] args) 
	{
		
		JFrame MainFrame = new JFrame("Import Export");

		JPanel panel_main = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		panel_main.setBackground(Color.GRAY);
		panel_main.setPreferredSize(new Dimension(360, 500));
		
		JPanel panel_import = new JPanel(new FlowLayout(FlowLayout.CENTER));
		 panel_import.setBackground(Color.GRAY);
		 panel_import.setPreferredSize(new Dimension(350, 400));
		
		JPanel panel_export = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel_export .setBackground(Color.GRAY);
		panel_export .setPreferredSize(new Dimension(350, 400));
		
		JTabbedPane tabbedpane_import_export=new JTabbedPane();
		tabbedpane_import_export.add("Import",panel_import);
		tabbedpane_import_export.add("Export",panel_export);
		
		JLabel label_import_select_table= new JLabel("Select Table");
		label_import_select_table.setPreferredSize(new Dimension(120, 50));
		
		JLabel label_export_select_table= new JLabel("Select Table");
		label_export_select_table.setPreferredSize(new Dimension(120, 50));
		
		JLabel label_select_file= new JLabel("Select File");
		label_select_file.setPreferredSize(new Dimension(120, 50));
		
		JComboBox combobox_import_select_table = new JComboBox(tablename);
		combobox_import_select_table.setPreferredSize(new Dimension(140, 30));
		
		JComboBox combobox_export_select_table = new JComboBox(tablename);
		combobox_export_select_table.setPreferredSize(new Dimension(140, 30));
		
		JButton button_brows=new JButton("Brows");
		button_brows.setPreferredSize(new Dimension(100,40));
		
		JButton button_import=new JButton("Import");
		button_import.setPreferredSize(new Dimension(100,40));
		
		JButton button_export=new JButton("Export");
		button_export.setPreferredSize(new Dimension(100,40));
		
		JButton button_cancel=new JButton("Cancel");
		button_cancel.setPreferredSize(new Dimension(100,50));
		button_cancel.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		
		JTextField text_select_file=new JTextField(12);
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
		
		panel_main.add(tabbedpane_import_export);
		panel_main.add(button_cancel);
		MainFrame.add(panel_main);
		MainFrame.setVisible(true);
		MainFrame.setSize(500, 600);
		MainFrame.pack();

	}

}
