import java.awt.;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.;

public class GUI extends JFrame implements ActionListener {
    private JPanel panel;
    private JFrame frame;
    private JLabel title;
    private Button time, ingredients;

    public GUI() {

        frame = new JFrame("Dinner Time!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(250, 150));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        title = new JLabel("Pick an option. ");
        title.setFont(new Font("Calibri", Font.BOLD, 25));

        time = new Button("Pick time");
        //time.setPreferredSize(new Dimension(300, 50));
        ingredients = new Button("Pick ingredients");
        //ingredients.setPreferredSize(new Dimension(300, 50));

        panel.add(title, BorderLayout.CENTER);
        panel.add(time, BorderLayout.CENTER);
        panel.add(ingredients, BorderLayout.CENTER);
        frame.add(panel);

    }
    public void run() {
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //new GUI();

    }

    @Override
    public void actionPerformed(ActionEvent e) {


    }


}
