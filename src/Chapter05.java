import java.lang.reflect.Array;

public class Chapter05 {
    public static void main(String[] args){
    long long1=911111111L;
    System.out.println(long1);
    double double1=12345.67;
    System.out.println(double1);
    boolean boolean1=true;
    System.out.println(boolean1);
    Float float1=0.1234f;
    System.out.println(float1);
    Integer integer1=1234566;
    System.out.println(integer1);
    Character char1='A';
    System.out.println(char1);
    
    int[] array1=new int[5];
    array1[0]=60;
    array1[4]=50;
    array1[3]=40;
    array1[2]=30;
    array1[1]=20;
    int int2=array1[2];
    System.out.println(int2);
    }
}
