//Point class
class Point {
	double x
	double y
	//Method to calculate distance from one point to another	
	double distanceTo(Point) {
		double distance = Math.sqrt((this.x - Point.x) ** 2 + (this.y - Point.y) **2)
		return distance
	}	
	//Method to calculate distance to Origin
	double distanceToOrigin () {
		Point origin = new Point()
		origin.x = 0
		origin.y = 0
		double result = distanceTo(origin)
		return result
	}
	// Method to move point to co-ordinates in parameters
	void moveTo(double x, double y) {
		this.x = x
		this.y = y
	}
	// Method to move point to this point
	void moveTo(Point point) {
		this.x = point.x
		this.y = point.y
	}
	// Returns a copy of the current point with the same co-ordinates
	Point clone() {
		Point copy = new Point()
		copy.x = this.x
		copy.y = this.y
		return copy
	}
	//Returns a point with the co-ordinates multiplied by -1
	Point opposite() {
		Point opposite = new Point()
		opposite.x = this.x * -1
		opposite.y = this.y * -1
		return opposite
				
	}
}

Point a = new Point()
a.x = 3
a.y = 4

Point b = new Point()
b.x = 5
b.y = 6

Point c = new Point()
c.x = 10
c.y = 10

point d = new Point()
d.x = 11
d.y = 11

print "The distance from point a to point b is "
println a.distanceTo(b)

print "The distance from the origin to point a is "
println a.distanceToOrigin()

print "Point a has now been moved to here "
a.moveTo(7, 7)
print a.x + ", "
println a.y

print "Point b has now been moved to "
b.moveTo(c)
print b.x + ", "
println b.y

