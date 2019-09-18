package uk.ac.belfastmet.todo;

public class codewars {

	static long elderAge(long n, long m, long k, long newp) {
		  long count = 0;
		  for(int i=0;i<n-k;i++)
		  {
		    for(int y=0;y<m-k;y++)
		    {
		      count +=Math.abs((y-k)^(i-k));
		    }
		      
		  }
		  
		  if(count>newp-1)
		    count=count-newp;
		  return count; // do it!
			}
		

	public static void main(String[] args) {
		System.out.println(elderAge(8,5,1,100));

	}

}
