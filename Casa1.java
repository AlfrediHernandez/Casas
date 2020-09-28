import javax.swing.*;
import java.awt.*;
public class Casa1 extends JFrame{
	public Casa1(){
		setSize(400,400);
		setDefaultCloseOperation(3);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		setTitle("Alfredi 28-sep-2020");
			getContentPane().add(new Lienzo());
	}
	public static void main(String [] ar){
		new Casa1();
	}
}
class Lienzo extends Canvas{
	public void paint(Graphics g){
		//Fondo
		g.setColor(Color.blue);
		g.fillRect(0,0,getWidth(),getHeight());
		//Cuadrado de la Casa 
		g.setColor(Color.cyan);
		g.fillRect(100,100,200,200);
		//Techo
		int x[] = {100,200,300};
		int y[] = {100,20,100};
		g.setColor(Color.orange);
		g.fillPolygon(x,y,3);
		//Ventanas
		g.setColor(Color.red);
		g.fillRect(120,150,40,40);
		g.fillRect(240,150,40,40);
		//Puerta
		g.setColor(Color.black);
		g.fillRect(180,200,40,100);
	}
}