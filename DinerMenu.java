import java.util.Arrays;

public class DinerMenu {
   //public static final int MAX_ITEMS = 6;
   private MenuItem[] menuItems;

   public DinerMenu() {
      menuItems = new MenuItem[0];

      addItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
      addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);
      addItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29);
      addItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05);
      addItem("Steamed Veggies and Brown Rice", "Steamed vegetables over brown rice", true, 3.99);
      addItem("Pasta", "Spaghetti with Marinara Sauce, and a slice of sourdough bread", false, 3.89);
   }

   public void addItem(String name, String description, boolean vegetarian, double price) {
      MenuItem menuItem = new MenuItem(name, description, vegetarian, price);

      int length = menuItems.length;
      menuItems = Arrays.copyOf(menuItems, menuItems.length + 1);
      // 有新的 item 進來再加空間就好啦…
      menuItems[length] = menuItem;
   }

   public MenuItem[] getMenuItems() {
      return menuItems;
   }

   public void showMenuItems() {
     for(MenuItem i : Arrays.asList(menuItems)) i.print();
  }

   public static void main(String[] args) {
     DinerMenu dinerMenu = new DinerMenu();
    dinerMenu.showMenuItems();
   }
}
