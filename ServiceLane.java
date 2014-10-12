import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ServiceLane
{
	private int[] freeway;

	public ServiceLane(int[] freeway)
	{
		this.freeway = freeway;
	}

	public int calculateLargestVehicleType(int entry, int exit)
	{
		if (entry == 1)
			return 1;

		int largestVehicle = 3;

		for(int i = entry; i <= exit; i++)
		{
			if(freeway[i] < largestVehicle)
				largestVehicle = freeway[i];
		}

		return largestVehicle;
	}

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int[] freeway = new int[s.nextInt()];
		int testCases = s.nextInt();

		//Populate the array with widths of service lanes
		for(int i = 0; i < freeway.length; i++)
			freeway[i] = s.nextInt();

		ServiceLane serviceLane = new ServiceLane(freeway);

		for(int i = 0; i < testCases; i++)
		{
			int entry = s.nextInt();
			int exit = s.nextInt();
			System.out.println(serviceLane.calculateLargestVehicleType(entry, exit));
		}
	}
}
