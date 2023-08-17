public class StreetFighter {

    public static String[] streetFighterSelection(String[][] fighters, int[] position, String[] moves){
        int x = position[1];
        int y = position[0];
        String[] result = new String[moves.length];

        for (int i = 0; i < moves.length; i++) {
            switch (moves[i]) {
                case "up":
                    y = 0;
                    break;
                case "down":
                    y = 1;
                    break;
                case "right":
                    x = (x + 1) % 6;
                    break;
                case "left":
                    x = (x + 5) % 6;
                    break;
                default: break;
            }
            result[i] = fighters[y][x];
        }
        return result;
    }
}
