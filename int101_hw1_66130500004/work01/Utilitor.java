public class Utilitor {

    public String testString(String value){
        if (value==null) {
            throw new NullPointerException();
        }else if (value.isBlank()) {
            throw new IllegalArgumentException();
        }else{
            return value;
        }
    }

    public double testPositive(double value){
        if (value>0) {
            return value;
        }else{
            throw new IllegalArgumentException();
        }
    }

    public long computeIsbn10(long isbn10){
        double mul=0;
        for (int i = 2; i <=10 ; i++) {
            double num=isbn10%10;
            mul=mul+num*i;
            isbn10=isbn10/10;
        }
        mul=11-(mul%11);
        return (long)mul;
    }
}
