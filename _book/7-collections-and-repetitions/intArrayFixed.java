public class intArrayFixed {
    public static void main(String[] args) {
        int[] numArr = new int[4];
        
        for (int i=0; i<4; i++) {
            numArr[i]=i+1; // indexing starts from 0
        }        
        for (int i=0; i<4; i++) {
            System.out.println(numArr[i]);
        }
    }
}