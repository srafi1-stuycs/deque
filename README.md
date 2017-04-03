# Deque

## Method selections
The one-sided queue had an add, remove, and peek methods, so we decided to add 3 similar methods for the opposite end. We also kept the size and isEmpty methods to make implementing the previous methods a little easier. We included a toString() method to make for easier debugging and extra functionality. This gives our interface a total of 9 methods:
- addFirst(T)
- removeFirst()
- peekFirst()
- addLast(T)
- removeLast()
- peekLast()
- isEmpty()
- size()
- toString()

## Node-based architecture
A queue generally works more efficiently with a LinkedList; all of the methods can be implemented in O(1) runtime except for toString(). Using an ArrayList would require O(n) for at least one of the list methods as all of the elements would have to be moved over one by one in the underlying array.
