package demo.strongarm;

/**
 * 
 * Category: Non-interprocedural, loop-free
 * Features: locals, primatives, fields
 * 
 * @author jls
 *
 */
public class A3 {
    
    int THE_FIELD;
    
    //@ requires true;
    public int localTest(int a, int b){
        
        THE_FIELD = 100;

        if(a > -1){
            return 0;
        }
        
        THE_FIELD = 100;
        return -1;
    }
    
    
}

