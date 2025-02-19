import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayLists it = new ArrayLists();
    }


    ArrayList<Integer> list = new ArrayList<Integer>();

    public ArrayLists(){
        System.out.println("Welcome to the wonderful world of ArrayLists!");


        list.add(2);
        //list.remove(0);
        list.add(27);
        //list.remove(1);
        list.add(1,37);
        for(int x=0;x<10;x++){
            list.add(52);
        }

        for(int x=0;x<44;x++){
            int n = (int)(Math.random()*75)+7;
            list.add(n);
        }

        //list.clear();
        if(list.contains(2)){
            System.out.println("boogaloo");
        }

        printInfo();
        System.out.println(list.lastIndexOf(52));
        System.out.println("avg num: " + avgNum());

    }

    public void printInfo(){
      for(int a=0;a<list.size(); a++){
          System.out.println(a + ":" + list.get(a));
      }
        System.out.println(list);
    }

    public double avgNum(){
        double last = 0;
        double size = 0;
        for(int x=0; x<list.size();x++){
            double num = list.get(x);
            last+=num;
            size+=1;
        }
        System.out.println(size);
        System.out.println(last);
        return last/size;
    }
}
