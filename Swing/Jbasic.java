import javax.swing.*;
import java.awt.*;

class Jbasic {
	public static void main(String[] args) {
		JFrame frame = new JFrame("JBasic");
		frame.setSize(700, 500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		// Create Header panel with GridBagLayout for centering
		JPanel Header = new JPanel(new GridBagLayout());
		Header.setBackground(Color.black);
		Header.setPreferredSize(new Dimension(frame.getWidth(), 40)); // Height is 70px

		// Create and add labels
		JLabel name = new JLabel("Namaste Coderzzz....!!");
		JLabel name2 = new JLabel("Namaste Chinmay");
		name.setForeground(Color.white);
		name2.setForeground(Color.white);

		// Create a panel to hold both labels and center them
		JPanel labelPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		labelPanel.setOpaque(false); // Make the panel transparent
		labelPanel.add(name);
		labelPanel.add(name2);

		// Add the label panel to the Header using GridBagLayout
		Header.add(labelPanel, new GridBagConstraints());

		// Use BorderLayout and add the Header to the top
		frame.setLayout(new BorderLayout());
		frame.add(Header, BorderLayout.NORTH);

		frame.setVisible(true);
	}
}
