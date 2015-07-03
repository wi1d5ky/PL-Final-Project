public class WaitressVersion2 implements Waitress {
   private PancakeHouseMenu pancakeHouseMenu;
   private DinerMenu dinerMenu;
   //... other fields

   public WaitressVersion2(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
      this.pancakeHouseMenu = pancakeHouseMenu;
      this.dinerMenu = dinerMenu;
   }

   public void printMenu() {
      Iterator pancakeIterator = pancakeHouseMenu.createIterator();
      Iterator dinerIterator = dinerMenu.createIterator();

      System.out.println("MENU\n----\nBREAKFAST");
      printMenu(pancakeIterator);

      System.out.println("\nLUNCH");
      printMenu(dinerIterator);
   }

   public void printBreakfastMenu()
   {
     Iterator pancakeIterator = pancakeHouseMenu.createIterator();
       printMenu(pancakeIterator);
   }

   public void printLunchMenu()
   {
     Iterator dinerIterator = dinerMenu.createIterator();
     printMenu(dinerIterator);
   }

   public void printMenu(Iterator iterator) {
      while (iterator.hasNext()) {
         MenuItem menuItem = (MenuItem) iterator.next(); //object down casting to MenuItem
         menuItem.print();
      }
   }

    public boolean isItemVegetarian(String name)
    {
      Iterator pancakeIterator = pancakeHouseMenu.createIterator();
      Iterator dinerIterator = dinerMenu.createIterator();

      while (pancakeIterator.hasNext()) {
         MenuItem menuItem1 = (MenuItem) pancakeIterator.next(); //object down casting to MenuItem
         if(menuItem1.getName().equals(name))
            return menuItem1.isVegetarian();
      }

      while (dinerIterator.hasNext()) {
         MenuItem menuItem2 = (MenuItem) dinerIterator.next(); //object down casting to MenuItem
         if(menuItem2.getName().equals(name))
            return menuItem2.isVegetarian();
      }
      return false;
    }

    public void printVegetarianMenu()
    {
      Iterator pancakeIterator = pancakeHouseMenu.createIterator();
      Iterator dinerIterator = dinerMenu.createIterator();

      while (pancakeIterator.hasNext()) {
         MenuItem menuItem1 = (MenuItem) pancakeIterator.next(); //object down casting to MenuItem
         if(isItemVegetarian(menuItem1.getName()))
            menuItem1.print();
      }

      while (dinerIterator.hasNext()) {
         MenuItem menuItem2 = (MenuItem) dinerIterator.next(); //object down casting to MenuItem
         if(isItemVegetarian(menuItem2.getName()))
            menuItem2.print();
      }

    }

   //implement other methods : isItemVegetarian & printVegetarianMenu
}
