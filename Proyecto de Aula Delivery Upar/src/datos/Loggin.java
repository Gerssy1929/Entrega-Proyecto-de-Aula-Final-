/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author German
 */
public class Loggin {
    public String userLogin(String user, String password)
    {
       
        String mensaje;
        if (user.equals("Admin")&& password.equals("1212"))
            mensaje = "Usuario Admin logeado";
        else if ((user.equals("German")&& password.equals("2002")))
                mensaje = "Usuario German logeado";
        else if ((user.equals("Luis")&& password.equals("2001")))
                mensaje = "Usuario Luis logeado";
        else 
            mensaje = "Usuario Invalido";
        
        return mensaje;
                         
    }
}
