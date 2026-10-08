public class DataType {
    void main() {

       // byte num1= 500; // give error (bada number chote data type ke andar store nhi ho sakta hai )
       // System.out.println(num1);
        byte num =127;
        System.out.println(num);

        int  n1 = 50000;
        System.out.println(n1);

        long num2 = 329543792;
        System.out.println(num2);
        
        short num3 =2345;
        System.out.println(num3);

        float num4 = 345.67f;
        System.out.println(num4);

        double num5 = 3.1423456754434;
        System.out.println(num5);
        
        // boolean sofiya = 1; // give error 
        boolean  sofiya = true ;
        System.out.println(sofiya);

        char ch ='a';
        System.out.println(ch);

        //ASCII value 
        char total = 'A';
        System.out.println(total+2);
        
        //implicit 
        byte num9 = 122;
        long newNum = num9 ; 
        System.out.println("new num " + newNum);
        
        // type casting
        long value1= 123456789;
        int value2 = (int)value1;
        System.out.println(value2);

    }
}
