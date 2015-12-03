import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;


public class Feedback_List implements ActionListener 
{
	static String feedback_list[]=new String[]{"Service Quality","Food Quality","Hygein","Customer Satisfaction","Environment","Date","Comment"};
	static String average_feedback[]=new String[]{"Service Quality","Food Quality","Hygein","Customer Satisfaction","Environment"};
	JButton button_close;
	JFrame MainFrame = new JFrame("Feedback List");
	/*public static void main(String[] args) 
	{
		Feedback_List fl=new Feedback_List();
	}*/
	public void Feedback_List()
	{
		JPanel panel_main = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		panel_main.setBackground(Color.GRAY);
		panel_main.setPreferredSize(new Dimension(1350, 700));
		
		JPanel panel_feedback_list=new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel_feedback_list.setBackground(Color.GRAY);
		panel_feedback_list.setBorder(new TitledBorder("Feedback List"));
		panel_feedback_list.setPreferredSize(new Dimension(1360,450));
		
		JPanel panel_feedback_average=new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel_feedback_average.setBackground(Color.GRAY);
		panel_feedback_average.setBorder(new TitledBorder("Feedback Average"));
		panel_feedback_average.setPreferredSize(new Dimension(1360,170));
		
		button_close=new JButton("Close");
		button_close.setPreferredSize(new Dimension(150,50));
		button_close.addActionListener((ActionListener) this);
		
		DefaultTableModel model_feedback_list,model_average_feedback;
		model_feedback_list=new DefaultTableModel(feedback_list,0);
		JTable table_feedback_list = new JTable(model_feedback_list);
		
		model_average_feedback=new DefaultTableModel(average_feedback,0);
		JTable table_average_feedback = new JTable(model_average_feedback);
		
		JScrollPane pane_feedback_list=new JScrollPane(table_feedback_list );
		pane_feedback_list.setPreferredSize(new Dimension(1340,420));
		
		JScrollPane pane_average_feedback=new JScrollPane(table_average_feedback);
		pane_average_feedback.setPreferredSize(new Dimension(1340,140));

		JTableHeader header_feedback_list = table_feedback_list.getTableHeader();
		header_feedback_list.setBackground(Color.GRAY);
		
		JTableHeader header_average_feedback = table_average_feedback.getTableHeader();
		header_average_feedback.setBackground(Color.GRAY);
		
		panel_feedback_list.add(pane_feedback_list);
		panel_feedback_average.add(pane_average_feedback);
		
		panel_main.add(panel_feedback_list);
		panel_main.add(panel_feedback_average);
		panel_main.add(button_close);
		MainFrame.add(panel_main);
		MainFrame.setVisible(true);
		MainFrame.setSize(500, 600);
		MainFrame.pack();
		MainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if (ae.getSource() == button_close)
		{
			MainFrame.dispose();
		}
		
	}

}
