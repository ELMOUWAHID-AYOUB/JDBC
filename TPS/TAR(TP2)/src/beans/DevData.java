/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author user
 */
public class DevData {
private String Developpeurs;
private String Jour;
private int Nb;

    public DevData() {
    }

    public DevData(String Developpeurs, String Jour, int NbScripts) {
        this.Developpeurs = Developpeurs;
        this.Jour = Jour;
        this.Nb = NbScripts;
    }

  
    public String getDeveloppeurs() {
        return Developpeurs;
    }

    public String getJour() {
        return Jour;
    }

    public int getNbScripts() {
        return Nb;
    }

    public void setDeveloppeurs(String Developpeurs) {
        this.Developpeurs = Developpeurs;
    }

    public void setJour(String Jour) {
        this.Jour = Jour;
    }

    public void setNbScripts(int NbScripts) {
        this.Nb = NbScripts;
    }


    
}
