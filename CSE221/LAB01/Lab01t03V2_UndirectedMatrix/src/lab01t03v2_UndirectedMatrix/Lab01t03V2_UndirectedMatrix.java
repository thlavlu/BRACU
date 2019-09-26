/*
 *Hi I am Tousif Hasan Lavlu.
 *A BRAC University Student, department of Computer Science and Engineering.
 *Welcome to my code.
 *For further contact
 *https://github.com/compboy
 *thlavlu
 */
package lab01t03v2_UndirectedMatrix;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;

/**
 *
 * @author TH LAVLU
 */
public class Lab01t03V2_UndirectedMatrix {
    

    int vertex;
    int matrix[][];

    public Lab01t03V2_UndirectedMatrix(int vertex) {
        this.vertex = vertex;
        matrix = new int[vertex][vertex];
    }

    public void addEdge(int x, int y) {
        matrix[x][y] = 1;
        matrix[y][x] = 1;
    }

    public void printGraph() {
        System.out.println();
        System.out.println("Adjacency Matrix:-");//PRINT VERTEX LINE
        System.out.print("  " + 0 + "");
        for (int i = 1; i < vertex; i++) {
            System.out.print(" " + i + "");//PRINT VERTEX LINE
        }
        System.out.println();
        for (int i = 0; i < vertex; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < vertex; j++) {
                System.out.print(+matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Adjacency List:- ");

        for (int i = 0; i < vertex; i++) {
            System.out.print(i + "--> ");
            for (int j = 0; j < vertex; j++) {
                if (matrix[i][j] == 1) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Out Degree:- ");
        for (int i = 0; i < vertex; i++) {
            int count = 0;
            for (int j = 0; j < vertex; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            System.out.println(i + " --> " + count);
        }
    }

    public static void main(String[] args) {
        
        try{
        File f = new File("D:\\BRACU\\PROGRAMMING\\NetBean\\CSE221\\LAB01\\Lab01t03V2_UndirectedMatrix\\input.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
    
        String st;
        int m = 7;
        int n = 2;
        int[][] a = new int[m][n];

            while ((st = br.readLine()) != null) {
                StringTokenizer st1 = new StringTokenizer(st, ",");
                for (int i = 0; i < m; i++) {
                    a[i][0] = Integer.parseInt(st1.nextToken());
                    a[i][1] = Integer.parseInt(st1.nextToken());
                }
            }
        

        Lab01t03V2_UndirectedMatrix graph = new Lab01t03V2_UndirectedMatrix(6);
        for (int i = 0; i < m; i++) {
            graph.addEdge(a[i][0], a[i][1]);
        }
        graph.printGraph();

    }
      catch (Exception e) {
            System.out.println("Oops, you are not TH LAVLU. Firstly, change your file path. You know what to do now.");
        }
}
}
