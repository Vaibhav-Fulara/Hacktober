class Max{
	//USING FUNCTION
	//define
	static int max(int a, int b){
		int max=a>b?(a):(b);
		return max;
	}
	
	public static void main(String args[]){
		System.out.println("Max is "+max(10,20));
		System.out.println("Max is "+max(5,6));
	}
}