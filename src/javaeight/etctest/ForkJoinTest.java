package javaeight.etctest;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;
import java.util.stream.IntStream;

class ForkJoinTest {
    static class ForkJoinSumTask extends RecursiveTask<Integer> {
        static final int SPLIT_THRESHOLD = 10;
        int[] values;
        int startPos;
        int endPos;

        public ForkJoinSumTask(int[] values) {
            this(values, 0, values.length);
        }

        public ForkJoinSumTask(int[] values, int startPos, int endPos) {
            this.values = values;
            this.startPos = startPos;
            this.endPos = endPos;
        }

        @Override
        protected Integer compute() {
            int computeTargetValueLength = endPos - startPos;

            if (computeTargetValueLength <= SPLIT_THRESHOLD) {
                return sumValuesSequentially();
            }

            int splitPosition = startPos + computeTargetValueLength/2;
            ForkJoinSumTask left = new ForkJoinSumTask(values, startPos, splitPosition);
            left.fork();

            ForkJoinSumTask right = new ForkJoinSumTask(values, splitPosition, endPos);

            int rightTaskResult = right.compute();
            int leftTaskResult = left.join();

            return leftTaskResult + rightTaskResult;
        }

        private int sumValuesSequentially() {
            int sum = Arrays.stream(values, startPos, endPos).reduce(0, (a, b) -> a + b);
            System.out.println(Thread.currentThread().getName() + ", startPos=" + startPos + ", endPos=" + endPos + ", sum=" + sum);
            return sum;
        }
    }

    public static void main (String[] args) {
        int[] values = IntStream.rangeClosed(1, 80).toArray();
        ForkJoinTask<Integer> task = new ForkJoinSumTask(values);
        int totalSum = new ForkJoinPool().commonPool().invoke(task);
        System.out.println("Total sum: " + totalSum);
        System.out.println("Total sum: " + new ForkJoinPool().commonPool().getPoolSize());
    }
}
