//u10416021	張馨容

//use this class to do operation
public class BigNumber {
	//add method 
    public static int[] add(int[] a, int[] b){ 
    	//local variable
        int carry=0;
        //use array c to store the number,and the arraysize is a.length
        int[] c = new int[a.length];
		//use for loop to compute
        for(int i = a.length - 1; i >= 0; i--){ 
            c[i] = a[i] + b[i] + carry; 
            if(c[i] >= 10000) {
           		c[i] = c[i] - 10000;
            	carry = 1; 
            }
            else{ 
                carry = 0; 
            } 
            
        } 
        
        return c;
    } 
	//subtract method
    public static int[] sub(int[] a, int[] b){ 
        //local variable
        int borrow=0; 
        //use array c to store the number,and the arraysize is a.length
        int[] c = new int[a.length];
		//use for loop to compute
        for(int i = a.length - 1; i >= 0; i--){ 
            c[i] = a[i] - b[i] - borrow; 
            if(c[i] >= 0) 
                borrow = 0; 
            else{ 
            	//borrow 
                c[i] = c[i] + 10000; 
                borrow = 1; 
            } 
        }
        return c;
    } 
    //main method
    public static void main(String[] args){
    	//a represents the number 
        int[] a = {9999, 9999, 9999, 0000, 0000};
        //b represents the number 
        int[] b = {1111, 1111, 1111, 1111, 1111};
        //use array to store two answer(a+b,a-b)
        int[] c = BigNumber.add(a, b);
        int[] d = BigNumber.sub(a, b);
        
        //use for loop to display the answers
        System.out.print("99999999999900000000 + 11111111111111111111 =  ");
        if(a[0]+b[0]>=10){
        	System.out.print("1");
            for(int i = 0; i < c.length; i++){
            	System.out.print(c[i]);
        	}
        	System.out.println();	
        }
        else{
        	for(int i = 0; i < c.length; i++){
            	System.out.print(c[i]);
        	}
        	System.out.println();	
        }
        //use for loop to display the answers
        System.out.print("99999999999900000000 - 11111111111111111111 =  ");
    		for(int i = 0; i < c.length; i++){
            	System.out.print(d[i]);
         	}
        System.out.println();
    }
}