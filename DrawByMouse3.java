 1: import java.awt.event.*;
 2: import java.awt.*;
 3: public class DrawByMouse3 {
 4: 	MyCanvas c;
 5:
 6: 	public static void main(String[] args) {
 7: 		new DrawByMouse3();
 8: 	}
 9: 	DrawByMouse3() {
10: 		Frame f = new Frame( "DrawByMouse variation2" );
11: 		f.setSize( 640, 480 );
12: 		f.addWindowListener( new WindowAdapter() {
13: 			@Override public void windowClosing( WindowEvent e ) {
14: 				System.exit( 0 );
15: 			}
16: 		});
17: 		c = new MyCanvas();
18: 		c.addMouseListener(new MouseListener() {
19: 			@Override public void mouseClicked( MouseEvent e ) {
20: 				if( e.getButton() == 1 ) {
21: 					c.setPoint( e.getX(), e.getY() );
22: 				} else if( e.getButton() == 2 ) {
23: 					c.changeDiagram();
24: 				}
25: 			}
26: 			@Override public void mouseEntered( MouseEvent e ) {}
27: 			@Override public void mouseExited( MouseEvent e ) {}
28: 			@Override public void mousePressed( MouseEvent e ) {}
29: 			@Override public void mouseReleased( MouseEvent e ) {}
30: 		});
31: 		c.addMouseMotionListener( new MouseMotionListener() {
32: 			@Override public void mouseDragged( MouseEvent e ) {}
33: 			@Override public void mouseMoved( MouseEvent e ) {}
34: 		});
35: 		f.add( c );
36: 		f.setVisible( true );
37: 	}
38: }
