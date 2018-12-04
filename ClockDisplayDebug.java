
/**
 * The ClockDisplayDebug class implements a digital clock display for a
 * European-style 24 hour clock. The clock shows hours and minutes. The 
 * range of the clock is 00:00 (midnight) to 23:59 (one minute before 
 * midnight).
 * 
 * The clock display receives "ticks" (via the timeTick method) every minute
 * and reacts by incrementing the display. This is done in the usual clock
 * fashion: the hour increments when the minutes roll over to zero.
 * 
 * @author Michael Kölling and David J. Barnes
 * @version 2011.07.31
 */
public class ClockDisplayDebug
{
    public static final int FIRST_MORNING_HOUR = 0;
    public static final int LAST_MORNING_HOUR  = 11;
    public static final int FIRST_EVENING_HOUR = 12;
    public static final int LAST_EVENING_HOUR  = 23;
    public static final int MINUTES_PER_HOUR   = 60;
    public static final String MORNING_SUFFIX  = "a.m.";
    public static final String EVENING_SUFFIX  = "p.m.";
    public static final int MIDNIGHT_HOUR      = 0;
    public static final int NOON_HOUR          = 12;
    public static final int HOUSE_PER_DAY      = 24;
    public static final int MINUTE_ZERO        = 0;
    
    private NumberDisplayDebug hours;
    private NumberDisplayDebug minutes;
    private String displayString;    // simulates the actual display
    
    /**
     * Constructor for ClockDisplayDebug objects. This constructor 
     * creates a new clock set at 00:00.
     */
    public ClockDisplayDebug()
    {
        hours = new NumberDisplayDebug(24);
        minutes = new NumberDisplayDebug(60);
    }

    /**
     * Constructor for ClockDisplayDebug objects. This constructor
     * creates a new clock set at the time specified by the 
     * parameters.
     */
    public ClockDisplayDebug(int hour, int minute)
    {
        hours = new NumberDisplayDebug(24);
        minutes = new NumberDisplayDebug(60);
        setTime(hour, minute);
    }

    /**
     * This method should get called once every minute - it makes
     * the clock display go one minute forward.
     */
    public void timeTick()
    {
        minutes.increment();
        if(minutes.getValue() == 0) {  // it just rolled over!
            hours.increment();
            // 0?
        }
        updateDisplay();
    }

    /**
     * Set the time of the display to the specified hour and
     * minute.
     */
    public void setTime(int hour, int minute)
    {
        hours.setValue(hour);
        minutes.setValue(minute);
        updateDisplay();
    }

    /**
     * Return the current time of this display in the format HH:MM.
     */
    public String getTime()
    {
        return displayString;
    }
    
    /**
     * Update the internal string that represents the display.
     */
    private void updateDisplay()
    {    
        int currHours = 0;
        
        if (hours.getValue() == 0) {
            currHours = 12;
        } else if (hours.getValue() > 12) {
            currHours = hours.getValue() - 12;
        } else {
            currHours = hours.getValue();
        }
        
        displayString = currHours + ":" + 
                        minutes.getDisplayValue() + " " + getSuffix();
                        
        if (hours.getValue() == MIDNIGHT_HOUR && minutes.getValue() == MINUTE_ZERO) {
            displayString += " (midnight)";
        }
        
        if (hours.getValue() == NOON_HOUR && minutes.getValue() == MINUTE_ZERO) {
            displayString += " (noon)";
        }
    }
    
    private int getHoursDisplay() {
        int currHours = 0;
        
        if (hours.getValue() == 0) {
            currHours = 12;
        } else if (hours.getValue() > 12) {
            currHours = hours.getValue() - 12;
        } else {
            currHours = hours.getValue();
        }
        
        return currHours;
    }
    
    private String getSuffix() {
     
        if (hours.getValue() >= FIRST_MORNING_HOUR && hours.getValue() <= LAST_MORNING_HOUR) {
            return MORNING_SUFFIX;
        } else if (hours.getValue() >= FIRST_EVENING_HOUR && hours.getValue() <= LAST_EVENING_HOUR) {
            return EVENING_SUFFIX;
        }
        
        return "";
    }
        
        
        
}
