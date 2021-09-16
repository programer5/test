package chapter3.ch16;

public class AdvancedLevel extends PlayerLevel {
    @Override
    void run() {
        System.out.println("빨리 달립니다.");
    }

    @Override
    void jump() {
        System.out.println("높이 jump 합니다.");
    }

    @Override
    void turn() {
        System.out.println("turn 못하지롱");
    }

    @Override
    void showLevelMessage() {
        System.out.println("****** 중급자 레벨입니다. ******");
    }
}
