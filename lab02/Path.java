/** A class that represents a path via pursuit curves. */
public class Path {

    public Point curr = new Point(2,3);
    public Point next = new Point(2,3);

    public Path(double x, double y) {
        // more code goes here!
        next.x = x;
        next.y = y;
    }


    public double getCurrX(){
        return curr.getX();
    }

    public double getCurrY(){
        return curr.getY();
    }
    public double getNextX(){
        return next.getX();
    }

    public double getNextY(){
        return next.getY();
    }

    public Point getCurrentPoint() {
        return this.curr;
    }

    public void setCurrentPoint(Point curr, Point next) {
        this.curr = next;
    }

    public void iterate(double dx, double dy){
        dx = next.x - curr.x;
        dy = next.y - next.y;
    }

}

