/*
 * TimeCalc.java
 *
 * Created on 9 de Março de 2006, 14:59
 *
 */

package curso.jee.web.filter;

/**
 *
 * @author hp
 */
public class TimeCalc {

    private long totalTime;
    private long quantity;
    
    public TimeCalc() {
        setTotalTime(0);
        setQuantity(0);
    }
    
    public void addTime(long time) {
        setTotalTime(getTotalTime() + time);
        setQuantity(getQuantity() + 1);
    }
    
    public float getAverage() {
        if (getQuantity() > 0) {
            return (float) getTotalTime() / (float) getQuantity();
        }
        
        return 0;
    }

    public long getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(long totalTime) {
        this.totalTime = totalTime;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }
}
