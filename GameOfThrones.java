
public class GameOfThrones {

    public static void main(String[] args) {
    	
    	Character jonSnow = new Character();
    	
    	System.out.println(jonSnow.toString());
    	
       Character dani = new Character("Dani");
       System.out.println(dani.toString());
       
       Character jimmy = new Character("Jimmy",6.2,8,true);
       System.out.println(jimmy.toString());
       
       dani.armDisarm(true);
       
       if (dani.isArmed())
       {
       System.out.println("dani is armed");
       
       jimmy.reduceStr(2);
       }
       else 
       {
       	System.out.println("dani is no armed");
       }
       System.out.println(dani.toString());
       System.out.println(jimmy.toString());
    }
}
