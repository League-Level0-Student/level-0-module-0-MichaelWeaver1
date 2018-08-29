import javax.swing.JOptionPane;

public class EverythingIsAwesome {
public static void main(String[] args) {
String thing = JOptionPane.showInputDialog("What do you think is awesome?");
JOptionPane.showMessageDialog(null, thing + " is awesome.");
}}