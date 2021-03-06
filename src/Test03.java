import java.util.Stack;

/**
 * 两个栈实现队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 * @author zlz
 *
 */
public class Test03 {
	Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
    }
    
    public int pop() {
    	if(stack2.empty()){
    		while(!stack1.empty()){
    			stack2.push(stack1.pop());
    		}
    	}else{
    		System.out.println("queue is empty");
    	}
    	return stack2.pop();
	}	
   
}
