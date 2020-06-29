package ue06_SerialCircuit;


public class TestSerialCircuit
{
    public static void main (String[] args)
    {
        SerialCircuit sc = new SerialCircuit();
        sc.setCurrent(1E-3); // 1mA

        sc.add(new Resistor("R1", 1.1234)); // 1.1234Ω
        sc.add(new Resistor("R2", 2200)); // 2.2kΩΩ
        sc.add(new Coil("L1", 0.0155)); // 15.5mH
        sc.add(new Coil("L2", 47E-6)); // 47µH
        sc.add(new Capacitor("C1", 100E-9)); // 100nF
        sc.add(new Capacitor("C2", 100E-12)); // 100pF

        sc.component("C1").setVoltage(5); // 5V

        System.out.println(sc);
        System.out.println(" Current/A: " + sc.getCurrent());
        System.out.println(" Voltage/V: " + sc.totalVoltage());
        System.out.println(" Power/W : " + sc.totalPower());
        System.out.println(" Energy/J : " + sc.totalEnergy());

        System.out.println("");
        
        for (Component c : sc.getComponents())
        {
            System.out.println(c);
        }
    }
}
