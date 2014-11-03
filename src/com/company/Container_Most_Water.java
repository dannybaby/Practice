package com.company;

/**
 * Created by ydeng on 10/26/2014.
 */
public class Container_Most_Water{
    public int maxArea(int[] height) {
        if(height.length == 0 || height.length == 1)
            return 0;
        int max = 0;
        int i = 0;
        int j = height.length - 1;
        while(i < j){
            if(height[i] > height[j]){
                if((height[j] * (j - i)) > max)
                    max = height[j] * (j - i);
                j--;
            }
            else{
                if((height[i] * (j - i)) > max)
                    max = height[i] * (j - i);
                i++;
            }
        }
        return max;
    }
}
