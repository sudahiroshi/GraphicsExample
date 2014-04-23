 1: import java.awt.event.*;
 2: import java.awt.*;
 3:
 4: public class DrawByMouse {
 5: 	MyCanvas c;
 6:
 7: 	public static void main( String[] args ){
 8: 		new DrawByMouse();
 9: 	}
10:
11: 	DrawByMouse(){
12: 		Frame f = new Frame( "DrawByMouse" );
13: 		f.setSize( 640, 480 );
14: 		f.addWindowListener( new WindowAdapter() {
15: 			@Override public void windowClosing( WindowEvent e ){
16: 				System.exit( 0 );
17: 			}
18: 		});
19: 		c = new MyCanvas();
20: 		c.addMouseListener(new MouseListener() {
21: 			@Override public void mouseClicked( MouseEvent e ) {
22: 				c.setPoint( e.getX(), e.getY() );
23: 			}
24: 			@Override public void mouseEntered( MouseEvent e ) {}
25: 			@Override public void mouseExited( MouseEvent e ) {}
26: 			@Override public void mousePressed( MouseEvent e ) {}
27: 			@Override public void mouseReleased( MouseEvent e ) {}
28: 		});
29: 		c.addMouseMotionListener( new MouseMotionListener() {
30: 			@Override public void mouseDragged( MouseEvent e ) {}
31: 			@Override public void mouseMoved( MouseEvent e ) {}
32: 		});
33: 		f.add( c );
34: 		f.setVisible( true );
35: 	}
36: }
