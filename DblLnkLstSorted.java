import javax.print.event.PrintEvent;

public class DblLnkLstSorted {

    private Link first; 
    private Link last; 

    //Constructor
    public DblLnkLstSorted(){
        first = null;
        last = null;
    }

    public boolean isEmpty(){
	    return (first == null);
	}

    public String findItem(String key){
        Link current = first;
        Link previous = last;
	    while( current != null)
	    {
	        if( current.sData == key)
	            return current.sData;
	        else
	            current = current.next;
	        }
	        return null;
        }
    public void putItem(String id){
	    Link newLink = new Link(id);
        newLink.next = first;
        newLink.prev = null;

        if(first != null)
            first.prev = newLink;

	    first = newLink;    
    }

    public Link deleteItem(String key) {
        Link current = first;
        Link previous = last;
        while (current.sData != key) {
            if (current.next == null)
                return null;
            else {
                previous = current;
                current = current.next;
            }
        }
        if (current == first)
            first = first.next;
        else
            previous.next = current.next;
        return current;
    }

    public void printItem(){
	    Link current = first;
	    while( current!= null)
	    {
	       current.displayLink();
	       current = current.next;
	    }
	   System.out.println();
    }   
    
    public static Link displayListBackwardsRec(Link head) {
        Link first;
        Link last;

        if (head == null) {
            return head;
        }
        first = head; 
        last = first.next; 
        if (last == null) {
            return head;
        }
        last = displayListBackwardsRec(last); 
        first.next.next = first; 
        first.next = null; 
        head = last; 

        return head;
    }

    public  void printList(Link head) {
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }

    public void displayListBackwards() {
        Link temp = null;
        Link current = first;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        if (temp != null) {
            first = temp.prev;
        }

        printItem();
    }
}