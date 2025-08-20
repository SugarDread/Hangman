public class GameStages {
    public void draw(int fails)
    {
        switch (fails) {
            case 0:
                System.out.println("\n" + //
                              "\n" + //
                              "\n" + //
                              "\n" + //
                              "\n" + //
                              "\n" + //
                              "\n" + //
                              "\n" + //
                              "---------------");
                break;
            case 1:
                System.out.println("\n" + //
                              " |\n" + //
                              " |\n" + //
                              " |\n" + //
                              " |\n" + //
                              " |\n" + //
                              " |\n" + //
                              " |\n" + //
                              "---------------");
                break;
            case 2:
                System.out.println(" --------------\n" + //
                              " |\n" + //
                              " |\n" + //
                              " |\n" + //
                              " |\n" + //
                              " |\n" + //
                              " |\n" + //
                              " |\n" + //
                              "---------------");
                break;
            case 3:
                System.out.println(" --------------\n" + //
                              " |            |\n" + //
                              " |            |\n" + //
                              " |\n" + //
                              " |\n" + //
                              " |\n" + //
                              " |\n" + //
                              " |\n" + //
                              "---------------");
                break;
            case 4:
                System.out.println(" --------------\n" + //
                              " |            |\n" + //
                              " |            |\n" + //
                              " |            o\n" + //
                              " |\n" + //
                              " |\n" + //
                              " |\n" + //
                              " |\n" + //
                              "---------------");
                break;
            case 5:
                System.out.println(" --------------\n" + //
                              " |            |\n" + //
                              " |            |\n" + //
                              " |            o\n" + //
                              " |           /0\\\n" + //
                              " |\n" + //
                              " |\n" + //
                              " |\n" + //
                              "---------------");
                break;
            case 6:
                System.out.println(" --------------\n" + //
                              " |            |\n" + //
                              " |            |\n" + //
                              " |            o\n" + //
                              " |           /0\\\n" + //
                              " |           / \\\n" + //
                              " |               \n" + //
                              " |               \n" + //
                              "---------------");
            
                break;
        }
    }
}
