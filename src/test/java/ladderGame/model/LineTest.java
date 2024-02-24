package ladderGame.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.junit.jupiter.api.Assertions.assertFalse;

class LineTest {
    @Test
    @DisplayName("연속으로 True를 가질 수 없다.")
    void notConsecutiveDraw() {
        Line line = new Line(new BooleanGenerator() {
            @Override
            public boolean generate() {
                return true;
            }
        }, 5);

        List<ConnectionStatus> isConnections = line.getConnectionStatuses();

        boolean isConsecutive = false;
        for (int i = 1; i < isConnections.size(); i++) {
            if (isConnections.get(i).equals(ConnectionStatus.CONNECTION) && isConnections.get(i - 1).equals(ConnectionStatus.CONNECTION)) {
                isConsecutive = true;
                break;
            }
        }

        assertFalse(isConsecutive);
    }
}
