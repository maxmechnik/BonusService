import static org.junit.jupiter.api.Assertions.assertEquals;

public class BonusServiceTest {
    @org.junit.jupiter.api.Test
    void registeredUnderLimit() {
        BonusService service = new BonusService();

        long amount = 1000;
        boolean registered = true;
        long expected = 30;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void registeredOverLimit() {
        BonusService service = new BonusService();

        long amount = 1000_000;
        boolean registered = true;
        long expected = 500;

        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void unregisteredUnderLimit() {

        BonusService service = new BonusService();
        long amount = 1000;
        boolean registered = false;
        long expected = 10;
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void unregisteredOverLimit() {

        BonusService service = new BonusService();
        long amount = 1000_000;
        boolean registered = false;
        long expected = 500;
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }
}
