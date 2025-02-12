public class Arrays2D {
    public static void main(String[] args) {
        System.out.println("Hello World");
        new Arrays2D();
    }

    int[][] grid = new int[3][4]; //first number is amount of rows and second is amount of columns

    public Arrays2D(){
        System.out.println("Welcome to grid world!");

        System.out.println(grid.length);
        for(int r=0;r< grid.length;r++){
            for(int c=0; c<grid[r].length; c++){
                int random = (int)(Math.random()*101);
                grid[r][c] = random;
            }

        }
        printGrid();
        System.out.println(avgNumber());
    }

    public void printGrid(){
        for(int r=0;r< grid.length;r++){
            for(int c=0; c<grid[r].length; c++){
                System.out.println("(" +r+","+c+"): " +grid[r][c]);
            }

        }
    }


    public double avgNumber(){
        //return the avg number that is in the grid
        double all = 0;
        double total = 0;
        for(int r=0;r< grid.length;r++){
            for(int c=0; c<grid[r].length; c++){
                total+=1;
                all+=grid[r][c];
            }
        }

        double avg = all/total;

        return avg;
    }

    public int bigNum() {
        int biggest = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                if(grid[r][c]>(grid[r][c]-1)){
                    grid[r][c] = biggest;
                    biggest+=grid[r][c];
                }
            }
        }
    }
}
