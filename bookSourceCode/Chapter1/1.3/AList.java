public class AList {
	private Item[] items;
	private int size;

    /** Creates an empty list. */
    public AList() {
    	items = (Item[]) new Object[100];
    	size = 0;
    }

    /** Inserts X into the back of the list. */
    public void addLast(Item x) {
    	if (size == items.length()) {
    		resize(size+1);
    	}
    	items[size] = x;
    	size += 1;
    }

    /** Returns the item from the back of the list. */
    public Item getLast() {
    	return items[size - 1];
    }

    /** Gets the ith item in the list (0 is the front). */
    public Item get(int i) {
    	return items[i];
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;        
    }

    /** Deletes item from back of the list and
      * returns deleted item. */
    public Item removeLast() {
    	Item item = getLast();
    	items[size - 1] = null;
    	size -= 1;
    	return item;
    }

} 