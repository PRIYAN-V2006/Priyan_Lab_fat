package test.java;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LeaveTest {

    @Test
    void testApproveLeave() {
        Leave leave = new Leave(10);
        assertTrue(leave.requestLeave(5), "Leave should be approved");
        assertEquals(5, leave.getBalance());
    }

    @Test
    void testRejectInsufficientBalance() {
        Leave leave = new Leave(2);
        assertFalse(leave.requestLeave(5), "Leave should be rejected");
        assertEquals(2, leave.getBalance());
    }

    @Test
    void testRejectInvalidDays() {
        Leave leave = new Leave(10);
        assertFalse(leave.requestLeave(-1), "Negative days should be rejected");
    }
}
