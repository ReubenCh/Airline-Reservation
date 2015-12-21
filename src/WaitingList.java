import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WaitingList extends JFrame implements ActionListener {

	private JButton btnAdd, btnRemove, btnUp, btnDown;
	private JList<Passenger> jlPassengers;
	private DefaultListModel<Passenger> dlm;

	public WaitingList() {

		dlm = new DefaultListModel<Passenger>();

		jlPassengers = new JList<Passenger>(dlm);
		jlPassengers.setVisibleRowCount(20);
		jlPassengers.setFont(new Font("Courier New", Font.PLAIN, 12));
		jlPassengers.setFixedCellWidth(250);
		jlPassengers.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
		jlPassengers.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);

		JLabel lblLogo = new JLabel();
		lblLogo.setIcon(new ImageIcon("images\\air-canada-logo.jpg"));
		lblLogo.setPreferredSize(new Dimension(350, 70));
		lblLogo.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblName = new JLabel();
		lblName.setText(" NAME");
		lblName.setPreferredSize(new Dimension(150, 20));

		JLabel lblPriority = new JLabel();
		lblPriority.setText(" PRIORITY");
		lblPriority.setPreferredSize(new Dimension(100, 20));
		lblPriority.setHorizontalAlignment(SwingConstants.RIGHT);

		JScrollPane scroll = new JScrollPane(jlPassengers, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scroll.setBorder(null);

		btnUp = new JButton("\u2191");
		btnUp.setPreferredSize(new Dimension(45, 30));
		btnUp.setBackground(Color.WHITE);
		btnUp.setFocusable(false);
		btnUp.addActionListener(this);
		
		btnDown = new JButton("\u2193");
		btnDown.setPreferredSize(new Dimension(45, 30));
		btnDown.setBackground(Color.WHITE);
		btnDown.setFocusable(false);
		btnDown.addActionListener(this);
		
		btnAdd = new JButton("ADD");
		btnAdd.setPreferredSize(new Dimension(100, 30));
		btnAdd.setBackground(Color.WHITE);
		btnAdd.setFocusable(false);
		btnAdd.addActionListener(this);

		btnRemove = new JButton("REMOVE");
		btnRemove.setPreferredSize(new Dimension(100, 30));
		btnRemove.setBackground(Color.WHITE);
		btnRemove.setFocusable(false);
		btnRemove.addActionListener(this);

		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 15));
		panel.setBackground(Color.WHITE);
		panel.add(lblLogo);
		panel.add(Box.createHorizontalStrut(25));
		panel.add(lblName);
		panel.add(lblPriority);
		panel.add(Box.createHorizontalStrut(25));
		panel.add(Box.createHorizontalStrut(25));
		panel.add(scroll);
		panel.add(Box.createHorizontalStrut(25));
		panel.add(btnUp);
		panel.add(btnAdd);
		panel.add(btnRemove);
		panel.add(btnDown);

		setContentPane(panel);
		setSize(350, 560);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setTitle("Waiting List");
		setResizable(false);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {

	}
}
