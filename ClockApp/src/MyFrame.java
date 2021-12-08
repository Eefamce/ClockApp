import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame{
	
	SimpleDateFormat timeFormat;
	SimpleDateFormat dayFormat;
	JLabel timeLabel;
	JLabel dayLabel;
	String time;
	String day;

	MyFrame(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Clock Application");
		this.setLayout(new FlowLayout());
		this.setSize(650,250);
		this.setBackground(Color.black); 
		//this.setResizable(false);
		
		timeFormat = new SimpleDateFormat("hh:mm:ss a");
		dayFormat = new SimpleDateFormat("EEEE, MMM d,' 'yyyy");
		
		timeLabel = new JLabel();
		timeLabel.setFont(new Font("Helvetica", Font.PLAIN, 60));
		timeLabel.setForeground(Color.CYAN);
		timeLabel.setBackground(Color.black);
		timeLabel.setOpaque(true);
		
		dayLabel = new JLabel();
		dayLabel.setFont(new Font("Ink Free", Font.PLAIN, 60));
		dayLabel.setForeground(Color.CYAN);
		dayLabel.setBackground(Color.black);
		dayLabel.setOpaque(true);

		
		
		this.add(timeLabel);
		this.add(dayLabel);
		this.setVisible(true);
		
		setTime();
	}
	
	public void setTime() {
		while(true) {
		time = timeFormat.format(Calendar.getInstance().getTime());
		timeLabel.setText(time);
		
		day = dayFormat.format(Calendar.getInstance().getTime());
		dayLabel.setText(day);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
}
