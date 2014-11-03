package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ydeng on 10/26/2014.
 */
public class Generate_Parenthese {
    public List<String> generateParenthesis(int n) {
        List<String[]> allres = new ArrayList<String[]>();
        List<String> res = new ArrayList<String>();
        String[] tmp = {""};
        allres.add(tmp);
        res.add(tmp[0]);
        if(n == 0)
            return res;

        else{
        for(int count = 1; count <= n; count++){
            List<String> cur = new ArrayList<String>();
            int i = 0;
            while(i<count){
                for(int j = 0; j < allres.get(i).length; j++){
                    String curstr = "(" + allres.get(i)[j]+ ")";
                    for(int k = 0; k< allres.get(count-i-1).length; k++){
                        String newstr = curstr + allres.get(count-i-1)[k];
                        cur.add(newstr);
                    }
                }
                i++;
            }
            if(count == n)
                return cur;
            allres.add((String[])cur.toArray(new String[cur.size()]));
        }
        return res;
    }
}
}
