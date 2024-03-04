/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise6;

/**
 *
 * @author user
 */
public class Exercise6 {
  public static void arrays(){
int arr1[]={2,70,0,98,30,19};
        int arr2[]={48,60,70,98,89};
        for(int i=0;i<arr1.length;i++){
        for(int j=0;j<arr2.length;j++){
            if(arr1[i]==arr2[j]){
                System.out.println(arr1[i]);
            }
        }
        }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         arrays();
        // TODO code application logic here
    }
    
}
