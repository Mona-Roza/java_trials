import java.io.PrintWriter;

public class BST {
    private BSTNode root;
    private String keyType;
    private static int counter = 0;

    public BST(BSTNode node, String keyType) {
        root = node;
        this.keyType = keyType;
    }

    public BST(String keyType) {
        this(null, keyType);
    }

    public BST() {
        this(null, "ID");
    }

    // Bu metod agacta saklanan ogrencileri agacta kullanilan anahtar degerini gore
    // Student dizisi olarak dondurur. Bu metodu yazmak icin gerek duyarsaniz bu
    // sinif
    // icinde yeni metodlar, fonksiyonlar ve sinif degisikenleri tanimlayabilirsiniz
    // ama
    // mevcut sinif metodlari ve degiskenleri uzerinde bir degisiklik yapmayiniz.
    // Eger ikili arama agaciniz anahtar degeri GPA (not ortalamasi) ise bu metodun
    // dondurecegin dizinin ilk elemanindaki ogrenci not ortalamasi en dusuk son
    // elemanindaki
    // ogrenci not ortalamasi en yuksek ogrenci olmalidir. Bir baska deyisle
    // dondurulen
    // dizideki elemanlar anahtar degerine gore kucukten buyuge sirali olmalidir.

    // Bu metod bir altta tanimlanan PrintOrderedStudentsTable metodu tarafindan
    // kullanilmaktadir.

    public Student[] getOrderedStudents() {
        if (root == null)
            return null;
        int studentCounter = studentCounterPreOrder(root);
        Student[] studentList = new Student[studentCounter];
        studentGetPreOrder(studentList, root);
        if (keyType == "name") {
            Student temp;
            for (int j = 0; j < studentCounter - 1; j++) {
                for (int k = j + 1; k < studentCounter; k++) {
                    if (studentList[j].getName().compareTo(studentList[k].getName()) > 0) {
                        temp = studentList[j];
                        studentList[j] = studentList[k];
                        studentList[k] = temp;
                    }
                }
            }
        } else if (keyType == "surname") {
            Student temp;
            for (int j = 0; j < studentCounter - 1; j++) {
                for (int k = j + 1; k < studentCounter; k++) {
                    if (studentList[j].getSurname().compareTo(studentList[k].getSurname()) > 0) {
                        temp = studentList[j];
                        studentList[j] = studentList[k];
                        studentList[k] = temp;
                    }
                }
            }

        } else if (keyType == "GPA") {
            Student temp;

            for (int k = 0; k < studentCounter; k++) {
                for (int j = 1; j < (studentCounter - k); j++) {

                    if (studentList[j - 1].getGPA() > studentList[j].getGPA()) {
                        temp = studentList[j - 1];
                        studentList[j - 1] = studentList[j];
                        studentList[j] = temp;
                    }

                }
            }

        } else {
            Student temp;

            for (int k = 0; k < studentCounter; k++) {
                for (int j = 1; j < (studentCounter - k); j++) {

                    if (studentList[j - 1].getID() > studentList[j].getID()) {
                        temp = studentList[j - 1];
                        studentList[j - 1] = studentList[j];
                        studentList[j] = temp;
                    }

                }
            }
        }

        return studentList;
    }

    private int counter2 = 0;

    public int studentCounterPreOrder(BSTNode node) {
        if (node == null) {
            return counter2;
        }
        counter2++;
        studentCounterPreOrder(node.left);
        studentCounterPreOrder(node.right);
        return counter2;
    }

    private int i = 0;

    public Student[] studentGetPreOrder(Student[] studentList, BSTNode node) {
        if (node == null) {
            return studentList;
        }
        studentList[i++] = node.data;
        studentGetPreOrder(studentList, node.left);
        studentGetPreOrder(studentList, node.right);
        return studentList;
    }
    // Bu metod agactaki ogrencilere ait bilgileri tablo olarak ekrana
    // yazdirmaktadir.
    // Tablodaki ogrenciler agacta anahtar olarak belirlenen niteligi gore sirali
    // olarak yazdirilmaktadir. Ornegin ikili arama agaciniz anahtari ID (ogrenci
    // numarasi)
    // olarak belirlendiyse bu metodu kullanarak agacinizdaki ogrencileri tablo
    // olarak ekrana
    // yazdirmak isterseniz tablonun en ust satirinda ogrenci numarasi en kucuk
    // ogrencinin; tablonun
    // en alt satirinda ise ogrenci numarasi en buyuk ogrencinin bilgilerini
    // goreceksiniz.

    public void printOrderedStudentsTable() {
        System.out.format("%-15s%-15s%-12s%-4s\n", "Name", "Surname", "ID", "GPA");
        Student[] students = getOrderedStudents();
        for (Student s : students) {
            System.out.format("%-15s%-15s%-12d%.2f\n",
                    s.getName(), s.getSurname(), s.getID(), s.getGPA());
        }
        System.out.println();
    }

    // Bu metod agaci gorsellestirmek icin kullanmaktadir.
    // Metod icindeki kodlari incelemeniz tavsiye edilir ama zorunlu degildir.

    public void toDotFile(String filepath) throws Exception {
        String allRules = toDot(root, "");
        String dotFileContent = "strict digraph BST{\n\tnodesep=1.5;\n\tranksep=0.5" + allRules + "\n}";

        PrintWriter writer = new PrintWriter(filepath, "UTF-8");
        writer.print(dotFileContent);
        writer.close();
    }

    // Bu metod agaci gorsellestirmek icin kullanmaktadir.
    // Metod icindeki kodlari incelemeniz tavsiye edilir ama zorunlu degildir.

    public String toDot(BSTNode node, String rules) {
        if (node == null) {
            return rules;
        }

        if ((node.left == null) && (node.right != null)) {
            counter++;
            String newRulePrefix = "\tnull" + counter + " [shape=point];\n";
            String newRule = "\t" + node.data.toDotString() + " -> " + "null" + counter + ";";
            rules = rules + "\n" + newRulePrefix + newRule;
        }

        if (node.left != null) {
            String newRule = "\t" + node.data.toDotString() + " -> " + node.left.data.toDotString() + ";";
            rules = rules + "\n" + newRule;
        }
        if (node.right != null) {
            String newRule = "\t" + node.data.toDotString() + " -> " + node.right.data.toDotString() + ";";
            rules = rules + "\n" + newRule;
        }

        if ((node.right == null) && (node.left != null)) {
            counter++;
            String newRulePrefix = "\tnull" + counter + " [shape=point];\n";
            String newRule = "\t" + node.data.toDotString() + " -> " + "null" + counter + ";";
            rules = rules + "\n" + newRulePrefix + newRule;
        }

        String leftRules = toDot(node.left, "");
        String rightRules = toDot(node.right, "");
        rules = rules + leftRules + rightRules;
        return rules;
    }

    public BSTNode insert(Student[] students) {
        BSTNode ret = null;
        for (Student s : students) {
            ret = insert(s);
        }
        return ret;
    }

    // Insert metodu ikili arama agacina anahtar olarak belirlenen veriye
    // gore agaca yeni eleman yerlestirmektedir.

    public BSTNode insert(Student s) {
        if (keyType == "name") {
            return insertNameOrdered(s);
        }
        if (keyType == "surname") {
            return insertSurnameOrdered(s);
        }
        if (keyType == "GPA") {
            return insertGPAOrdered(s);
        }
        return insertIDOrdered(s);
    }

    // Bu metod agacin anahtar olarak ogrenci ismi secilmesi durumunda
    // kullanilacaktir.
    // Bu metod kullanilarak ikili arama agacina eklenen bir ogrenci agaca ogrenci
    // ismi
    // baz alinarak eklenecektir. Bu metodu yazabilmek icin String kutuphanesinin
    // compareTo
    // metodunu kullanmaniz gerekmektedir.

    private BSTNode insertNameOrdered(Student s) {
        BSTNode newNode = new BSTNode(s);
        if (root == null) {
            root = newNode;
            return root;
        }

        BSTNode p = null;
        BSTNode n = root;

        while (n != null) {
            if (n.data.getName().compareTo(s.getName()) < 0) {
                p = n;
                n = n.right;
            } else {
                p = n;
                n = n.left;
            }
        }

        if (p.data.getName().compareTo(s.getName()) < 0) {
            p.right = newNode;
        } else {
            p.left = newNode;
        }
        return root;
    }

    // Bu metod agacin anahtar olarak ogrenci soyismi secilmesi durumunda
    // kullanilacaktir.
    // Bu metod kullanilarak ikili arama agacina eklenen bir ogrenci agaca ogrenci
    // soyismi
    // baz alinarak eklenecektir. Bu metodu yazabilmek icin String kutuphanesinin
    // compareTo
    // metodunu kullanmaniz gerekmektedir.

    private BSTNode insertSurnameOrdered(Student s) {
        BSTNode newNode = new BSTNode(s);
        if (root == null) {
            root = newNode;
            return root;
        }

        BSTNode p = null;
        BSTNode n = root;

        while (n != null) {
            if (n.data.getSurname().compareTo(s.getSurname()) < 0) {
                p = n;
                n = n.right;
            } else {
                p = n;
                n = n.left;
            }
        }

        if (p.data.getSurname().compareTo(s.getSurname()) < 0) {
            p.right = newNode;
        } else {
            p.left = newNode;
        }
        return root;
    }

    // Bu metod agacin anahtar olarak ogrenci not ortalamasi (GPA) secilmesi
    // durumunda kullanilacaktir.
    // Bu metod kullanilarak ikili arama agacina eklenen bir ogrenci agaca ogrenci
    // not ortalamasi
    // baz alinarak eklenecektir.

    private BSTNode insertGPAOrdered(Student s) {
        BSTNode newNode = new BSTNode(s);
        if (root == null) {
            root = newNode;
            return root;
        }

        BSTNode p = null;
        BSTNode n = root;

        while (n != null) {
            if (n.data.getGPA() < s.getGPA()) {
                p = n;
                n = n.right;
            } else {
                p = n;
                n = n.left;
            }
        }

        if (p.data.getGPA() < s.getGPA()) {
            p.right = newNode;
        } else {
            p.left = newNode;
        }
        return root;
    }

    // Bu metod agacin anahtar olarak ogrenci not numarasi (ID) secilmesi durumunda
    // kullanilacaktir.
    // Bu metod kullanilarak ikili arama agacina eklenen bir ogrenci agaca ogrenci
    // numarasi
    // baz alinarak eklenecektir.

    private BSTNode insertIDOrdered(Student s) {
        BSTNode newNode = new BSTNode(s);
        if (root == null) {
            root = newNode;
            return root;
        }

        BSTNode p = null;
        BSTNode n = root;

        while (n != null) {
            if (n.data.getID() < s.getID()) {
                p = n;
                n = n.right;
            } else {
                p = n;
                n = n.left;
            }
        }

        if (p.data.getID() < s.getID()) {
            p.right = newNode;
        } else {
            p.left = newNode;
        }
        return root;
    }

    // Bu metod Main fonksiyonu icinde olusturulan agaclarda saklanan ogrencilerin
    // hangi cizgi dizinin
    // karakteri oldugunu kucuk harflerle ekrana yazdirir. Ipucu:
    // Bu metod 8 karakterli bir string dondurecek sekilde degistirilmelidir.
    // Bu metoddan proje aciklamalarinda bahsedilmemektedir.
    public String bonus() {
        return "";
    }

}
