import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.awt.*;

public class AirlineReservation extends JFrame implements ActionListener, WindowListener {

	private Seat[][] btnSeats;
	private JButton btnManifest, btnWaitingList;
	private JPanel panel;
	private JMenu mnuFile;
	private JMenuItem miOpen, miSave;
	private JMenuBar menuBar;

	public static void main(String[] args) {

		new AirlineReservation();
	}

	public AirlineReservation() {

		String[] aisles = {"A", "B", "C", "D", "E", "F", "G", "H"};
		JLabel[] lblRows = new JLabel[10];

		JLabel lblLogo = new JLabel();
		lblLogo.setIcon(new ImageIcon("images\\air-canada-logo.png"));
		lblLogo.setPreferredSize(new Dimension(650, 70));
		lblLogo.setHorizontalAlignment(SwingConstants.CENTER);

		panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panel.setBackground(Color.WHITE);
		panel.add(lblLogo);

		btnSeats = new Seat[10][8];

		for (int i = 0; i < lblRows.length; i++)
		{
			lblRows[i] = new JLabel();
			lblRows[i].setText(Integer.toString(i + 1));
			lblRows[i].setPreferredSize(new Dimension(40, 40));
			lblRows[i].setForeground(new Color(211, 38, 40));
			lblRows[i].setHorizontalAlignment(SwingConstants.CENTER);
			panel.add(lblRows[i]);

			for (int j = 0; j < btnSeats[0].length; j++)
			{
				btnSeats[i][j] = new Seat();
				btnSeats[i][j].setPreferredSize(new Dimension(50, 40));
				btnSeats[i][j].setBackground(Color.WHITE);
				btnSeats[i][j].setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED,
						Color.LIGHT_GRAY, Color.DARK_GRAY));
				btnSeats[i][j].setText(aisles[j ]);
				btnSeats[i][j].setFocusable(false);
				btnSeats[i][j].addActionListener(this);
				panel.add(btnSeats[i][j]);

				if (j == 1 || j == 5)
				{
					panel.add(Box.createRigidArea(new Dimension(50, 40)));
				}
			}
		}

		btnManifest = new JButton();
		btnManifest.setText("VIEW MANIFEST");
		btnManifest.setFocusable(false);
		btnManifest.setPreferredSize(new Dimension(150, 30));
		btnManifest.setBackground(Color.WHITE);
		btnManifest.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, Color.LIGHT_GRAY,
				Color.DARK_GRAY));
		btnManifest.setForeground(new Color(211, 38, 40));
		btnManifest.addActionListener(this);

		btnWaitingList = new JButton();
		btnWaitingList.setText("VIEW WAITING LIST");
		btnWaitingList.setFocusable(false);
		btnWaitingList.setPreferredSize(new Dimension(150, 30));
		btnWaitingList.setBackground(Color.WHITE);
		btnWaitingList.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, Color.LIGHT_GRAY,
				Color.DARK_GRAY));
		btnWaitingList.setForeground(new Color(211, 38, 40));
		btnWaitingList.addActionListener(this);

		miOpen = new JMenuItem(String.format("%-10s", "Open"));
		miOpen.addActionListener(this);

		miSave = new JMenuItem(String.format("%-10s", "Save"));
		miSave.addActionListener(this);

		mnuFile = new JMenu("File");
		mnuFile.setForeground(new Color(211, 38, 40));
		mnuFile.add(miOpen);
		mnuFile.add(miSave);

		menuBar = new JMenuBar();
		menuBar.setBackground(Color.WHITE);
		menuBar.add(mnuFile);

		panel.add(Box.createRigidArea(new Dimension(650, 10)));
		panel.add(btnManifest);
		panel.add(btnWaitingList);

		setContentPane(panel);
		setJMenuBar(menuBar);
		setTitle("Air Canada Reservation System");
		setSize(625, 650);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		addWindowListener(this);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnManifest)
		{
			new Manifest();
		}
		else if (e.getSource() == btnWaitingList)
		{
			new WaitingList();
		}
		else if (e.getSource() == miSave)
		{
			
		}
		else if (e.getSource() == miOpen)
		{
			
		}
		else
		{
			
		}
	}

	public void windowClosing(WindowEvent e) {

		int option = JOptionPane.showConfirmDialog(null, "Are you sure want to exit?", 
				"Airline Reservation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

		if (option == JOptionPane.YES_OPTION)
		{
			System.exit(0);
		}
	}

	public void windowActivated(WindowEvent arg0) {}
	public void windowClosed(WindowEvent arg0) {}
	public void windowDeactivated(WindowEvent arg0) {}
	public void windowDeiconified(WindowEvent arg0) {}
	public void windowIconified(WindowEvent arg0) {}
	public void windowOpened(WindowEvent arg0) {}
}
