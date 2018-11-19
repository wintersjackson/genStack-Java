
package feefo.examples;

/**
 *
 * @author Dan
 */
public class genStack {
    //Effective stack already implemented in Java utils. However, here is mine.
    int[] stack;
    
    
    public boolean empty(){  
    //Check empty    
        if(stack.length!=0){
            return true;
        }
        return false;
    }
    
    //Peek
    public int peek(){
        return (stack[0]);
    }
    
    //Pop
    public int pop(){
        int popValue =stack[0];
        for(int i=0;i<stack.length;i++){
            stack[i]=stack[i+1];
        }
        return popValue;
    }
    
    //Push
    public void push(int pushValue){
        for(int i=stack.length;i>0;i--){
            stack[i+1]=stack[i];
        }
        stack[0]=pushValue;
    }
/*To allow other classes to be informed of changes, listeners can be used so long
  as the class remains public*/    
}
