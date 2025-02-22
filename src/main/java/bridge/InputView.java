package bridge;

import camp.nextstep.edu.missionutils.Console;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {
    private final static String BRIDGE_INPUT = "다리의 길이를 입력해주세요.";
    /**
     * 다리의 길이를 입력받는다.
     */
    public int readBridgeSize() {
        Validation validation = new Validation();
        System.out.println(BRIDGE_INPUT);
        String input = Console.readLine();
        validation.totalValidation(input);

        int inputBridge = parseStringToInt(input);
        System.out.println(input);
        System.out.println();



        return inputBridge;
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
        Validation validation = new Validation();
        System.out.println("이동할 칸을 선택해주세요. (위: U, 아래: D)");
        String input = Console.readLine();

        System.out.println(input);

        return input;
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        Validation validation = new Validation();
        System.out.println("게임을 다시 시도할지 여부를 입력해주세요. (재시도: R, 종료: Q)");
        String input = Console.readLine();

        System.out.println(input);

        return input;
    }

    public int parseStringToInt(String number){
        return Integer.parseInt(number);
    }



}
