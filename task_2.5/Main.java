public static void main(String[] args) {
        String cleaning [] = {"Мама", "Мыла", "Раму"};
        perm(cleaning, 0);


    }
    public static void perm(String[] arr, int k){
        if (k==arr.length) {
            printstr(arr);
        }
        else {
            int grand[] = new int [arr.length-k];
            for (int i=k, n=0; i<arr.length; i++,n++) {
                grand[n]=i;
            }
            for (int i=0; i<grand.length; i++) {
                String z;
                z=arr[k];
                arr[k]=arr[grand[i]];
                arr[grand[i]]=z;
                perm(arr, k+1);
                z=arr[k];
                arr[k]=arr[grand[i]];
                arr[grand[i]]=z;
            }

        }
    }
    public static void printstr(String[] arr){

        String teString="";
        for (int i=0; i<arr.length; i++) {
            teString = teString + arr[i];
        }
        System.out.println(teString);

    }
}
