public class MenuTestDrive {
   public static void main(String[] args) {
      PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
      DinerMenu dinerMenu = new DinerMenu();

      Waitress waitress = new WaitressVersion2(pancakeHouseMenu, dinerMenu);
      // other testing
      waitress.printMenu();
      System.out.print("\n\n===========================================\n\n");
      waitress.printBreakfastMenu();
      System.out.print("\n\n===========================================\n\n");
      waitress.printLunchMenu();
      System.out.print("\n\n===========================================\n\n");
      waitress.printVegetarianMenu();
   }
}
