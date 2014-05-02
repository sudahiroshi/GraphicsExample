import java.awt.event.*;
import java.awt.*;
public class DrawByMouse3 {
	MyCanvas c;

	public static void main(String[] args) {
		new DrawByMouse3();
	}
	DrawByMouse3() {
		Frame f = new Frame( "DrawByMouse variation2" );
		f.setSize( 640, 480 );
		f.addWindowListener( new WindowAdapter() {
			@Override public void windowClosing( WindowEvent e ) {
				System.exit( 0 );
			}
		});
		c = new MyCanvas();
		c.addMouseListener(new MouseListener() {
			@Override public void mouseClicked( MouseEvent e ) {
				if( e.getButton() == 1 ) {
					c.setPoint( e.getX(), e.getY() );
				} else if( e.getButton() == 2 ) {
					c.changeDiagram();
				}
			}
			@Override public void mouseEntered( MouseEvent e ) {}
			@Override public void mouseExited( MouseEvent e ) {}
			@Override public void mousePressed( MouseEvent e ) {}
			@Override public void mouseReleased( MouseEvent e ) {}
		});
		c.addMouseMotionListener( new MouseMotionListener() {
			@Override public void mouseDragged( MouseEvent e ) {}
			@Override public void mouseMoved( MouseEvent e ) {}
		});
		f.add( c );
		f.setVisible( true );
	}
}
