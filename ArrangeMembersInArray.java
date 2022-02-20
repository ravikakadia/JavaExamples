//Arrange array [1, 0, 2, 0, 1, 2, 2, 1, 0, 0] to [2,2,2,0,0,0,1,1,1]
public class ArrangeMembersInArray {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 1, 2, 2, 1, 0, 0};
        int len = arr.length;
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < len; i++) {
            if(arr[i]==0){
                count0++;

            }
            else if(arr[i]==1){
                count1++;
            }
            else count2++;
        }
        for (int i = 0; i <=count2; i++){
            arr[i]=2;
        }
        for (int i = count2; i <=(count2+count0); i++){
            arr[i]=0;
        }
        for (int i = (count2+count0); i <(count2+count0+count1); i++){
            arr[i]=1;
        }
        System.out.println("count0=" + count0);
        System.out.println("count1=" + count1);
        System.out.println("count2=" + count2);
        for (int i = 0; i < len; i++) {
        System.out.println(arr[i]);}
    }
}
