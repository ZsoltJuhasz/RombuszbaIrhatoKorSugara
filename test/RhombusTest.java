import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;

public class RhombusTest {
    Rhombus rhombus;
    
    @BeforeEach 
    void setUp(){
        this.rhombus = new Rhombus();
    }

    @Test
    void calcRadiusTest(){
        double side = 30;
        double angle = 35;
        double expectedRadius = 8.60;

        double acutalRadius = this.rhombus.calcRadius(side, angle);

        assertEquals(expectedRadius, acutalRadius, 0.01);
    }

    @Test
    void calcRadiusTestAnother(){
        double side = 120;
        double angle = 40;
        double expectedRadius = 38.56;

        double acutalRadius = this.rhombus.calcRadius(side, angle);

        assertEquals(expectedRadius, acutalRadius, 0.01);
    }
    
    @Test
    void calcRadiusOneTest(){
        double side = 1;
        double angle = 1;
        double expectedRadius = 0.0087;

        double acutalRadius = this.rhombus.calcRadius(side, angle);

        assertEquals(expectedRadius, acutalRadius, 0.0001);
    }

    @Test
    void calcRadiusTopAngleTest(){
        double side = 30;
        double angle = 179;
        double expectedRadius = 0.26;

        double acutalRadius = this.rhombus.calcRadius(side, angle);

        assertEquals(expectedRadius, acutalRadius, 0.01);
    }
    
}