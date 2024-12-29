package soal2;

class Anjing extends HewanPeliharaan {
    private String[] kemampuan;

    public Anjing(String nama, String ras, String warnaBulu, String[] kemampuan) {
        super(nama, ras);
        this.kemampuan = kemampuan;
    }

    public void displayDetailAnjing() {
        super.display();
        System.out.print("Memiliki kemampuan: ");
        for (String kemampuan : kemampuan) {
            System.out.print(kemampuan + " ");
        }
        System.out.println();
    }
}

