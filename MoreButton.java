import java.awt.event.*;
import javax.swing.*;

public class MoreButton extends JButton implements ActionListener {

    private GameFrame frame;

    public MoreButton(GameFrame f) {
        super("More");
        frame = f;
        addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        new GameFrame();
    }

}