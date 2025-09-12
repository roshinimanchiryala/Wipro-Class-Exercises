public class wrapdemo {
    public static void main(String[] args) {
        int num = 10;
        double price = 99.99;
        char grade = 'A';
        boolean isJavaFun = true;
        Integer numObj = Integer.valueOf(num);
        Double priceObj = Double.valueOf(price);
        Character gradeObj = Character.valueOf(grade);
        Boolean isJavaFunObj = Boolean.valueOf(isJavaFun);

        System.out.println("Integer object: " + numObj);
        System.out.println("Double object: " + priceObj);
        System.out.println("Character object: " + gradeObj);
        System.out.println("Boolean object: " + isJavaFunObj);
        int n = numObj.intValue();
        double p = priceObj.doubleValue();
        char g = gradeObj.charValue();
        boolean flag = isJavaFunObj.booleanValue();

        System.out.println("Unboxed int: " + n);
        System.out.println("Unboxed double: " + p);
        System.out.println("Unboxed char: " + g);
        System.out.println("Unboxed boolean: " + flag);

    }
}
