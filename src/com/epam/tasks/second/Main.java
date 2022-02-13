package com.epam.tasks.second;

public class Main {

    public static void main(String[] args) {
        ProgrammOutput programmOutput = new ProgrammOutput();
        ProgrammInput programmInput = new ProgrammInput();
        Logic logic = new Logic();

        programmOutput.output("Введите 4-х значное число");
        programmOutput.output(Boolean.toString(logic.FirstPart((int)programmInput.input())));

        programmOutput.output("Введите 3 вещественных числа");
        programmOutput.output(Double.toString(logic.SecondPart(programmInput.input(), programmInput.input(), programmInput.input())));

        programmOutput.output("Введите 3 вещественных числа");
        programmOutput.output(Double.toString(logic.SixPart(programmInput.input(), programmInput.input(), programmInput.input())));
    }
}
