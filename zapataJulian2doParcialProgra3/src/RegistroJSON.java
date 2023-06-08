public class RegistroJSON {
    private String kit;
    private long temp;
    private String Barrio;

    @Override
    public String toString() {
        return "RegistroJSON{" +
                "kit='" + kit + '\'' +
                ", temp=" + temp +
                ", Barrio='" + Barrio + '\'' +
                '}';
    }

    public RegistroJSON(String kit, long temp, String barrio) {
        this.kit = kit;
        this.temp = temp;
        Barrio = barrio;
    }
}
