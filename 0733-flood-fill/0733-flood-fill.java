class Solution {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int oldColor = image[sr][sc];

        if (oldColor == color) {
            return image;
        }

        dfs(image, sr, sc, oldColor, color);

        return image;
    }

    public void dfs(int[][] image, int row, int col,
                    int oldColor, int newColor) {

        image[row][col] = newColor;

        int[][] directions = {
            {-1, 0},
            {1, 0},
            {0, -1},
            {0, 1}
        };

        for (int[] direction : directions) {

            int newRow = row + direction[0];
            int newCol = col + direction[1];

            if (newRow >= 0 &&
                newRow < image.length &&
                newCol >= 0 &&
                newCol < image[0].length &&
                image[newRow][newCol] == oldColor) {

                dfs(image, newRow, newCol, oldColor, newColor);
            }
        }
    }
}