import java.awt.*;
import java.io.*;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

class roadMap extends Frame{
      Image img;


        public roadMap() throws IOException{
               File input = new File("");
               img = ImageIO.read(input);

               setTitle("City Map");
               setSize(800,400);
               setBackground(Color.yellow);
               setVisible(true);
        }

        public void paint(Graphics g){

                    Font f = new Font("ARIAL",Font.BOLD,50);
                    g.setFont(f);
                    g.setColor(Color.yellow);
                    g.drawString("Hong Kong",400,100);
                    g.drawImage(img,0,0,this);

    //**** creating all junctions(stations)....
                   g.fillOval(200,200,10,10);
                   g.fillOval(300,250,10,10);
                   g.fillOval(400,300,10,10);
                   g.fillOval(500,225,10,10);
                   g.fillOval(600,275,10,10);
                   g.fillOval(225,150,10,10);
                   g.fillOval(325,350,10,10);
                   g.fillOval(150,375,10,10);

    //**** joing all junctions forming roads....
                   g.drawLine(200,200,300,250);
                   g.drawLine(300,250,225,150);
                   g.drawLine(300,250,400,300);
                   g.drawLine(400,300,600,275);
                   g.drawLine(400,300,500,225);
                   g.drawLine(500,225,300,250);
                   g.drawLine(200,200,300,250);
                   g.drawLine(400,300,325,350);
                   g.drawLine(325,350,150,375);


        }
        public static void main(String args[])throws IOException{
               roadMap r = new roadMap();
        }
}