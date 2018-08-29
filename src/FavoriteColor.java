import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class FavoriteColor {
public static void main(String[] args) {
String color = JOptionPane.showInputDialog("Whats your favorte color?");	
JOptionPane.showMessageDialog(null, color + " is also my favorite.");
Robot Marvin =  new Robot();  
Marvin.penDown();
Marvin.hide();
Marvin.setSpeed(200);
Marvin.turn(120);
Marvin.move(200);
Marvin.turn(120);
Marvin.move(200);
Marvin.turn(120);
Marvin.move(200);

}}