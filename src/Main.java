import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void task10(){
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        task10(n,k,k);
    }
    //Linear O(k)
    private static void task10(int n,int k,int div){
        if(div==1){
            System.out.println(1);
            return;
        }
        else if(k%div == 0 && n%div==0){
            System.out.println(div);
            return;
        }
        task10(n,k,div-1);
    }
    public static void task9(){
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(task9(n,k));
    }
    //Linear 0(n)
    private static int task9(int n, int k) {
        if (k == 0 || n == k) {
            return 1;
        }
        return task9(n-1,k-1)+task9(n-1,k);
    }

    public static void task8(){
        char[] str = scanner.nextLine().toCharArray();
        if(task8(str,str.length-1)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    // Linear O(n)
    private static boolean task8(char[] str, int i){
        if (i <= 0){
           return true;
        }
        else if (Character.isDigit(str[i])){
        return task8(str, i-1);
        }
        else {
            return false;
        }
    }
    public static void task7(){
        char[] str = scanner.nextLine().toCharArray();
        task7(str,0,str.length-1);
    }
    //Quadratic O(n**2)
    private static void task7(char[] str, int start, int end){
        if (start == end) {
            System.out.println(str);
        }
        else{
            for(int i = start;i<=end;i++){
                char save = str[start];
                str[start] = str[i];
                str[i] = save;
                task7(str,start+1,end);
                char save2 = str[start];
                str[start] = str[i];
                str[i] = save2;
            }
        }
    }
    public static void task6(){
        int num = scanner.nextInt();;
        int degree = scanner.nextInt();;
        System.out.println(task6(num,degree,1));
    }
    //Linear O(n)
    private static int task6(int num, int degree, int res){
        if(degree<=0){
            return res;
        }
        res*=num;
        degree--;
        return task6(num, degree, res);
    }
    public static void task5(){
        int pos = scanner.nextInt();
        System.out.println(task5(pos));
    }
    // Exponential O(2**n)
    private static int task5(int pos) {
        if (pos == 0) return 0;
        if (pos == 1) return 1;

        return task5(pos - 2)
                + task5(pos - 1);
    }
    public static void task4(){
        int n = scanner.nextInt();
        task4(1,n,1);
    }
    //Linear O(n)
    private static void task4(int num, int max, int sum){
        if(num == max+1){
            System.out.println(sum);
            return;
        }
        sum *= num;
        task4(num+1,max,sum);
    }
    public static void task3(){
        int num = scanner.nextInt();
        if(task3(num,2)){
            System.out.println("PRIME");
        }
        else{
            System.out.println("Composite");
        }
    }
    // Linear O(sqrt(n))
    private static boolean task3(int num, int checknum){
        if(num == 2){
            return true;
        }
        else if(num % checknum == 0){
            return false;
        }
        else if (checknum > Math.sqrt(num)) {
            return true;
        }
        return task3(num, checknum+1);
    }
    public static void task2(){
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        task2(n,arr,0,0);
    }
    // linear O(n)
    private static void task2(int n, int[] arr, float sum, int ind){
        if(n == ind){
            System.out.println("avg" + sum/n);
            return;
        }
        sum += arr[ind];
        task2(n,arr,sum,ind+1);
    }
    public static void task1(){
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        task1(arr,10000,0,n);
    }
    // Linear O(n)
    private static void task1(int[] arr, int min, int ind, int n){
        if(ind == n){
            System.out.println("min:" + min);
            return;
        }
        if(arr[ind] < min){
            min = arr[ind];
        }
        task1(arr,min,ind+1,n);
    }
    public static void main(String[] args) {
}}