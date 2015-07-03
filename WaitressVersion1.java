import java.util.Arrays;

public class WaitressVersion1 implements Waitress {
   private PancakeHouseMenu pancakeHouseMenu;
   private DinerMenu dinerMenu;
   //... other fields

   public WaitressVersion1(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
      this.pancakeHouseMenu = pancakeHouseMenu;
      this.dinerMenu = dinerMenu;
   }

   public void printMenu() {
      System.out.print("MENU\n----\nBREAKFAST\n");
      printBreakfastMenu();
      System.out.print("\n\nLUNCH\n");
      printLunchMenu();
   }

   public void printBreakfastMenu() {
      pancakeHouseMenu.showMenuItems();
   }

   public void printLunchMenu() {
      dinerMenu.showMenuItems();
   }

   public void printVegetarianMenu() {
      for( MenuItem a : pancakeHouseMenu.getMenuItems() )
        if(a.isVegetarian())
          a.print();
      for( MenuItem b : Arrays.asList(dinerMenu.getMenuItems()) )
        if(b.isVegetarian())
          b.print();
   }

   public boolean isItemVegetarian(String name) {

     for( MenuItem a : pancakeHouseMenu.getMenuItems() ) {
       if(a.getName().equals(name)) return a.isVegetarian();
     }
     for( MenuItem b : dinerMenu.getMenuItems() ) {
       if(b.getName().equals(name)) return b.isVegetarian();
     }
     return false;
   }
   //... other methods
}
