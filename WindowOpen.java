 1: import java.awt.event.*;
 2: import java.awt.*;
 3:
 4: public class WindowOpen {
 5: 	public static void main( String[] args ){
 6: 		new WindowOpen();
 7: 	}
 8: 	WindowOpen() {
 9: 		Frame f = new Frame( "WindowOpen" );
10: 		f.setSize( 640, 480 );
11: 		f.addWindowListener( new WindowAdapter() {
12: 			@Override public void windowClosing( WindowEvent e ) {
13: 				System.exit( 0 );
14: 			}
15: 		} );
16: 		f.setVisible( true );
17: 	}
18: }
