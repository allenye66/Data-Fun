package src;
import java.io.FileNotFoundException;
import java.util.*;
public class LineOfBestFit {
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<Long> x = new ArrayList<Long>();
		ArrayList<Long> y = new ArrayList<Long>();
		x.add((long) -2);
		x.add((long) -1);
		x.add((long) 1);
		x.add((long) 4);

		y.add((long) -3);
		y.add((long) -1);
		y.add((long) 2);
		y.add((long) 3);

		double x_mean = 0, y_mean = 0, xy_mean = 0, x_squared_mean = 0;		
		for(int i =0 ; i < x.size(); i ++) {
			x_mean += x.get(i);
			y_mean += y.get(i);
			xy_mean += x.get(i) * y.get(i);
			x_squared_mean += Math.pow(x.get(i), 2);
		}		
		x_mean = x_mean/x.size();
		y_mean = y_mean/y.size();
		xy_mean = xy_mean/y.size();
		x_squared_mean= x_squared_mean/x.size();
		double slope = ((x_mean * y_mean)- xy_mean)/((Math.pow(x_mean, 2) - x_squared_mean));
		double b = y_mean - slope * x_mean;
		System.out.println("Your line is: y = " + slope + "x + " + b );
		}	
}