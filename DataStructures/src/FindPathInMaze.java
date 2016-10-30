import java.util.Random;

/**
 * Created by Arpit on 10/24/2016.
 */
public class FindPathInMaze {

    private static int[][] solution=new int[4][4];

    public static void displayMaze(int[][] maze)
    {
        for(int i=0;i<maze.length;i++)
        {
            for(int j=0;j<maze[0].length;j++)
            {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }


    }

    public static boolean solveMaze(int[][] maze, int startx, int starty, int endx, int endy )
    {
        if (startx==endx-1 && starty==endy-1 )
        {
            solution[startx][starty]=1;
            return true;
        }

        if(startx>=0 && startx<endx && starty>=0 && starty<endy && maze[startx][starty]==1)
        {
            solution[startx][starty]=1;

            /*if(solveMaze(maze,startx-1,starty,endx,endy))
            {
                return true;
            }*/
            if(solveMaze(maze,startx+1,starty,endx,endy))
            {
                return true;
            }
            /*if(solveMaze(maze,startx,starty-1,endx,endy))
            {
                return true;
            }*/
            if(solveMaze(maze,startx,starty+1,endx,endy))
            {
                return true;
            }

            solution[startx][starty]=0;
            return false;
        }

        //solution[startx][starty]=0;

        return false;
    }



    public static void main(String arrgs[])
    {
        int[][] a={
                {1,1,1,1},
                {0,0,1,0},
                {0,1,1,0},
                {0,1,1,1}
        };

        displayMaze(a);
        System.out.println();
        System.out.println();

        solveMaze(a,0,0,4,4);

        for(int i=0;i<solution.length;i++)
        {
            for(int j=0;j<solution[0].length;j++)
            {
                System.out.print(solution[i][j] + " ");
            }
            System.out.println();
        }
    }
}
