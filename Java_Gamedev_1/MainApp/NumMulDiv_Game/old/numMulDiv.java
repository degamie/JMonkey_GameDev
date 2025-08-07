package MainApp.NumMulDiv_Game;
import java.util.HashMap;

import Math;
public class numMulDiv{
    numMulDiv(Integer m,Integer n,int[][] grid,int score){
        this.m=m;
        this.n=n;
        this.grid=grid;
        this.score=score;
    }
    public static void Main(String[] args){  
        int m; int n;
        int[][] grid=new int[m][n];
        HashMap<Integer>hmap=new HashMap<>();
        hMap.put(0,')');
        hMap.put(1,'!');
        hMap.put(2,'@');
        hMap.put(3,'#');
        hMap.put(4,'$');
        hMap.put(5,'%');
        hMap.put(6,'^');
        hMap.put(7,'&');
        hMap.put(8,'*');
        hMap.put(9,'(');
     
        int out=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0)return;
                else if(grid[i][j]<=9){
                    grid[i][j]=hMap(i);
                    output+=Math.max(grid[i][j])+1;
                    score+=output.length;
                }
                else if(grid[i][j]>=9 && grid[i][j]<=99){
                    grid[i][j]=hMap(i);
                    output+=Math.max(grid[i][j]);
                    score+=output.length+1;
                }
                else out=0;
            }
            return score;
        }
        
    }
}
public interface NumMulDiv {
	public void onStart();
}