import java.util.Arrays;

class TargetFinderTest {
    public static void main(String[] args) {
        int[] aiCoords = {10, 10};
        int[][] targets = {
                {20, 20},
                {15, 14},
                {30, 5}
        };

        TargetFinder targetFinder = new TargetFinder();
        int[] nearestTarget = targetFinder.findTarget(aiCoords, targets);

        //Expect [15, 14]
        System.out.println(Arrays.toString(nearestTarget));
    }
}

class TargetFinder {
    public int[] findTarget(int[] aiCoords, int[][] targets) {
        double[] distance = new double[targets.length];
        int index = 0;
        for (int i = 0; i < targets.length; i++) {
            distance[i] = Math.sqrt((targets[i][0] - aiCoords[0]) * (targets[i][0] - aiCoords[0]) +
                    (targets[i][1] - aiCoords[1]) * (targets[i][1] - aiCoords[1]));

        }
         for (int j = 0; j < distance.length-1; j++) {
             if (distance[j] > distance[j+1]) {
                 index = j + 1;
             }
         }
         return targets[index];
    }
}
