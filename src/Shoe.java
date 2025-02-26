public class Shoe {

    private String brand;
    private int size;
    private boolean hasLaces;

    public Shoe(int pSize){
        size = pSize;
        brand = "Nike";
        hasLaces = true;
    }

    public String getBrand() {
        return brand;
    }

    public int getSize() {
        return size;
    }

    public boolean isHasLaces() {
        return hasLaces;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setHasLaces(boolean hasLaces) {
        this.hasLaces = hasLaces;
    }

    public void printInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Size: " + size);
        System.out.println("Has Laces: " + hasLaces);

    }
}
