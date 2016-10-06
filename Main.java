package tadas.ivanauskas;

import javax.swing.*;
import java.security.SecureRandom;
import java.util.ArrayList;

public class Main {
private SecureRandom rand = new SecureRandom();
    public static void main(String[] args) {
        String choice="";
        Main task = new Main();
        while(!(choice.equalsIgnoreCase("exit")||choice.equalsIgnoreCase("0"))){
            choice=JOptionPane.showInputDialog(null,"Enter the task");
            switch (choice){
                case "0":
                    System.exit(0);
                    break;
                case "1":
                    task.task1();
                    break;
                case "2":
                    task.task2();
                    break;
                case "3":
                    task.task3();
                    break;
                case "4":
                    task.task4();
                    break;
                case "5":
                    task.task5();
                    break;
                case "6":
                    task.task6();
                    break;
                case "7":
                    task.task7();
                    break;
                case "8":
                    task.task8();
                    break;
                case "9":
                    task.task9();
                    break;
                case "10":
                    task.task10();
                    break;
                case "11":
                    task.task11();
                    break;
                case"12":
                    task.task12();
                    break;
                case"13":
                    task.task13();
                    break;
                case "14":
                    task.task14();
                    break;
                case "15":
                    task.task15();
                    break;
                case "16":
                    task.task16();
                    break;
                case "17":
                    int[][] arr={{1,2,3},{4,5},{6,7,8},{9,10,11,12}};
                    task.task17(arr);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Invalid input!");
                    break;
            }
        }

    }
    private void task1(){ //array of 10 numbers to store
        int[] arr = new int[10];
        //manual
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        arr[5]=6;
        arr[6]=7;
        arr[7]=8;
        arr[8]=9;
        arr[9]=10;
        int [] arr2 = new int [10];
        //loop
        for (int i=0;i<10;i++){
            arr2[i]=i+1;
            System.out.println(arr[i]+ arr2[i]);
        }

    }
    private void task2(){
        //10 to 1
        int[] arr = new int[10];
        for (int i=0;i<10;i++){
            arr[i]=10-i;
            System.out.println(arr[i]);
        }
    }
    private void task3(){
        String string="";
        int[] arr = new int[10];
        for (int i=0;i<10;i++){
            arr[i]=10-i;
        }
        for(int i :arr){
            string=string+i+" ";
        }
        JOptionPane.showMessageDialog(null,string);
    }
    private void task4(){
        String[] string={"This","is","a","sentence","stored","in","an","array"};
        for (String i:string){
            System.out.println(i);
        }
    }
    private void task5(){
        String[] strings = new String[5];
        String string="";
        for (int i=0;i<5;i++){
            strings[i]= JOptionPane.showInputDialog(null,"Enter a word");
        }
        for(String s:strings){
            string = string +s+" ";
        }
        JOptionPane.showMessageDialog(null,string);
    }
    private void task6() {
        String[] strings = new String[5];
        String string = "";
        for (int i = 4; i >= 0; i--) {
            strings[i] = JOptionPane.showInputDialog(null, "Enter a word");
        }
        for (String s : strings) {
            string = string + s + " ";
        }
        JOptionPane.showMessageDialog(null, string);
    }
    private void task7(){
        double[] arr = new double[5];
        String number;
        for (int i=0;i<5;i++) {
            number = JOptionPane.showInputDialog(null, "Enter a real number");
            try {
                arr[i] = Double.parseDouble(number);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Invalid input");
            }
        }
        JOptionPane.showMessageDialog(null,arr[Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the index of a number"))]);
    }

    private void task8(){
        int[] arr = new int[51];
        for (int i = 0; i<51;i++){
            arr[i]= i*2;
            System.out.print(arr[i]+" ");
        }
    }
    private void task9(){
        int[] arr = new int[51];
        for (int i = 0; i<51;i++){
            arr[i]= i*2;
        }
        for (int i:arr) {
            System.out.print(i+" ");
        }
    }
    private void task10() {
        int[] arr = new int[51];
        int[] arr2 = new int[51];
        for (int i = 0; i < 51; i++) {
            arr[i] = i * 2;
        }
        for (int i = 0; i < 51; i++) {
            arr2[i]=arr[50-i];
            System.out.print(arr2[i]+" ");
        }
    }
    private void task11(){
        int[] arr = new int[20];
        arr[0]=0; arr[1]=1;
        for (int i=2;i<20;i++){
                arr[i]=arr[i-2]+arr[i-1];
            }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    private void task12(){
        int[] arr = new int[100];
        int arr2[] = new int[100];
        for (int i = 0; i<100;i++){
            arr[i]=rand.nextInt(100);
            arr2[i]=rand.nextInt(100);
        }
        for (int i=0;i<100;i++){
            System.out.printf("%d * %d = %d%n",arr[i],arr2[i],arr[i]+arr2[i]);
        }
    }
    private void task13(){
        ArrayList<Integer> arr= new ArrayList<>();
        int a;
        do {
            a = (Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number:")));
            arr.add(a);
        }while (a>0);
        System.out.print(arr.get(1));
    }
    private void task14(){
        ArrayList<String> string = new ArrayList<>();
        for (int i=0;i<5;i++){
            string.add(JOptionPane.showInputDialog(null,"Enter a word"));
        }
        string.remove(1);
        string.forEach(System.out::print);
    }
    private void task15(){
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i=0;i<1000;i++){
            arr.add(rand.nextInt(10));
        }
        int[] arr1 = new int[10];
        for(int i:arr){
            arr1[i]++;
        }
        for (int i=0;i<10;i++){
            System.out.print((i+1)+": ");
            for (int j=arr1[i];j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private void task16(){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Hello");
        arr.add("world");
        arr.add("this");
        arr.add("will");
        arr.add("be");
        arr.add("printed");
        arr.add("using");
        arr.add("an");
        arr.add("enhanced");
        arr.add("for");
        arr.add("statement");
        for (String s:arr) {
            System.out.print(s+" ");
        }
    }
    private void task17(int[][]arr){
        for (int i=0;i<arr.length;i++){
            for (int j =0;j<arr[i].length;j++){
                if (arr[i][j]!=0){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
