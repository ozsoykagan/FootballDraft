
package footballdraft;


public class Formation {
     private String name;
    private String[] positions;
    public Formation(String name,String[] positions){
    this.name=name;
    this.positions=positions;   
    }
  public String getName() {
        return name;
    }
  public String[] getPositions() {
        return positions;
    }
}
