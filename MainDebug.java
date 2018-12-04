
/**
 * Write a description of class DebugMain here.
 *
 * @author Mike Mulder
 * @version 1.0
 */
public class MainDebug
{
    /**
     * Main method
     */
    public static void main() {
        
        ClockDisplayDebug clockDisplayCommon = new ClockDisplayDebug(10, 0);
        ClockDisplayDebug clockDisplayRef = clockDisplayCommon;
        HistoricalMomentDebug momentTest1 = new HistoricalMomentDebug("Test Event 1", clockDisplayCommon);
        HistoricalMomentDebug momentTest2 = new HistoricalMomentDebug("Test Event 2", clockDisplayRef);
        momentTest1.printDetails();
        momentTest2.printDetails();
        momentTest1.addMinuteToTimeOfEvent();
        momentTest1.printDetails();
        momentTest2.printDetails();
        
        
    }
}
