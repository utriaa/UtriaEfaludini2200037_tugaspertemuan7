public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        startTime = System.currentTimeMillis();
    }
    public void start() {
        startTime = System.currentTimeMillis();
    }
    public void stop() {
        endTime = System.currentTimeMillis();
    }
    public long getElapsedTime() {
        return endTime - startTime;
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        StopWatch stopwatch = new StopWatch();

        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100000);
        }
        stopwatch.start();
        selectionSort(arr);
        stopwatch.stop();

        System.out.println("Waktu yang diperlukan untuk pengurutan: " + stopwatch.getElapsedTime() + " milidetik");
    }
}
