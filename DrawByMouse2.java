import java.awt.event.*;
import java.awt.*;

public class DrawByMouse2 {
	MyCanvas c;
	int diagram = 0;

	public static void main(String[] args) {
		new DrawByMouse2();
	}

	DrawByMouse2() {
		Frame f = new Frame( "DrawByMouse variation1" );
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
					c.setPoint(e.getX(), e.getY());
				} else if( e.getButton() == 2 ) {
					if( diagram == 0 ) {
						diagram = 1;
						c.changeDiagram( 1 );
					} else if( diagram == 1 ) {
						diagram = 0;
						c.changeDiagram( 0 );
					}
				}
			}
			@Override public void mouseEntered( MouseEvent e ) {}
			@Override public void mouseExited( MouseEvent e ) {}
			@Override public void mousePressed( MouseEvent e ) {}
			@Override public void mouseReleased( MouseEvent e ) {}
		});
		c.addMouseMotionListener( new MouseMotionListener(){
			@Override public void mouseDragged( MouseEvent e ) {}
			@Override public void mouseMoved( MouseEvent e ) {}
		});
		f.add( c );
		f.setVisible( true );
	}
}
