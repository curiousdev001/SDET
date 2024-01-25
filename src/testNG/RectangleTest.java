package testNG;

import org.testng.annotations.Test;
import SDETComprehensiveAssignment.Rectangle_Demo;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RectangleTest {

    @Test(dataProvider = "rectangleData")
    public void testRectangle(float length, float width) {
        Rectangle_Demo rectangle = new Rectangle_Demo();
        rectangle.setLength(length);
        rectangle.setWidth(width);

        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }

    @DataProvider(name = "rectangleData")
    public Object[][] rectangleData() {
        return new Object[][] {
                {5.0f, 3.0f},
                {8.0f, 4.0f},
                {6.5f, 2.5f}
        };
    }
}
