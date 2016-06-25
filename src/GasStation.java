/**
 * Created by Frank Hall on 6/25/2016.
 */
public class GasStation
{
    char pump;
    char repair;
    double price;
    Pump pumps = new Pump();
    Repair repairs = new Repair();

    public double calcPrice(char Pump1, char Repair1)
    {
        double Total = pumps.getTotal() + repairs.getTotal();
        if((Pump1 == 'p' || Pump1 == 'P') && (Repair1 == 'O' || Repair1 == 'o' || Repair1 == 'T' || Repair1 == 't'))
        {
            Total = Total - (Total*.08);
        }
        return Total;
    }

    public double calcPrice(Pump p, Repair r, char Pump1, char Repair1)
    {
        double Total = pumps.getTotal() + repairs.getTotal();
        if((Pump1 == 'p' || Pump1 == 'P') && (Repair1 == 'O' || Repair1 == 'o' || Repair1 == 'T' || Repair1 == 't'))
        {
            Total = Total - (Total*.08);
        }
        return Total;
    }

    public GasStation()
    {
        pump = (pumps.getGasType()).charAt(0);
        repair = repairs.getRepairType();
        price = calcPrice(pump,repair);
    }

    public GasStation(String pumpStr,char repair,double numGalls)
    {
        Pump p1 = new Pump(pumpStr,numGalls);
        Repair r1 = new Repair(repair);
        price = calcPrice(p1,r1,pump,repair);
    }

    public String toString()
    {
        String output = "Gas Station:\n"+pumps.toString()+"\n"+repairs.toString()+"\nTotal Price: $"+String.format("%.2f",price);
        return output;
    }
}
