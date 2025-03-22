public class Colors {
    public static void main(String[] args) {
        int[] colors = {1,0,1,0,2,0,1,1,0,0,2};
        int start = 0;
        int end = colors.length - 1 ;
        int current = 0;
        while (current <= end){
            if (colors[current] == 0){
                int temp = colors[start];
                colors[start] = colors[current];
                colors[current] = temp;
                start++;
                current++;
            }else if (colors[current] == 1){
                current++;
            }else{
                int temp = colors[current];
                colors[current] = colors[end];
                colors[end] = temp;
                end--;
            }
        }
        for (int i = 0; i<colors.length; i++){
            System.out.println(colors[i]);
        }
    }
}
