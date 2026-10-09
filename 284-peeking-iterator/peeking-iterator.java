// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> it;
    Integer peekval = null;
    boolean haspeek = false;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    this.it = iterator;
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        if(!haspeek){
            peekval = it.next();
            haspeek=true;
        }
        return peekval;
        
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
        if(!haspeek)return it.next();
        Integer res = peekval;
        haspeek = false;
        peekval = null;
        return res;	    
	}
	
	@Override
	public boolean hasNext() {
        return haspeek|| it.hasNext();
	    
	}
}