package dsa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Scanner;
public class MatrixDiagonal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number of Rows:");
        int r=sc.nextInt();
        System.out.println("Enter The Number of Rows:");
        int c=sc.nextInt();
        int[][] mat=new int[r][c];
        System.out.println("Enter The Matrix Elements:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println(" The Matrix Elements:");
        LinkedHashMap<Integer, ArrayList<Integer>> map=new LinkedHashMap<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(map.get(i+j)==null){
                    map.put(i+j,new ArrayList<>());
                }
                map.get(i+j).add(mat[i][j]);
            }
        }

        for(Integer key:map.keySet()){
            Collections.reverse(map.get(key));
            System.out.println(map.get(key));
        }
    }
}
