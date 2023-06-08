public class RegistroTest {
    private String DNI;
    private float temp;

    public RegistroTest() {
    }

    public RegistroTest(String DNI, float temp) {
        this.DNI = DNI;
        this.temp = temp;
    }

    public String getDNI() {
        return DNI;
    }

    public float getTemp() {
        return temp;
    }
}
