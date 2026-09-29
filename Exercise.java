public class Exercise {
    
    public static void main(String[] args) {
        
        
        String myString = "Hello World!";
        System.out.println("Declared and initialized myString: " + myString);

        
        String myString2 = "hello";
        String myString3 = "3.141592";
        String myString4 = "!@#$%^&*()_=+{}\\|,;<>./?";
        System.out.println("Various strings: " + myString2 + ", " + myString3 + ", " + myString4);

       
        String hello = "Hello";
        hello += " World!";
        System.out.println("Concatenated string: " + hello);

        
        int myInt = 5;
        String myIntString = "My Int is: " + myInt;
        System.out.println(myIntString);

        
        String hello2 = "Hello";
        hello2 += " World!";  
        System.out.println("Concatenation using +=: " + hello2);
        
    }
    
}

