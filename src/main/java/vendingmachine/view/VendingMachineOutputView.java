package vendingmachine.view;

import vendingmachine.util.ViewMessage;
import vendingmachine.util.constant.Symbol;

public class VendingMachineOutputView {

    public void outputHoldingChanges(String changes) {
        StringBuilder output = new StringBuilder();

        output.append(Symbol.NEW_LINE).append(ViewMessage.OUTPUT_HOLDING_CHANGES.getMessage());
        output.append(Symbol.NEW_LINE).append(changes).append(Symbol.NEW_LINE);
        System.out.println(output);
    }

    public void outputInputAmount(int remainAmount) {
        System.out.println(Symbol.NEW_LINE + ViewMessage.OUTPUT_INPUT_AMOUNT.getMessage() + remainAmount);
    }

    public void outputReturnChanges(String changes) {
        StringBuilder output = new StringBuilder();

        output.append(ViewMessage.OUTPUT_CHANGES.getMessage()).append(Symbol.NEW_LINE);
        output.append(changes);
        System.out.println(output);
    }
}
