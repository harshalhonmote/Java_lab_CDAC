package geometry;

public class Point2D {
    public int x;
    public int y;
    
    public Point2D(){
    	this(0,0);
    }
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String getDetails() {
	    return ("POINTS :"+this.x+", "+this.y);	
	}
    
	public Boolean isEqual(Point2D p) {
		return this.x==p.x && this.y==p.y ? true : false;
	}
	
	public float distance(Point2D p) {
		return (float)Math.sqrt(Math.pow((this.x-p.x), 2) + Math.pow((this.y-p.y),2));
	}	
}
