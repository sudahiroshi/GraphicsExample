import java.awt.event.*;
import java.awt.*;

public class WindowOpen {
	public static void main( String[] args ){
		new WindowOpen();
	}
	WindowOpen() {
		Frame f = new Frame( "WindowOpen" );
		f.setSize( 640, 480 );
		f.addWindowListener( new WindowAdapter() {
			@Override public void windowClosing( WindowEvent e ) {
				System.exit( 0 );
			}
		} );
		f.setVisible( true );
	}
}
