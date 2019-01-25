//Eric Chen
import java.util.*;

public class Factorial{

public int factorial (int n, String type)
{
	if (type == "recursive"){
		return factorial_recursive(n);
	}
	if (type == "iterative"){
		return factorial_iterative(n);
	}
	else{
		return 0;
	}
}

public int factorial_iterative (int n)
{
	int f = 1;

	if((n == 0) || (n == 1)){ //number must be greater than 0 or 1 to find factorial
		return 1;
	}
	else{
		for(int i = n; i > 0; i--){ //factorial
			f = f * i; 
		}
	}
	return f;
	}


public int factorial_recursive (int n)
{
	if ((n == 0)||(n ==1)){ //number must be greater than 0 or 1 to find factorial
		return 1;
	}
	return factorial_recursive(n-1) * n; //decrements n by 1 and multiplies by n
}
}