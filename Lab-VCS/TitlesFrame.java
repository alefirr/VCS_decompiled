import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class TitlesFrame extends JFrame {
   /**
   * Creates the main application window and initializes the user interface.
   */
   public TitlesFrame() {
     this.initUI();
   }

   /**
    * Configures the window title, size, close operation and adds the drawing panel.
    */
   private void initUI() {
      this.setTitle("Кривые фигуры");
      this.setDefaultCloseOperation(3);
      this.add(new TitlesPanel(14));
      this.setSize(350, 350);
      this.setLocationRelativeTo((Component)null);
   }

   public static void main(String[] args) {
      SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            TitlesFrame ps = new TitlesFrame();
            ps.setVisible(true);
         }
      });
   }
}
