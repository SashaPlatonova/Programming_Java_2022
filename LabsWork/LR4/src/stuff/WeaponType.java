package stuff;

public enum WeaponType {
    CLUB("club"),
    GAN("gan");

    private String name;
    WeaponType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
