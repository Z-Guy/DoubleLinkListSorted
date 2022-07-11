class Link {
    public String sData;
    public Link next;
    public Link prev;
    
    public Link( String sdata1){
        sData = sdata1;
    }
    public void displayLink(){
        System.out.print(sData + " ");
    }
}
