// pw assignment 4 q1
// leetcode : intersection of three sorted array

public class FindCommonElementInThree {

    public static void  commonElements(int arr1[], int arr2[], int arr3[]) {

        //Declare three variables and intialized to zero
        int x = 0, y = 0, z = 0;

        while(x < arr1.length && y < arr2.length && z < arr3.length) {

            if(arr1[x] == arr2[y] && arr2[y] == arr3[z]) {
                System.out.println(arr1[x]);
                x++;
                y++;
                z++;
            } else if (arr1[x] > arr2[y]) {
                y++;

            } else if (arr2[y] > arr3[z]) {
                z++;

            } else {
                x++;
            }
        }
    }

    public static void main(String[] args) {
        int arr1[] = {1, 5, 10, 20, 40, 80};
        int arr2[] = {6, 7, 20, 80, 100};
        int arr3[] = {3, 4, 15, 20, 30, 70, 80, 120};

        commonElements(arr1, arr2, arr3);
    }
}