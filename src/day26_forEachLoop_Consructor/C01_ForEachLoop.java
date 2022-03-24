package day26_forEachLoop_Consructor;

public class C01_ForEachLoop {
    public static void main(String[] args) {

        int arr[]={2,4,6,8,11};
        //elementleri forLoop ile yazdiralim
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        //bunu for-each loop ile yapcak olirsak
        //for-each loop'u calistirmak icin hedef bir collection vermeliyiz
        for (int each : arr
             ) {
            System.out.print(each + " ");
        }
    }
}
