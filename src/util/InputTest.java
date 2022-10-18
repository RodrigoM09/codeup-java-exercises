package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        input.yesNo();
        input.getInt(0, Input.generateRandom(100));
        input.getDbl(0.01, .9);

    }
}
