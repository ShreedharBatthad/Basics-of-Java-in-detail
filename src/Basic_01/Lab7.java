package Basic_01;

public class Lab7
{
    public static void main(String[] args)
    {
        boolean powerison = true;
        int voltage = 310;


        if(powerison)
        {
            if(voltage==240)
            {
                System.out.println("Normal Voltage");
                System.out.println("Washing Machine will start running");
            }
            else if (voltage<240 && voltage>230)
            {
                System.out.println("Low Voltage");
                System.out.println("Washing Machine will run slowly!");
            }
            else if (voltage>300)
            {
                System.out.println("High Voltage");
                System.out.println("Washing Machine will stop");
            }
            else {
                System.out.println("Voltage is out of range");
            }
        }
    else{
            System.out.println("There is no Power, please check your plug or setup to start the Washing machine");
        }
    }
}

