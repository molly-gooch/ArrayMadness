public class Pasta {
   private String shape;
   private int pounds;
   private boolean hasSauce;

   public Pasta(int pPounds){
       shape = "spaghetti";
       hasSauce = true;
       pounds = pPounds;
   }

   public void printInfo(){
       System.out.println("Pasta Shape: " + shape);
       System.out.println("Pounds of Pasta: " + pounds);
       System.out.println("Has Sauce: " + hasSauce);
   }

    public String getShape() {
        return shape;
    }

    public int getPounds() {
        return pounds;
    }

    public boolean getHasSauce() {
        return hasSauce;
    }

    public void setHasSauce(boolean hasSauce) {
        this.hasSauce = hasSauce;
    }

    public void setPounds(int pounds) {
        this.pounds = pounds;
    }

    public boolean setHasSauce() {
        return hasSauce;
    }
}
