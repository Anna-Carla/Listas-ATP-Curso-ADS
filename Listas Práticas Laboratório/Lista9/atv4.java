public class atv4{
public static void main(String[] args) {
    int [] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    imprimeSerie(array, 0);
}


    public static void imprimeSerie(int [] array, int position){
        if(position==array.length-1){
            System.out.println(array[position]);
        } else{
            System.out.println(array[position]+" ");
        }
        imprimeSerie(array, position-1);
    }
}