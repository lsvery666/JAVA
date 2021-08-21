package Offer066;

class Solution {
    public int[] constructArr(int[] a) {
        if(a.length == 0) return a;
        int[] left = new int[a.length];
        left[0] = 1;
        for(int i=1;i<a.length;i++){
            left[i] = a[i-1] * left[i-1];
        }
        int right = a[a.length-1];
        for(int i=a.length-2;i>=0;i--){
            left[i] *= right;
            right *= a[i];
        }
        return left;
    }
}
