/*
Bayan Berri
APCS2 pd4
HW29--Stress is the Best
2017-04-05
 */
public class DequeTester{
    public static void main( String[] args){
	LLDeque<String> tester= new LLDeque<String>();
	
	tester.addFront("a");
	System.out.println("updated deque:");
	System.out.println(tester);

	tester.addFront("b");
	System.out.println("updated deque:");
	System.out.println(tester);

	tester.addFront("c");
	System.out.println("updated deque:");
	System.out.println(tester);
	
	tester.addLast("l1");
	System.out.println("updated deque:");
	System.out.println(tester);

	tester.addLast("l2");
	System.out.println("updated deque:");
	System.out.println(tester);

	tester.addLast("l3");
	System.out.println("updated deque:");
	System.out.println(tester);

	System.out.println("testing toString() now:");
	System.out.println(tester);

	System.out.println("testing removeLast() now:");
	System.out.println(tester.removeLast());

	System.out.println("testing toString() now:");
	System.out.println(tester);

	System.out.println("testing removeFirst() now:");
	System.out.println(tester.removeFront());
	System.out.println("updated deque:");
	System.out.println(tester);
	
	System.out.println("testing peekFirst() now:");
	System.out.println(tester.peekFront());
	System.out.println("peek doesn't update the deque::");
	System.out.println(tester);
	
	System.out.println("testing peekLast() now:");
	System.out.println(tester.peekLast());
	/*-----------------------------------------
	----------------------------------*/
    }
}
