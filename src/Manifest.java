import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class Manifest extends JFrame implements ActionListener {

	private JList<Passenger> jlPassengers;
	private DefaultListModel<Passenger> dlm;
	private JButton btnName, btnSeat;

	public Manifest() {

		dlm = new DefaultListModel<Passenger>();
		
		jlPassengers = new JList<Passenger>(dlm);
		jlPassengers.setVisibleRowCount(20);
		jlPassengers.setFont(new Font("Courier New", Font.PLAIN, 12));
		jlPassengers.setFixedCellWidth(250);
		jlPassengers.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
		jlPassengers.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		
		JLabel lblLogo = new JLabel();
		lblLogo.setIcon(new ImageIcon("images\\air-canada-logo.jpg"));
		
		JLabel lblName = new JLabel();
		lblName.setText("NAME");
		lblName.setHorizontalAlignment(SwingConstants.LEFT);
		lblName.setPreferredSize(new Dimension(215, 20));
		
		JLabel lblSeat = new JLabel();
		lblSeat.setText("SEAT");
		lblSeat.setPreferredSize(new Dimension(50, 20));
		lblSeat.setHorizontalAlignment(SwingConstants.LEFT);

		JScrollPane scroll = new JScrollPane(jlPassengers, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scroll.setBorder(null);

		btnName = new JButton("NAME");
		btnName.setPreferredSize(new Dimension(80, 30));
		btnName.setBackground(Color.WHITE);
		btnName.setFocusable(false);
		btnName.addActionListener(this);

		btnSeat = new JButton("SEAT");
		btnSeat.setPreferredSize(new Dimension(80, 30));
		btnSeat.setBackground(Color.WHITE);
		btnSeat.setFocusable(false);
		btnSeat.addActionListener(this);

		JPanel buttonPanel = new JPanel();
		buttonPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), "SORT BY:", 
				TitledBorder.CENTER, TitledBorder.TOP, new Font("Arial", Font.BOLD, 12), new Color(226, 36, 42)));
		buttonPanel.setBackground(Color.WHITE);
		buttonPanel.add(btnName);
		buttonPanel.add(btnSeat);

		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 15));
		panel.setBackground(Color.WHITE);
		panel.add(lblLogo);
		panel.add(lblName);
		panel.add(lblSeat);
		panel.add(scroll);
		panel.add(buttonPanel);

		setContentPane(panel);
		setSize(350, 560);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setTitle("Manifest");
		setResizable(false);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		
	}
}
