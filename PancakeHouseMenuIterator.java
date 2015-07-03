import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {
  private ArrayList<MenuItem> menuItems;
  int index = 0;

  public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems) {
    this.menuItems = menuItems;
  }

  public boolean hasNext() {
    return (index+1 < menuItems.size());
  }

  public Object next() {
    return menuItems.get(++index);
  }
}
