import java.util.Arrays;

public class DinerMenuIterator implements Iterator {
  private MenuItem[] menuItems;
  int index = 0;

  public DinerMenuIterator(MenuItem[] menuItems) {
    this.menuItems = menuItems;
  }

  public boolean hasNext() {
    return (index+1 < menuItems.length);
  }

  public Object next() {
    return menuItems[++index];
  }
}
