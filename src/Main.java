public class Main {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        double sum=0,harmonic;
        for (int i = 0; i < array.length ; i++) {
            sum+=1.0/array[i];
        }
        harmonic= array.length/sum;
        System.out.println("Dizinin harmonik ortalaması: "+harmonic);

    }
}
