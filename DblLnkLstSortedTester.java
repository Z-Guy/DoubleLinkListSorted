public class DblLnkLstSortedTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        DblLnkLstSorted llI = new DblLnkLstSorted();
        
        Link head = null;
		
		llI.putItem( "part" );
		llI.putItem( "mart" );
		llI.putItem( "dart" );
		llI.putItem( "cart" );
		llI.putItem( "art" );
		
        llI.printItem();

        llI.displayListBackwards();

        head = llI.displayListBackwardsRec(head);
        
        llI.printList(head); 

      

		
		

	}

}