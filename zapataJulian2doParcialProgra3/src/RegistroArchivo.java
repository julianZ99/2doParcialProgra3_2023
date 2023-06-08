public class RegistroArchivo {
    private String barrio;
    private String UUID;

    @Override
    public String toString() {
        return "RegistroArchivo{" +
                "barrio='" + barrio + '\'' +
                ", UUID='" + UUID + '\'' +
                '}';
    }

    public RegistroArchivo(String barrio, String uuid) {
        this.barrio = barrio;
        UUID = uuid;
    }
}
