import java.util.Stack;

/**
 * ����ջʵ�ֶ��У���ɶ��е�Push��Pop������ �����е�Ԫ��Ϊint���͡�
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
