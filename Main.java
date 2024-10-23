public class Main {
    public static void main(String[] args) {
        LinkedList viralList = new LinkedList()
        
        int choice;
        do{
            System.out.println("\nMenu:")
            System.out.println("1. Tambahkan orang viral diawal:");
            System.out.println("2. Tambahkan orang viral diakhir:");
            System.out.println("3. Hapus orang viral diawal:");
            System.out.println("4. Hapus orang viral diakhir:");;
            System.out.println("5. Tampilkan Orang viral:");
            System.out.println("pilih");
        }
        switch (choice) {
            case 1:
                System.out.print("Masukkan Nama: ");
                String nama = scanner.next();
                System.out.print("Masukkan hobi: ");
                String nama = scanner.next();
                System.out.print("Masukkan skill: ");
                String nama = scanner.next();
                System.out.print("Masukkan umur: ");
                int umur = scanner.nextInt();
                viralList.addviral(nama, hobi, skill, umur);
                break;

            case 2:
                studentList.displayStudents();
                break;

            case 3:
                System.out.print("Masukkan ID Siswa yang akan dihapus: ");
                int idToRemove = scanner.nextInt();
                studentList.removeStudent(idToRemove);
                break;

            case 4:
                System.out.print("Masukkan Nama Siswa yang akan dicari: ");
                String nameToSearch = scanner.next();
                studentList.searchStudentByName(nameToSearch);
                break;

            case 5:
                System.out.println("Keluar dari program.");
                break;

            default:
                System.out.println("Pilihan tidak valid.");
        }
    } while (choice != 5);
        }
    }
}
public static void main(String[] args) {
    Viral list = new Viral();
    list.addLast("Vadel", "Dance Geterrr", 19, "Dance");
    list.addLast("Loli", "ATM berjalan", 16, "Liat Vadel");
    list.addLast("Agus", "Agus sakit", 35, "DOnasi");
    list.addLast("Fufu Fafa", "Roasting", 30, "Buka kaskus");
    list.addFirst("Kak Gem", "Kasih paham", 32, "Bernafas");        
    list.display();

    list.deleteLast();
    list.deleteFirst();
    
    System.out.println("\nDelete kakgem dan fufu fafa");
    System.out.println("__________");
    list.display();
}
}