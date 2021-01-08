



public class mainhome {
    public static void main(String[] args) {
        // Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] arr = {1,0,0,1,1,1};

        for(int i=0; i<arr.length;i++){
            if(arr[i] == 0)
                arr[i] = 1;
            else arr[i] = 0;
        }


        showArr(arr);


        //Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

        int[] arr2 = new int[8];
        int count = 0;
        for(int i=0;i<arr2.length;i++){
            arr2[i] = count;
            count = count + 3;
        }
        showArr(arr2);

        //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for(int i=0;i<arr3.length;i++){
           if(arr3[i]<6){
               arr3[i]*=2;
           }
        }
        showArr(arr3);

        //Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

        int[][] arr4 = new int[5][5];
        for(int i=0; i<5; i++){
            for (int b=0; b<5; b++){
                if(i==b)
                    arr4[i][b] = 1;
                else arr4[i][b] = 0;
            }
        }
        showArr(arr4);

        //** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        int[] arr5 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        int min = arr5[0];
        int max = arr5[0];
        for(int i: arr5){
            if(min>i)
                min = i;

            if(max<i)
                max = i;
        }
        showArr(arr5);
        System.out.println("Минмальное число :" + min);
        System.out.println("Максимальное число :" + max);


        //** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
        int[] arr6 = {1, 5, 3, 2, 1, 1, 5, 2, 4, 8, 9, 1 };
        System.out.println( checkBalance(arr5));
        System.out.println( checkBalance(arr6));

        //**** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
        showArr(move(arr6,2));
    }

    public static int[] move(int[] arr, int n){
      int tmp =0;
        if(n>0){
            for(int i=0;i<n;i++) {
                 for (int b=arr.length-1;b>0;b--){
                    tmp = arr[b];
                    arr[b]=arr[b - 1];
                     arr[b - 1] = tmp;
                  }
             }
        }else{
            for(int i=0;i<n;i++) {
                for (int b = 0; b < arr.length-1; b++) {
                    tmp = arr[b];
                    arr[b] = arr[b + 1];
                    arr[b + 1] = tmp;
                }
            }
        }
        return arr;
    }

    public static boolean checkBalance(int[] arr){
        for(int i=1; i<arr.length;i++){
            if(arr[i]==arr[i-1]) {
                return true;
            }
        }
        return  false;
    }

    public static void showArr( int[] arr){
        System.out.print("{");
        for(int i=0; i<arr.length;i++){
            System.out.print( arr[i] );
            if(i < arr.length-1){
                System.out.print(",");
            }
        }
        System.out.println("}");
    }

    public static void showArr( int[][] arr){
        System.out.print("{");
        for(int i=0; i<arr.length;i++){
            System.out.print("{");
            for(int b=0; b<arr[i].length;b++) {
                System.out.print(arr[i][b]);
                if (b< arr.length - 1) {
                    System.out.print(",");
                }
            }
            System.out.println("}");
        }
        System.out.println("}");
    }


}
