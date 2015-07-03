public class MenuTestDrive {
   public static void main(String[] args) {
      PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
      DinerMenu dinerMenu = new DinerMenu();

      Waitress waitress = new WaitressVersion1(pancakeHouseMenu, dinerMenu);
      waitress.printMenu();
      // other testing
   }
}
