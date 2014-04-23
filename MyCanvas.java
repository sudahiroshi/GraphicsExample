 1: import java.awt.*;
 2:
 3: public class MyCanvas extends Canvas{
 4: 	public int x[] = new int[200], y[] = new int[200], num = 0;
 5:
 6: 	@Override public void paint( Graphics g ) {
 7: 		for( int i=0; i<num; i++ ) {
 8: 			g.setColor( new Color( 0, 0, 0 ) );
 9: 			g.fillOval( x[i], y[i], 5, 5 );
10: 		}
11: 	}
12:
13: 	public void setPoint( int x, int y ){
14: 		this.x[ num ] = x;
15: 		this.y[ num ] = y;
16: 		num++;
17: 		if( num >= 200 )	num = 0;
18: 		repaint();
19: 	}
20: }