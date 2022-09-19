import java.util.*;

class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> itr;
    Integer nextVal;
    boolean noSuchElement;

    public PeekingIterator(Iterator<Integer> iterator) {
        itr = iterator;
        advanceIter();
    }

    public Integer peek() {
        return nextVal;
    }

    @Override
    public Integer next() {
        if(noSuchElement){
            throw new NoSuchElementException();
        }
        Integer res=nextVal;
        advanceIter();;
        return res;
    }

    @Override
    public boolean hasNext() {
        return !noSuchElement;
    }
    private void advanceIter(){
        if(itr.hasNext()){
            nextVal=itr.next();
        }else{
            noSuchElement=true;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        Iterator<Integer> itr = al.iterator();
        PeekingIterator itr1=new PeekingIterator(itr);
        System.out.println(al);
        //itr1.advanceIter();

        System.out.println(itr1.next());
        System.out.println(itr1.peek());
        System.out.println(itr1.next());
        System.out.println(itr1.next());
        boolean b=itr1.hasNext();
        System.out.println(b);

    }
}
