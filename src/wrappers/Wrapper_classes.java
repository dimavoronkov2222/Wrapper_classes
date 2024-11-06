package wrappers;
public class Wrapper_classes {
    public static void main(String[] args) {
        Integer i1 = 10;
        Integer i2 = Integer.valueOf(10);
        Integer i3 = Integer.valueOf(10);
        Integer i4 = Integer.parseInt("10");
        Double d1 = 10.5;
        Double d2 = Double.valueOf(10.5);
        Double d3 = Double.valueOf(10.5);
        Double d4 = Double.parseDouble("10.5");
        Float f1 = 10.5f;
        Float f2 = Float.valueOf(10.5f);
        Float f3 = Float.valueOf(10.5f);
        Float f4 = Float.parseFloat("10.5");
        Boolean b1 = true;
        Boolean b2 = Boolean.valueOf(true);
        Boolean b3 = Boolean.valueOf(true);
        Boolean b4 = Boolean.parseBoolean("true");
        Character c1 = 'A';
        Character c2 = Character.valueOf('A');
        Character c3 = Character.valueOf('A');
        Character c4 = 'A';
        Double doubleValue = 123.45;
        byte byteValue = doubleValue.byteValue();
        short shortValue = doubleValue.shortValue();
        int intValue = doubleValue.intValue();
        float floatValue = doubleValue.floatValue();
        long longValue = doubleValue.longValue();
        Double nonZero = 10.0;
        Double zero = 0.0;
        Double nanValue = zero / zero;
        Double infinityValue = nonZero / zero;
        System.out.println("nanValue = " + nanValue);
        System.out.println("infinityValue = " + infinityValue);
        if (nanValue.isNaN()) {
            System.out.println("Переменная nanValue = NaN");
        }
        if (infinityValue.isNaN()) {
            System.out.println("Переменная infinityValue = NaN");
        }
        if (nanValue.isInfinite()) {
            System.out.println("Переменная nanValue = Infinity");
        }
        if (infinityValue.isInfinite()) {
            System.out.println("Переменная infinityValue = Infinity");
        }
        Long longValue1 = 120L;
        Long longValue2 = 120L;
        System.out.println("Сравнение (120): " + (longValue1 == longValue2));
        longValue1 = 1200L;
        longValue2 = 1200L;
        System.out.println("Сравнение (1200): " + (longValue1 == longValue2));
    }
}
