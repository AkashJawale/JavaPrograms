class AddTwoArrayClass{

	public static void main(String[] args){

		// Declaration and initialization of  array
		int a[] = {1,2,3,4,5};
		int b[] = {6,7,8,9,10};

		// Instantiation of third array to store results
		int c[] = new int[5];

		for(int i=0; i<5; ++i){
			// add two array and result store in third array
			c[i] = a[i] + b[i];

			//Display results
			System.out.println("Enter sum of "+i +"index" +" " + c[i]);
		}
	}
}
