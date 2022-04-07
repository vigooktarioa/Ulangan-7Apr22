package tes;
public class NewMain7 {  
    public static boolean a(){      
          
        //Initialize array   
        int [] arr = new int [] {1, 2, 3, 4, 90, 7, 8, 9, -1};   
 
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    return true;  
            }  
        }
        return false;
    }
    
    public static void main(String[] args){
        System.out.println("Duplikat = " + a());
    }
}  