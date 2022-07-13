package baekjoon.etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Problem_2309 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        // 일곱 난쟁이.
        // 숫자 9. 7개의 합 100. 오름차순 정렬. 전수조사.InputStreamReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] height = new int[9];
        
        ArrayList<Integer> heightList = new ArrayList<>(); 
        
        int sum = 0;
        for(int i = 0; i < 9; i++){
            height[i] = Integer.parseInt(br.readLine());
            heightList.add(height[i]);
            sum = sum + height[i];
        }
        
        br.close();
        
        
        // sum - 100은 난쟁이가 아닌 둘의 키 합.
        int others = sum - 100;
        
        forout:
        for(int i = 0; i < 8; i++){
            
            for(int j  = i + 1; j < 9; j++){
                
                if(height[i] + height[j] == others){ // 둘을 찾았을 때.
                    //System.out.println("height[i] = " + height[i]);
                    //System.out.println("height[j] = " + height[j]);
                    heightList.remove(j);
                    heightList.remove(i);
                    
                    heightList.sort(null);
                    
                    for(int n = 0; n < 7; n++){
                         System.out.println(heightList.get(n));
                    }
                    
                    break forout;
                    
                }
            }
        }
        

    }
}
