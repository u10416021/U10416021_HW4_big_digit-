public class TestBigNumber{
	public static void main(String[] args){
		BigNumber bignumber = new BigNumber();
    	//a represents the number 
        int[] a = {9999, 9999, 9999, 0000, 0000};
        //b represents the number 
        int[] b = {1111, 1111, 1111, 1111, 1111};
        //use array to store two answer(a+b,a-b)
        int[] c = bignumber.add(a, b);
        int[] d = bignumber.sub(a, b);
        
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