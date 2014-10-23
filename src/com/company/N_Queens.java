/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

/**
 *
 * @author newstar
 */
import java.util.List;
import java.util.ArrayList;
public class N_Queens {
    public String[] queentostring(int[] A, int n){
        String[] sol = new String[n];
        for(int i=0 ; i<n; i++){
            sol[i]="";
            for(int j =0; j<n; j++){
                if(A[i] == j)
                    sol[i] += "Q";
                else
                    sol[i] += ".";
            }
        }
        return sol;
    }
    public boolean isvalid(int[] A, int row, int col){
        for(int i = 0; i < row; i++){
            if(A[i] == col || Math.abs(i - row) == Math.abs(A[i] - col))
                return false;
        }
        return true;
    }
    public List<String[]> solveNQueens(int n) {
        List<String[]> solutions = new ArrayList<String[]>();
        int[] A = new int[n];
        queen(A, 0 , n, solutions);
        return solutions;
    }
    
    public void queen(int[] A, int row, int n, List<String[]> solutions){
        if( row == n){
            solutions.add(queentostring(A,n));
        }
        else{
            for(int k = 0 ; k < n; k++){
                if(isvalid(A, row, k)){
                    A[row] = k;
                    queen(A, row + 1, n, solutions);
                }
            }
        }
    }
    public List<String[]> solveNQueens2(int n) {
        List<String[]> solutions = new ArrayList<String[]>();
        int[] A = new int[n];
        int i = 0, j = 0;
        while( i < n){
            while(j < n){
                if(isvalid(A,i,j)){
                    A[i] = j;
                    j = 0;
                    break;
                }
                else{
                    j++;
                }
            }
            if(j == n){
                if(i == 0)
                    break;
                else{
                    i--;
                    j = A[i] + 1;
                    continue;
                }
            }
            
            if(i == (n-1)){
                solutions.add(queentostring(A, n));
                j = A[i] + 1;
                continue;
            }
            i++;
            
        }
        return solutions;
    }
}
