public class Arrays2DObjects {

    Pasta[][] grid = new Pasta[3][4];

    public static void main(String[] args) {
        Arrays2DObjects it = new Arrays2DObjects();
    }

    public Arrays2DObjects(){
        System.out.println("Welcome to Pasta World!");

        for(int r=0;r< grid.length;r++){
            for(int c=0; c<grid[r].length; c++){
                int a = (int)(Math.random()*101);
                grid[r][c] = new Pasta(a);
            }

        }

        printArray();
        System.out.println("Avg Pounds of Pasta: " + avgPoundsOfPasta());
    }

    public void printArray(){
        for(int r=0;r< grid.length;r++){
            for(int c=0; c<grid[r].length; c++){
                grid[r][c].printInfo();
            }

        }
    }

    public double avgPoundsOfPasta(){

        double all = 0;
        double total = 0;

        for(int r=0;r< grid.length;r++){
            for(int c=0; c<grid[r].length; c++){
                total+=1;
                all+=grid[r][c].getPounds();
            }
        }

        double avg = all/total;

        return avg;
    }
}
