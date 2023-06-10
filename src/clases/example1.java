package clases;
//Seccion A
public class example1 {
public static void main(String[] args) {
	profesor f = new profesor("1","David","123",1);
	profesor g = new profesor("2","Gerald","123",1);
	student s= new student("1","Matilda",3);
	singleton fsingle= singleton.getInstance(f);
	singleton gsingle= singleton.getInstance(g);

	System.out.println(fsingle.profesor.getNombre());
	System.out.println(gsingle.profesor.getNombre());
	System.out.println(s.getName());
}
}
