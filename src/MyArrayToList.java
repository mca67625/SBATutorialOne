import java.util.ArrayList;

public class MyArrayToList implements THeList{

   private ArrayList<String> arrayToList;

   public MyArrayToList(){
       this.arrayToList = new ArrayList<>();
   }

   public void conversion(String[] a){
       for (int i = 0; i < a.length; i++){
           arrayToList.add(a[i]);
           System.out.println("I have added the string " + a[i] + " at the index: " + i);
       }

   }
    @Override
   public void replacement(int index){
       String val= arrayToList.get(index);
       arrayToList.set(index,"");
       System.out.println("I have replaced the string " + val + " with a null string ");
    }
    @Override
   public ArrayList<String> remove(){
       for (int i = 0; i < arrayToList.size(); i++){
           if (arrayToList.get(i).equals("")){
               arrayToList.remove(i);
           }
       }
       return arrayToList;
    }

}
