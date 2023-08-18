package view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
 
import javax.swing.JPasswordField;
 
@SuppressWarnings("serial")
public class MyRoundJpassTextfield extends JPasswordField{
	
	private Shape shape;
    public MyRoundJpassTextfield() {
//        super(size);
        setOpaque(false); // As suggested by @AVD in comment.
    }
    protected void paintComponent(Graphics g) {
         g.setColor(getBackground());
         g.fillRoundRect(0, 0, getWidth()-2, getHeight()-2, 12, 12);
         super.paintComponent(g);
    }
    protected void paintBorder(Graphics g) {
    	Graphics2D g2d = (Graphics2D) g;
    	//圆角抗锯齿
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
//		g2d.setColor(new Color(221,221,221));
        
		g2d.drawRoundRect(0, 0, getWidth()-2, getHeight()-2, 12, 12);
    }
//    public boolean contains(int x, int y) {
//         if (shape == null || !shape.getBounds().equals(getBounds())) {
//             shape = new RoundRectangle2D.Float(0, 0, getWidth()-1, getHeight()-1, 10, 10);
//         }
//         return shape.contains(x, y);
//    }
 
}