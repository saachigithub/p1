public class MergeSort {
    int[] temp;
    int[] arr;
    int l;

    public static void main(String[] args) {
        int[] arra = {68, 34, 56};
        MergeSort ms = new MergeSort();
        ms.sort(arra);
        for(int i:arra){
            System.out.print(i+",");
        }
    }

    public void sort(int inputarr[]) {
        this.arr = inputarr;
        this.l = inputarr.length;
        this.temp = new int[l];
        divide(0, l - 1);
    }

    public void divide(int lowerindex, int higherindex) {
        if (lowerindex < higherindex) {
            int middle = lowerindex + (higherindex - lowerindex) / 2;
            //left side
            divide(lowerindex, middle);
            //right side
            divide(middle + 1, higherindex);
            merge(lowerindex,middle,higherindex);
        }
    }

    public void merge(int lowerindex, int middle, int higherindex) {
        for (int i = lowerindex; i <= higherindex; i++) {
            temp[i] = arr[i];
        }
        int i = lowerindex;
        int j = middle + 1;
        int k = lowerindex;
        while (i <= middle && j <= higherindex) {
            if (temp[i] <= temp[j]) {
                arr[k]=temp[i];
                i++;
            }
            else{
                arr[k]=temp[j];
                j++;
            }
            k++;
        }
        while(i<=middle){
            arr[k]=temp[i];
            k++;
            i++;
        }
    }
}
