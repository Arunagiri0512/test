public class bubble {
    public static void main(String[] args) {
        int arr[]  = {4,1,12,3,2,0};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        } 
        for (int i = 0; i < arr.length; i++) {            
            System.out.println(arr[i]);  
        }
    }
    
}
