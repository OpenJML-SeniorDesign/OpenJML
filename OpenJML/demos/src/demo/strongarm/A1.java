package demo.strongarm;

/**
 * 
 * Category: Non-interprocedural, loop-free
 * Features: locals, primatives
 * 
 * @author jls
 *
 */
public class A1 {
    
    //@ requires true;
    public int cmp(int a, int b){
        
        int c = 0;
        
        if(a < b){
            return -1;
        }else{
            
            if(a > b){
                return 1;
            }
            
            return 0;
            
        }
    }
    
    
}

