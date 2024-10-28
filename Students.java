public class Students{

	public static void main(String[] args){
		name("Anu");


        clas("A" ,19);
        clas("B" ,21);



        registerNumber("Anushree" , "Government engineering college",18000);
		registerNumber("Pushpa" , "GECG", 18000);
		registerNumber("Aishu" ,"gecg" ,18000);


        result(98.6,"A",8.8,67655543);
        result(78.2,"A",9.9,45567778);
        result(55.8,"B",6.8,56677588);
        result(77.9,"B",9.9,97556464);
	}

    public static void name(String name){

    	System.out.println( "student name is Anu");

    }
   
    public static void clas(String section ,int age){
    	System.out.println("Student section is" + section);
    	System.out.println("Student age is" + age);
    }

    public static void registerNumber(String name , String collegeName , int fee){

    	System.out.println("Student name is" + name);
    	System.out.println("College name is" + collegeName);
    	System.out.println("College fees is" + fee);
    	
    }

    public static void result(double percentage,String grade,double cgpa,int mobileNumber){
    	System.out.println("Student percentage is" + percentage);
    	System.out.println("Student grade is" + grade);
    	System.out.println("Student cgpa is" + cgpa);
    	System.out.println("Student mobileNumber is" + mobileNumber);
    }
    

    }
