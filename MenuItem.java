public class MenuItem {
   private String name;
   private String description;
   private boolean vegetarian;
   private double price;

   public MenuItem(String name, String description,
         boolean vegetarian, double price) {
      this.name = name;
      this.description = description;
      this.vegetarian = vegetarian;
      this.price = price;
   }

   public String getName(){
      return name;
   }

   public String getDescription(){
      return description;
   }

   public boolean isVegetarian(){
      return vegetarian;
   }

   public double getPrice(){
      return price;
   }

   public void print() {
      System.out.print("  " + name);
      if (vegetarian) {
         System.out.print("(v)");
      }
      System.out.println(", " + price);
      System.out.println("     -- " + description);
   }

   public static void main(String[] args) {
     MenuItem test = new MenuItem("JavaScript", "It\' s a great language, yummy!", true, 0);
     test.print();
   }
}
