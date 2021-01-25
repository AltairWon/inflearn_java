package bookshelf;

public class BookShelf extends Shelf implements Queue{

	@Override
	public void enQueue(String title) {
		shelf.add(title); //add = ArrayList의 맨 뒤로 들어간다.
	}

	@Override
	public String deQueue() {
		return shelf.remove(0); //remove = string 타입의 return
	}

	@Override
	public int getSize() {
		return getCount();
	}

	
	
}
