import javax.swing.*;
import java.awt.*;
public class Casa4 extends JFrame{
	public Casa4(){
		getContentPane().add(new Lienzo4());
			setDefaultCloseOperation(3);
			setResizable(false);
			setSize(400,400);
			setLocationRelativeTo(null);
			setVisible(true);
			setTitle("Alfredihdz 29-Octubre-2020");
	}
	public static void main(String [] al){
		new Casa4();
	}
}
class Lienzo4 extends Canvas{
	public void paint(Graphics g){
		// fondo negro
		g.setColor(Color.black);
		g.fillRect(0,0,getWidth(),getHeight());
		// techo
		int x[] = {100,200,300};
		int y[] = {100,20,100};
		g.setColor(Color.green);
		g.drawPolygon(x,y,3);
		// cuadrado de la Casa4
		g.setColor(Color.blue);
		g.drawRect(100,100,200,200);
		// ventanas
		g.setColor(Color.cyan);
		g.drawRect(120,150,40,50);
		g.drawRect(240,150,40,50);
		// puerta
		g.setColor(Color.green);
		g.drawRect(175,200,50,100);
	}
}
