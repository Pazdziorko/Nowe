import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerBigDecimal {
    public static void main(String[] args) {
        BigInteger bigInt = new BigInteger("8944454454894611");
       bigInt = bigInt.add(new BigInteger("63939376987936877"));
        System.out.println(bigInt);

        BigDecimal decimal = new BigDecimal("336366.54544494949495494");
        decimal = decimal.pow(4);
        System.out.println(decimal);

    }
}
