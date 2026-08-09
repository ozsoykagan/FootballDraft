
package footballdraft;


public class User {
    private String name;
    private String favoriteTeam;
    public User(String name,String favoriteTeam){
    this.name=name;
    this.favoriteTeam=favoriteTeam;
    
    }
   public String getName(){
   return name;
   } 
    public String getFavoriteTeam(){
   return favoriteTeam;
   }    
}
