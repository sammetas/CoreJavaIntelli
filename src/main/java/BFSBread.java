import java.util.ArrayDeque;
import java.util.Queue;

class BFSBread {
    public static void main(String[] args) {
        int startX = 2;
        int startY = 4;

        int days = spreadVirus(4,6, startX - 1, startY - 1);
        System.out.println("It takes " + days + " days for the virus to spread to all elements.");

    }

    public static int spreadVirus(int sizeX, int sizeY, int elementX, int elementY) {
        int[][] grid = new int[sizeX][sizeY]; //initializes with zeros
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; // to cover all corners

        Queue<int[]> queue = new ArrayDeque<>();
        int days = 0;
        int[] coordinates = {elementX, elementY};
        queue.add(coordinates);

        while (!queue.isEmpty()) { //bfs enters

            for (int i = 0; i < queue.size(); i++) {
                int[] virus = queue.poll();
                for (int[] dir : dirs) {
                    int x = virus[0] + dir[0];
                    int y = virus[1] + dir[1];

                    if (x >= 0 && x < sizeX && y >= 0 && y < sizeY && grid[x][y] == 0) {
                        grid[x][y] = 1;
                        queue.add(new int[]{x, y});
                    }

                }
            }
            if (!queue.isEmpty()) days++;
        }

        return days -1 ;


    }
}