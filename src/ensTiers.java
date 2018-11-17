
import java.util.*;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * 
 */
public class Ens. Tiers {

    /**
     * Default constructor
     */
    public Ens. Tiers() {
    }

    /**
     * 
     */
    public boolean Existe?(int id_tier) {
        // TODO implement here
        try{
        stm=conn.obtenirconnexion().createStatement();
        ResultSet Rs=stm.executeQuery("Select t_nom from tiers where t_id=id_tier");
        if(Rs.getstring("t_nom")!="") return true; 
        }
        catch(Exception e){System.err.println(e);}
    }

}
