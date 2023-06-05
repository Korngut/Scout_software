import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Main {
    public static void main(String[] args) {
        final Team orbit = new Team(1690, "Orbit", "C:\\Users\\User\\Scout_software\\src\\orbit.jpg");
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Scouting - Excalibur 6738");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
            frame.setUndecorated(true);

            JPanel panel = new JPanel(null) {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);

                    Graphics2D g2d = (Graphics2D) g;
                    Stroke oldStroke = g2d.getStroke();
                    g2d.setStroke(new BasicStroke(3)); // Increase the stroke thickness
                    g2d.drawRect(100, 190, 600, 300); // Draw the square
                    g2d.drawRect(800, 190, 600, 300); // Draw the square
                    g2d.drawRect(100, 600, 600, 300); // Draw the square
                    g2d.drawRect(800, 600, 600, 300); // Draw the square
                    g2d.drawRect(1500, 190, 300, 715); // Draw the square

                    g2d.setColor(new Color(82, 173, 245, 128)); // Blue color with transparency
                    g2d.fillRect(110, 200, 575, 75); // Draw a blue square with transparency
                    g2d.fillRect(110, 290, 575, 75); // Draw a blue square with transparency
                    g2d.fillRect(110, 380, 575, 75); // Draw a blue square with transparency
                    g2d.fillRect(810, 200, 575, 75); // Draw a blue square with transparency
                    g2d.fillRect(110, 610, 575, 75); // Draw a blue square with transparency
                    g2d.fillRect(810, 610, 575, 75); // Draw a blue square with transparency
                    g2d.fillRect(110, 700, 575, 75); // Draw a blue square with transparency
                    g2d.fillRect(110, 790, 575, 75); // Draw a blue square with transparency
                    g2d.fillRect(810, 700, 575, 75); // Draw a blue square with transparency
                    g2d.fillRect(810, 790, 575, 75); // Draw a blue square with transparency
                    g2d.fillRect(810, 290, 575, 75); // Draw a blue square with transparency
                    g2d.fillRect(810, 380, 575, 75); // Draw a blue square with transparency
                    g2d.setStroke(oldStroke); // Reset the stroke to the original
                }
            };

            JLabel label = new JLabel("הכי הרבה נקודות למשחק:");
            label.setBounds(275, 140, 350, 30); // Set the position and size of the label
            label.setFont(new Font("assistant", Font.BOLD, 27));
            JLabel label1 = new JLabel("ההגנות הכי טובות:");
            label1.setBounds(1000, 140, 350, 30); // Set the position and size of the label

            label1.setFont(new Font("assistant", Font.BOLD, 27));
            JLabel label2 = new JLabel("הכי הרבה קוביות:");
            label2.setBounds(275, 550, 350, 30); // Set the position and size of the label
            label2.setFont(new Font("assistant", Font.BOLD, 27));
            JLabel label3 = new JLabel("הכי הרבה קונוסים:");
            label3.setBounds(1000, 550, 350, 30); // Set the position and size of the label
            label3.setFont(new Font("assistant", Font.BOLD, 27));
            JLabel label4 = new JLabel("עדכוני סקואט אחרונים:");
            label4.setBounds(1525, 140, 350, 30); // Set the position and size of the label
            label4.setFont(new Font("assistant", Font.BOLD, 27));
            JLabel score1 = new JLabel(orbit.getName()); // Create the label without text initially
            score1.setBounds(190, 210, 350, 30); // Set the position and size of the label
            score1.setFont(new Font("assistant", Font.BOLD, 30));
            JLabel score11 = new JLabel(orbit.getNumber()); // Create the label without text initially
            score11.setBounds(190, 233, 350, 30); // Set the position and size of the label
            score11.setFont(new Font("assistant", Font.BOLD, 20));
            // Resize the image to 60x60 pixels
            ImageIcon icon1 = new ImageIcon(orbit.getPhoto());
            Image image = icon1.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
            ImageIcon resizedIcon = new ImageIcon(image);
            JLabel score111 = new JLabel(resizedIcon); // Create the label with the resized image
            score111.setBounds(120, 207, 60, 60); // Set the position and size of the label
            score111.setFont(new Font("assistant", Font.BOLD, 20));
            JLabel score2 = new JLabel(orbit.getName()); // Create the label without text initially
            score2.setBounds(190, 300, 350, 30); // Set the position and size of the label
            score2.setFont(new Font("assistant", Font.BOLD, 30));
            JLabel score22 = new JLabel(orbit.getNumber()); // Create the label without text initially
            score22.setBounds(190, 333, 350, 30); // Set the position and size of the label
            score22.setFont(new Font("assistant", Font.BOLD, 20));
            // Resize the image to 60x60 pixels
            ImageIcon icon2 = new ImageIcon(orbit.getPhoto());
            Image image2 = icon2.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
            ImageIcon resizedIcon2 = new ImageIcon(image2);
            JLabel score222 = new JLabel(resizedIcon); // Create the label with the resized image
            score222.setBounds(120, 300, 60, 60); // Set the position and size of the label
            score222.setFont(new Font("assistant", Font.BOLD, 20));
            frame.add(panel);
            panel.add(label);
            panel.add(label1);
            panel.add(label2);
            panel.add(label3);
            panel.add(label4);
            panel.add(score1);
            panel.add(score11);
            panel.add(score111); panel.add(score1); panel.add(score222); panel.add(score22); panel.add(score2);
            panel.add(score11);

            frame.setVisible(true);
        });
    }
}
