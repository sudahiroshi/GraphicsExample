 1: import java.awt.event.*;
 2: import java.awt.*;
 3:
 4: public class DrawByMouse2 {
 5: 	MyCanvas c;
 6: 	int diagram = 0;
 7:
 8: 	public static void main(String[] args) {
 9: 		new DrawByMouse2();
10: 	}
11:
12: 	DrawByMouse2() {
13: 		Frame f = new Frame( "DrawByMouse variation1" );
14: 		f.setSize( 640, 480 );
15: 		f.addWindowListener( new WindowAdapter() {
16: 			@Override public void windowClosing( WindowEvent e ) {
17: 				System.exit( 0 );
18: 			}
19: 		});
20: 		c = new MyCanvas();
21: 		c.addMouseListener(new MouseListener() {
22: 			@Override public void mouseClicked( MouseEvent e ) {
23: 				if( e.getButton() == 1 ) {
24: 					c.setPoint(e.getX(), e.getY());
25: 				} else if( e.getButton() == 2 ) {
26: 					if( diagram == 0 ) {
27: 						diagram = 1;
28: 						c.changeDiagram( 1 );
29: 					} else if( diagram == 1 ) {
30: 						diagram = 0;
31: 						c.changeDiagram( 0 );
32: 					}
33: 				}
34: 			}
35: 			@Override public void mouseEntered( MouseEvent e ) {}
36: 			@Override public void mouseExited( MouseEvent e ) {}
37: 			@Override public void mousePressed( MouseEvent e ) {}
38: 			@Override public void mouseReleased( MouseEvent e ) {}
39: 		});
40: 		c.addMouseMotionListener( new MouseMotionListener(){
41: 			@Override public void mouseDragged( MouseEvent e ) {}
42: 			@Override public void mouseMoved( MouseEvent e ) {}
43: 		});
44: 		f.add( c );
45: 		f.setVisible( true );
46: 	}
47: }