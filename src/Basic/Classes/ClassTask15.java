package Classes;

public class ClassTask15 {

    static class Canvas {
        private final int width;
        private final int height;
        private final char[][] cav;

        public Canvas(int width, int height) {
            if (width < 0 || height < 0) {
                throw new IllegalArgumentException();
            }

            this.width = width;
            this.height = height;

            cav = new char[height][width];
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    cav[i][j] = ' ';
                }
            }
        }

        private void drawHorizonLine(int x1, int x2, int y) {
            int begin = Math.min(x1, x2);
            int end = Math.max(x1, x2);

            for (int i = begin; i < end + 1; i++) {
                cav[y][i] = 'x';
            }
        }

        private void drawVerticalLine(int y1, int y2, int x) {
            int begin = Math.min(y1, y2);
            int end = Math.max(y1, y2);

            for (int i = begin; i < end + 1; i++) {
                cav[i][x] = 'x';
            }
        }

        private void drawRectangle(int x1, int y1, int x2, int y2) {
            this.drawHorizonLine(x1, x2, y1);
            this.drawHorizonLine(x1, x2, y2);
            this.drawVerticalLine(y1, y2, x1);
            this.drawVerticalLine(y1, y2, x2);
        }

        public Canvas draw(int x1, int y1, int x2, int y2) {
            if ((x1 < 0 || x1 >= width) || (x2 < 0 || x2 >= width) ||
                    (y1 < 0 || y1 >= height) || (y2 < 0 || y2 >= height)) {
                throw new IllegalArgumentException();
            }
            this.drawRectangle(x1, y1, x2, y2);
            return this;
        }

        private void fillRecursive(int x, int y, char ch) {
            if (x < 0 || x >= width) {
                return;
            }
            if (y < 0 || y >= height) {
                return;
            }
            if (cav[y][x] != ' ') {
                return;
            }

            cav[y][x] = ch;

            fillRecursive(x - 1, y, ch);
            fillRecursive(x + 1, y, ch);
            fillRecursive(x, y - 1, ch);
            fillRecursive(x, y + 1, ch);
        }

        public Canvas fill(int x, int y, char ch) {
            if ((x < 0 || x >= width) || (y < 0 || y >= height)) {
                throw new IllegalArgumentException();
            }

            this.fillRecursive(x, y, ch);
            return this;
        }

        public String drawCanvas() {
            StringBuilder res = new StringBuilder();

            res.append("-".repeat(Math.max(0, width + 2)));

            res.append('\n');

            for (int i = 0; i < height; i++) {
                res.append('|');
                for (int j = 0; j < width; j++) {
                    res.append(cav[i][j]);
                }
                res.append('|').append('\n');
            }
            res.append("-".repeat(Math.max(0, width + 2)));
            System.out.println(res.toString());

            return res.toString();
        }
    }
}
