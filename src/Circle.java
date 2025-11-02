
public class Circle extends MyFrame2 {

	/*public void drawCircle(int cx, int cy, int r) {
	    // TODO: メソッドの中身を書く
		double x;
		double y;
		for(int i=0; i<360; i++) {
			x = r*Math.cos(Math.toRadians(i))+cx;
			y = r*Math.sin(Math.toRadians(i))+cy;
			
			fillRect((int)x,(int)y,1,1);
		}
	}*/
    
    public void drawSpiral(int cx, int cy, int dist, int num, int deg) {
    	double x;
		double y;
		for(int i=0; i<360; i++) {
			x = r*Math.cos(Math.toRadians(i))+cx;
			y = r*Math.sin(Math.toRadians(i))+cy;
			
			fillRect((int)x,(int)y,1,1);
		}
    }
    public void run() {
        // TODO: drawCircle を呼出して，半径が異なる n 個の同心円を表示
    	for(int i=0; i<7+3; i++) {
    		//drawCircle(150,150,(i+1)*10);
    		
    	}
    }

    public static void main(String[] args) {
        new Circle();
    }
}