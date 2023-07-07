package Interview;

public class NABTEST_2 {
    public int solution(String S) {
        char[] moves = S.toCharArray();
        int numMovedSuccessfullyPlayers = 0;
        final char empty = 'e';

        for (int i = 0; i < moves.length; i++) {
            // move up or move down that have not prevented
            if(moves[i] == 'v' || moves[i] == '^'){
                moves[i] = empty;
                numMovedSuccessfullyPlayers++;
            } else if (moves[i] == '<' && (i == 0 || moves[i-1] == empty ) ) {
                // be able to move left if it's first player or closest left side is empty
                moves[i] = empty;
                numMovedSuccessfullyPlayers++;
            }else if (moves[i] == '>' && i == moves.length - 1) {
                // be able to move right only if it's last player
                numMovedSuccessfullyPlayers++;
            }
        }
        return numMovedSuccessfullyPlayers;
    }


}
