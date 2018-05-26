package RPS;
import javax.swing.ImageIcon;

/**
 * 
 * @author Ryan Wheeler
 *
 */

public enum RPSEnum {

	ROCK(new ImageIcon(RPSEnum.class.getResource("stone.png"))),
	PAPER(new ImageIcon(RPSEnum.class.getResource("paper.png"))),
	SCISSORS(new ImageIcon(RPSEnum.class.getResource("scissors.png")));

	private ImageIcon choice;

	private RPSEnum(ImageIcon choice) {
		this.choice = choice;

	}

	public ImageIcon getImageIcon() {
		return choice;
	}

	public static RPSEnum randomChoice() {
		RPSEnum i = values()[(int)(Math.random()*values().length)];
		return i ;

	}
}