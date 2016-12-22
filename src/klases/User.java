
package klases;

/**
 *
 * @author Gertas
 */
public class User
{
    private String gerimas;
    private int maistas1;
    private int maistas2;
    private int maistas3;
    
    public User(String Gerimas,int Maistas1,int Maistas2,int Maistas3)
    {
        this.gerimas=Gerimas;
        this.maistas1=Maistas1;
        this.maistas2=Maistas2;
        this.maistas3=Maistas3;
        
    }
    
    public String getGerimas()
    {
        return gerimas;
    }
    
    public int getMaistas1()
    {
        return maistas1;
    }
    
    public int getMaistas2()
    {
        return maistas2;
    }
    
    public int getMaistas3()
    {
        return maistas3;
    }
}
