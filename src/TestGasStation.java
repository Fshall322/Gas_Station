/**
 * Created by Frank Hall on 6/25/2016.
 */
public class TestGasStation
{
    public static void main(String[] args)
    {
        GasStation gas1 = new GasStation();
        GasStation gas2 = new GasStation("Premium",'T',15);
        System.out.println("GasStation:\n"+gas1.toString());
        System.out.println("\nGasStation:\n"+gas2.toString());
    }
}
