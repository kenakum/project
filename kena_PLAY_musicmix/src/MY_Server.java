
import java.rmi.*;

public class MY_Server{
    public static void main(String args[]){
    try{
        MusicMixInterface stub=new Play_MusicRemote();
        Naming.rebind("rmi://localhost:49870/MUSIC",stub);

        } catch(Exception e){System.out.println(e);}
     }
}
