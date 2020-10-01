import javax.swing.*;
import java.awt.*;
public class Casa2 extends JFrame{
	public Casa2(){
		setSize(400,400);
		setDefaultCloseOperation(3);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		setTitle("Alfredi 01-oct-2020");
		getContentPane().add(new Lienzo());
	}
	public static void main(String [] ar){
		new Casa2();
	}
}
class Lienzo extends Canvas{
	public void paint(Graphics g){
		// Fondo
		g.setColor(Color.yellow);
		g.fillRect(0,0,getWidth(), getHeight());
		// Cuadrado Casa2
		g.setColor(Color.black);
		g.fillRect(100,100,200,200);
		// techo
		int x[] = {100,200,300};
		int y[] = {100,20,100};
		g.setColor(Color.gray);
		g.fillPolygon(x,y,3);
		// ventanas
		g.setColor(Color.green);
		g.fillRect(120,150,40,40);
		g.fillRect(240,150,40,40);
		// pueta
		g.setColor(Color.red);
		g.fillRect(180,200,40,100);
	}
}