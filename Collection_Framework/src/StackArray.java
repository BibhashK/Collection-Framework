
public class StackArray<T> {
Object[] Stack;
int size;
int top;
	public StackArray(int size) {
		this.size  = size;
		Stack = new Object[this.size]; // create the stack with size
		top = -1;
	}
	public Boolean isFull(){
		return(top == size - 1);
	}
	public void push(Object newItem){
		if(isFull()){
			System.out.println("stack is full");
			return;
		}
		top = top +1;
		Stack[top] = newItem; // new item added to the stack
	}
	public Boolean isEmpty(){
		return(top == -1); // since when empty top becomes -1
	}
	public T pop(){
		if(isEmpty()){
			System.out.println("stack is empty");
			return null;
		}
		T item = (T)Stack[top]; // remove the new item added in push
		top = top -1; // remove the memory address
		return item; // provide the stack after pop
	}
	// peek operation
	public Object peek(){
		return Stack[top];
	}
	public int getsize(){
		return Stack.length;
	}
}
