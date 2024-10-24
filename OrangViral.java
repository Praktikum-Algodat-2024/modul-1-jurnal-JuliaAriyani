import java.util.Scanner;

class Orang {
    String nama;
    String hobi;
    String skill;
    int umur;
    Orang next;

    // Constructor
    public Orang(String nama, String hobi, String skill, int umur) {
        this.nama = nama;
        this.hobi = hobi;
        this.skill = skill;
        this.umur = umur;
        this.next = null;
    }
}

class OrangViral {
    Orang head;

    public OrangViral() {
        head = null;
    }

    // Menambahkan orang di depan list
    public void addFirst(String nama, String hobi, String skill, int umur) {
        Orang orangBaru = new Orang(nama, hobi, skill, umur);
        if (head == null) {
            head = orangBaru;
        } else {
            orangBaru.next = head;
            head = orangBaru;
        }
    }

    // Menambahkan orang di akhir list
    public void addLast(String nama, String hobi, String skill, int umur) {
        Orang orangBaru = new Orang(nama, hobi, skill, umur);
        if (head == null) {
            head = orangBaru;
        } else {
            Orang temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = orangBaru;
        }
    }

    // Menghapus orang dari depan list
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List kosong, tidak ada yang bisa dihapus.");
        } else {
            System.out.println("Menghapus: " + head.nama);
            head = head.next;
        }
    }

    // Menghapus orang dari akhir list
    public void deleteLast() {
        if (head == null) {
            System.out.println("List kosong, tidak ada yang bisa dihapus.");
        } else if (head.next == null) {
            System.out.println("Menghapus: " + head.nama);
            head = null;
        } else {
            Orang temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            System.out.println("Menghapus: " + temp.next.nama);
            temp.next = null;
        }
    }

    // Menampilkan seluruh orang yang ada di dalam list
    public void displayList() {
        if (head == null) {
            System.out.println("List kosong.");
        } else {
            Orang current = head;
            while (current != null) {
                System.out.println("Nama: " + current.nama);
                System.out.println("Hobi: " + current.hobi);
                System.out.println("Skill: " + current.skill);
                System.out.println("Umur: " + current.umur);
                System.out.println("---------------------------");
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        OrangViral list = new OrangViral();
        Scanner input = new Scanner(System.in);
        boolean lanjut = true;

        while (lanjut) {
            System.out.println("Pilih tindakan:");
            System.out.println("1. Tambah orang di depan");
            System.out.println("2. Tambah orang di belakang");
            System.out.println("3. Hapus orang dari depan");
            System.out.println("4. Hapus orang dari belakang");
            System.out.println("5. Tampilkan daftar orang");
            System.out.println("6. Keluar");
            System.out.print("Masukkan pilihan: ");
            int pilihan = input.nextInt();
            input.nextLine(); // menangkap newline

            switch (pilihan) {
                case 1:
                    // Tambah orang di depan
                    System.out.print("Masukkan nama: ");
                    String namaDepan = input.nextLine();
                    System.out.print("Masukkan hobi: ");
                    String hobiDepan = input.nextLine();
                    System.out.print("Masukkan skill: ");
                    String skillDepan = input.nextLine();
                    System.out.print("Masukkan umur: ");
                    int umurDepan = input.nextInt();
                    list.addFirst(namaDepan, hobiDepan, skillDepan, umurDepan);
                    break;
                case 2:
                    // Tambah orang di belakang
                    System.out.print("Masukkan nama: ");
                    String namaBelakang = input.nextLine();
                    System.out.print("Masukkan hobi: ");
                    String hobiBelakang = input.nextLine();
                    System.out.print("Masukkan skill: ");
                    String skillBelakang = input.nextLine();
                    System.out.print("Masukkan umur: ");
                    int umurBelakang = input.nextInt();
                    list.addLast(namaBelakang, hobiBelakang, skillBelakang, umurBelakang);
                    break;
                case 3:
                    // Hapus orang dari depan
                    list.deleteFirst();
                    break;
                case 4:
                    // Hapus orang dari belakang
                    list.deleteLast();
                    break;
                case 5:
                    // Tampilkan daftar orang
                    list.displayList();
                    break;
                case 6:
                    // Keluar
                    lanjut = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
        input.close();
    }
}