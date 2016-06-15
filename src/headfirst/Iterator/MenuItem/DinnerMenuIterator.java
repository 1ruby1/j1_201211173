package headfirst.Iterator.MenuItem;

import java.util.Iterator;

public class DinnerMenuIterator implements Iterator{
  MenuItem[] items;
    int position = 0;

    public DinnerMenuIterator(MenuItem[] items) {
        this.items = items;
    }
 
    public Object next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } return true;
    }
    public void remove(){
      if(this.position >= items.length)return;
      Object tmp;
      for(int i=position+1;i<=this.items.length;i++){
        this.items[i-1]=this.items[i];
      }
      this.position--;
      return ;
    }
}