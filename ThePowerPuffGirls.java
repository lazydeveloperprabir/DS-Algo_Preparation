import java.util.Scanner;

public class ThePowerPuffGirls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   int numberOfIngredients  = sc.nextInt();
   int[] weightedValue = new int[numberOfIngredients];
   int[] availableQty = new int[numberOfIngredients];
try{
   for(int i =0;i<numberOfIngredients;i++){
      weightedValue[i] = sc.nextInt();
   }
   
   for(int i =0;i<numberOfIngredients;i++){
      availableQty[i] = sc.nextInt();
   }
} catch(IllegalArgumentException ie){
    sc.close();
    throw new IllegalArgumentException();
}
   int min =0;
   for(int i =0;i <numberOfIngredients;i++){
       if(min ==0) {
           min = getMaxValue(weightedValue[i],availableQty[i]);
       } else {
        min = Math.min(min, getMaxValue(weightedValue[i],availableQty[i]));
       }
       
   }

   System.out.println(min);
   sc.close();
}


    public static int getMaxValue(int ingredQty, int ingredAval) {

        return ingredAval/ingredQty;
    }


}