public class ReturnTypes{




	public static void main(String[] args){


    int result1 = addition(10,100,10);
    System.out.println(result1);
    int result2 = addition(52,208,562);
    System.out.println(result2);
	

    int result3 = subtraction(45,46,89,97);
    System.out.println(result3);
    int result4 = subtraction(567,788,789,789);
    System.out.println(result4);


    int happiness = happy(170,34,75,67);
    System.out.println(happiness);


    int operator = operations(100,100);
    System.out.println(operator);

    int mathematics = maths(100,787,137,7788,45,35);
    System.out.println(mathematics);
    }


    public static int addition(int a,int b,int c){
    	int Value = a + b + c ;
    	return a - b - c ;
    }

    public static int subtraction(int a,int b,int c,int d){
    	int value = b - a + d + c ;
    	return a - b - c -d ;

    }
    

    public static int happy(int a,int b,int c,int d){
    	return a + b - c * d ;
    }

    public static int operations(int a, int b){
    	return a + b;
    }
    
    public static int maths(int a,int b,int c,int d,int e,int f){
    	return a * b + c * e * d ;
    }
} 