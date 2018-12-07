
/**
 * Write a description of class HistoricalMomentDebug here.
 *
 * @author Mike Mulder
 * @version 1.0
 */
public class HistoricalMomentDebug
{
    private String eventName;
    private ClockDisplayDebug timeOfEvent;
    
    /**
     * Default constructor
     */
    public HistoricalMomentDebug() {
        this.eventName = "untitled event";
        this.timeOfEvent = new ClockDisplayDebug(ClockDisplayDebug.MIDNIGHT_HOUR, ClockDisplayDebug.MINUTE_ZERO);
    }
    
    /**
     * Constructor with an event
     * 
     * @param nameOfTheEvent
     */
    public HistoricalMomentDebug(String nameOfTheEvent) {
        if (null != nameOfTheEvent || !nameOfTheEvent.equals("")) {
            this.eventName = nameOfTheEvent;
        } else {
            this.eventName = "untitled event";
        }
        this.timeOfEvent = new ClockDisplayDebug();
    }
    
    /**
     * Constructor with event and clock display
     * 
     * @param nameOfTheEvent
     * @param theTime
     */
    public HistoricalMomentDebug(String nameOfTheEvent, ClockDisplayDebug theTime) {
        if (null != nameOfTheEvent || !nameOfTheEvent.equals("")) {
            this.eventName = nameOfTheEvent;
            this.timeOfEvent = theTime;
        } else {
            throw new IllegalArgumentException("Illegal Event Name");
        }
    }
    
    /**
     * Adds a minute to the event
     */
    public void addMinuteToTimeOfEvent() {
        this.timeOfEvent.timeTick();
    }
    
    /**
     * Prints the details of the event
     */
    public void printDetails() {
        System.out.println("At " + this.timeOfEvent.getTime() + ", " + this.eventName);
    }

}
