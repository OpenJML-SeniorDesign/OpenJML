package demo;

public class A {

    

    //@ requires a > Integer.MIN_VALUE;
    //@ requires b > Integer.MIN_VALUE;
    public int cmp(int a, int b){
        if(a < b){
            return -1;
        }else{
            
            if(a > b){
                return 1;
            }
            
            return 0;
            
        }
    }

   
    
    // ensures \result == (\product int i ; 1 <= i && i <= f ; i);

}

