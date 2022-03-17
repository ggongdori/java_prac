import java.util.*;

//클래스 생성
//Constructor
class Phone{
    String name;
    String color;
    int price;
    Phone(String name, String col, int pr){
        this.name = name;
        this.color = col;
        this.price = pr;
    }
}

public class Main {
    public static void main(String[] args){
        System.out.println("Back to Java");


        Phone iphone = new Phone("iphone12 pro", "graphite", 1500);


        System.out.println(iphone.price);

        int[] arr2 = new int[5]; //배열은 선언과 동시에 크기를 지정해줘야함
        int[] arr3 = new int[]{1,2,3,4,5}; //선언과 초기화 동시에
        //String은 Reference(Wrapper)
        //primitive type = byte, short, double, int, long, float, char, boolean
        String[] strArr = new String[5];
        //2차원 배열
        int[][] arr4 = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arr4[i][j] = i * j;
            }
        }

        System.out.println(Arrays.toString(arr4));
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = "i";
        }
        for (int i = 0; i < 5; i++) {
            arr2[i] = i;
        }

        //array를 프린트 하려면 Arrays.toString
        System.out.println(Arrays.toString(arr2));

        //ArrayList는 크기 선언 안 해도 됨됨
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add(i);
        }
        System.out.println(arr);

        String a = "hi";
        System.out.println(a);




    }
}
