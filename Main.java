import javax.swing.JOptionPane;

class Main 
{
  public static void main(String[] args) 
  {
    //Player input
    String playerName = JOptionPane.showInputDialog("What's your name?");

    JOptionPane.showMessageDialog(null, "Ah what a curious name. Hello " + playerName);
  }
}