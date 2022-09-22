import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Mystery implements MysteryColorAnalyzer{
    @Override
    public int numberOfDistinctColors(List<Color> mysteryColors) {
        ArrayList distinctColors = new ArrayList();
        for (int i = 0; i < mysteryColors.size(); i++) {
            Color thisColor = mysteryColors.get(i);
            if (distinctColors.indexOf(thisColor) == -1) {
                distinctColors.add(thisColor);
            }
        }
        return distinctColors.size();
    }

    @Override
    public int colorOccurence(List<Color> mysteryColors, Color color) {
        int occurrences = 0;
        for (int i = 0; i < mysteryColors.size(); i++) {
            Color thisColor = mysteryColors.get(i);
            if (thisColor.equals(color)) {
                occurrences++;
            }
        }
        return occurrences;
    }
}



