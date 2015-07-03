public interface Waitress {

   /** prints every item on the menu */
   public void printMenu();

   /** prints just breakfast items */
   public void printBreakfastMenu();

   /** prints just lunch items */
   public void printLunchMenu();

   /** prints all vegetarian menu items */
   public void printVegetarianMenu();

   /**
    * given the name of an item, returns true if the items is vegetarian,
    * otherwise, returns false
    */
   public boolean isItemVegetarian(String name);
}
