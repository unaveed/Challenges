#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
using namespace std;

int main(){
	// Holds input stream	
	string input;
	// Array size, number of test cases, and a counter to keep
	// track of our position in the input
	int arr_size, loops, counter;
	// The widths of the enter/exit lanes
	int* widths;	// Remember to delete []widths;
	// Holds tests cases
	vector<string> cases;	
	
	counter = 1;
	while(true){
		getline(cin, input);	
		if(input.empty())
			break;

		// First run, initialize variables
		if(counter == 1){
			arr_size = input[0]- '0'; 
			loops = input[2] - '0';

			widths = new int[arr_size];
		}
		// Second run, initialize the array
		else if(counter == 2){
			for(int i = 0; i < arr_size*2; i+=2)
				widths[i] = input[i] - '0';
		}
		// Add each test case to the cases vector
		else {
			cases.push_back(input);	
		}

		// keeps track of which line of the input is being read
		counter++;
	}

	cout << "Reached end" << endl;
	return 0;
}
