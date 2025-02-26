import java.util.ArrayList;

public class ArrayListsObjects {
    public static void main(String[] args) {
        new ArrayListsObjects();
    }

    ArrayList<Shoe> shoes = new ArrayList<Shoe>();

    public ArrayListsObjects(){
        System.out.println("making arraylists with objects");
        System.out.println(shoes.size());

        shoes.add(0,new Shoe(11)); //telling it to add to specific index
        shoes.add(new Shoe(11)); //telling it to add to end of array

        Shoe puma = new Shoe(11); //better because you made the object and can change things/get rid of it easier
        puma.setHasLaces(false);
        shoes.add(puma);
        System.out.println(shoes.size());
        shoes.remove(puma);
        System.out.println(shoes.size());

        System.out.println(shoes.get(0).getBrand());
    }
}
