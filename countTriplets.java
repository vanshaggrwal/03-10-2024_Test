public class TripletCount {

    public static int countTriplets(int[] arr, int sum) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    
                    if (arr[i] + arr[j] + arr[k] < sum) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 4, 7};
        int sum = 12;
        int result = countTriplets(arr, sum);
        System.out.println("Number of triplets: " + result);
    }
}
