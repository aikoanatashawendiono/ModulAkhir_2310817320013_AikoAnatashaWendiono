package model;

public class Pelanggan {
    private int pelangganId;
    private String nama;
    private String email;
    private String telepon;

    
    public Pelanggan(int pelangganId, String nama, String email, String telepon) {
        this.pelangganId = pelangganId;
        this.nama = nama;
        this.email = email;
        setTelepon(telepon); 
    }

    // Getter dan Setter
    public int getPelangganId() {
        return pelangganId;
    }

    public void setPelangganId(int pelangganId) {
        this.pelangganId = pelangganId;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        // Example validation: checks if the phone number contains only digits, spaces, or special characters like "+" or "-"
        if (telepon != null && telepon.matches("[+\\d\\-\\s()]+")) {
            this.telepon = telepon;
        } else {
            throw new IllegalArgumentException("Invalid phone number format");
        }
    }
}
