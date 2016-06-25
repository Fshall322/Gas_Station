/**
 * Created by Frank Hall on 6/25/2016.
 */
public class Pump
{
    String gasType;
    double numOfGallons;
    double pricePerGallon;
    double total;

    public Pump(String gasType,double numOfGallons)
    {
        this.gasType = gasType;
        this.numOfGallons = numOfGallons;
        if (gasType.charAt(0) == 'p' || gasType.charAt(0) == 'P')
            pricePerGallon =2.39;
        else if (gasType.charAt(0) == 'r' || gasType.charAt(0) == 'R')
            pricePerGallon = 2.19;
        else
            System.out.println("Error: Please type either \"Regular\" or \"Premium\".");

        total=calcPrice(numOfGallons,pricePerGallon);
    }

    public Pump()
    {
        this("Regular 87 Octane",10);
    }

    private double calcPrice(double gallons,double price)
    {
        return (gallons*price);
    }

    public String getGasType()
    {
        return gasType;
    }

    public double getNumOfGallons()
    {
        return numOfGallons;
    }

    public double getTotal()
    {
        return total;
    }

    public String toString()
    {
        String output = "Gas Pump Service:\n\tGas Type: "+gasType+"\n\tNumber Of Gallons: "+String.format("%.1f",numOfGallons)+"\n\tPrice Per Gallon: $"+String.format("%.2f",pricePerGallon)+"\n\tTotal Price For Gas: $"+String.format("%.2f",total);
        return output;
    }
}
