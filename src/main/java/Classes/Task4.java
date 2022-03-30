package Classes;

public class Task4 {
//    https://www.codewars.com/kata/simple-drawing-board/

    char[][] canvas;


    public static void main(String[] args) {
//        Task4 c = new Task4(7, 7);
//        c.draw(1, 1, 5, 4);
//        System.out.println("---------\n|       |\n| xxxxx |\n| x   x |\n| x   x |\n| xxxxx |\n|       |\n|       |\n---------");
//        System.out.println(c.drawCanvas());

        Task4 c = new Task4(14, 14);
        c.draw(1, 1, 10, 10)
                .fill(3, 3, 'o');
        System.out.println("---------\n|       |\n| xxxxx |\n| xooox |\n| xooox |\n| xxxxx |\n|       |\n|       |\n---------");
        System.out.println(c.drawCanvas());


//        Task4 c2 = new Task4(5, 5);
//        c2.draw(0, 2, 4, 2)
//                .draw(2, 0, 2, 4);
//        System.out.println("-------\n|  x  |\n|  x  |\n|xxxxx|\n|  x  |\n|  x  |\n-------");
//        System.out.println(c2.drawCanvas());

    }


    public Task4(int width, int height) {
        canvas = new char[width + 2][height + 2];
        for (int i = canvas.length - 1; i >= 0; i--) {
            for (int i1 = canvas[i].length - 1; i1 >= 0; i1--) {
                canvas[i][i1] = ' ';
            }
        }
    }

    public Task4 draw(int x1, int y1, int x2, int y2) {
        if (x1 == x2 || y1 == y2) {
            //line
            for (int j = y1 + 1; j < y2 + 2; j++) {
                for (int i = x1 + 1; i < x2 + 2; i++) {
                    canvas[j][i] = 'x';
                }
            }
        } else {
            //rectangle

            for (int j = y1 + 1; j < y2 + (y1 + 1) + 1; j++) {
                canvas[x1 + 1][j] = 'x';
                canvas[x1 + y2][j] = 'x';
            }
            for (int i = x1 + 2; i < x2 + x1; i++) {
                canvas[i][x1 + 1] = 'x';
                canvas[i][x1 + (y2 + 1)] = 'x';
            }

//            for (int j = y1 + 1; j < y2 + y1 + 1; j++) {
//                for (int i = x1 + 1; i < x2 + x1 + 1; i++) {
//                    canvas[j][i] = 'x';
//                }
//            }
        }
        return this;
    }

    public Task4 fill(int x, int y, char ch) {
        int x1 = -1, x2 = -1, y1 = -1, y2 = -1;

        if (canvas[x + 1][y + 1] == ' ') {

            // find x1
            int i = 1;
            while (x1 == -1) {
                if (canvas[(x + 1) - (i)][y + 1] == 'x') {
                    x1 = (x + 1) - i;
                }
                i++;
            }

            // find x2
            i = 1;
            while (x2 == -1) {
                if (canvas[(x + 1) + (i)][y + 1] == 'x') {
                    x2 = (x + 1) + i;
                }
                i++;
            }

            // find y1
            i = 1;
            while (y1 == -1) {
                if (canvas[x + 1][(y + 1) - (i)] == 'x') {
                    y1 = (y + 1) - i;
                }
                i++;
            }

            // find y2
            i = 1;
            while (y2 == -1) {
                if (canvas[x + 1][(y + 1) + (i)] == 'x') {
                    y2 = (y + 1) + i;
                }
                i++;
            }
        }

//filling
        for (int j = y1 + 1; j < y2 - y1 + 1; j++) {
            for (int i = x1 + 1; i < x2 - x1 + 3; i++) {
                canvas[j][i] = ch;
            }
        }
        return this;
    }

    public String drawCanvas() {
        // add borders
        for (int i = 0; i < canvas[0].length; i++) {
            canvas[0][i] = '-';
            canvas[canvas.length - 1][i] = '-';
        }
        for (int j = 1; j < canvas.length - 1; j++) {
            canvas[j][0] = '|';
            canvas[j][canvas[0].length - 1] = '|';
        }

// prepare string
        StringBuffer result = new StringBuffer();
        String separator = "\n";

        for (int i = 0; i < canvas.length; ++i) {
            for (int j = 0; j < canvas[i].length; ++j)
                if (j == canvas[i].length - 1 && i != canvas.length - 1) {
                    result.append(canvas[i][j]).append(separator);
                } else {
                    result.append(canvas[i][j]);
                }
        }
        return result.toString();
//        return "draw the canvas with borders";
    }
}
