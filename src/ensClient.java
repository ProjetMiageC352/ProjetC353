
import java.util.*;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * 
 */
public class Ens. Client {

    /**
     * Default constructor
     */
    public Ens. Client() {
    }

    /**
     * 
     */
    public boolean Existe?(int id_client) {
        // TODO implement here
        try{
        stm=conn.obtenirconnexion().createStatement();
        ResultSet Rs=stm.executeQuery("Select c_nom from client where c_id_client=id_client");
        if(Rs.getstring("c_nom")!="") return true; 
        }
        catch(Exception e){System.err.println(e);}
    }

}
