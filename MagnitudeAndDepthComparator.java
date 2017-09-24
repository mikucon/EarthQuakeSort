import java.util.*;
public class MagnitudeAndDepthComparator implements Comparator<QuakeEntry> {
    @Override
    public int compare(QuakeEntry q1, QuakeEntry q2){
       int magnitudeCompare = Double.compare(q1.getMagnitude(),q2.getMagnitude());
        
    if(magnitudeCompare == 0){
        return Double.compare(q1.getDepth(), q2.getDepth());
    }
    return magnitudeCompare;
    }

}