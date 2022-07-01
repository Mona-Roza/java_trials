class Main{
    public static void main(){

    }

    public static void bubbleSort(int arr[]){
        boolean swapped = false;
        do{
            swapped = false;
            for(int i =1; i< arr.length; i++){
                if(arr[i-1] > arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                    swapped = true;
                }
            }
        }while(swapped);
    }
}