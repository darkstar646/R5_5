
public class Circle extends MyFrame2 {
	
    public void drawSpiral(int cx, int cy, int dist, int num, int deg) {
    	double x;
		double y;
		int total=360*num;
		
		for(int i=0; i<total; i++) {
			double rate=(double)i/total;
			double r=dist*rate;
			
			x = r*Math.cos(Math.toRadians(deg+i))+cx;
			y = r*Math.sin(Math.toRadians(deg+i))+cy;
			
			fillRect((int)x,(int)y,1,1);
		}
    }
    
    public void run() {
    	setSize(600,600);
    	
    	for(int i=0; i<6; i++) {
    		if(i<3) {
    			drawSpiral(100+i*200,200,70,i+1,0);
    		}else {
    			drawSpiral(100+(i-3)*200,400,70,4,90+90*(i-3));
    		}
    	}
    }

    public static void main(String[] args) {
        new Circle();
        
    }
}



