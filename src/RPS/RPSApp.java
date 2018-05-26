package RPS;

/**
 * 
 * @author Ryan Wheeler
 * 
 */

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;

public class RPSApp extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPlayer;
	private JTextField txtComputer;
	private JTextField txtWinner;
	private JTextField txtOutCome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RPSApp frame = new RPSApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RPSApp() {
		setTitle("Rock, Paper, Scissors");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 750, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JLayeredPane layeredPane = new JLayeredPane();

		contentPane.add(layeredPane, BorderLayout.CENTER);
		JLabel player = new JLabel("");
		player.setBounds(20, 5, 500, 500);
		layeredPane.add(player);

		JLabel computer = new JLabel("");
		computer.setBounds(450, 2, 500, 500);
		layeredPane.add(computer);

		JButton Rock = new JButton("Rock");
		Rock.setFont(new Font("Tahoma", Font.PLAIN, 25));
		Rock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				RPSEnum rock = RPSEnum.ROCK;
				RPSEnum rand = RPSEnum.randomChoice();
				player.setIcon(rock.getImageIcon());
				computer.setIcon(rand.getImageIcon());

				if (rock == rand) {
					txtOutCome.setText("TIE");
				} else if (rock != rand && rand == RPSEnum.PAPER) {
					txtOutCome.setText("COMPUTER");
				} else {
					txtOutCome.setText("Player");
				}

			}
		});
		Rock.setBounds(100, 550, 150, 30);
		layeredPane.add(Rock);

		JButton Paper = new JButton("Paper");
		Paper.setFont(new Font("Tahoma", Font.PLAIN, 25));
		Paper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				RPSEnum paper = RPSEnum.PAPER;
				RPSEnum rand = RPSEnum.randomChoice();
				player.setIcon(paper.getImageIcon());
				computer.setIcon(rand.getImageIcon());

				if (paper == rand) {
					txtOutCome.setText("TIE");
				} else if (paper != rand && rand == RPSEnum.SCISSORS) {
					txtOutCome.setText("COMPUTER");
				} else {
					txtOutCome.setText("Player");
				}

			}
		});
		Paper.setBounds(275, 550, 150, 30);
		layeredPane.add(Paper);

		JButton Scissors = new JButton("Scissors");
		Scissors.setFont(new Font("Tahoma", Font.PLAIN, 25));
		Scissors.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				RPSEnum scissors = RPSEnum.SCISSORS;
				RPSEnum rand = RPSEnum.randomChoice();
				player.setIcon(scissors.getImageIcon());
				computer.setIcon(rand.getImageIcon());

				if (scissors == rand) {
					txtOutCome.setText("TIE");
				} else if (scissors != rand && rand == RPSEnum.ROCK) {
					txtOutCome.setText("COMPUTER");
				} else {
					txtOutCome.setText("Player");
				}

			}
		});
		Scissors.setBounds(450, 550, 150, 30);
		layeredPane.add(Scissors);

		txtPlayer = new JTextField();
		txtPlayer.setForeground(Color.BLACK);
		txtPlayer.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtPlayer.setEditable(false);
		txtPlayer.setHorizontalAlignment(SwingConstants.CENTER);
		txtPlayer.setText("PLAYER");
		txtPlayer.setBounds(50, 20, 150, 30);
		layeredPane.add(txtPlayer);
		txtPlayer.setColumns(10);

		txtComputer = new JTextField();
		txtComputer.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtComputer.setEditable(false);
		txtComputer.setHorizontalAlignment(SwingConstants.CENTER);
		txtComputer.setText("COMPUTER");
		txtComputer.setBounds(500, 20, 150, 30);
		layeredPane.add(txtComputer);
		txtComputer.setColumns(10);

		txtWinner = new JTextField();
		txtWinner.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtWinner.setEditable(false);
		txtWinner.setHorizontalAlignment(SwingConstants.CENTER);
		txtWinner.setText("WINNER");
		txtWinner.setBounds(275, 342, 150, 30);
		layeredPane.add(txtWinner);
		txtWinner.setColumns(10);

		txtOutCome = new JTextField();
		txtOutCome.setHorizontalAlignment(SwingConstants.CENTER);
		txtOutCome.setEditable(false);
		txtOutCome.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtOutCome.setBounds(275, 372, 150, 30);
		layeredPane.add(txtOutCome);
		txtOutCome.setColumns(10);

	}
}
