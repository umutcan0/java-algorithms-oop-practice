public class Main {

    public static void main(String[] args) {

        Main m= new Main();
        m.drawIsoscelesTriangleInArray(10);
        m.drawRightTriangleInArray(6);

    }//İKİZ KENAR ÜÇGEN ARRAY

    void drawIsoscelesTriangleInArray(int height) {

        String[][] triangle = new String[height][2 * height - 1];

        for (int i = 0; i < triangle.length; i++) {

            for (int j = 0; j < height - (i + 1); j++) {

                triangle[i][j] = " ";
            }

            for (int j = height - (i + 1); j < (height +i); j++) {

                triangle[i][j] = "*";
            }

            for (int j = height+i; j < 2 * height - 1; j++) {

                triangle[i][j] = " ";
            }
        }

        for (int i = 0; i < triangle.length; i++) {

            for (int j = 0; j < triangle[i].length; j++) {

                System.out.print(triangle[i][j]);
            }
            System.out.println("");
        }
    }

// DİK ÜÇGEN ARRAY

    void drawRightTriangleInArray(int height) {

        String[][] triangle = new String[height][2 * height - 1];

        for (int i = 0; i < triangle.length; i++) {

            for (int j = 0; j < 2 * i + 1; j++) {

                triangle[i][j] = "*";
            }

            for (int j = 0; j < triangle[i].length; j++) {

                if (triangle[i][j] == null)

                    triangle[i][j] = "";
            }
        }

        for (int i = 0; i < triangle.length; i++) {

            for (int j = 0; j < triangle[i].length; j++) {

                System.out.print(triangle[i][j]);
            }

            System.out.println("");
        }
    }
}


// * karakteri kullanılarak diziler sayesinde üçgenler oluşturuldu.