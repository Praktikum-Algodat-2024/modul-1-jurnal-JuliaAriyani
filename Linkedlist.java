class LinkedList {
        Node head;
    
        // Menambahkan elemen di awal
        public void Addfirst(int data) {
            Node newNode= newNode(data);
            newNode.next = head;
            head = newNode;
        }
    
        // Menambahkan elemen di akhir
        public void Addlast(int data) {
            Node nodeBaru = new Node(data);
            if (head == null) {
                head = nodeBaru;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = nodeBaru;
            }
        }
        //Method untuk menghapus diawal
        public void Deletefirst(int data){
            if (head==null) {
                System.out.println("list masih kosong");
                return;
            }
            if (head.data == data){
                head =head.next;
                return;
            }
            Node temp = head;
            while (temp.next != null && temp.next.data != data){
               temp= temp.next;
            }
            if (temp.next==null){
                system.out.println("Data tidak ditemukan dalam list");
            }else {
                temp.next = temp.next.next;
            }
        }
        //Methode menghapus diakhir
        Void Deletelast(int data){
            if(head==null){
                System.out.println("Linkedlist kosong")
            }
            if(head.next==null){
                head==null;
                return
            }
        }
        ListNode current=head;
        ListNode previous=null;
        //Methode untuk menampilkan data
        public void display(){
            Node temp = head;
            while(temp != null){
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
            System.out.println()
        }
    }