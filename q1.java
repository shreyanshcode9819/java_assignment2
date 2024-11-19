    import java.util.Arrays;

    public class q1 {
        public static void main(String[] args) {
            
            int[] A = {1, 3, 5, 7};
            int[] B = {2, 4, 6, 8};
            
            
            int[] C = mergeArrays(A, B);
            System.out.println("Merged array C: " + Arrays.toString(C));
        }

        public static int[] mergeArrays(int[] A, int[] B) {
            int lengthA = A.length;
            int lengthB = B.length;
            int[] C = new int[lengthA + lengthB];

            int i = 0, j = 0, k = 0;

            
            while (i < lengthA && j < lengthB) {
                if (A[i] < B[j]) {
                    C[k++] = A[i++];
                } else {
                    C[k++] = B[j++];
                }
            }

            
            while (i < lengthA) {
                C[k++] = A[i++];
            }

            
            while (j < lengthB) {
                C[k++] = B[j++];
            }

            return C;
        }
    }

