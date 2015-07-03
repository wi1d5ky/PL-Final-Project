public interface Iterator {
   /** tells us if there are more elements in the aggregate to iterate through */
   public boolean hasNext();

   /** returns the next object in the aggregate */
   Object next();
}
