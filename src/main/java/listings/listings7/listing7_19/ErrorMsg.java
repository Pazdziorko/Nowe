package listings.listings7.listing7_19;

public class ErrorMsg {
    final int OUTERR = 0;
    final int INNERR = 1;
    final int DISKERR = 2;
    final int INDEXERR = 3;

    String msgs[] = {
            "Output error",
            "Input error",
            "Disk is full",
            "Index out of range",

    };

    String getErrorMsg(int i) {
        if (i >= 0 & i < msgs.length) {
            return msgs[i];
        } else {
            return "Incorrect error code";
        }

    }
}
