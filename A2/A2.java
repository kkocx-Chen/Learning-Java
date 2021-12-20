import java.awt.*;      //引入原廠設計圖awt
import java.applet.*;   //引入原廠設計圖applet
//class 
public class A2 extends Applet      //extends 繼承 Applet 網頁程式
{           

    public void paint(Graphics g) //paint 繪圖筆 graphics 繪圖物件 g 繪圖筆
    {
        g.drawString("Hello Java 網頁程式", 50, 50);     //drawString 繪製字串 使用g繪圖筆(物件導向)
        g.drawString("Hello Java Web", 50, 70);     //drawString 繪製字串 使用g繪圖筆(物件導向)
        g.drawString("Hello Java Android", 50, 90);     //drawString 繪製字串 使用g繪圖筆(物件導向)
        g.setColor(Color.RED);
        g.drawLine(50,110,150,110);
        g.setColor(Color.BLUE);
        g.drawRect(50,130,100,50);
        g.setColor(Color.YELLOW);
        g.fillRect(50,130,100,50);
        g.setColor(new Color(255,123,255));
        g.drawOval(50,130+50+10,100,70);
        g.setColor(Color.GREEN);
        g.fillOval(50,190,100,70);   
    }


    
}
