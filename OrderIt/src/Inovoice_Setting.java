import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;


public class Inovoice_Setting extends Frame 
{
	static String size[]={"1","2","3"};
	static String text_item[]={" "," "};

	static JPanel panel_inovoice_setting= new JPanel(new FlowLayout(FlowLayout.LEFT));

	static JPanel panel_bill_setting= new JPanel(new FlowLayout(FlowLayout.LEFT));
	static JPanel panel_takeaway_setting= new JPanel(new FlowLayout(FlowLayout.LEFT));
	static JPanel panel_kitchen_setting= new JPanel(new FlowLayout(FlowLayout.LEFT));
	static JPanel panel_comments=new JPanel(new FlowLayout(FlowLayout.LEFT));
	static JPanel panel_item_list=new JPanel(new FlowLayout(FlowLayout.LEFT));
	static JTabbedPane tabbedpane_inovoice_setting=new JTabbedPane();
	
	public Inovoice_Setting()
	{
		inovoice_setting();
		bill_setting();
		takeaway_setting();
		kitchen_setting();
		comment();
		item_list();
	}
	
	public void comment()
	{
		panel_comments.setBackground(Color.GRAY);
		panel_comments.setBorder(new TitledBorder("Comments"));
		panel_comments.setPreferredSize(new Dimension(480,170));
		
		JLabel label_note_comment=new JLabel("Note Comment");
		label_note_comment.setPreferredSize(new Dimension(110,15));

		JLabel label_note_comment_alignment=new JLabel("Alignment");
		label_note_comment_alignment.setPreferredSize(new Dimension(110,30));
		JLabel label_note_comment_font_size=new JLabel("Font Size");
		label_note_comment_font_size.setPreferredSize(new Dimension(110,30));

		JLabel label_foot_comment=new JLabel("Foot Comment");
		label_foot_comment.setPreferredSize(new Dimension(110,15));

		JLabel label_foot_comment_alignment=new JLabel("Alignment");
		label_foot_comment_alignment.setPreferredSize(new Dimension(110,30));
		JLabel label_foot_comment_font_size=new JLabel("Font Size");
		label_foot_comment_font_size.setPreferredSize(new Dimension(110,30));
		
		JTextArea textarea_note_comment=new JTextArea(2,30);
		textarea_note_comment.setBackground(Color.LIGHT_GRAY);

		JTextArea textarea_foot_comment=new JTextArea(2,30);
		textarea_foot_comment.setBackground(Color.LIGHT_GRAY);
		
		JComboBox combobox_note_comment_alignment=new JComboBox(text_item);
		combobox_note_comment_alignment.setPreferredSize(new Dimension(100, 22));
		JComboBox combobox_note_comment_font_size=new JComboBox(size);
		combobox_note_comment_font_size.setPreferredSize(new Dimension(100, 22));

		JComboBox combobox_foot_comment_alignment=new JComboBox(size);
		combobox_foot_comment_alignment.setPreferredSize(new Dimension(100, 22));

		JComboBox combobox_foot_comment_font_size=new JComboBox(size);
		combobox_foot_comment_font_size.setPreferredSize(new Dimension(100, 22));
		
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
	
	public void item_list()
	{
		panel_item_list.setBackground(Color.GRAY);
		panel_item_list.setBorder(new TitledBorder("Item List"));
		panel_item_list.setPreferredSize(new Dimension(480,55));
		
		JLabel label_item_list_font_size=new JLabel("Item List Font Size");
		label_item_list_font_size.setPreferredSize(new Dimension(110,15));
		
		JComboBox combobox_item_list_font_size=new JComboBox(size);
		combobox_item_list_font_size.setPreferredSize(new Dimension(170, 22));
		
		panel_item_list.add(label_item_list_font_size);
		panel_item_list.add(combobox_item_list_font_size);

	}

	public void inovoice_setting()
	{
		JPanel panel_inovoice_option=new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel_inovoice_option.setBackground(Color.GRAY);
		panel_inovoice_option.setBorder(new TitledBorder("Inovoice Option"));
		panel_inovoice_option.setPreferredSize(new Dimension(480,70));

		JPanel panel_inovoice_numbering=new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel_inovoice_numbering.setBackground(Color.GRAY);
		panel_inovoice_numbering.setBorder(new TitledBorder("Inovoice Numbering"));
		panel_inovoice_numbering.setPreferredSize(new Dimension(480,70));

		JPanel panel_inovoice_text=new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel_inovoice_text.setBackground(Color.GRAY);
		panel_inovoice_text.setBorder(new TitledBorder("Inovoice Text"));
		panel_inovoice_text.setPreferredSize(new Dimension(480,100));

		JLabel label_prefix=new JLabel("Prefix(Optional)");
		label_prefix.setPreferredSize(new Dimension(110,15));
		JLabel label_number=new JLabel("Number");

		JLabel label_inovoice_text_item=new JLabel("Inovoice Text Item");
		label_inovoice_text_item.setPreferredSize(new Dimension(110,30));
		JLabel label_font_size=new JLabel("Font Size");
		label_font_size.setPreferredSize(new Dimension(110,30));

		JCheckBox checkbox_print_sales_person_name=new JCheckBox("Print Sales Person Name");
		checkbox_print_sales_person_name.setBackground(Color.GRAY);

		JCheckBox checkbox_add_paid_text=new JCheckBox("Add Paid Text on Inovoice That here been paid");
		checkbox_add_paid_text.setBackground(Color.GRAY);

		JComboBox combobox_inovoice_text_item=new JComboBox(text_item);
		combobox_inovoice_text_item.setPreferredSize(new Dimension(170, 22));
		JComboBox combobox_font_size=new JComboBox(size);
		combobox_font_size.setPreferredSize(new Dimension(170, 22));

		JTextField text_prefix=new JTextField(12);
		text_prefix.setBackground(Color.LIGHT_GRAY);

		JTextField text_number=new JTextField(12);
		text_number.setBackground(Color.LIGHT_GRAY);

		JTextField text_inovoice_text_items=new JTextField(13);
		text_inovoice_text_items.setBackground(Color.LIGHT_GRAY);

		panel_inovoice_text.add(label_inovoice_text_item);
		panel_inovoice_text.add(combobox_inovoice_text_item);
		panel_inovoice_text.add(text_inovoice_text_items);
		panel_inovoice_text.add(label_font_size);
		panel_inovoice_text.add(combobox_font_size);

		panel_inovoice_setting.add(panel_inovoice_option);
		panel_inovoice_setting.add(panel_inovoice_numbering);
		panel_inovoice_setting.add(panel_inovoice_text);
		panel_inovoice_setting.add(panel_item_list);
		panel_inovoice_setting.add(panel_comments);

		panel_inovoice_option.add(checkbox_print_sales_person_name);
		panel_inovoice_option.add(checkbox_add_paid_text);

		panel_inovoice_numbering.add(label_prefix);
		panel_inovoice_numbering.add(text_prefix);
		panel_inovoice_numbering.add(label_number);
		panel_inovoice_numbering.add(text_number);
	}
	
	public void bill_setting()
	{
		JPanel panel_bill_templet_text=new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel_bill_templet_text.setBackground(Color.GRAY);
		panel_bill_templet_text.setBorder(new TitledBorder("Bill Templet Text"));
		panel_bill_templet_text.setPreferredSize(new Dimension(480,100));

		JLabel label_bill_text_item=new JLabel("Bill Text Item");
		label_bill_text_item.setPreferredSize(new Dimension(110,30));
		
		JLabel label_font_size=new JLabel("Font Size");
		label_font_size.setPreferredSize(new Dimension(110,30));
		
		JComboBox combobox_bill_text_item=new JComboBox(size);
		combobox_bill_text_item.setPreferredSize(new Dimension(150, 22));

		JComboBox combobox_font_size=new JComboBox(size);
		combobox_font_size.setPreferredSize(new Dimension(150, 22));
		
		JComboBox combobox_item_list_font_size=new JComboBox(size);
		combobox_item_list_font_size.setPreferredSize(new Dimension(150, 22));

		JTextField text_bill_text_item=new JTextField(12);
		text_bill_text_item.setBackground(Color.LIGHT_GRAY);

		panel_bill_setting.add(panel_bill_templet_text);
		panel_bill_setting.add(panel_item_list);
	    panel_bill_setting.add(panel_comments);
	    
	    panel_bill_templet_text.add(label_bill_text_item);
	    panel_bill_templet_text.add(combobox_bill_text_item);
	    panel_bill_templet_text.add(text_bill_text_item);
	    panel_bill_templet_text.add(label_font_size);
	    panel_bill_templet_text.add(combobox_font_size);
	}
	
	public void takeaway_setting()
	{
		JPanel panel_takeaway_templet_text=new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel_takeaway_templet_text.setBackground(Color.GRAY);
		panel_takeaway_templet_text.setBorder(new TitledBorder("Kitchen Templet Text"));
		panel_takeaway_templet_text.setPreferredSize(new Dimension(480,100));
		
		JLabel label_takeaway_text_item=new JLabel("takeaway Text Item");
		label_takeaway_text_item.setPreferredSize(new Dimension(110,30));
		
		JLabel label_font_size=new JLabel("Font Size");
		label_font_size.setPreferredSize(new Dimension(110,30));
		
		JComboBox combobox_takeaway_text_item=new JComboBox(size);
		combobox_takeaway_text_item.setPreferredSize(new Dimension(150, 22));

		JComboBox combobox_font_size=new JComboBox(size);
		combobox_font_size.setPreferredSize(new Dimension(150, 22));
		
		JTextField text_takeaway_text_item=new JTextField(12);
		text_takeaway_text_item.setBackground(Color.LIGHT_GRAY);
	    
		panel_takeaway_templet_text.add(label_takeaway_text_item);
		panel_takeaway_templet_text.add(combobox_takeaway_text_item);
		panel_takeaway_templet_text.add(text_takeaway_text_item);
		panel_takeaway_templet_text.add(label_font_size);
		panel_takeaway_templet_text.add(combobox_font_size);
	    
		panel_takeaway_setting.add(panel_takeaway_templet_text);
		panel_takeaway_setting.add(panel_item_list);
	    panel_takeaway_setting.add(panel_comments);	
	}
	
	public void kitchen_setting()
	{
		JPanel panel_kitchen_templet_text=new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel_kitchen_templet_text.setBackground(Color.GRAY);
		panel_kitchen_templet_text.setBorder(new TitledBorder("Kitchen Templet Text"));
		panel_kitchen_templet_text.setPreferredSize(new Dimension(480,100));
		
		JLabel label_kitchen_text_item=new JLabel("kitchen Text Item");
		label_kitchen_text_item.setPreferredSize(new Dimension(110,30));
		
		JLabel label_font_size=new JLabel("Font Size");
		label_font_size.setPreferredSize(new Dimension(110,30));
		
		JComboBox combobox_kitchen_text_item=new JComboBox(size);
		combobox_kitchen_text_item.setPreferredSize(new Dimension(150, 22));

		JComboBox combobox_font_size=new JComboBox(size);
		combobox_font_size.setPreferredSize(new Dimension(150, 22));
		
		JTextField text_bill_text_item=new JTextField(12);
		text_bill_text_item.setBackground(Color.LIGHT_GRAY);
	    
	    panel_kitchen_templet_text.add(label_kitchen_text_item);
	    panel_kitchen_templet_text.add(combobox_kitchen_text_item);
	    panel_kitchen_templet_text.add(text_bill_text_item);
	    panel_kitchen_templet_text.add(label_font_size);
	    panel_kitchen_templet_text.add(combobox_font_size);
	    
		panel_kitchen_setting.add(panel_kitchen_templet_text);
		panel_kitchen_setting.add(panel_item_list);
	    panel_kitchen_setting.add(panel_comments);	
	}

	public static void main(String[] args)
	{
		Inovoice_Setting is=new Inovoice_Setting();
		JFrame MainFrame = new JFrame("Inovoice Setting");

		JPanel panel_main = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		panel_main.setBackground(Color.GRAY);
		panel_main.setPreferredSize(new Dimension(500, 600));

		panel_inovoice_setting.setBackground(Color.GRAY);
		panel_inovoice_setting.setPreferredSize(new Dimension(490, 500));

		panel_bill_setting.setBackground(Color.GRAY);
		panel_bill_setting.setPreferredSize(new Dimension(490, 500));

		panel_takeaway_setting.setBackground(Color.GRAY);
		panel_takeaway_setting.setPreferredSize(new Dimension(490, 500));

		panel_kitchen_setting.setBackground(Color.GRAY);
		panel_kitchen_setting.setPreferredSize(new Dimension(490, 500));

		JButton button_save=new JButton("Save");
		button_save.setPreferredSize(new Dimension(100,50));

		JButton button_cancel=new JButton("Cancel");
		button_cancel.setPreferredSize(new Dimension(100,50));
		button_cancel.setAlignmentY(Component.BOTTOM_ALIGNMENT);

		tabbedpane_inovoice_setting.add("Inovoice Setting",panel_inovoice_setting);
		tabbedpane_inovoice_setting.add("Bill Setting",panel_bill_setting);
		tabbedpane_inovoice_setting.add("Takeaway Setting",panel_takeaway_setting);
		tabbedpane_inovoice_setting.add("Kitchen Setting",panel_kitchen_setting);
		
		panel_main.add(tabbedpane_inovoice_setting);
		panel_main.add(button_save);
		panel_main.add(button_cancel);
		MainFrame.add(panel_main);
		MainFrame.setVisible(true);
		MainFrame.setSize(500, 600);
		MainFrame.pack();
	}

}
