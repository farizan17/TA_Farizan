/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta;

/**
 *
 * @author ROG
 */
public class Admin {
    private String[][] datauser = new String[2][2];
    private String namauser, pwuser;
    
    public Admin (String namauser, String pwuser){
        this.namauser = namauser;
        this.pwuser = pwuser;
        String[][] datauser =
        {
            {"admin","1234"},
            {"ican","ican1234"}
            
        };
        this.datauser = datauser;
        
    }
    public boolean checkUser(){
        for (int i = 0; i<datauser.length; i++  ){
            if(datauser [i][0].equals(namauser)){
                if(datauser [i][1].equals(pwuser)){
                    return true;
                }
            }
        }
        return false;
    }
}
