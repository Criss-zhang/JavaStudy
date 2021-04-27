package package02.homework2;

import java.util.Arrays;

public class GameStart {
    public static void main(String[] args) {
        Player player1 = new Player(Position.First);
        player1.setGaming(true);

        Player player2 = new Player(Position.SECOND);
        player2.setGaming(false);

        Player player3 = new Player(Position.THIRD);
        player3.setGaming(true);

        Player player4 = new Player(Position.FORTH);
        player4.setGaming(true);

        Player player5 = new Player(Position.FIFTH);
        player5.setGaming(false);
        //将玩家加入牌桌
        Player[] playerArray = {player2,player1,player5,player3,player4};
        Game game = Game.newInstance();
        game.setPlayers(playerArray, Position.SECOND);
        game.init();
        for (Player pp: game.players
             ) {
            System.out.println(pp);
        }
        System.out.println(Arrays.toString(game.extraCard));
    }
}
