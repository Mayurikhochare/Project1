import java.awt.*;
import java.util.List;

public interface MysteryColorAnalyzer {
    int numberOfDistinctColors(List<Color> mysteryColors);
    int colorOccurence(List<Color> mysteryColors,Color color);
}
