class Solution {
    public int snakesAndLadders(int[][] board) {
        int minSteps = 0;
        int rows = board.length;
        int start = 1, end = rows * rows;
        boolean[][] isVisited = new boolean[rows][rows];
        LinkedList<Integer> queue = new LinkedList<>();

        isVisited[rows - 1][0] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int currentPosition = queue.pop();
                if (currentPosition == end) return minSteps;
                //Rolling Dice upto 6 and adding those possible destinations to Queue.
                for (int dice = 1; dice <= 6; dice++) {
                    if (dice + currentPosition > end) break;

                    int[] nextPosition = findCoordinates(currentPosition + dice, rows);
                    int nextRow = nextPosition[0], nextColumn = nextPosition[1];
                    if (!isVisited[nextRow][nextColumn]) {
                        isVisited[nextRow][nextColumn] = true;
                        if (board[nextRow][nextColumn] != -1) queue.add(board[nextRow][nextColumn]);
                        else queue.add(currentPosition + dice);
                    }
                }
            }
            minSteps++;
        }
        return -1;
    }
    
	//Most Important part, rest of the question is simple BFS.
    private int[] findCoordinates(int currentPosition, int n) {
        int r = n - (currentPosition - 1) / n - 1;
        int c = (currentPosition - 1) % n;
        if (r % 2 == n % 2) return new int[]{r, n - 1 - c};
        else return new int[]{r, c};

        
    }
}