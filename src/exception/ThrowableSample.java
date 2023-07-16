package exception;

public class ThrowableSample {
    public static void main(String[] args) {
        ThrowableSample sample = new ThrowableSample();
        sample.throwable();
    }

    // java.lang.Throwable 클래스
    public void throwable() {
        int[] intArray= new int[5];

        try {
            intArray=null;
            System.out.println(intArray[5]);
        }catch (Throwable t) {
            System.out.println(t.getMessage()); //1.getMessage()
            System.out.println(t.toString());  //2.toString()
            t.printStackTrace();  //3.printStackTrace()
        }
    }
}
