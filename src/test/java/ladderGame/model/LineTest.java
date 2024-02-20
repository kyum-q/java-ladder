package ladderGame.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.junit.jupiter.api.Assertions.*;

class LineTest {
    @Test
    @DisplayName("인원 수를 인자로 받아서 Line을 생성한다.")
    void createLine() {
        assertThatCode(() -> new Line(3));
    }

    @RepeatedTest(100)
    @DisplayName("연속으로 True를 가질 수 없다.")
    void notConsecutiveDraw() {
        Line line = new Line(5);

        List<Boolean> isDrawn = line.getIsDrawn();

        boolean isConsecutive = false;
        for(int i = 1; i < isDrawn.size(); i++) {
            if(isDrawn.get(i) && isDrawn.get(i - 1)) {
                isConsecutive = true;
                break;
            }
        }

        assertFalse(isConsecutive);
    }
}