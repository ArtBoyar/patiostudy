package HW_3;

public class Player {

    private String nickname;
    private int level;
    private int score;

    public Player(String nickname, int level, int score) {
        this.nickname = nickname;
        this.level = level;
        this.score = score;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public void levelUp() {
        this.level += 1;
    }
    public void addScore(int points) {
        if (points > 0) {
            this.score += points;
        } else {
            System.out.println("Очки должны быть положительными.");
        }
    }
    public void printPlayerInfo() {
        System.out.println("Игрок: " + nickname + ", Уровень: " + level + ", Очки: " + score);
    }

    public static void main(String[] args) {
        Player player = new Player("Mercy", 2, 0);
        player.printPlayerInfo();
        player.levelUp();
        player.addScore(150);
        player.printPlayerInfo();
    }
}
