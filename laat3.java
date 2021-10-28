public class laat3
{
public static void main(String args[]) { 
class Buku {
	String pengarang;
	String judul;
}
Buku a,b; 
a=new Buku();
b=new Buku();
a.pengarang="Felix Siauw";
a.judul="Beyond The Inspiration";
b.pengarang="Budi Raharjo";
b.judul="Mudah Belajar Java";
System.out.println("Judul: "+a.judul+" pengarang: "+ a.pengarang);
System.out.println("Judul: "+b.judul+" pengarang: "+ b.pengarang);
}
}