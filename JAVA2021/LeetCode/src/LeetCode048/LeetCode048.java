package LeetCode048;

class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        flip(matrix);
    }

    public void transpose(int[][] matrix){
        int n = matrix.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                swap(matrix, i, j, j, i);
            }
        }
    }

    public void flip(int[][] matrix){
        int n = matrix.length;
        for(int i=0;i<n/2;i++){
            for(int j=0;j<n;j++){
                swap(matrix, j, i, j, n-1-i);
            }
        }
    }

    public void swap(int[][] matrix, int i1, int j1, int i2, int j2){
        int tmp = matrix[i1][j1];
        matrix[i1][j1] = matrix[i2][j2];
        matrix[i2][j2] = tmp;
    }
}
